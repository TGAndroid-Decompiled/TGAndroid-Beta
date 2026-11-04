package l4;

import b8.zb;
import e3.i0;
public final class m {
    public final i0 f17870a;
    public boolean f17871b;
    public boolean f17872c;
    public boolean d;
    public int f17873e;
    public int f17874f;
    public long f17875g;
    public long h;

    public m(i0 i0Var) {
        this.f17870a = i0Var;
    }

    public final void a(int i3, int i10, byte[] bArr) {
        boolean z10;
        if (this.f17872c) {
            int i11 = this.f17874f;
            int i12 = (i3 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f17872c = false;
                return;
            }
            this.f17874f = (i10 - i3) + i11;
        }
    }

    public final void b(int i3, long j10, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.p(z11);
        if (this.f17873e == 182 && z10 && this.f17871b) {
            boolean z12 = this.d;
            long j11 = this.h;
            this.f17870a.d(j11, z12 ? 1 : 0, (int) (j10 - this.f17875g), i3, null);
        }
        if (this.f17873e != 179) {
            this.f17875g = j10;
        }
    }
}
