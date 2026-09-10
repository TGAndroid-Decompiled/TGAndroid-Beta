package o2;

import java.util.Arrays;
import v7.n7;
public final class e extends v2.e {
    public byte[] f14152s;
    public volatile boolean v;
    public byte[] f14153w;

    @Override
    public final void a() {
        try {
            this.f42867r.open(this.f42863b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f14152s;
                if (bArr.length < i11 + 16384) {
                    this.f14152s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f42867r.read(this.f14152s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f14153w = Arrays.copyOf(this.f14152s, i11);
            }
            n7.a(this.f42867r);
        } catch (Throwable th2) {
            n7.a(this.f42867r);
            throw th2;
        }
    }

    @Override
    public final void k() {
        this.v = true;
    }
}
