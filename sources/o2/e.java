package o2;

import java.util.Arrays;
import v7.n7;
public final class e extends v2.e {
    public byte[] f15555s;
    public volatile boolean v;
    public byte[] f15556w;

    @Override
    public final void D() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f44167r.open(this.f44163b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15555s;
                if (bArr.length < i11 + 16384) {
                    this.f15555s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f44167r.read(this.f15555s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15556w = Arrays.copyOf(this.f15555s, i11);
            }
            n7.a(this.f44167r);
        } catch (Throwable th2) {
            n7.a(this.f44167r);
            throw th2;
        }
    }
}
