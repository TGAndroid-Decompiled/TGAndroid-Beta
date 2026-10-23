package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.f {
    public byte[] f17578s;
    public volatile boolean v;
    public byte[] f17579w;

    @Override
    public final void O() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f47900r.open(this.f47896b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17578s;
                if (bArr.length < i11 + 16384) {
                    this.f17578s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f47900r.read(this.f17578s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17579w = Arrays.copyOf(this.f17578s, i11);
            }
            k7.a(this.f47900r);
        } catch (Throwable th2) {
            k7.a(this.f47900r);
            throw th2;
        }
    }
}
