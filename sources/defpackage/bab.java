package defpackage;

import android.view.View;
import android.view.WindowManager;
public final class bab implements Runnable {
    public final byte a;
    public final rbb b;

    public bab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final void run() {
        gbb gbbVar;
        qbb qbbVar;
        byte b = this.a;
        my8 my8Var = null;
        int i = 0;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.p();
                return;
            case 1:
                rbbVar.getClass();
                rbbVar.d(1.0f, true, new bab(rbbVar, (byte) 3));
                rbbVar.c1.b(true, true);
                return;
            case 2:
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null) {
                    c8bVar.y0 = !c8bVar.y0;
                    gbb gbbVar2 = rbbVar.Y0;
                    if (gbbVar2 != null) {
                        gbbVar2.u(c8bVar);
                    }
                    vab vabVar = rbbVar.w1;
                    if (vabVar != null && vabVar.B0 != null) {
                        while (i < rbbVar.w1.B0.getChildCount()) {
                            View childAt = rbbVar.w1.B0.getChildAt(i);
                            if (childAt instanceof b47) {
                                ((b47) childAt).setupTheme(rbbVar.L1);
                            }
                            i++;
                        }
                    }
                    rbbVar.n0(true);
                    return;
                }
                return;
            case 3:
            case 22:
                rbbVar.N();
                return;
            case 4:
                rbbVar.o(true);
                return;
            case 5:
                rbbVar.Z(false);
                return;
            case 6:
                rbbVar.B0.setCameraThumb(rbbVar.y());
                wab wabVar = rbbVar.C0;
                if (wabVar != null) {
                    wabVar.destroy(true, null);
                    hl.B2(rbbVar.C0);
                    fbb fbbVar = rbbVar.B0;
                    if (fbbVar != null) {
                        fbbVar.setCameraView(null);
                    }
                    rbbVar.C0 = null;
                    return;
                }
                return;
            case 7:
                rbbVar.B0.setCameraThumb(rbbVar.y());
                return;
            case 8:
                if (rbbVar.g0 == 1) {
                    rbbVar.k0(2, false, true);
                    return;
                }
                return;
            case 9:
                nab nabVar = rbbVar.e1;
                if (nabVar != null) {
                    int i2 = -(hl.L(24.0f) + rbbVar.d1.getEditTextHeight());
                    ksb ksbVar = rbbVar.a1;
                    if (ksbVar != null) {
                        i = ksbVar.getContentHeight() - hl.L(5.0f);
                    }
                    nabVar.setTranslationY(i2 - i);
                    return;
                }
                return;
            case 10:
                fbb fbbVar2 = rbbVar.B0;
                if (fbbVar2 != null) {
                    ny8 ny8Var = fbbVar2.c;
                    if (rbbVar.E0.E) {
                        my8Var = (my8) rbbVar.D0.d;
                    }
                    ny8Var.c(my8Var);
                    return;
                }
                return;
            case 11:
                rbbVar.l0(true);
                return;
            case 12:
                rbbVar.q();
                return;
            case 13:
                hbb hbbVar = rbbVar.d1;
                if (hbbVar != null) {
                    hbbVar.m();
                    return;
                }
                return;
            case 14:
                if (rbbVar.h0 == -1 && rbbVar.g0 == 1) {
                    hbb hbbVar2 = rbbVar.d1;
                    if (!hbbVar2.p0 && !hbbVar2.O1) {
                        ksb ksbVar2 = rbbVar.a1;
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
                        nab nabVar2 = rbbVar.e1;
                        if (nabVar2.N) {
                            nabVar2.c(false, true);
                            return;
                        }
                        rbbVar.k0(0, false, true);
                        vab vabVar2 = rbbVar.w1;
                        if (vabVar2 != null) {
                            vabVar2.Q0(2);
                            vabVar2.Z1 = true;
                            vabVar2.l0(true);
                            rbbVar.w1.w0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                rbbVar.O1 = true;
                rbbVar.c1.setShareEnabled(false);
                fq3 fq3Var = rbbVar.f1;
                fq3Var.getClass();
                fq3Var.c(ob6.N0("VideoConvertFail"));
                return;
            case 16:
                rbbVar.B0.setCameraThumb(rbbVar.y());
                return;
            case 17:
                qbb qbbVar2 = rbbVar.n;
                x53 x53Var = rbbVar.a;
                new d31(qbbVar2, x53Var).Q(2131624341, 36, hl.N2(ob6.M0(2131744235, null), aob.Xc, 0, new bab(rbbVar, (byte) 26), x53Var)).k(true);
                return;
            case 18:
                rbbVar.d(1.0f, true, new bab(rbbVar, (byte) 22));
                return;
            case 19:
                w9b w9bVar = rbbVar.r0;
                if (w9bVar != null) {
                    w9bVar.dismiss();
                }
                rbbVar.I(2, true);
                return;
            case 20:
                rbbVar.k0(-1, false, true);
                return;
            case 21:
                rbbVar.k0(-1, false, true);
                return;
            case 23:
                if (!rbbVar.L1.b0 && rbbVar.r0 != null && (gbbVar = rbbVar.Y0) != null) {
                    gbbVar.g(new dab(rbbVar, (byte) 0), gbbVar, rbbVar.x1, rbbVar.A1);
                }
                rbbVar.I(1, true);
                return;
            case 24:
                rbbVar.i0(false);
                rbbVar.f2 = null;
                return;
            case 25:
                rbbVar.i0(false);
                rbbVar.f2 = null;
                return;
            case 26:
                rbbVar.S();
                return;
            case 27:
                WindowManager windowManager = rbbVar.f;
                if (windowManager != null && (qbbVar = rbbVar.n) != null && qbbVar.getParent() != null) {
                    windowManager.removeView(rbbVar.n);
                    return;
                }
                return;
            case 28:
                rbbVar.c(false);
                rbbVar.n2 = null;
                return;
            default:
                if (rbbVar.u2 >= 0) {
                    uc7.e1().edit().putFloat("frontflash_warmth", rbbVar.s.o).putFloat("frontflash_intensity", rbbVar.s.p).apply();
                }
                rbbVar.s.e(0.0f, 240L, null);
                rbbVar.F0.setSelected(false);
                return;
        }
    }
}
