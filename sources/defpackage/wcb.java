package defpackage;

import java.io.EOFException;
public final class wcb implements yzb {
    public final yzb a;
    public final tcb b;
    public vcb g;
    public go4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = hac.b;
    public final yw7 c = new yw7();

    public wcb(yzb yzbVar, tcb tcbVar) {
        this.a = yzbVar;
        this.b = tcbVar;
    }

    @Override
    public final void a(long r6, int r8, int r9, int r10, defpackage.xzb r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcb.a(long, int, int, int, xzb):void");
    }

    @Override
    public final void b(yw7 yw7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(yw7Var, i, i2);
            return;
        }
        h(i);
        yw7Var.k(this.e, i, this.f);
        this.e += i;
    }

    @Override
    public final int c(s73 s73Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(s73Var, i, z);
        }
        h(i);
        int read = s73Var.read(this.f, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override
    public final void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override
    public final void g(go4 go4Var) {
        boolean z;
        vcb vcbVar;
        go4Var.t.getClass();
        String str = go4Var.t;
        if (wf7.h(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        boolean equals = go4Var.equals(this.h);
        tcb tcbVar = this.b;
        if (!equals) {
            this.h = go4Var;
            if (tcbVar.h(go4Var)) {
                vcbVar = tcbVar.v(go4Var);
            } else {
                vcbVar = null;
            }
            this.g = vcbVar;
        }
        vcb vcbVar2 = this.g;
        yzb yzbVar = this.a;
        if (vcbVar2 == null) {
            yzbVar.g(go4Var);
            return;
        }
        fo4 a = go4Var.a();
        a.s = wf7.n("application/x-media3-cues");
        a.k = str;
        a.x = Long.MAX_VALUE;
        a.T = tcbVar.C(go4Var);
        mlb.w(a, yzbVar);
    }

    public final void h(int i) {
        byte[] bArr;
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 << 1, i + i3);
        byte[] bArr2 = this.f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr;
    }

    @Override
    public final void d(long j) {
    }
}
