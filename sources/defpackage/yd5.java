package defpackage;
public final class yd5 {
    public final yzb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public yd5(yzb yzbVar) {
        this.a = yzbVar;
    }

    public final void a(int i, int i2, byte[] bArr) {
        boolean z;
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & 192) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.d = z;
                this.c = false;
                return;
            }
            this.f = (i2 - i) + i3;
        }
    }

    public final void b(int i, long j, boolean z) {
        boolean z2;
        if (this.h != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        jte.p(z2);
        if (this.e == 182 && z && this.b) {
            boolean z3 = this.d;
            long j2 = this.h;
            this.a.a(j2, z3 ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
