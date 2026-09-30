package o2;

import java.util.Arrays;
import v7.n7;
public final class e extends v2.e {
    public byte[] f15552s;
    public volatile boolean v;
    public byte[] f15553w;

    @Override
    public final void D() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f44131r.open(this.f44127b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15552s;
                if (bArr.length < i11 + 16384) {
                    this.f15552s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f44131r.read(this.f15552s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15553w = Arrays.copyOf(this.f15552s, i11);
            }
            n7.a(this.f44131r);
        } catch (Throwable th2) {
            n7.a(this.f44131r);
            throw th2;
        }
    }
}
