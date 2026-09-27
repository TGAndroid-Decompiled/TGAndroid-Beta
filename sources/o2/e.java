package o2;

import java.util.Arrays;
import v7.n7;
public final class e extends v2.e {
    public byte[] f15590s;
    public volatile boolean v;
    public byte[] f15591w;

    @Override
    public final void a() {
        try {
            this.f44175r.open(this.f44171b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15590s;
                if (bArr.length < i11 + 16384) {
                    this.f15590s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f44175r.read(this.f15590s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15591w = Arrays.copyOf(this.f15590s, i11);
            }
            n7.a(this.f44175r);
        } catch (Throwable th2) {
            n7.a(this.f44175r);
            throw th2;
        }
    }

    @Override
    public final void q() {
        this.v = true;
    }
}
