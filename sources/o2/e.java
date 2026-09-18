package o2;

import java.util.Arrays;
import v7.m7;
public final class e extends v2.e {
    public byte[] f15508s;
    public volatile boolean v;
    public byte[] f15509w;

    @Override
    public final void D() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f44101r.open(this.f44097b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15508s;
                if (bArr.length < i11 + 16384) {
                    this.f15508s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f44101r.read(this.f15508s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15509w = Arrays.copyOf(this.f15508s, i11);
            }
            m7.a(this.f44101r);
        } catch (Throwable th2) {
            m7.a(this.f44101r);
            throw th2;
        }
    }
}
