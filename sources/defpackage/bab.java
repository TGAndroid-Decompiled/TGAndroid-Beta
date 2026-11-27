package defpackage;

import android.view.View;
import android.view.WindowManager;
public final class bab implements Runnable {
    public final byte a;
    public final sbb b;

    public bab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override
    public final void run() {
        hbb hbbVar;
        rbb rbbVar;
        byte b = this.a;
        my8 my8Var = null;
        int i = 0;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.p();
                return;
            case 1:
                sbbVar.getClass();
                sbbVar.d(1.0f, true, new bab(sbbVar, (byte) 3));
                sbbVar.c1.b(true, true);
                return;
            case 2:
                c8b c8bVar = sbbVar.L1;
                if (c8bVar != null) {
                    c8bVar.y0 = !c8bVar.y0;
                    hbb hbbVar2 = sbbVar.Y0;
                    if (hbbVar2 != null) {
                        hbbVar2.u(c8bVar);
                    }
                    wab wabVar = sbbVar.w1;
                    if (wabVar != null && wabVar.B0 != null) {
                        while (i < sbbVar.w1.B0.getChildCount()) {
                            View childAt = sbbVar.w1.B0.getChildAt(i);
                            if (childAt instanceof b47) {
                                ((b47) childAt).setupTheme(sbbVar.L1);
                            }
                            i++;
                        }
                    }
                    sbbVar.n0(true);
                    return;
                }
                return;
            case 3:
            case 22:
                sbbVar.N();
                return;
            case 4:
                sbbVar.o(true);
                return;
            case 5:
                sbbVar.Z(false);
                return;
            case 6:
                sbbVar.B0.setCameraThumb(sbbVar.y());
                xab xabVar = sbbVar.C0;
                if (xabVar != null) {
                    xabVar.destroy(true, null);
                    hl.B2(sbbVar.C0);
                    gbb gbbVar = sbbVar.B0;
                    if (gbbVar != null) {
                        gbbVar.setCameraView(null);
                    }
                    sbbVar.C0 = null;
                    return;
                }
                return;
            case 7:
                sbbVar.B0.setCameraThumb(sbbVar.y());
                return;
            case 8:
                if (sbbVar.g0 == 1) {
                    sbbVar.k0(2, false, true);
                    return;
                }
                return;
            case 9:
                oab oabVar = sbbVar.e1;
                if (oabVar != null) {
                    int i2 = -(hl.L(24.0f) + sbbVar.d1.getEditTextHeight());
                    ksb ksbVar = sbbVar.a1;
                    if (ksbVar != null) {
                        i = ksbVar.getContentHeight() - hl.L(5.0f);
                    }
                    oabVar.setTranslationY(i2 - i);
                    return;
                }
                return;
            case 10:
                gbb gbbVar2 = sbbVar.B0;
                if (gbbVar2 != null) {
                    ny8 ny8Var = gbbVar2.c;
                    if (sbbVar.E0.E) {
                        my8Var = (my8) sbbVar.D0.d;
                    }
                    ny8Var.c(my8Var);
                    return;
                }
                return;
            case 11:
                sbbVar.l0(true);
                return;
            case 12:
                sbbVar.q();
                return;
            case 13:
                ibb ibbVar = sbbVar.d1;
                if (ibbVar != null) {
                    ibbVar.m();
                    return;
                }
                return;
            case 14:
                if (sbbVar.h0 == -1 && sbbVar.g0 == 1) {
                    ibb ibbVar2 = sbbVar.d1;
                    if (!ibbVar2.p0 && !ibbVar2.O1) {
                        ksb ksbVar2 = sbbVar.a1;
                        if (ksbVar2.Q) {
                            ksbVar2.Q = false;
                            if (ksbVar2.F && ksbVar2.h == null) {
                                ksbVar2.H = true;
                                esb esbVar = ksbVar2.a;
                                if (esbVar != null) {
                                    esbVar.e1(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        oab oabVar2 = sbbVar.e1;
                        if (oabVar2.N) {
                            oabVar2.c(false, true);
                            return;
                        }
                        sbbVar.k0(0, false, true);
                        wab wabVar2 = sbbVar.w1;
                        if (wabVar2 != null) {
                            wabVar2.Q0(2);
                            wabVar2.Z1 = true;
                            wabVar2.l0(true);
                            sbbVar.w1.w0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                sbbVar.O1 = true;
                sbbVar.c1.setShareEnabled(false);
                fq3 fq3Var = sbbVar.f1;
                fq3Var.getClass();
                fq3Var.c(ob6.N0("VideoConvertFail"));
                return;
            case 16:
                sbbVar.B0.setCameraThumb(sbbVar.y());
                return;
            case 17:
                rbb rbbVar2 = sbbVar.n;
                x53 x53Var = sbbVar.a;
                new d31(rbbVar2, x53Var).Q(2131624341, 36, hl.N2(ob6.M0(2131744235, null), aob.Xc, 0, new bab(sbbVar, (byte) 26), x53Var)).k(true);
                return;
            case 18:
                sbbVar.d(1.0f, true, new bab(sbbVar, (byte) 22));
                return;
            case 19:
                w9b w9bVar = sbbVar.r0;
                if (w9bVar != null) {
                    w9bVar.dismiss();
                }
                sbbVar.I(2, true);
                return;
            case 20:
                sbbVar.k0(-1, false, true);
                return;
            case 21:
                sbbVar.k0(-1, false, true);
                return;
            case 23:
                if (!sbbVar.L1.b0 && sbbVar.r0 != null && (hbbVar = sbbVar.Y0) != null) {
                    hbbVar.g(new dab(sbbVar, (byte) 0), hbbVar, sbbVar.x1, sbbVar.A1);
                }
                sbbVar.I(1, true);
                return;
            case 24:
                sbbVar.i0(false);
                sbbVar.f2 = null;
                return;
            case 25:
                sbbVar.i0(false);
                sbbVar.f2 = null;
                return;
            case 26:
                sbbVar.S();
                return;
            case 27:
                WindowManager windowManager = sbbVar.f;
                if (windowManager != null && (rbbVar = sbbVar.n) != null && rbbVar.getParent() != null) {
                    windowManager.removeView(sbbVar.n);
                    return;
                }
                return;
            case 28:
                sbbVar.c(false);
                sbbVar.n2 = null;
                return;
            default:
                if (sbbVar.u2 >= 0) {
                    uc7.e1().edit().putFloat("frontflash_warmth", sbbVar.s.o).putFloat("frontflash_intensity", sbbVar.s.p).apply();
                }
                sbbVar.s.e(0.0f, 240L, null);
                sbbVar.F0.setSelected(false);
                return;
        }
    }
}
