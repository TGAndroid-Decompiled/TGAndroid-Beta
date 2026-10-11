package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.e {
    public byte[] f17008s;
    public volatile boolean v;
    public byte[] f17009w;

    @Override
    public final void a() {
        try {
            this.f49143r.open(this.f49138b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17008s;
                if (bArr.length < i11 + 16384) {
                    this.f17008s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f49143r.read(this.f17008s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17009w = Arrays.copyOf(this.f17008s, i11);
            }
            k7.a(this.f49143r);
        } catch (Throwable th2) {
            k7.a(this.f49143r);
            throw th2;
        }
    }

    @Override
    public final void v() {
        this.v = true;
    }
}
