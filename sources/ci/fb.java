package ci;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class fb implements h7 {
    public final kc f5090a;

    public fb(kc kcVar) {
        this.f5090a = kcVar;
    }

    public final void a() {
        kc kcVar = this.f5090a;
        ArrayList<k8> content = kcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            kcVar.K1 = content.get(0);
        } else {
            kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null && k8Var.K) {
            i10 = 1;
        }
        kcVar.O1 = i10;
        cb cbVar = kcVar.Q0;
        if (cbVar != null) {
            cbVar.a(i10);
        }
        fa.a(kcVar.f5381c, kcVar.K1);
        kcVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        kc kcVar = this.f5090a;
        nb nbVar = kcVar.B0;
        if (nbVar != null && !kcVar.S1 && !kcVar.P1 && nbVar.isInited()) {
            kc kcVar2 = this.f5090a;
            if (kcVar2.f5393f0 == 0) {
                e4 e4Var = kcVar2.f5413m1;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                if (this.f5090a.q0() && (arrayList = this.f5090a.f5441u2) != null && !arrayList.isEmpty()) {
                    kc kcVar3 = this.f5090a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) kcVar3.f5441u2.get(kcVar3.f5438t2)).commit();
                }
                this.f5090a.B0.switchCamera();
                kc.a0(this.f5090a.B0.isFrontface());
                if (this.f5090a.q0()) {
                    this.f5090a.f5432s.c(null);
                } else {
                    this.f5090a.f5432s.d();
                }
            }
        }
    }

    public final void c() {
        nb nbVar;
        kc kcVar = this.f5090a;
        if (!kcVar.P1 && !kcVar.S1 && kcVar.f5393f0 == 0 && (nbVar = kcVar.B0) != null && nbVar.isInited()) {
            kcVar.W0.e(true);
            File file = kcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.G1 = null;
            }
            f7 f7Var = kcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            kcVar.G1 = k8.w(kcVar.f5381c, "jpg");
            kcVar.P1 = true;
            kcVar.p();
            kcVar.f5384c2 = false;
            if (kcVar.B0.isFrontface() && kcVar.f5438t2 == 1) {
                kc.a(kcVar);
            }
            if (kcVar.q0()) {
                x2 x2Var = kcVar.f5432s;
                ai.y1 y1Var = new ai.y1(this, 17);
                x2Var.h(x2Var.f6278p);
                x2Var.e(1.0f, 320L, new t2(x2Var, y1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j3;
        kc kcVar = this.f5090a;
        if (!kcVar.R1 && kcVar.Q1) {
            kcVar.R1 = true;
            db dbVar = new db(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            AndroidUtilities.runOnUIThread(dbVar, j3);
        }
    }

    public final void e(Runnable runnable, boolean z10) {
        nb nbVar;
        kc kcVar = this.f5090a;
        if (!kcVar.Q1 && !kcVar.R1 && !kcVar.S1 && kcVar.f5393f0 == 0 && (nbVar = kcVar.B0) != null && nbVar.getCameraSession() != null) {
            e4 e4Var = kcVar.l1;
            if (e4Var != null) {
                e4Var.e(true);
            }
            e4 e4Var2 = kcVar.f5413m1;
            if (e4Var2 != null) {
                e4Var2.e(true);
            }
            kcVar.W0.e(true);
            kcVar.Q1 = true;
            f7 f7Var = kcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            File file = kcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.G1 = null;
            }
            kcVar.G1 = k8.x(kcVar.f5381c, true);
            kcVar.p();
            kcVar.f5384c2 = false;
            if (kcVar.B0.isFrontface() && kcVar.f5438t2 == 1) {
                kc.a(kcVar);
            }
            if (kcVar.q0()) {
                kcVar.f5432s.c(new eb(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        kc kcVar = this.f5090a;
        if (kcVar.B0 != null) {
            CameraController.getInstance().recordVideo(kcVar.B0.getCameraSessionObject(), kcVar.G1, false, new a1.c(this, 20), new eb(this, runnable, z10), kcVar.B0, true);
            boolean z12 = true;
            if (kcVar.O1 != 1) {
                kcVar.O1 = 1;
                kcVar.I0.a(false, true);
                if (kcVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kcVar.i0(z11, true);
                kcVar.Q0.a(kcVar.O1);
                j7 j7Var = kcVar.O0;
                if (kcVar.O1 != 1) {
                    z12 = false;
                }
                j7Var.f5234n0 = -1.0f;
                j7Var.f5235o0 = z12;
                j7Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ci.fb.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
