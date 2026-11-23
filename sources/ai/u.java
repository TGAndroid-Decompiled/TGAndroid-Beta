package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class u {
    public final Object f1540a = new Object();
    public byte[] f1541b = new byte[320000];
    public int f1542c;
    public boolean d;
    public AudioRecord f1543e;
    public Thread f1544f;
    public volatile p1 f1545g;
    public double h;
    public int f1546i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1540a) {
            try {
                int i10 = this.f1542c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1541b;
                if (i10 > bArr2.length) {
                    this.f1541b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1541b, this.f1542c, i7);
                this.f1542c += i7;
                this.f1540a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1540a) {
            int max = Math.max(0, Math.min(i7, this.f1542c));
            copyOfRange = Arrays.copyOfRange(this.f1541b, max, Math.max(max, Math.min(i10, this.f1542c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1540a) {
            i7 = this.f1542c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1540a) {
            this.d = true;
            this.f1540a.notifyAll();
        }
        AudioRecord audioRecord = this.f1543e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1544f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1543e.release();
            this.f1543e = null;
        }
    }
}
