package o2;

import java.util.Arrays;
import v7.n7;
public final class e extends v2.e {
    public byte[] f15567s;
    public volatile boolean v;
    public byte[] f15568w;

    @Override
    public final void D() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f44237r.open(this.f44233b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15567s;
                if (bArr.length < i11 + 16384) {
                    this.f15567s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f44237r.read(this.f15567s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15568w = Arrays.copyOf(this.f15567s, i11);
            }
            n7.a(this.f44237r);
        } catch (Throwable th2) {
            n7.a(this.f44237r);
            throw th2;
        }
    }
}
