package defpackage;
public final class dr4 {
    public final yzb a;
    public zzb d;
    public id3 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public go4 l;
    public go4 m;
    public boolean n;
    public final tzb b = new tzb();
    public final yw7 c = new yw7();
    public final yw7 j = new yw7(1);
    public final yw7 k = new yw7();

    public dr4(yzb yzbVar, zzb zzbVar, id3 id3Var, go4 go4Var) {
        this.a = yzbVar;
        this.d = zzbVar;
        this.e = id3Var;
        this.m = go4Var;
        if (c1d.e(go4Var.t)) {
            this.l = go4Var;
        }
        this.d = zzbVar;
        this.e = id3Var;
        if (this.l == null) {
            yzbVar.g(this.m);
        }
        e();
    }

    public final int a() {
        int i;
        if (!this.n) {
            i = this.d.g[this.f];
        } else if (this.b.j[this.f]) {
            i = 1;
        } else {
            i = 0;
        }
        if (b() != null) {
            return i | 1073741824;
        }
        return i;
    }

    public final szb b() {
        if (this.n) {
            tzb tzbVar = this.b;
            id3 id3Var = tzbVar.a;
            String str = hac.a;
            int i = id3Var.a;
            szb szbVar = tzbVar.m;
            if (szbVar == null) {
                szb[] szbVarArr = this.d.a.n;
                if (szbVarArr == null) {
                    szbVar = null;
                } else {
                    szbVar = szbVarArr[i];
                }
            }
            if (szbVar != null && szbVar.a) {
                return szbVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        yw7 yw7Var;
        boolean z;
        boolean z2;
        int i3;
        szb b = b();
        if (b == null) {
            return 0;
        }
        int i4 = b.d;
        tzb tzbVar = this.b;
        if (i4 != 0) {
            yw7Var = tzbVar.n;
        } else {
            byte[] bArr = b.e;
            String str = hac.a;
            int length = bArr.length;
            yw7 yw7Var2 = this.k;
            yw7Var2.L(length, bArr);
            i4 = bArr.length;
            yw7Var = yw7Var2;
        }
        int i5 = this.f;
        if (tzbVar.k && tzbVar.l[i5]) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        yw7 yw7Var3 = this.j;
        byte[] bArr2 = yw7Var3.a;
        if (z2) {
            i3 = 128;
        } else {
            i3 = 0;
        }
        bArr2[0] = (byte) (i3 | i4);
        yw7Var3.N(0);
        yzb yzbVar = this.a;
        yzbVar.b(yw7Var3, 1, 1);
        yzbVar.b(yw7Var, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        yw7 yw7Var4 = this.c;
        if (!z) {
            yw7Var4.K(8);
            byte[] bArr3 = yw7Var4.a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = 0;
            bArr3[3] = (byte) (i2 & 255);
            bArr3[4] = (byte) ((i >> 24) & 255);
            bArr3[5] = (byte) ((i >> 16) & 255);
            bArr3[6] = (byte) ((i >> 8) & 255);
            bArr3[7] = (byte) (i & 255);
            yzbVar.b(yw7Var4, 8, 1);
            return i4 + 9;
        }
        yw7 yw7Var5 = tzbVar.n;
        int H = yw7Var5.H();
        yw7Var5.O(-2);
        int i6 = (H * 6) + 2;
        if (i2 != 0) {
            yw7Var4.K(i6);
            byte[] bArr4 = yw7Var4.a;
            yw7Var5.k(0, i6, bArr4);
            int i7 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
            bArr4[2] = (byte) ((i7 >> 8) & 255);
            bArr4[3] = (byte) (i7 & 255);
        } else {
            yw7Var4 = yw7Var5;
        }
        yzbVar.b(yw7Var4, i6, 1);
        return i4 + 1 + i6;
    }

    public final void e() {
        tzb tzbVar = this.b;
        tzbVar.d = 0;
        tzbVar.p = 0L;
        tzbVar.q = false;
        tzbVar.k = false;
        tzbVar.o = false;
        tzbVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
