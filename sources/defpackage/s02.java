package defpackage;

import android.os.Build;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class s02 implements m52, ee, l99, h59, py4, mm0, oy4, m7, u72, gk, p22 {
    public final byte a;
    public final i22 b;

    public s02(i22 i22Var, byte b) {
        this.a = b;
        this.b = i22Var;
    }

    @Override
    public final void a(org.telegram.tgnet.TLRPC.MessageMedia r87, android.text.Editable r88, defpackage.wf8 r89, java.util.ArrayList r90, final boolean r91, final int r92, final long r93) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s02.a(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, wf8, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                ((yv1) i22Var.Z1).b(messageMedia, i, z, i2, 0L);
                return;
            case 12:
                ((yv1) i22Var.Z1).b(messageMedia, i, z, i2, j);
                return;
            default:
                ((yv1) i22Var.Z1).b(messageMedia, i, z, i2, j);
                return;
        }
    }

    @Override
    public final void e(m99 m99Var) {
        this.b.d1();
    }

    @Override
    public final void f(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        Editable editable2;
        i22 i22Var = this.b;
        p22 p22Var = i22Var.S1;
        if (p22Var != null) {
            p22Var.f(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        d dVar = i22Var.Z1;
        if (dVar != null && (dVar instanceof yv1)) {
            yv1 yv1Var = (yv1) dVar;
            if (yv1Var.s5()) {
                yv1Var.F6(editable, null);
                j5 accountInstance = yv1Var.getAccountInstance();
                if (editable != null) {
                    editable2 = editable;
                } else {
                    editable2 = null;
                }
                long j3 = yv1Var.l6;
                k47 k47Var = yv1Var.F5;
                k47 k47Var2 = yv1Var.m4;
                k47 k47Var3 = yv1Var.H5;
                l3a X6 = yv1Var.X6();
                mp3 mp3Var = a6a.J;
                new Thread(new r3a(null, arrayList, j3, accountInstance, editable2, false, null, k47Var3, k47Var, k47Var2, z, i, i2, null, X6, j, z2, j2, null)).start();
                yv1Var.E4();
                return;
            }
            return;
        }
        g22 g22Var = i22Var.W3;
        if (g22Var != null) {
            g22Var.n0(arrayList, editable, z, i, i2, j, z2, j2);
        }
    }

    @Override
    public final boolean g(int i, View view) {
        TLRPC.User user;
        if (view instanceof b22) {
            b22 b22Var = (b22) view;
            i22 i22Var = this.b;
            if (!i22Var.P1 && (user = b22Var.b) != null) {
                i22Var.f1(b22Var.c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void h(int i) {
        this.b.U2.getActionBarMenuOnItemClick().b(i);
    }

    @Override
    public final int i() {
        return cmb.v0(cmb.c6, this.b.J0);
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        float f;
        int i;
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 5:
                if (e86.e(262144)) {
                    f = 0.85f;
                } else {
                    f = 0.76f;
                }
                if (z) {
                    i = cmb.Z6;
                } else {
                    i = cmb.h5;
                }
                int v0 = cmb.v0(i, ylbVar);
                int v02 = cmb.v0(cmb.c6, ylbVar);
                if (i22Var.j4) {
                    return on2.f(0.75f, v02, i22Var.k4);
                }
                return qqd.m(f, v0, v02);
            case 6:
                if (i22Var.j4) {
                    return 0;
                }
                if (!z) {
                    return -1;
                }
                return 687865855;
            case 7:
                if (i22Var.j4) {
                    return 0;
                }
                if (!z) {
                    return -1;
                }
                return 352321535;
            default:
                if (i22Var.j4) {
                    if (gm.B(i22Var.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        i22 i22Var = this.b;
        i22Var.A4 = true;
        i22Var.dismiss();
    }

    @Override
    public final void s(int i) {
        i22 i22Var = this.b;
        mr3 mr3Var = i22Var.C4;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            if (iqd.a(i, 4)) {
                bz4 e = i22Var.X0.e();
                e.b(i22Var.b.getY(), i22Var.b.getWidth(), i22Var.b.getY() + i22Var.b.getHeight());
                mr3Var.h(e);
            }
            mr3Var.e(i22Var.F4, i22Var.b.getWidth(), i22Var.b.getHeight());
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        long j;
        boolean p1;
        switch (this.a) {
            case 14:
                i22 i22Var = this.b;
                a22 a22Var = i22Var.v2;
                if (a22Var != i22Var.d2 && a22Var != i22Var.k2) {
                    if (!a22Var.K(z, i, i2, 0L, i22Var.a1())) {
                        i22Var.A4 = true;
                        i22Var.dismiss();
                        return;
                    }
                    return;
                }
                i22Var.p1(z, i, 0, i22Var.K2, i22Var.a1());
                return;
            default:
                i22 i22Var2 = this.b;
                oy1 oy1Var = i22Var2.b2;
                if (oy1Var != null) {
                    j = oy1Var.i();
                } else {
                    j = 0;
                }
                long j2 = j;
                p12 p12Var = i22Var2.F2;
                i22Var2.K2 = j2;
                p12Var.setEffect(j2);
                a22 a22Var2 = i22Var2.v2;
                if (a22Var2 != i22Var2.d2 && a22Var2 != i22Var2.k2) {
                    if (!a22Var2.K(z, i, i2, j2, i22Var2.a1())) {
                        i22Var2.dismiss();
                    }
                    p1 = false;
                } else {
                    p1 = i22Var2.p1(z, i, i2, j2, i22Var2.a1());
                }
                oy1 oy1Var2 = i22Var2.b2;
                if (oy1Var2 != null) {
                    oy1Var2.f(!p1);
                    i22Var2.b2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
    }
}
