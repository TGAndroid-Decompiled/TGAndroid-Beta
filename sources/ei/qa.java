package ei;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class qa implements x6 {
    public final vb f9665a;

    public qa(vb vbVar) {
        this.f9665a = vbVar;
    }

    public final void a() {
        vb vbVar = this.f9665a;
        ArrayList<a8> content = vbVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            vbVar.K1 = content.get(0);
        } else {
            vbVar.K1 = a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
        }
        a8 a8Var = vbVar.K1;
        if (a8Var != null && a8Var.K) {
            i10 = 1;
        }
        vbVar.O1 = i10;
        na naVar = vbVar.Q0;
        if (naVar != null) {
            naVar.a(i10);
        }
        s9.a(vbVar.f9957c, vbVar.K1);
        vbVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        vb vbVar = this.f9665a;
        ya yaVar = vbVar.B0;
        if (yaVar != null && !vbVar.S1 && !vbVar.P1 && yaVar.isInited()) {
            vb vbVar2 = this.f9665a;
            if (vbVar2.f9968f0 == 0) {
                x3 x3Var = vbVar2.f9988m1;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                if (this.f9665a.p0() && (arrayList = this.f9665a.f10016u2) != null && !arrayList.isEmpty()) {
                    vb vbVar3 = this.f9665a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) vbVar3.f10016u2.get(vbVar3.f10013t2)).commit();
                }
                this.f9665a.B0.switchCamera();
                vb.Z(this.f9665a.B0.isFrontface());
                if (this.f9665a.p0()) {
                    this.f9665a.f10007s.c(null);
                } else {
                    this.f9665a.f10007s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        vb vbVar = this.f9665a;
        if (vbVar.f9968f0 == 0 && !vbVar.P1 && !vbVar.Q1) {
            Activity activity = vbVar.f9953b;
            if (activity != null) {
                boolean z11 = false;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        z11 = true;
                    }
                    if (z11) {
                        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
                    }
                } else {
                    if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z11 = true;
                    }
                    if (z11) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
                    }
                }
                z10 = !z11;
            } else {
                z10 = true;
            }
            if (z10) {
                vbVar.e(true);
            }
        }
    }

    public final void d() {
        ya yaVar;
        vb vbVar = this.f9665a;
        if (!vbVar.P1 && !vbVar.S1 && vbVar.f9968f0 == 0 && (yaVar = vbVar.B0) != null && yaVar.isInited()) {
            vbVar.W0.e(true);
            File file = vbVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vbVar.G1 = null;
            }
            v6 v6Var = vbVar.C0;
            if (v6Var != null) {
                v6Var.c(true);
            }
            vbVar.G1 = a8.w(vbVar.f9957c, "jpg");
            vbVar.P1 = true;
            vbVar.o();
            vbVar.f9960c2 = false;
            if (vbVar.B0.isFrontface() && vbVar.f10013t2 == 1) {
                vb.a(vbVar);
            }
            if (vbVar.p0()) {
                s2 s2Var = vbVar.f10007s;
                ai.r0 r0Var = new ai.r0(this, 23);
                s2Var.h(s2Var.f9781p);
                s2Var.e(1.0f, 320L, new o2(s2Var, r0Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j10;
        vb vbVar = this.f9665a;
        if (!vbVar.R1 && vbVar.Q1) {
            vbVar.R1 = true;
            oa oaVar = new oa(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(oaVar, j10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        ya yaVar;
        vb vbVar = this.f9665a;
        if (!vbVar.Q1 && !vbVar.R1 && !vbVar.S1 && vbVar.f9968f0 == 0 && (yaVar = vbVar.B0) != null && yaVar.getCameraSession() != null) {
            x3 x3Var = vbVar.l1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            x3 x3Var2 = vbVar.f9988m1;
            if (x3Var2 != null) {
                x3Var2.e(true);
            }
            vbVar.W0.e(true);
            vbVar.Q1 = true;
            v6 v6Var = vbVar.C0;
            if (v6Var != null) {
                v6Var.c(true);
            }
            File file = vbVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vbVar.G1 = null;
            }
            vbVar.G1 = a8.x(vbVar.f9957c, true);
            vbVar.o();
            vbVar.f9960c2 = false;
            if (vbVar.B0.isFrontface() && vbVar.f10013t2 == 1) {
                vb.a(vbVar);
            }
            if (vbVar.p0()) {
                vbVar.f10007s.c(new pa(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        vb vbVar = this.f9665a;
        if (vbVar.B0 != null) {
            CameraController.getInstance().recordVideo(vbVar.B0.getCameraSessionObject(), vbVar.G1, false, new e1.c(this, 8), new pa(this, runnable, z10), vbVar.B0, true);
            boolean z12 = true;
            if (vbVar.O1 != 1) {
                vbVar.O1 = 1;
                vbVar.I0.a(false, true);
                if (vbVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vbVar.h0(z11, true);
                vbVar.Q0.a(vbVar.O1);
                z6 z6Var = vbVar.O0;
                if (vbVar.O1 != 1) {
                    z12 = false;
                }
                z6Var.f10225n0 = -1.0f;
                z6Var.f10226o0 = z12;
                z6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ei.qa.h(org.telegram.messenger.Utilities$Callback):void");
    }
}
