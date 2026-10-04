package o2;

import java.util.Arrays;
import v7.m7;
public final class e extends v2.e {
    public byte[] f17003s;
    public volatile boolean v;
    public byte[] f17004w;

    @Override
    public final void a() {
        try {
            this.f47783r.open(this.f47778b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17003s;
                if (bArr.length < i11 + 16384) {
                    this.f17003s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f47783r.read(this.f17003s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17004w = Arrays.copyOf(this.f17003s, i11);
            }
            m7.a(this.f47783r);
        } catch (Throwable th2) {
            m7.a(this.f47783r);
            throw th2;
        }
    }

    @Override
    public final void q() {
        this.v = true;
    }
}
