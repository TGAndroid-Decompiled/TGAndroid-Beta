package defpackage;

import java.io.EOFException;
public final class vab implements wxb {
    public final wxb a;
    public final sab b;
    public uab g;
    public fm4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = g8c.b;
    public final xu7 c = new xu7();

    public vab(wxb wxbVar, sab sabVar) {
        this.a = wxbVar;
        this.b = sabVar;
    }

    @Override
    public final void a(long r6, int r8, int r9, int r10, defpackage.vxb r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vab.a(long, int, int, int, vxb):void");
    }

    @Override
    public final void b(xu7 xu7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(xu7Var, i, i2);
            return;
        }
        h(i);
        xu7Var.k(this.e, i, this.f);
        this.e += i;
    }

    @Override
    public final int c(g63 g63Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(g63Var, i, z);
        }
        h(i);
        int read = g63Var.read(this.f, this.e, i);
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
    public final void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override
    public final void g(fm4 fm4Var) {
        boolean z;
        uab uabVar;
        fm4Var.t.getClass();
        String str = fm4Var.t;
        if (ud7.h(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        boolean equals = fm4Var.equals(this.h);
        sab sabVar = this.b;
        if (!equals) {
            this.h = fm4Var;
            if (sabVar.h(fm4Var)) {
                uabVar = sabVar.r(fm4Var);
            } else {
                uabVar = null;
            }
            this.g = uabVar;
        }
        uab uabVar2 = this.g;
        wxb wxbVar = this.a;
        if (uabVar2 == null) {
            wxbVar.g(fm4Var);
            return;
        }
        em4 a = fm4Var.a();
        a.s = ud7.n("application/x-media3-cues");
        a.k = str;
        a.x = Long.MAX_VALUE;
        a.T = sabVar.y(fm4Var);
        yjb.v(a, wxbVar);
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
