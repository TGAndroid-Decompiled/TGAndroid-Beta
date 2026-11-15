package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class y {
    public final Object f1624a = new Object();
    public byte[] f1625b = new byte[320000];
    public int f1626c;
    public boolean d;
    public AudioRecord f1627e;
    public Thread f1628f;
    public volatile t1 f1629g;
    public double h;
    public int f1630i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1624a) {
            try {
                int i10 = this.f1626c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1625b;
                if (i10 > bArr2.length) {
                    this.f1625b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1625b, this.f1626c, i7);
                this.f1626c += i7;
                this.f1624a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1624a) {
            int max = Math.max(0, Math.min(i7, this.f1626c));
            copyOfRange = Arrays.copyOfRange(this.f1625b, max, Math.max(max, Math.min(i10, this.f1626c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1624a) {
            i7 = this.f1626c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1624a) {
            this.d = true;
            this.f1624a.notifyAll();
        }
        AudioRecord audioRecord = this.f1627e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1628f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1627e.release();
            this.f1627e = null;
        }
    }
}
