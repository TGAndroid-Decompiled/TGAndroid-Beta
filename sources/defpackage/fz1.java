package defpackage;

import android.os.Build;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class fz1 implements b42, ed, j79, e39, nw4, ml0, mw4, m7, j62, gj, e12 {
    public final byte a;
    public final x02 b;

    public fz1(x02 x02Var, byte b) {
        this.a = b;
        this.b = x02Var;
    }

    @Override
    public final void a(org.telegram.tgnet.TLRPC.MessageMedia r87, android.text.Editable r88, defpackage.ud8 r89, java.util.ArrayList r90, final boolean r91, final int r92, final long r93) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.a(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, ud8, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                ((mu1) x02Var.Z1).b(messageMedia, i, z, i2, 0L);
                return;
            case 12:
                ((mu1) x02Var.Z1).b(messageMedia, i, z, i2, j);
                return;
            default:
                ((mu1) x02Var.Z1).b(messageMedia, i, z, i2, j);
                return;
        }
    }

    @Override
    public final boolean d(int i, View view) {
        TLRPC.User user;
        if (view instanceof q02) {
            q02 q02Var = (q02) view;
            x02 x02Var = this.b;
            if (!x02Var.P1 && (user = q02Var.b) != null) {
                x02Var.f1(q02Var.c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(k79 k79Var) {
        this.b.d1();
    }

    @Override
    public final void g(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        Editable editable2;
        x02 x02Var = this.b;
        e12 e12Var = x02Var.S1;
        if (e12Var != null) {
            e12Var.g(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        d dVar = x02Var.Z1;
        if (dVar != null && (dVar instanceof mu1)) {
            mu1 mu1Var = (mu1) dVar;
            if (mu1Var.l5()) {
                mu1Var.y6(editable, null);
                j5 accountInstance = mu1Var.getAccountInstance();
                if (editable != null) {
                    editable2 = editable;
                } else {
                    editable2 = null;
                }
                long j3 = mu1Var.l6;
                k27 k27Var = mu1Var.F5;
                k27 k27Var2 = mu1Var.m4;
                k27 k27Var3 = mu1Var.H5;
                j1a Q6 = mu1Var.Q6();
                co3 co3Var = z3a.J;
                new Thread(new p1a(null, arrayList, j3, accountInstance, editable2, false, null, k27Var3, k27Var, k27Var2, z, i, i2, null, Q6, j, z2, j2, null)).start();
                mu1Var.z4();
                return;
            }
            return;
        }
        v02 v02Var = x02Var.W3;
        if (v02Var != null) {
            v02Var.R0(arrayList, editable, z, i, i2, j, z2, j2);
        }
    }

    @Override
    public final void h(int i) {
        this.b.U2.getActionBarMenuOnItemClick().b(i);
    }

    @Override
    public final int i() {
        return bkb.v0(bkb.c6, this.b.J0);
    }

    @Override
    public final void j(int i) {
        x02 x02Var = this.b;
        cq3 cq3Var = x02Var.C4;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            if (fod.a(i, 4)) {
                zw4 e = x02Var.X0.e();
                e.b(x02Var.b.getY(), x02Var.b.getWidth(), x02Var.b.getY() + x02Var.b.getHeight());
                cq3Var.h(e);
            }
            cq3Var.e(x02Var.F4, x02Var.b.getWidth(), x02Var.b.getHeight());
        }
    }

    @Override
    public final int k(wjb wjbVar, boolean z) {
        float f;
        int i;
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 5:
                if (e66.e(262144)) {
                    f = 0.85f;
                } else {
                    f = 0.76f;
                }
                if (z) {
                    i = bkb.Z6;
                } else {
                    i = bkb.h5;
                }
                int v0 = bkb.v0(i, wjbVar);
                int v02 = bkb.v0(bkb.c6, wjbVar);
                if (x02Var.j4) {
                    return bm2.f(0.75f, v02, x02Var.k4);
                }
                return nod.m(f, v0, v02);
            case 6:
                if (x02Var.j4) {
                    return 0;
                }
                if (!z) {
                    return -1;
                }
                return 687865855;
            case 7:
                if (x02Var.j4) {
                    return 0;
                }
                if (!z) {
                    return -1;
                }
                return 352321535;
            default:
                if (x02Var.j4) {
                    if (gl.B(x02Var.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        long j;
        boolean p1;
        switch (this.a) {
            case 14:
                x02 x02Var = this.b;
                p02 p02Var = x02Var.v2;
                if (p02Var != x02Var.d2 && p02Var != x02Var.k2) {
                    if (!p02Var.M(z, i, i2, 0L, x02Var.a1())) {
                        x02Var.A4 = true;
                        x02Var.dismiss();
                        return;
                    }
                    return;
                }
                x02Var.p1(z, i, 0, x02Var.K2, x02Var.a1());
                return;
            default:
                x02 x02Var2 = this.b;
                bx1 bx1Var = x02Var2.b2;
                if (bx1Var != null) {
                    j = bx1Var.i();
                } else {
                    j = 0;
                }
                long j2 = j;
                e02 e02Var = x02Var2.F2;
                x02Var2.K2 = j2;
                e02Var.setEffect(j2);
                p02 p02Var2 = x02Var2.v2;
                if (p02Var2 != x02Var2.d2 && p02Var2 != x02Var2.k2) {
                    if (!p02Var2.M(z, i, i2, j2, x02Var2.a1())) {
                        x02Var2.dismiss();
                    }
                    p1 = false;
                } else {
                    p1 = x02Var2.p1(z, i, i2, j2, x02Var2.a1());
                }
                bx1 bx1Var2 = x02Var2.b2;
                if (bx1Var2 != null) {
                    bx1Var2.f(!p1);
                    x02Var2.b2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        x02 x02Var = this.b;
        x02Var.A4 = true;
        x02Var.dismiss();
    }

    @Override
    public final void c() {
    }
}
