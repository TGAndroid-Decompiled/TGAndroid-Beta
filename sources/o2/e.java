package o2;

import a8.hc;
import java.util.Arrays;
public final class e extends v2.f {
    public byte[] f18987s;
    public volatile boolean v;
    public byte[] f18988w;

    @Override
    public final void b() {
        try {
            this.f50046r.open(this.f50042b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f18987s;
                if (bArr.length < i11 + 16384) {
                    this.f18987s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f50046r.read(this.f18987s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f18988w = Arrays.copyOf(this.f18987s, i11);
            }
            hc.a(this.f50046r);
        } catch (Throwable th2) {
            hc.a(this.f50046r);
            throw th2;
        }
    }

    @Override
    public final void f0() {
        this.v = true;
    }
}
