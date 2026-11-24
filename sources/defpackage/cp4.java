package defpackage;
public final class cp4 {
    public final wxb a;
    public xxb d;
    public wb3 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public fm4 l;
    public fm4 m;
    public boolean n;
    public final rxb b = new rxb();
    public final xu7 c = new xu7();
    public final xu7 j = new xu7(1);
    public final xu7 k = new xu7();

    public cp4(wxb wxbVar, xxb xxbVar, wb3 wb3Var, fm4 fm4Var) {
        this.a = wxbVar;
        this.d = xxbVar;
        this.e = wb3Var;
        this.m = fm4Var;
        if (bzc.e(fm4Var.t)) {
            this.l = fm4Var;
        }
        this.d = xxbVar;
        this.e = wb3Var;
        if (this.l == null) {
            wxbVar.g(this.m);
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

    public final qxb b() {
        if (this.n) {
            rxb rxbVar = this.b;
            wb3 wb3Var = rxbVar.a;
            String str = g8c.a;
            int i = wb3Var.a;
            qxb qxbVar = rxbVar.m;
            if (qxbVar == null) {
                qxb[] qxbVarArr = this.d.a.n;
                if (qxbVarArr == null) {
                    qxbVar = null;
                } else {
                    qxbVar = qxbVarArr[i];
                }
            }
            if (qxbVar != null && qxbVar.a) {
                return qxbVar;
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
        xu7 xu7Var;
        boolean z;
        boolean z2;
        int i3;
        qxb b = b();
        if (b == null) {
            return 0;
        }
        int i4 = b.d;
        rxb rxbVar = this.b;
        if (i4 != 0) {
            xu7Var = rxbVar.n;
        } else {
            byte[] bArr = b.e;
            String str = g8c.a;
            int length = bArr.length;
            xu7 xu7Var2 = this.k;
            xu7Var2.L(length, bArr);
            i4 = bArr.length;
            xu7Var = xu7Var2;
        }
        int i5 = this.f;
        if (rxbVar.k && rxbVar.l[i5]) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        xu7 xu7Var3 = this.j;
        byte[] bArr2 = xu7Var3.a;
        if (z2) {
            i3 = 128;
        } else {
            i3 = 0;
        }
        bArr2[0] = (byte) (i3 | i4);
        xu7Var3.N(0);
        wxb wxbVar = this.a;
        wxbVar.b(xu7Var3, 1, 1);
        wxbVar.b(xu7Var, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        xu7 xu7Var4 = this.c;
        if (!z) {
            xu7Var4.K(8);
            byte[] bArr3 = xu7Var4.a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = 0;
            bArr3[3] = (byte) (i2 & 255);
            bArr3[4] = (byte) ((i >> 24) & 255);
            bArr3[5] = (byte) ((i >> 16) & 255);
            bArr3[6] = (byte) ((i >> 8) & 255);
            bArr3[7] = (byte) (i & 255);
            wxbVar.b(xu7Var4, 8, 1);
            return i4 + 9;
        }
        xu7 xu7Var5 = rxbVar.n;
        int H = xu7Var5.H();
        xu7Var5.O(-2);
        int i6 = (H * 6) + 2;
        if (i2 != 0) {
            xu7Var4.K(i6);
            byte[] bArr4 = xu7Var4.a;
            xu7Var5.k(0, i6, bArr4);
            int i7 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
            bArr4[2] = (byte) ((i7 >> 8) & 255);
            bArr4[3] = (byte) (i7 & 255);
        } else {
            xu7Var4 = xu7Var5;
        }
        wxbVar.b(xu7Var4, i6, 1);
        return i4 + 1 + i6;
    }

    public final void e() {
        rxb rxbVar = this.b;
        rxbVar.d = 0;
        rxbVar.p = 0L;
        rxbVar.q = false;
        rxbVar.k = false;
        rxbVar.o = false;
        rxbVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
