package o3;
public final class x {
    public final byte[] f19123a = new byte[10];
    public boolean f19124b;
    public int f19125c;
    public long d;
    public int f19126e;
    public int f19127f;
    public int f19128g;

    public final void a(w wVar, v vVar) {
        if (this.f19125c > 0) {
            wVar.c(this.d, this.f19126e, this.f19127f, this.f19128g, vVar);
            this.f19125c = 0;
        }
    }

    public final void b(w wVar, long j10, int i10, int i11, int i12, v vVar) {
        boolean z10;
        if (this.f19128g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f19124b) {
                int i13 = this.f19125c;
                int i14 = i13 + 1;
                this.f19125c = i14;
                if (i13 == 0) {
                    this.d = j10;
                    this.f19126e = i10;
                    this.f19127f = 0;
                }
                this.f19127f += i11;
                this.f19128g = i12;
                if (i14 >= 16) {
                    a(wVar, vVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(l lVar) {
        char c3;
        if (!this.f19124b) {
            int i10 = 0;
            byte[] bArr = this.f19123a;
            lVar.a(0, 10, bArr);
            lVar.s();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        c3 = '\t';
                    } else {
                        c3 = '\b';
                    }
                    i10 = 40 << ((bArr[c3] >> 4) & 7);
                }
            }
            if (i10 == 0) {
                return;
            }
            this.f19124b = true;
        }
    }
}
