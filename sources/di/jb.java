package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class jb implements j7 {
    public final pc f7471a;

    public jb(pc pcVar) {
        this.f7471a = pcVar;
    }

    public final void a() {
        pc pcVar = this.f7471a;
        ArrayList<o8> content = pcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            pcVar.K1 = content.get(0);
        } else {
            pcVar.K1 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
        }
        o8 o8Var = pcVar.K1;
        if (o8Var != null && o8Var.K) {
            i10 = 1;
        }
        pcVar.O1 = i10;
        gb gbVar = pcVar.Q0;
        if (gbVar != null) {
            gbVar.a(i10);
        }
        ja.a(pcVar.f7876c, pcVar.K1);
        pcVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        pc pcVar = this.f7471a;
        sb sbVar = pcVar.B0;
        if (sbVar != null && !pcVar.S1 && !pcVar.P1 && sbVar.isInited()) {
            pc pcVar2 = this.f7471a;
            if (pcVar2.f7888f0 == 0) {
                f4 f4Var = pcVar2.f7908m1;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                if (this.f7471a.q0() && (arrayList = this.f7471a.f7936u2) != null && !arrayList.isEmpty()) {
                    pc pcVar3 = this.f7471a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) pcVar3.f7936u2.get(pcVar3.f7933t2)).commit();
                }
                this.f7471a.B0.switchCamera();
                pc.a0(this.f7471a.B0.isFrontface());
                if (this.f7471a.q0()) {
                    this.f7471a.f7927s.c(null);
                } else {
                    this.f7471a.f7927s.d();
                }
            }
        }
    }

    public final void c() {
        sb sbVar;
        pc pcVar = this.f7471a;
        if (!pcVar.P1 && !pcVar.S1 && pcVar.f7888f0 == 0 && (sbVar = pcVar.B0) != null && sbVar.isInited()) {
            pcVar.W0.e(true);
            File file = pcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                pcVar.G1 = null;
            }
            h7 h7Var = pcVar.C0;
            if (h7Var != null) {
                h7Var.c(true);
            }
            pcVar.G1 = o8.w(pcVar.f7876c, "jpg");
            pcVar.P1 = true;
            pcVar.p();
            pcVar.f7879c2 = false;
            if (pcVar.B0.isFrontface() && pcVar.f7933t2 == 1) {
                pc.a(pcVar);
            }
            if (pcVar.q0()) {
                y2 y2Var = pcVar.f7927s;
                bi.o1 o1Var = new bi.o1(this, 14);
                y2Var.h(y2Var.f8489p);
                y2Var.e(1.0f, 320L, new u2(y2Var, o1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j3;
        pc pcVar = this.f7471a;
        if (!pcVar.R1 && pcVar.Q1) {
            pcVar.R1 = true;
            hb hbVar = new hb(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            AndroidUtilities.runOnUIThread(hbVar, j3);
        }
    }

    public final void e(Runnable runnable, boolean z10) {
        sb sbVar;
        pc pcVar = this.f7471a;
        if (!pcVar.Q1 && !pcVar.R1 && !pcVar.S1 && pcVar.f7888f0 == 0 && (sbVar = pcVar.B0) != null && sbVar.getCameraSession() != null) {
            f4 f4Var = pcVar.l1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            f4 f4Var2 = pcVar.f7908m1;
            if (f4Var2 != null) {
                f4Var2.e(true);
            }
            pcVar.W0.e(true);
            pcVar.Q1 = true;
            h7 h7Var = pcVar.C0;
            if (h7Var != null) {
                h7Var.c(true);
            }
            File file = pcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                pcVar.G1 = null;
            }
            pcVar.G1 = o8.x(pcVar.f7876c, true);
            pcVar.p();
            pcVar.f7879c2 = false;
            if (pcVar.B0.isFrontface() && pcVar.f7933t2 == 1) {
                pc.a(pcVar);
            }
            if (pcVar.q0()) {
                pcVar.f7927s.c(new ib(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        pc pcVar = this.f7471a;
        if (pcVar.B0 != null) {
            CameraController.getInstance().recordVideo(pcVar.B0.getCameraSessionObject(), pcVar.G1, false, new a1.c(this, 26), new ib(this, runnable, z10), pcVar.B0, true);
            boolean z12 = true;
            if (pcVar.O1 != 1) {
                pcVar.O1 = 1;
                pcVar.I0.a(false, true);
                if (pcVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pcVar.i0(z11, true);
                pcVar.Q0.a(pcVar.O1);
                l7 l7Var = pcVar.O0;
                if (pcVar.O1 != 1) {
                    z12 = false;
                }
                l7Var.f7580n0 = -1.0f;
                l7Var.f7581o0 = z12;
                l7Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: di.jb.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
