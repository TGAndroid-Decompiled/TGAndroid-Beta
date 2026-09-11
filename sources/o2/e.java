package o2;

import java.util.Arrays;
import v7.m7;
public final class e extends v2.e {
    public byte[] f16845s;
    public volatile boolean v;
    public byte[] f16846w;

    @Override
    public final void W() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f47304r.open(this.f47299b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f16845s;
                if (bArr.length < i11 + 16384) {
                    this.f16845s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f47304r.read(this.f16845s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f16846w = Arrays.copyOf(this.f16845s, i11);
            }
            m7.a(this.f47304r);
        } catch (Throwable th2) {
            m7.a(this.f47304r);
            throw th2;
        }
    }
}
