package ci;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class jb implements j7 {
    public final oc f4859a;

    public jb(oc ocVar) {
        this.f4859a = ocVar;
    }

    public final void a() {
        oc ocVar = this.f4859a;
        ArrayList<o8> content = ocVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            ocVar.K1 = content.get(0);
        } else {
            ocVar.K1 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
        }
        o8 o8Var = ocVar.K1;
        if (o8Var != null && o8Var.K) {
            i10 = 1;
        }
        ocVar.O1 = i10;
        gb gbVar = ocVar.Q0;
        if (gbVar != null) {
            gbVar.a(i10);
        }
        ja.a(ocVar.f5211c, ocVar.K1);
        ocVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        oc ocVar = this.f4859a;
        rb rbVar = ocVar.B0;
        if (rbVar != null && !ocVar.S1 && !ocVar.P1 && rbVar.isInited()) {
            oc ocVar2 = this.f4859a;
            if (ocVar2.f5222f0 == 0) {
                f4 f4Var = ocVar2.f5242m1;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                if (this.f4859a.q0() && (arrayList = this.f4859a.f5270u2) != null && !arrayList.isEmpty()) {
                    oc ocVar3 = this.f4859a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) ocVar3.f5270u2.get(ocVar3.f5267t2)).commit();
                }
                this.f4859a.B0.switchCamera();
                oc.a0(this.f4859a.B0.isFrontface());
                if (this.f4859a.q0()) {
                    this.f4859a.f5261s.c(null);
                } else {
                    this.f4859a.f5261s.d();
                }
            }
        }
    }

    public final void c() {
        rb rbVar;
        oc ocVar = this.f4859a;
        if (!ocVar.P1 && !ocVar.S1 && ocVar.f5222f0 == 0 && (rbVar = ocVar.B0) != null && rbVar.isInited()) {
            ocVar.W0.e(true);
            File file = ocVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ocVar.G1 = null;
            }
            h7 h7Var = ocVar.C0;
            if (h7Var != null) {
                h7Var.c(true);
            }
            ocVar.G1 = o8.w(ocVar.f5211c, "jpg");
            ocVar.P1 = true;
            ocVar.p();
            ocVar.f5214c2 = false;
            if (ocVar.B0.isFrontface() && ocVar.f5267t2 == 1) {
                oc.a(ocVar);
            }
            if (ocVar.q0()) {
                y2 y2Var = ocVar.f5261s;
                ai.y1 y1Var = new ai.y1(this, 14);
                y2Var.h(y2Var.f5818p);
                y2Var.e(1.0f, 320L, new u2(y2Var, y1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z10) {
        long j3;
        oc ocVar = this.f4859a;
        if (!ocVar.R1 && ocVar.Q1) {
            ocVar.R1 = true;
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
        rb rbVar;
        oc ocVar = this.f4859a;
        if (!ocVar.Q1 && !ocVar.R1 && !ocVar.S1 && ocVar.f5222f0 == 0 && (rbVar = ocVar.B0) != null && rbVar.getCameraSession() != null) {
            f4 f4Var = ocVar.l1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            f4 f4Var2 = ocVar.f5242m1;
            if (f4Var2 != null) {
                f4Var2.e(true);
            }
            ocVar.W0.e(true);
            ocVar.Q1 = true;
            h7 h7Var = ocVar.C0;
            if (h7Var != null) {
                h7Var.c(true);
            }
            File file = ocVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ocVar.G1 = null;
            }
            ocVar.G1 = o8.x(ocVar.f5211c, true);
            ocVar.p();
            ocVar.f5214c2 = false;
            if (ocVar.B0.isFrontface() && ocVar.f5267t2 == 1) {
                oc.a(ocVar);
            }
            if (ocVar.q0()) {
                ocVar.f5261s.c(new ib(this, z10, runnable));
            } else {
                f(runnable, z10);
            }
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        boolean z11;
        oc ocVar = this.f4859a;
        if (ocVar.B0 != null) {
            CameraController.getInstance().recordVideo(ocVar.B0.getCameraSessionObject(), ocVar.G1, false, new a1.c(this, 20), new ib(this, runnable, z10), ocVar.B0, true);
            boolean z12 = true;
            if (ocVar.O1 != 1) {
                ocVar.O1 = 1;
                ocVar.I0.a(false, true);
                if (ocVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ocVar.i0(z11, true);
                ocVar.Q0.a(ocVar.O1);
                l7 l7Var = ocVar.O0;
                if (ocVar.O1 != 1) {
                    z12 = false;
                }
                l7Var.f4957n0 = -1.0f;
                l7Var.f4958o0 = z12;
                l7Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ci.jb.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
