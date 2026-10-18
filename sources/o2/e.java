package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.f {
    public byte[] f17581s;
    public volatile boolean v;
    public byte[] f17582w;

    @Override
    public final void O() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f47936r.open(this.f47932b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17581s;
                if (bArr.length < i11 + 16384) {
                    this.f17581s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f47936r.read(this.f17581s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17582w = Arrays.copyOf(this.f17581s, i11);
            }
            k7.a(this.f47936r);
        } catch (Throwable th2) {
            k7.a(this.f47936r);
            throw th2;
        }
    }
}
