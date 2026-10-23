package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.f {
    public byte[] f17641s;
    public volatile boolean v;
    public byte[] f17642w;

    @Override
    public final void O() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f48338r.open(this.f48334b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17641s;
                if (bArr.length < i11 + 16384) {
                    this.f17641s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f48338r.read(this.f17641s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17642w = Arrays.copyOf(this.f17641s, i11);
            }
            k7.a(this.f48338r);
        } catch (Throwable th2) {
            k7.a(this.f48338r);
            throw th2;
        }
    }
}
