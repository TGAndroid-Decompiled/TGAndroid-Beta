package o2;

import java.util.Arrays;
import v7.l7;
public final class e extends v2.f {
    public byte[] f13978s;
    public volatile boolean f13979w;
    public byte[] f13980x;

    @Override
    public final void R1() {
        this.f13979w = true;
    }

    @Override
    public final void b() {
        try {
            this.f50324r.open(this.f50320b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f13979w) {
                byte[] bArr = this.f13978s;
                if (bArr.length < i11 + 16384) {
                    this.f13978s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f50324r.read(this.f13978s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f13979w) {
                this.f13980x = Arrays.copyOf(this.f13978s, i11);
            }
            l7.a(this.f50324r);
        } catch (Throwable th2) {
            l7.a(this.f50324r);
            throw th2;
        }
    }
}
