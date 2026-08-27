package o4;

import g7.l0;
import java.util.Arrays;

public final class e extends l4.e {

    public byte[] f19198s;
    public volatile boolean v;

    public byte[] f19199w;

    @Override
    public final void a() {
        try {
            this.f15423r.open(this.f15418b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f19198s;
                if (bArr.length < i11 + 16384) {
                    this.f19198s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f15423r.read(this.f19198s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f19199w = Arrays.copyOf(this.f19198s, i11);
            }
        } finally {
            l0.a(this.f15423r);
        }
    }

    @Override
    public final void l() {
        this.v = true;
    }
}
