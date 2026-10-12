package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.e {
    public byte[] f16710s;
    public volatile boolean v;
    public byte[] f16711w;

    @Override
    public final void C() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f49284r.open(this.f49279b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f16710s;
                if (bArr.length < i11 + 16384) {
                    this.f16710s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f49284r.read(this.f16710s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f16711w = Arrays.copyOf(this.f16710s, i11);
            }
            k7.a(this.f49284r);
        } catch (Throwable th2) {
            k7.a(this.f49284r);
            throw th2;
        }
    }
}
