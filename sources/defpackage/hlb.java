package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hlb implements ll5, d39, arc, ed {
    public final byte a;
    public final qmb b;

    public hlb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        qmb qmbVar = this.b;
        if (!(qmbVar.D1 instanceof krc)) {
            Drawable t = imageReceiver.t();
            if (z && t != null) {
                slb slbVar = qmbVar.a;
                gl.q(t);
                slbVar.k(qmbVar.P0(t), t, Float.valueOf(qmbVar.n1));
                if (!z2 && qmbVar.H1 && qmbVar.y1 == null) {
                    qmbVar.z0.getImageReceiver().B0 = false;
                    qmbVar.m1();
                    qmbVar.z0.getImageReceiver().B0 = true;
                }
                qmbVar.W0();
            }
        }
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            boolean E2 = gb2Var.E2(f);
            qmb qmbVar = this.b;
            if (E2) {
                if (gb2Var.getMessageObject().O3()) {
                    qmbVar.c1(3, true);
                    return;
                } else {
                    qmbVar.c1(1, true);
                    return;
                }
            }
            qmbVar.c1(2, true);
        }
    }

    @Override
    public final void h(int i, int i2) {
        qmb qmbVar = this.b;
        if (!qmbVar.G1) {
            return;
        }
        qmbVar.z0.getBackground();
        float f = 1.0f;
        if (qmbVar.D0 != null) {
            f = (qmbVar.z0.getScaleX() - 1.0f) / (qmbVar.A1 - 1.0f);
        }
        qmbVar.z0.setTranslationX(i * f);
        qmbVar.z0.setTranslationY(i2 * f);
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        boolean z;
        byte b = this.a;
        qmb qmbVar = this.b;
        switch (b) {
            case 3:
                qmbVar.u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                qmbVar.O0(false);
                return;
            case 5:
                zjb zjbVar = qmbVar.w;
                if (zjbVar.j == 4294967296L) {
                    zjbVar.j = 0L;
                    zjbVar.k = 0L;
                    zjbVar.l = 0L;
                    zjbVar.m = 0L;
                    qmbVar.q1(false);
                    bkb.r1(false, false);
                }
                qmbVar.x = true;
                bkb.t1(true);
                qmbVar.c1(2, false);
                return;
            case 6:
                zjb zjbVar2 = qmbVar.w;
                if (bkb.a1() && bkb.I.j0.d != 0) {
                    vjb vjbVar = zjbVar2.y;
                    zjbVar2.j = vjbVar.d;
                    zjbVar2.k = vjbVar.e;
                    zjbVar2.l = vjbVar.f;
                    zjbVar2.m = vjbVar.g;
                    zjbVar2.n = vjbVar.h;
                    String str = vjbVar.c;
                    zjbVar2.o = str;
                    float f = vjbVar.k;
                    zjbVar2.p = f;
                    qmbVar.n1 = f;
                    if (str != null && !"c".equals(str)) {
                        int size = qmbVar.W0.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) qmbVar.W0.get(i2);
                                if (tL_wallPaper.pattern && zjbVar2.o.equals(tL_wallPaper.slug)) {
                                    qmbVar.Y0 = tL_wallPaper;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        qmbVar.Y0 = null;
                    }
                    qmbVar.x = true;
                    rqc rqcVar = qmbVar.L0[1];
                    if (qmbVar.Y0 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rqcVar.a(z, true);
                    qmbVar.q1(false);
                    bkb.r1(false, false);
                }
                Drawable background = qmbVar.z0.getBackground();
                if (background instanceof ye7) {
                    ye7 ye7Var = (ye7) background;
                    ye7Var.r(100, null);
                    boolean o = bkb.I.o();
                    float f2 = qmbVar.n1;
                    if (o) {
                        if (f2 < 0.0f) {
                            qmbVar.z0.getImageReceiver().W(ye7Var.k);
                        }
                        ty0 ty0Var = qmbVar.V0;
                        if (ty0Var != null) {
                            ty0Var.setTwoSided(true);
                        }
                    } else if (f2 < 0.0f) {
                        qmbVar.n1 = -f2;
                    }
                }
                ty0 ty0Var2 = qmbVar.V0;
                if (ty0Var2 != null) {
                    ty0Var2.setProgress(qmbVar.n1);
                }
                bkb.t1(true);
                qmbVar.c1(2, false);
                return;
            default:
                zjb zjbVar3 = qmbVar.w;
                if (zjbVar3.j == 4294967296L) {
                    zjbVar3.j = 0L;
                    zjbVar3.k = 0L;
                    zjbVar3.l = 0L;
                    zjbVar3.m = 0L;
                    qmbVar.q1(false);
                    bkb.r1(false, false);
                }
                qmbVar.x = true;
                bkb.t1(true);
                qmbVar.c1(2, false);
                return;
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
