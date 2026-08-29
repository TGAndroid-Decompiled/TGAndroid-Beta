package nh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class ca implements l6 {
    public final gb f17486a;

    public ca(gb gbVar) {
        this.f17486a = gbVar;
    }

    public final void a() {
        gb gbVar = this.f17486a;
        ArrayList<o7> content = gbVar.f17808w0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            gbVar.G1 = content.get(0);
        } else {
            gbVar.G1 = o7.a(gbVar.f17808w0.getLayout(), gbVar.f17808w0.getContent());
        }
        o7 o7Var = gbVar.G1;
        if (o7Var != null && o7Var.K) {
            i10 = 1;
        }
        gbVar.K1 = i10;
        z9 z9Var = gbVar.M0;
        if (z9Var != null) {
            z9Var.a(i10);
        }
        f9.a(gbVar.f17743c, gbVar.G1);
        gbVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        gb gbVar = this.f17486a;
        ka kaVar = gbVar.f17812x0;
        if (kaVar != null && !gbVar.O1 && !gbVar.L1 && kaVar.isInited()) {
            gb gbVar2 = this.f17486a;
            if (gbVar2.f17740b0 == 0) {
                t3 t3Var = gbVar2.f17765i1;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                if (this.f17486a.q0() && (arrayList = this.f17486a.f17789q2) != null && !arrayList.isEmpty()) {
                    gb gbVar3 = this.f17486a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) gbVar3.f17789q2.get(gbVar3.f17786p2)).commit();
                }
                this.f17486a.f17812x0.switchCamera();
                gb.a0(this.f17486a.f17812x0.isFrontface());
                if (this.f17486a.q0()) {
                    this.f17486a.f17794s.c(null);
                } else {
                    this.f17486a.f17794s.d();
                }
            }
        }
    }

    public final void c() {
        ka kaVar;
        gb gbVar = this.f17486a;
        if (!gbVar.L1 && !gbVar.O1 && gbVar.f17740b0 == 0 && (kaVar = gbVar.f17812x0) != null && kaVar.isInited()) {
            gbVar.S0.e(true);
            File file = gbVar.C1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                gbVar.C1 = null;
            }
            j6 j6Var = gbVar.f17816y0;
            if (j6Var != null) {
                j6Var.c(true);
            }
            gbVar.C1 = o7.w(gbVar.f17743c, "jpg");
            gbVar.L1 = true;
            gbVar.p();
            gbVar.Y1 = false;
            if (gbVar.f17812x0.isFrontface() && gbVar.f17786p2 == 1) {
                gb.a(gbVar);
            }
            if (gbVar.q0()) {
                p2 p2Var = gbVar.f17794s;
                b0 b0Var = new b0(this, 8);
                p2Var.h(p2Var.f18343p);
                p2Var.e(1.0f, 320L, new l2(p2Var, b0Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j10;
        gb gbVar = this.f17486a;
        if (!gbVar.N1 && gbVar.M1) {
            gbVar.N1 = true;
            aa aaVar = new aa(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(aaVar, j10);
        }
    }

    public final void e(Runnable runnable, boolean z10) {
        ka kaVar;
        gb gbVar = this.f17486a;
        if (!gbVar.M1 && !gbVar.N1 && !gbVar.O1 && gbVar.f17740b0 == 0 && (kaVar = gbVar.f17812x0) != null && kaVar.getCameraSession() != null) {
            t3 t3Var = gbVar.f17762h1;
            if (t3Var != null) {
                t3Var.e(true);
            }
            t3 t3Var2 = gbVar.f17765i1;
            if (t3Var2 != null) {
                t3Var2.e(true);
            }
            gbVar.S0.e(true);
            gbVar.M1 = true;
            j6 j6Var = gbVar.f17816y0;
            if (j6Var != null) {
                j6Var.c(true);
            }
            File file = gbVar.C1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                gbVar.C1 = null;
            }
            gbVar.C1 = o7.x(gbVar.f17743c, true);
            gbVar.p();
            gbVar.Y1 = false;
            if (gbVar.f17812x0.isFrontface() && gbVar.f17786p2 == 1) {
                gb.a(gbVar);
            }
            if (gbVar.q0()) {
                gbVar.f17794s.c(new ba(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        gb gbVar = this.f17486a;
        if (gbVar.f17812x0 != null) {
            CameraController.getInstance().recordVideo(gbVar.f17812x0.getCameraSessionObject(), gbVar.C1, false, new l4.s0(this, 18), new ba(this, runnable, z10), gbVar.f17812x0, true);
            boolean z12 = true;
            if (gbVar.K1 != 1) {
                gbVar.K1 = 1;
                gbVar.E0.a(false, true);
                if (gbVar.K1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                gbVar.i0(z11, true);
                gbVar.M0.a(gbVar.K1);
                o6 o6Var = gbVar.K0;
                if (gbVar.K1 != 1) {
                    z12 = false;
                }
                o6Var.f18232j0 = -1.0f;
                o6Var.f18233k0 = z12;
                o6Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: nh.ca.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
