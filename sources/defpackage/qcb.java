package defpackage;

import java.util.ArrayList;
import java.util.List;
public final class qcb implements s84 {
    public final vcb a;
    public final go4 b;
    public final ArrayList c;
    public yzb f;
    public u84 g;
    public ip5 h;
    public int i;
    public byte j;
    public long[] k;
    public long l;
    public byte[] e = hac.b;
    public final yw7 d = new yw7();

    public qcb(vcb vcbVar, go4 go4Var) {
        go4 go4Var2;
        this.a = vcbVar;
        if (go4Var != null) {
            fo4 a = go4Var.a();
            a.s = wf7.n("application/x-media3-cues");
            a.k = go4Var.t;
            a.T = vcbVar.r();
            go4Var2 = new go4(a);
        } else {
            go4Var2 = null;
        }
        this.b = go4Var2;
        this.c = new ArrayList();
        this.j = (byte) 0;
        this.k = hac.c;
        this.l = -9223372036854775807L;
    }

    @Override
    public final int b(defpackage.t84 r20, defpackage.u21 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcb.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        boolean z;
        byte b = this.j;
        byte b2 = 1;
        if (b != 0 && b != 5) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        this.l = j2;
        byte b3 = this.j;
        if (b3 == 2) {
            this.j = (byte) 1;
        } else {
            b2 = b3;
        }
        if (b2 == 4) {
            this.j = (byte) 3;
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        this.g = u84Var;
        yzb c0 = u84Var.c0(0, 3);
        this.f = c0;
        go4 go4Var = this.b;
        if (go4Var != null) {
            c0.g(go4Var);
            u84Var.B();
            ip5 ip5Var = new ip5(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = ip5Var;
            u84Var.f0(ip5Var);
        }
        this.j = (byte) 1;
    }

    public final void g(pcb pcbVar) {
        this.f.getClass();
        byte[] bArr = pcbVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        yw7 yw7Var = this.d;
        yw7Var.L(length2, bArr);
        this.f.e(length, yw7Var);
        this.f.a(pcbVar.a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.a.reset();
        this.j = (byte) 5;
    }

    @Override
    public final s84 a() {
        return this;
    }
}
