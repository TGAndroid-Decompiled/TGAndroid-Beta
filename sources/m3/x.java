package m3;
public final class x {
    public final byte[] f17264a = new byte[10];
    public boolean f17265b;
    public int f17266c;
    public long d;
    public int f17267e;
    public int f17268f;
    public int f17269g;

    public final void a(w wVar, v vVar) {
        if (this.f17266c > 0) {
            wVar.e(this.d, this.f17267e, this.f17268f, this.f17269g, vVar);
            this.f17266c = 0;
        }
    }

    public final void b(w wVar, long j10, int i9, int i10, int i11, v vVar) {
        boolean z10;
        if (this.f17269g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f17265b) {
                int i12 = this.f17266c;
                int i13 = i12 + 1;
                this.f17266c = i13;
                if (i12 == 0) {
                    this.d = j10;
                    this.f17267e = i9;
                    this.f17268f = 0;
                }
                this.f17268f += i10;
                this.f17269g = i11;
                if (i13 >= 16) {
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
        char c10;
        if (!this.f17265b) {
            int i9 = 0;
            byte[] bArr = this.f17264a;
            lVar.c(0, 10, bArr);
            lVar.t();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i9 = 1;
                    }
                    if (i9 != 0) {
                        c10 = '\t';
                    } else {
                        c10 = '\b';
                    }
                    i9 = 40 << ((bArr[c10] >> 4) & 7);
                }
            }
            if (i9 == 0) {
                return;
            }
            this.f17265b = true;
        }
    }
}
