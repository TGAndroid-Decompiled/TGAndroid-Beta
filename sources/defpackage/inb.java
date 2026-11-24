package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class inb implements ln5, g59, ctc, ee {
    public final byte a;
    public final rob b;

    public inb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        rob robVar = this.b;
        if (!(robVar.D1 instanceof mtc)) {
            Drawable t = imageReceiver.t();
            if (z && t != null) {
                tnb tnbVar = robVar.a;
                gm.q(t);
                tnbVar.k(robVar.Q0(t), t, Float.valueOf(robVar.n1));
                if (!z2 && robVar.H1 && robVar.y1 == null) {
                    robVar.z0.getImageReceiver().B0 = false;
                    robVar.n1();
                    robVar.z0.getImageReceiver().B0 = true;
                }
                robVar.X0();
            }
        }
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            boolean E2 = rc2Var.E2(f);
            rob robVar = this.b;
            if (E2) {
                if (rc2Var.getMessageObject().O3()) {
                    robVar.d1(3, true);
                    return;
                } else {
                    robVar.d1(1, true);
                    return;
                }
            }
            robVar.d1(2, true);
        }
    }

    @Override
    public final void l(int i, int i2) {
        rob robVar = this.b;
        if (!robVar.G1) {
            return;
        }
        robVar.z0.getBackground();
        float f = 1.0f;
        if (robVar.D0 != null) {
            f = (robVar.z0.getScaleX() - 1.0f) / (robVar.A1 - 1.0f);
        }
        robVar.z0.setTranslationX(i * f);
        robVar.z0.setTranslationY(i2 * f);
    }

    @Override
    public final void r(he heVar, int i) {
        boolean z;
        byte b = this.a;
        rob robVar = this.b;
        switch (b) {
            case 3:
                robVar.u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                robVar.P0(false);
                return;
            case 5:
                amb ambVar = robVar.w;
                if (ambVar.j == 4294967296L) {
                    ambVar.j = 0L;
                    ambVar.k = 0L;
                    ambVar.l = 0L;
                    ambVar.m = 0L;
                    robVar.r1(false);
                    cmb.r1(false, false);
                }
                robVar.x = true;
                cmb.t1(true);
                robVar.d1(2, false);
                return;
            case 6:
                amb ambVar2 = robVar.w;
                if (cmb.a1() && cmb.I.j0.d != 0) {
                    xlb xlbVar = ambVar2.y;
                    ambVar2.j = xlbVar.d;
                    ambVar2.k = xlbVar.e;
                    ambVar2.l = xlbVar.f;
                    ambVar2.m = xlbVar.g;
                    ambVar2.n = xlbVar.h;
                    String str = xlbVar.c;
                    ambVar2.o = str;
                    float f = xlbVar.k;
                    ambVar2.p = f;
                    robVar.n1 = f;
                    if (str != null && !"c".equals(str)) {
                        int size = robVar.W0.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) robVar.W0.get(i2);
                                if (tL_wallPaper.pattern && ambVar2.o.equals(tL_wallPaper.slug)) {
                                    robVar.Y0 = tL_wallPaper;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        robVar.Y0 = null;
                    }
                    robVar.x = true;
                    tsc tscVar = robVar.L0[1];
                    if (robVar.Y0 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tscVar.a(z, true);
                    robVar.r1(false);
                    cmb.r1(false, false);
                }
                Drawable background = robVar.z0.getBackground();
                if (background instanceof ah7) {
                    ah7 ah7Var = (ah7) background;
                    ah7Var.r(100, null);
                    boolean o = cmb.I.o();
                    float f2 = robVar.n1;
                    if (o) {
                        if (f2 < 0.0f) {
                            robVar.z0.getImageReceiver().W(ah7Var.k);
                        }
                        a01 a01Var = robVar.V0;
                        if (a01Var != null) {
                            a01Var.setTwoSided(true);
                        }
                    } else if (f2 < 0.0f) {
                        robVar.n1 = -f2;
                    }
                }
                a01 a01Var2 = robVar.V0;
                if (a01Var2 != null) {
                    a01Var2.setProgress(robVar.n1);
                }
                cmb.t1(true);
                robVar.d1(2, false);
                return;
            default:
                amb ambVar3 = robVar.w;
                if (ambVar3.j == 4294967296L) {
                    ambVar3.j = 0L;
                    ambVar3.k = 0L;
                    ambVar3.l = 0L;
                    ambVar3.m = 0L;
                    robVar.r1(false);
                    cmb.r1(false, false);
                }
                robVar.x = true;
                cmb.t1(true);
                robVar.d1(2, false);
                return;
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
