package bi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class sc implements k8 {
    public final ce f3660a;

    public sc(ce ceVar) {
        this.f3660a = ceVar;
    }

    public final void a() {
        ce ceVar = this.f3660a;
        ArrayList<r9> content = ceVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            ceVar.K1 = content.get(0);
        } else {
            ceVar.K1 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
        }
        r9 r9Var = ceVar.K1;
        if (r9Var != null && r9Var.K) {
            i10 = 1;
        }
        ceVar.O1 = i10;
        pc pcVar = ceVar.Q0;
        if (pcVar != null) {
            pcVar.a(i10);
        }
        sb.a(ceVar.f2437c, ceVar.K1);
        ceVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ce ceVar = this.f3660a;
        bd bdVar = ceVar.B0;
        if (bdVar != null && !ceVar.S1 && !ceVar.P1 && bdVar.isInited()) {
            ce ceVar2 = this.f3660a;
            if (ceVar2.f2448f0 == 0) {
                x4 x4Var = ceVar2.f2468m1;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                if (this.f3660a.q0() && (arrayList = this.f3660a.f2496u2) != null && !arrayList.isEmpty()) {
                    ce ceVar3 = this.f3660a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) ceVar3.f2496u2.get(ceVar3.f2493t2)).commit();
                }
                this.f3660a.B0.switchCamera();
                ce.a0(this.f3660a.B0.isFrontface());
                if (this.f3660a.q0()) {
                    this.f3660a.f2487s.c(null);
                } else {
                    this.f3660a.f2487s.d();
                }
            }
        }
    }

    public final void c() {
        bd bdVar;
        ce ceVar = this.f3660a;
        if (!ceVar.P1 && !ceVar.S1 && ceVar.f2448f0 == 0 && (bdVar = ceVar.B0) != null && bdVar.isInited()) {
            ceVar.W0.e(true);
            File file = ceVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ceVar.G1 = null;
            }
            i8 i8Var = ceVar.C0;
            if (i8Var != null) {
                i8Var.c(true);
            }
            ceVar.G1 = r9.w(ceVar.f2437c, "jpg");
            ceVar.P1 = true;
            ceVar.p();
            ceVar.f2440c2 = false;
            if (ceVar.B0.isFrontface() && ceVar.f2493t2 == 1) {
                ce.a(ceVar);
            }
            if (ceVar.q0()) {
                m3 m3Var = ceVar.f2487s;
                ai.b bVar = new ai.b(this, 10);
                m3Var.h(m3Var.f3088p);
                m3Var.e(1.0f, 320L, new h3(m3Var, bVar, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j3;
        ce ceVar = this.f3660a;
        if (!ceVar.R1 && ceVar.Q1) {
            ceVar.R1 = true;
            qc qcVar = new qc(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            AndroidUtilities.runOnUIThread(qcVar, j3);
        }
    }

    public final void e(Runnable runnable, boolean z10) {
        bd bdVar;
        ce ceVar = this.f3660a;
        if (!ceVar.Q1 && !ceVar.R1 && !ceVar.S1 && ceVar.f2448f0 == 0 && (bdVar = ceVar.B0) != null && bdVar.getCameraSession() != null) {
            x4 x4Var = ceVar.l1;
            if (x4Var != null) {
                x4Var.e(true);
            }
            x4 x4Var2 = ceVar.f2468m1;
            if (x4Var2 != null) {
                x4Var2.e(true);
            }
            ceVar.W0.e(true);
            ceVar.Q1 = true;
            i8 i8Var = ceVar.C0;
            if (i8Var != null) {
                i8Var.c(true);
            }
            File file = ceVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ceVar.G1 = null;
            }
            ceVar.G1 = r9.x(ceVar.f2437c, true);
            ceVar.p();
            ceVar.f2440c2 = false;
            if (ceVar.B0.isFrontface() && ceVar.f2493t2 == 1) {
                ce.a(ceVar);
            }
            if (ceVar.q0()) {
                ceVar.f2487s.c(new rc(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        ce ceVar = this.f3660a;
        if (ceVar.B0 != null) {
            CameraController.getInstance().recordVideo(ceVar.B0.getCameraSessionObject(), ceVar.G1, false, new a1.c(this, 10), new rc(this, runnable, z10), ceVar.B0, true);
            boolean z12 = true;
            if (ceVar.O1 != 1) {
                ceVar.O1 = 1;
                ceVar.I0.a(false, true);
                if (ceVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ceVar.i0(z11, true);
                ceVar.Q0.a(ceVar.O1);
                m8 m8Var = ceVar.O0;
                if (ceVar.O1 != 1) {
                    z12 = false;
                }
                m8Var.f3121n0 = -1.0f;
                m8Var.f3122o0 = z12;
                m8Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: bi.sc.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
