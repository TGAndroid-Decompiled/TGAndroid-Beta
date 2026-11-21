package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class z {
    public final Object f1635a = new Object();
    public byte[] f1636b = new byte[320000];
    public int f1637c;
    public boolean d;
    public AudioRecord f1638e;
    public Thread f1639f;
    public volatile w1 f1640g;
    public double h;
    public int f1641i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1635a) {
            try {
                int i10 = this.f1637c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1636b;
                if (i10 > bArr2.length) {
                    this.f1636b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1636b, this.f1637c, i7);
                this.f1637c += i7;
                this.f1635a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1635a) {
            int max = Math.max(0, Math.min(i7, this.f1637c));
            copyOfRange = Arrays.copyOfRange(this.f1636b, max, Math.max(max, Math.min(i10, this.f1637c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1635a) {
            i7 = this.f1637c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1635a) {
            this.d = true;
            this.f1635a.notifyAll();
        }
        AudioRecord audioRecord = this.f1638e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1639f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1638e.release();
            this.f1638e = null;
        }
    }
}
