package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.e {
    public byte[] f16962s;
    public volatile boolean v;
    public byte[] f16963w;

    @Override
    public final void a() {
        try {
            this.f49100r.open(this.f49095b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f16962s;
                if (bArr.length < i11 + 16384) {
                    this.f16962s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f49100r.read(this.f16962s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f16963w = Arrays.copyOf(this.f16962s, i11);
            }
            k7.a(this.f49100r);
        } catch (Throwable th2) {
            k7.a(this.f49100r);
            throw th2;
        }
    }

    @Override
    public final void v() {
        this.v = true;
    }
}
