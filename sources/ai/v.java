package ai;

import android.media.AudioRecord;
import java.util.Arrays;
public final class v {
    public final Object f1552a = new Object();
    public byte[] f1553b = new byte[320000];
    public int f1554c;
    public boolean d;
    public AudioRecord f1555e;
    public Thread f1556f;
    public volatile q1 f1557g;
    public double h;
    public int f1558i;

    public final void a(int i7, byte[] bArr) {
        synchronized (this.f1552a) {
            try {
                int i10 = this.f1554c + i7;
                if (i10 > 19200000) {
                    return;
                }
                byte[] bArr2 = this.f1553b;
                if (i10 > bArr2.length) {
                    this.f1553b = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length * 2, i10)));
                }
                System.arraycopy(bArr, 0, this.f1553b, this.f1554c, i7);
                this.f1554c += i7;
                this.f1552a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] b(int i7, int i10) {
        byte[] copyOfRange;
        synchronized (this.f1552a) {
            int max = Math.max(0, Math.min(i7, this.f1554c));
            copyOfRange = Arrays.copyOfRange(this.f1553b, max, Math.max(max, Math.min(i10, this.f1554c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i7;
        synchronized (this.f1552a) {
            i7 = this.f1554c;
        }
        return i7;
    }

    public final void d() {
        synchronized (this.f1552a) {
            this.d = true;
            this.f1552a.notifyAll();
        }
        AudioRecord audioRecord = this.f1555e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f1556f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.f1555e.release();
            this.f1555e = null;
        }
    }
}
