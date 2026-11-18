package m4;

import a8.la;
import f3.i0;
public final class m {
    public final i0 f20661a;
    public boolean f20662b;
    public boolean f20663c;
    public boolean d;
    public int f20664e;
    public int f20665f;
    public long f20666g;
    public long h;

    public m(i0 i0Var) {
        this.f20661a = i0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        boolean z10;
        if (this.f20663c) {
            int i11 = this.f20665f;
            int i12 = (i7 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f20663c = false;
                return;
            }
            this.f20665f = (i10 - i7) + i11;
        }
    }

    public final void b(int i7, long j3, boolean z10) {
        boolean z11;
        if (this.h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.p(z11);
        if (this.f20664e == 182 && z10 && this.f20662b) {
            boolean z12 = this.d;
            long j10 = this.h;
            this.f20661a.c(j10, z12 ? 1 : 0, (int) (j3 - this.f20666g), i7, null);
        }
        if (this.f20664e != 179) {
            this.f20666g = j3;
        }
    }
}
