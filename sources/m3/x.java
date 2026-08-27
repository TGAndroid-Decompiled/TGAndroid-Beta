package m3;

public final class x {

    public final byte[] f17640a = new byte[10];

    public boolean f17641b;

    public int f17642c;
    public long d;

    public int f17643e;

    public int f17644f;

    public int f17645g;

    public final void a(w wVar, v vVar) {
        if (this.f17642c > 0) {
            wVar.e(this.d, this.f17643e, this.f17644f, this.f17645g, vVar);
            this.f17642c = 0;
        }
    }

    public final void b(w wVar, long j10, int i10, int i11, int i12, v vVar) {
        if (!(this.f17645g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f17641b) {
            int i13 = this.f17642c;
            int i14 = i13 + 1;
            this.f17642c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.f17643e = i10;
                this.f17644f = 0;
            }
            this.f17644f += i11;
            this.f17645g = i12;
            if (i14 >= 16) {
                a(wVar, vVar);
            }
        }
    }

    public final void c(l lVar) {
        if (this.f17641b) {
            return;
        }
        int i10 = 0;
        byte[] bArr = this.f17640a;
        lVar.b(0, 10, bArr);
        lVar.q();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i10 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f17641b = true;
    }
}
