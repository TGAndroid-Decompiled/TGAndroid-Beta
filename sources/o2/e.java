package o2;

import java.util.Arrays;
import v7.k7;
public final class e extends v2.e {
    public byte[] f17044s;
    public volatile boolean v;
    public byte[] f17045w;

    @Override
    public final void a() {
        try {
            this.f49177r.open(this.f49172b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17044s;
                if (bArr.length < i11 + 16384) {
                    this.f17044s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f49177r.read(this.f17044s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17045w = Arrays.copyOf(this.f17044s, i11);
            }
            k7.a(this.f49177r);
        } catch (Throwable th2) {
            k7.a(this.f49177r);
            throw th2;
        }
    }

    @Override
    public final void v() {
        this.v = true;
    }
}
