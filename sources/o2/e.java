package o2;

import a8.hc;
import java.util.Arrays;
public final class e extends v2.f {
    public byte[] f18988s;
    public volatile boolean v;
    public byte[] f18989w;

    @Override
    public final void b() {
        try {
            this.f50008r.open(this.f50004b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f18988s;
                if (bArr.length < i11 + 16384) {
                    this.f18988s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f50008r.read(this.f18988s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f18989w = Arrays.copyOf(this.f18988s, i11);
            }
            hc.a(this.f50008r);
        } catch (Throwable th2) {
            hc.a(this.f50008r);
            throw th2;
        }
    }

    @Override
    public final void f0() {
        this.v = true;
    }
}
