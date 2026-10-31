package o2;

import java.util.Arrays;
import v7.l7;
public final class e extends v2.f {
    public byte[] f13977s;
    public volatile boolean f13978w;
    public byte[] f13979x;

    @Override
    public final void R1() {
        this.f13978w = true;
    }

    @Override
    public final void b() {
        try {
            this.f50310r.open(this.f50306b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f13978w) {
                byte[] bArr = this.f13977s;
                if (bArr.length < i11 + 16384) {
                    this.f13977s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f50310r.read(this.f13977s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f13978w) {
                this.f13979x = Arrays.copyOf(this.f13977s, i11);
            }
            l7.a(this.f50310r);
        } catch (Throwable th2) {
            l7.a(this.f50310r);
            throw th2;
        }
    }
}
