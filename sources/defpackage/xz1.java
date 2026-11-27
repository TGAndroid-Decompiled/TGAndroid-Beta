package defpackage;

import android.os.Build;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class xz1 implements fd, wa9, t69, sy4, nl0, ry4, n7, r42, z62, hj, u12 {
    public final byte a;
    public final n12 b;

    public xz1(n12 n12Var, byte b) {
        this.a = b;
        this.b = n12Var;
    }

    @Override
    public final void a(org.telegram.tgnet.TLRPC.MessageMedia r87, android.text.Editable r88, defpackage.ih8 r89, java.util.ArrayList r90, final boolean r91, final int r92, final long r93) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz1.a(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, ih8, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 11:
                ((zu1) n12Var.Z1).b(messageMedia, i, z, i2, 0L);
                return;
            case 12:
                ((zu1) n12Var.Z1).b(messageMedia, i, z, i2, j);
                return;
            default:
                ((zu1) n12Var.Z1).b(messageMedia, i, z, i2, j);
                return;
        }
    }

    @Override
    public final void d(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        Editable editable2;
        n12 n12Var = this.b;
        u12 u12Var = n12Var.S1;
        if (u12Var != null) {
            u12Var.d(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        e eVar = n12Var.Z1;
        if (eVar != null && (eVar instanceof zu1)) {
            zu1 zu1Var = (zu1) eVar;
            if (zu1Var.r5()) {
                zu1Var.F6(editable, null);
                k5 accountInstance = zu1Var.getAccountInstance();
                if (editable != null) {
                    editable2 = editable;
                } else {
                    editable2 = null;
                }
                long j3 = zu1Var.l6;
                r47 r47Var = zu1Var.F5;
                r47 r47Var2 = zu1Var.m4;
                r47 r47Var3 = zu1Var.H5;
                c5a X6 = zu1Var.X6();
                to3 to3Var = r7a.J;
                new Thread(new o5a(null, arrayList, j3, accountInstance, editable2, false, null, r47Var3, r47Var, r47Var2, z, i, i2, null, X6, j, z2, j2, null)).start();
                zu1Var.E4();
                return;
            }
            return;
        }
        l12 l12Var = n12Var.W3;
        if (l12Var != null) {
            l12Var.f0(arrayList, editable, z, i, i2, j, z2, j2);
        }
    }

    @Override
    public final boolean e(int i, View view) {
        TLRPC.User user;
        if (view instanceof g12) {
            g12 g12Var = (g12) view;
            n12 n12Var = this.b;
            if (!n12Var.P1 && (user = g12Var.b) != null) {
                n12Var.g1(g12Var.c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(xa9 xa9Var) {
        this.b.e1();
    }

    @Override
    public final void g(int i) {
        this.b.U2.getActionBarMenuOnItemClick().b(i);
    }

    @Override
    public final int h() {
        return aob.v0(aob.d6, this.b.J0);
    }

    @Override
    public final void k(int i) {
        n12 n12Var = this.b;
        tq3 tq3Var = n12Var.C4;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            if (vsd.a(i, 4)) {
                fz4 e = n12Var.X0.e();
                e.b(n12Var.b.getY(), n12Var.b.getWidth(), n12Var.b.getY() + n12Var.b.getHeight());
                tq3Var.h(e);
            }
            tq3Var.e(n12Var.F4, n12Var.b.getWidth(), n12Var.b.getHeight());
        }
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
        float f;
        int i;
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 4:
                if (i86.e(262144)) {
                    f = 0.85f;
                } else {
                    f = 0.76f;
                }
                if (z) {
                    i = aob.a7;
                } else {
                    i = aob.i5;
                }
                int v0 = aob.v0(i, vnbVar);
                int v02 = aob.v0(aob.d6, vnbVar);
                if (n12Var.j4) {
                    return vm2.f(0.75f, v02, n12Var.k4);
                }
                return dtd.m(f, v0, v02);
            case 5:
                if (n12Var.j4) {
                    return 0;
                }
                if (!z) {
                    return -1;
                }
                return 687865855;
            case 6:
                if (n12Var.j4) {
                    return 0;
                }
                if (!z) {
                    return -1;
                }
                return 352321535;
            default:
                if (n12Var.j4) {
                    if (hl.B(n12Var.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        n12 n12Var = this.b;
        n12Var.A4 = true;
        n12Var.dismiss();
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        long j;
        boolean q1;
        switch (this.a) {
            case 14:
                n12 n12Var = this.b;
                f12 f12Var = n12Var.v2;
                if (f12Var != n12Var.d2 && f12Var != n12Var.k2) {
                    if (!f12Var.K(z, i, i2, 0L, n12Var.b1())) {
                        n12Var.A4 = true;
                        n12Var.dismiss();
                        return;
                    }
                    return;
                }
                n12Var.q1(z, i, 0, n12Var.K2, n12Var.b1());
                return;
            default:
                n12 n12Var2 = this.b;
                ox1 ox1Var = n12Var2.b2;
                if (ox1Var != null) {
                    j = ox1Var.i();
                } else {
                    j = 0;
                }
                long j2 = j;
                u02 u02Var = n12Var2.F2;
                n12Var2.K2 = j2;
                u02Var.setEffect(j2);
                f12 f12Var2 = n12Var2.v2;
                if (f12Var2 != n12Var2.d2 && f12Var2 != n12Var2.k2) {
                    if (!f12Var2.K(z, i, i2, j2, n12Var2.b1())) {
                        n12Var2.dismiss();
                    }
                    q1 = false;
                } else {
                    q1 = n12Var2.q1(z, i, i2, j2, n12Var2.b1());
                }
                ox1 ox1Var2 = n12Var2.b2;
                if (ox1Var2 != null) {
                    ox1Var2.f(!q1);
                    n12Var2.b2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
    }
}
