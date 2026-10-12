package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.e {
    public byte[] f16711s;
    public volatile boolean v;
    public byte[] f16712w;

    @Override
    public final void C() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f49292r.open(this.f49287b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f16711s;
                if (bArr.length < i11 + 16384) {
                    this.f16711s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f49292r.read(this.f16711s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f16712w = Arrays.copyOf(this.f16711s, i11);
            }
            k7.a(this.f49292r);
        } catch (Throwable th2) {
            k7.a(this.f49292r);
            throw th2;
        }
    }
}
