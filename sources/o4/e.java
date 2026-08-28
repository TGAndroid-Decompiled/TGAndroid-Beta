package o4;

import f7.f5;
import java.util.Arrays;
public final class e extends l4.e {
    public byte[] f18851s;
    public volatile boolean v;
    public byte[] f18852w;

    @Override
    public final void K() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f16666r.open(this.f16661b);
            int i9 = 0;
            int i10 = 0;
            while (i9 != -1 && !this.v) {
                byte[] bArr = this.f18851s;
                if (bArr.length < i10 + 16384) {
                    this.f18851s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i9 = this.f16666r.read(this.f18851s, i10, 16384);
                if (i9 != -1) {
                    i10 += i9;
                }
            }
            if (!this.v) {
                this.f18852w = Arrays.copyOf(this.f18851s, i10);
            }
            f5.a(this.f16666r);
        } catch (Throwable th) {
            f5.a(this.f16666r);
            throw th;
        }
    }
}
