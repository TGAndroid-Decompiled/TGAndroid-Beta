package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.f {
    public byte[] f16487s;
    public volatile boolean v;
    public byte[] f16488w;

    @Override
    public final void J() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f46503r.open(this.f46499b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f16487s;
                if (bArr.length < i11 + 16384) {
                    this.f16487s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f46503r.read(this.f16487s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f16488w = Arrays.copyOf(this.f16487s, i11);
            }
            k7.a(this.f46503r);
        } catch (Throwable th2) {
            k7.a(this.f46503r);
            throw th2;
        }
    }
}
