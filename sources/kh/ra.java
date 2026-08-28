package kh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class ra implements x6 {
    public final wb f15971a;

    public ra(wb wbVar) {
        this.f15971a = wbVar;
    }

    public final void a() {
        wb wbVar = this.f15971a;
        ArrayList<a8> content = wbVar.f16318w0.getContent();
        int i9 = 0;
        if (content.size() == 1) {
            wbVar.G1 = content.get(0);
        } else {
            wbVar.G1 = a8.a(wbVar.f16318w0.getLayout(), wbVar.f16318w0.getContent());
        }
        a8 a8Var = wbVar.G1;
        if (a8Var != null && a8Var.K) {
            i9 = 1;
        }
        wbVar.K1 = i9;
        oa oaVar = wbVar.M0;
        if (oaVar != null) {
            oaVar.a(i9);
        }
        u9.a(wbVar.f16253c, wbVar.G1);
        wbVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        wb wbVar = this.f15971a;
        za zaVar = wbVar.f16322x0;
        if (zaVar != null && !wbVar.O1 && !wbVar.L1 && zaVar.isInited()) {
            wb wbVar2 = this.f15971a;
            if (wbVar2.f16250b0 == 0) {
                x3 x3Var = wbVar2.f16275i1;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                if (this.f15971a.q0() && (arrayList = this.f15971a.f16299q2) != null && !arrayList.isEmpty()) {
                    wb wbVar3 = this.f15971a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) wbVar3.f16299q2.get(wbVar3.f16296p2)).commit();
                }
                this.f15971a.f16322x0.switchCamera();
                wb.a0(this.f15971a.f16322x0.isFrontface());
                if (this.f15971a.q0()) {
                    this.f15971a.f16304s.c(null);
                } else {
                    this.f15971a.f16304s.d();
                }
            }
        }
    }

    public final void c() {
        za zaVar;
        wb wbVar = this.f15971a;
        if (!wbVar.L1 && !wbVar.O1 && wbVar.f16250b0 == 0 && (zaVar = wbVar.f16322x0) != null && zaVar.isInited()) {
            wbVar.S0.e(true);
            File file = wbVar.C1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                wbVar.C1 = null;
            }
            v6 v6Var = wbVar.f16326y0;
            if (v6Var != null) {
                v6Var.c(true);
            }
            wbVar.C1 = a8.w(wbVar.f16253c, "jpg");
            wbVar.L1 = true;
            wbVar.p();
            wbVar.Y1 = false;
            if (wbVar.f16322x0.isFrontface() && wbVar.f16296p2 == 1) {
                wb.a(wbVar);
            }
            if (wbVar.q0()) {
                s2 s2Var = wbVar.f16304s;
                i9 i9Var = new i9(this, 1);
                s2Var.h(s2Var.f16022p);
                s2Var.e(1.0f, 320L, new o2(s2Var, i9Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j10;
        wb wbVar = this.f15971a;
        if (!wbVar.N1 && wbVar.M1) {
            wbVar.N1 = true;
            pa paVar = new pa(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(paVar, j10);
        }
    }

    public final void e(Runnable runnable, boolean z10) {
        za zaVar;
        wb wbVar = this.f15971a;
        if (!wbVar.M1 && !wbVar.N1 && !wbVar.O1 && wbVar.f16250b0 == 0 && (zaVar = wbVar.f16322x0) != null && zaVar.getCameraSession() != null) {
            x3 x3Var = wbVar.f16272h1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            x3 x3Var2 = wbVar.f16275i1;
            if (x3Var2 != null) {
                x3Var2.e(true);
            }
            wbVar.S0.e(true);
            wbVar.M1 = true;
            v6 v6Var = wbVar.f16326y0;
            if (v6Var != null) {
                v6Var.c(true);
            }
            File file = wbVar.C1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                wbVar.C1 = null;
            }
            wbVar.C1 = a8.x(wbVar.f16253c, true);
            wbVar.p();
            wbVar.Y1 = false;
            if (wbVar.f16322x0.isFrontface() && wbVar.f16296p2 == 1) {
                wb.a(wbVar);
            }
            if (wbVar.q0()) {
                wbVar.f16304s.c(new qa(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        wb wbVar = this.f15971a;
        if (wbVar.f16322x0 != null) {
            CameraController.getInstance().recordVideo(wbVar.f16322x0.getCameraSessionObject(), wbVar.C1, false, new p(this, 6), new qa(this, runnable, z10), wbVar.f16322x0, true);
            boolean z12 = true;
            if (wbVar.K1 != 1) {
                wbVar.K1 = 1;
                wbVar.E0.a(false, true);
                if (wbVar.K1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wbVar.i0(z11, true);
                wbVar.M0.a(wbVar.K1);
                z6 z6Var = wbVar.K0;
                if (wbVar.K1 != 1) {
                    z12 = false;
                }
                z6Var.f16442j0 = -1.0f;
                z6Var.f16443k0 = z12;
                z6Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: kh.ra.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
