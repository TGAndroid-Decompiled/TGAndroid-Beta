package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class z {
    public final Object f1627a = new Object();
    public byte[] f1628b = new byte[320000];
    public int f1629c;
    public boolean d;
    public AudioRecord f1630e;
    public Thread f1631f;
    public volatile u1 f1632g;
    public double h;
    public int f1633i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1627a) {
            try {
                int i10 = this.f1629c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1628b;
                if (i10 > bArr2.length) {
                    this.f1628b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1628b, this.f1629c, i7);
                this.f1629c += i7;
                this.f1627a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1627a) {
            int max = Math.max(0, Math.min(i7, this.f1629c));
            copyOfRange = Arrays.copyOfRange(this.f1628b, max, Math.max(max, Math.min(i10, this.f1629c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1627a) {
            i7 = this.f1629c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1627a) {
            this.d = true;
            this.f1627a.notifyAll();
        }
        AudioRecord audioRecord = this.f1630e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1631f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1630e.release();
            this.f1630e = null;
        }
    }
}
