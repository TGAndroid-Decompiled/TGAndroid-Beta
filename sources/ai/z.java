package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class z {
    public final Object f1628a = new Object();
    public byte[] f1629b = new byte[320000];
    public int f1630c;
    public boolean d;
    public AudioRecord f1631e;
    public Thread f1632f;
    public volatile u1 f1633g;
    public double h;
    public int f1634i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1628a) {
            try {
                int i10 = this.f1630c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1629b;
                if (i10 > bArr2.length) {
                    this.f1629b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1629b, this.f1630c, i7);
                this.f1630c += i7;
                this.f1628a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1628a) {
            int max = Math.max(0, Math.min(i7, this.f1630c));
            copyOfRange = Arrays.copyOfRange(this.f1629b, max, Math.max(max, Math.min(i10, this.f1630c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1628a) {
            i7 = this.f1630c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1628a) {
            this.d = true;
            this.f1628a.notifyAll();
        }
        AudioRecord audioRecord = this.f1631e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1632f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1631e.release();
            this.f1631e = null;
        }
    }
}
