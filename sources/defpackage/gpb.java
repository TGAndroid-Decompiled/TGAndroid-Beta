package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gpb implements on5, s69, ovc, fd {
    public final byte a;
    public final pqb b;

    public gpb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            boolean E2 = wb2Var.E2(f);
            pqb pqbVar = this.b;
            if (E2) {
                if (wb2Var.getMessageObject().O3()) {
                    pqbVar.d1(3, true);
                    return;
                } else {
                    pqbVar.d1(1, true);
                    return;
                }
            }
            pqbVar.d1(2, true);
        }
    }

    @Override
    public final void e(int i, int i2) {
        pqb pqbVar = this.b;
        if (!pqbVar.G1) {
            return;
        }
        pqbVar.z0.getBackground();
        float f = 1.0f;
        if (pqbVar.D0 != null) {
            f = (pqbVar.z0.getScaleX() - 1.0f) / (pqbVar.A1 - 1.0f);
        }
        pqbVar.z0.setTranslationX(i * f);
        pqbVar.z0.setTranslationY(i2 * f);
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        pqb pqbVar = this.b;
        if (!(pqbVar.D1 instanceof yvc)) {
            Drawable t = imageReceiver.t();
            if (z && t != null) {
                rpb rpbVar = pqbVar.a;
                hl.q(t);
                rpbVar.k(pqbVar.Q0(t), t, Float.valueOf(pqbVar.n1));
                if (!z2 && pqbVar.H1 && pqbVar.y1 == null) {
                    pqbVar.z0.getImageReceiver().B0 = false;
                    pqbVar.n1();
                    pqbVar.z0.getImageReceiver().B0 = true;
                }
                pqbVar.X0();
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        boolean z;
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 3:
                pqbVar.u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                pqbVar.P0(false);
                return;
            case 5:
                ynb ynbVar = pqbVar.w;
                if (ynbVar.j == 4294967296L) {
                    ynbVar.j = 0L;
                    ynbVar.k = 0L;
                    ynbVar.l = 0L;
                    ynbVar.m = 0L;
                    pqbVar.r1(false);
                    aob.r1(false, false);
                }
                pqbVar.x = true;
                aob.t1(true);
                pqbVar.d1(2, false);
                return;
            case 6:
                ynb ynbVar2 = pqbVar.w;
                if (aob.a1() && aob.I.j0.d != 0) {
                    unb unbVar = ynbVar2.y;
                    ynbVar2.j = unbVar.d;
                    ynbVar2.k = unbVar.e;
                    ynbVar2.l = unbVar.f;
                    ynbVar2.m = unbVar.g;
                    ynbVar2.n = unbVar.h;
                    String str = unbVar.c;
                    ynbVar2.o = str;
                    float f = unbVar.k;
                    ynbVar2.p = f;
                    pqbVar.n1 = f;
                    if (str != null && !"c".equals(str)) {
                        int size = pqbVar.W0.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) pqbVar.W0.get(i2);
                                if (tL_wallPaper.pattern && ynbVar2.o.equals(tL_wallPaper.slug)) {
                                    pqbVar.Y0 = tL_wallPaper;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        pqbVar.Y0 = null;
                    }
                    pqbVar.x = true;
                    fvc fvcVar = pqbVar.L0[1];
                    if (pqbVar.Y0 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fvcVar.a(z, true);
                    pqbVar.r1(false);
                    aob.r1(false, false);
                }
                Drawable background = pqbVar.z0.getBackground();
                if (background instanceof hh7) {
                    hh7 hh7Var = (hh7) background;
                    hh7Var.r(100, null);
                    boolean o = aob.I.o();
                    float f2 = pqbVar.n1;
                    if (o) {
                        if (f2 < 0.0f) {
                            pqbVar.z0.getImageReceiver().W(hh7Var.k);
                        }
                        bz0 bz0Var = pqbVar.V0;
                        if (bz0Var != null) {
                            bz0Var.setTwoSided(true);
                        }
                    } else if (f2 < 0.0f) {
                        pqbVar.n1 = -f2;
                    }
                }
                bz0 bz0Var2 = pqbVar.V0;
                if (bz0Var2 != null) {
                    bz0Var2.setProgress(pqbVar.n1);
                }
                aob.t1(true);
                pqbVar.d1(2, false);
                return;
            default:
                ynb ynbVar3 = pqbVar.w;
                if (ynbVar3.j == 4294967296L) {
                    ynbVar3.j = 0L;
                    ynbVar3.k = 0L;
                    ynbVar3.l = 0L;
                    ynbVar3.m = 0L;
                    pqbVar.r1(false);
                    aob.r1(false, false);
                }
                pqbVar.x = true;
                aob.t1(true);
                pqbVar.d1(2, false);
                return;
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
