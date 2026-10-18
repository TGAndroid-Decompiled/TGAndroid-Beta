package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.f {
    public byte[] f17577s;
    public volatile boolean v;
    public byte[] f17578w;

    @Override
    public final void O() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f47889r.open(this.f47885b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17577s;
                if (bArr.length < i11 + 16384) {
                    this.f17577s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f47889r.read(this.f17577s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17578w = Arrays.copyOf(this.f17577s, i11);
            }
            k7.a(this.f47889r);
        } catch (Throwable th2) {
            k7.a(this.f47889r);
            throw th2;
        }
    }
}
