package ci;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class gb implements h7 {
    public final lc f4742a;

    public gb(lc lcVar) {
        this.f4742a = lcVar;
    }

    public final void a() {
        lc lcVar = this.f4742a;
        ArrayList<l8> content = lcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            lcVar.K1 = content.get(0);
        } else {
            lcVar.K1 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null && l8Var.K) {
            i10 = 1;
        }
        lcVar.O1 = i10;
        db dbVar = lcVar.Q0;
        if (dbVar != null) {
            dbVar.a(i10);
        }
        ga.a(lcVar.f5040c, lcVar.K1);
        lcVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        lc lcVar = this.f4742a;
        ob obVar = lcVar.B0;
        if (obVar != null && !lcVar.S1 && !lcVar.P1 && obVar.isInited()) {
            lc lcVar2 = this.f4742a;
            if (lcVar2.f5051f0 == 0) {
                e4 e4Var = lcVar2.f5071m1;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                if (this.f4742a.q0() && (arrayList = this.f4742a.f5099u2) != null && !arrayList.isEmpty()) {
                    lc lcVar3 = this.f4742a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) lcVar3.f5099u2.get(lcVar3.f5096t2)).commit();
                }
                this.f4742a.B0.switchCamera();
                lc.a0(this.f4742a.B0.isFrontface());
                if (this.f4742a.q0()) {
                    this.f4742a.f5090s.c(null);
                } else {
                    this.f4742a.f5090s.d();
                }
            }
        }
    }

    public final void c() {
        ob obVar;
        lc lcVar = this.f4742a;
        if (!lcVar.P1 && !lcVar.S1 && lcVar.f5051f0 == 0 && (obVar = lcVar.B0) != null && obVar.isInited()) {
            lcVar.W0.e(true);
            File file = lcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.G1 = null;
            }
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            lcVar.G1 = l8.w(lcVar.f5040c, "jpg");
            lcVar.P1 = true;
            lcVar.p();
            lcVar.f5043c2 = false;
            if (lcVar.B0.isFrontface() && lcVar.f5096t2 == 1) {
                lc.a(lcVar);
            }
            if (lcVar.q0()) {
                x2 x2Var = lcVar.f5090s;
                ai.y1 y1Var = new ai.y1(this, 17);
                x2Var.h(x2Var.f5831p);
                x2Var.e(1.0f, 320L, new t2(x2Var, y1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j3;
        lc lcVar = this.f4742a;
        if (!lcVar.R1 && lcVar.Q1) {
            lcVar.R1 = true;
            eb ebVar = new eb(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            AndroidUtilities.runOnUIThread(ebVar, j3);
        }
    }

    public final void e(Runnable runnable, boolean z10) {
        ob obVar;
        lc lcVar = this.f4742a;
        if (!lcVar.Q1 && !lcVar.R1 && !lcVar.S1 && lcVar.f5051f0 == 0 && (obVar = lcVar.B0) != null && obVar.getCameraSession() != null) {
            e4 e4Var = lcVar.l1;
            if (e4Var != null) {
                e4Var.e(true);
            }
            e4 e4Var2 = lcVar.f5071m1;
            if (e4Var2 != null) {
                e4Var2.e(true);
            }
            lcVar.W0.e(true);
            lcVar.Q1 = true;
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            File file = lcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.G1 = null;
            }
            lcVar.G1 = l8.x(lcVar.f5040c, true);
            lcVar.p();
            lcVar.f5043c2 = false;
            if (lcVar.B0.isFrontface() && lcVar.f5096t2 == 1) {
                lc.a(lcVar);
            }
            if (lcVar.q0()) {
                lcVar.f5090s.c(new fb(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        lc lcVar = this.f4742a;
        if (lcVar.B0 != null) {
            CameraController.getInstance().recordVideo(lcVar.B0.getCameraSessionObject(), lcVar.G1, false, new a1.c(this, 20), new fb(this, runnable, z10), lcVar.B0, true);
            boolean z12 = true;
            if (lcVar.O1 != 1) {
                lcVar.O1 = 1;
                lcVar.I0.a(false, true);
                if (lcVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lcVar.i0(z11, true);
                lcVar.Q0.a(lcVar.O1);
                j7 j7Var = lcVar.O0;
                if (lcVar.O1 != 1) {
                    z12 = false;
                }
                j7Var.f4853n0 = -1.0f;
                j7Var.f4854o0 = z12;
                j7Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ci.gb.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
