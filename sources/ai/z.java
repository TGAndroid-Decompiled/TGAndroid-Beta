package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class z {
    public final Object f1636a = new Object();
    public byte[] f1637b = new byte[320000];
    public int f1638c;
    public boolean d;
    public AudioRecord f1639e;
    public Thread f1640f;
    public volatile x1 f1641g;
    public double h;
    public int f1642i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1636a) {
            try {
                int i10 = this.f1638c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1637b;
                if (i10 > bArr2.length) {
                    this.f1637b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1637b, this.f1638c, i7);
                this.f1638c += i7;
                this.f1636a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1636a) {
            int max = Math.max(0, Math.min(i7, this.f1638c));
            copyOfRange = Arrays.copyOfRange(this.f1637b, max, Math.max(max, Math.min(i10, this.f1638c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1636a) {
            i7 = this.f1638c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1636a) {
            this.d = true;
            this.f1636a.notifyAll();
        }
        AudioRecord audioRecord = this.f1639e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1640f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1639e.release();
            this.f1639e = null;
        }
    }
}
