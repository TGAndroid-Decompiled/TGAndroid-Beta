package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.e {
    public byte[] f16958s;
    public volatile boolean v;
    public byte[] f16959w;

    @Override
    public final void a() {
        try {
            this.f49054r.open(this.f49049b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f16958s;
                if (bArr.length < i11 + 16384) {
                    this.f16958s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f49054r.read(this.f16958s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f16959w = Arrays.copyOf(this.f16958s, i11);
            }
            k7.a(this.f49054r);
        } catch (Throwable th2) {
            k7.a(this.f49054r);
            throw th2;
        }
    }

    @Override
    public final void v() {
        this.v = true;
    }
}
