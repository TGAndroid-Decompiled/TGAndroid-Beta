package defpackage;

import android.media.AudioRecord;
import java.util.Arrays;
public final class sm3 {
    public final Object a = new Object();
    public byte[] b = new byte[320000];
    public int c;
    public boolean d;
    public AudioRecord e;
    public Thread f;
    public volatile xn3 g;
    public double h;
    public int i;

    public final void a(int i, byte[] bArr) {
        synchronized (this.a) {
            int i2 = this.c + i;
            if (i2 > 19200000) {
                return;
            }
            byte[] bArr2 = this.b;
            if (i2 > bArr2.length) {
                bArr2 = Arrays.copyOf(bArr2, Math.min(19200000, Math.max(bArr2.length << 1, i2)));
                this.b = bArr2;
            }
            System.arraycopy(bArr, 0, bArr2, this.c, i);
            this.c += i;
            this.a.notifyAll();
        }
    }

    public final byte[] b(int i, int i2) {
        byte[] copyOfRange;
        synchronized (this.a) {
            int max = Math.max(0, Math.min(i, this.c));
            copyOfRange = Arrays.copyOfRange(this.b, max, Math.max(max, Math.min(i2, this.c)));
        }
        return copyOfRange;
    }

    public final int c() {
        int i;
        synchronized (this.a) {
            i = this.c;
        }
        return i;
    }

    public final void d() {
        synchronized (this.a) {
            this.d = true;
            this.a.notifyAll();
        }
        AudioRecord audioRecord = this.e;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                Thread thread = this.f;
                if (thread != null) {
                    thread.join(300L);
                }
            } catch (InterruptedException unused2) {
            }
            this.e.release();
            this.e = null;
        }
    }
}
