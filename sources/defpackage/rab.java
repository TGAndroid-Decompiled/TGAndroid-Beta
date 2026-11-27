package defpackage;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
public final class rab implements t59 {
    public final rbb a;

    public rab(rbb rbbVar) {
        this.a = rbbVar;
    }

    public final void a() {
        c8b a;
        rbb rbbVar = this.a;
        ArrayList<c8b> content = rbbVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            rbbVar.L1 = a;
        } else {
            a = c8b.a(rbbVar.B0.getLayout(), rbbVar.B0.getContent());
            rbbVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        rbbVar.P1 = i;
        oab oabVar = rbbVar.R0;
        if (oabVar != null) {
            oabVar.a(i);
        }
        y9b.a(rbbVar.c, rbbVar.L1);
        rbbVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        rbb rbbVar = this.a;
        wab wabVar = rbbVar.C0;
        if (wabVar != null && !rbbVar.T1 && !rbbVar.Q1 && wabVar.isInited()) {
            rbb rbbVar2 = this.a;
            if (rbbVar2.g0 == 0) {
                kg5 kg5Var = rbbVar2.n1;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                    rbb rbbVar3 = this.a;
                    a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) rbbVar3.v2.get(rbbVar3.u2)).commit();
                }
                this.a.C0.switchCamera();
                uc7.e1().edit().putBoolean("stories_camera", this.a.C0.isFrontface()).apply();
                boolean p0 = this.a.p0();
                rk4 rk4Var = this.a.s;
                if (p0) {
                    rk4Var.c(null);
                } else {
                    rk4Var.d();
                }
            }
        }
    }

    public final void c() {
        boolean z;
        rbb rbbVar = this.a;
        if (rbbVar.g0 == 0 && !rbbVar.Q1 && !rbbVar.R1) {
            Activity activity = rbbVar.b;
            if (activity != null) {
                boolean z2 = false;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        z2 = true;
                    }
                    if (z2) {
                        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
                    }
                } else {
                    if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z2 = true;
                    }
                    if (z2) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
                    }
                }
                z = !z2;
            } else {
                z = true;
            }
            if (z) {
                rbbVar.c(true);
            }
        }
    }

    public final void d() {
        wab wabVar;
        rbb rbbVar = this.a;
        if (!rbbVar.Q1 && !rbbVar.T1 && rbbVar.g0 == 0 && (wabVar = rbbVar.C0) != null && wabVar.isInited()) {
            rbbVar.X0.f(true);
            File file = rbbVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                rbbVar.H1 = null;
            }
            oy8 oy8Var = rbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(true);
            }
            rbbVar.H1 = c8b.w(rbbVar.c, "jpg");
            rbbVar.Q1 = true;
            rbbVar.m();
            rbbVar.d2 = false;
            if (rbbVar.C0.isFrontface() && rbbVar.u2 == 1) {
                rbbVar.n();
            }
            if (rbbVar.p0()) {
                rk4 rk4Var = rbbVar.s;
                sh9 sh9Var = new sh9(this, (byte) 18);
                rk4Var.h(rk4Var.p);
                rk4Var.e(1.0f, 320L, new mk4(rk4Var, sh9Var, (byte) 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z) {
        long j;
        rbb rbbVar = this.a;
        if (!rbbVar.S1 && rbbVar.R1) {
            rbbVar.S1 = true;
            pab pabVar = new pab(this, (byte) 0);
            if (z) {
                j = 0;
            } else {
                j = 400;
            }
            hl.d3(pabVar, j);
        }
    }

    public final void f(Runnable runnable, boolean z) {
        wab wabVar;
        rbb rbbVar = this.a;
        if (!rbbVar.R1 && !rbbVar.S1 && !rbbVar.T1 && rbbVar.g0 == 0 && (wabVar = rbbVar.C0) != null && wabVar.getCameraSession() != null) {
            kg5 kg5Var = rbbVar.m1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = rbbVar.n1;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
            rbbVar.X0.f(true);
            rbbVar.R1 = true;
            oy8 oy8Var = rbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(true);
            }
            File file = rbbVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                rbbVar.H1 = null;
            }
            rbbVar.H1 = c8b.w(rbbVar.c, "mp4");
            rbbVar.m();
            rbbVar.d2 = false;
            if (rbbVar.C0.isFrontface() && rbbVar.u2 == 1) {
                rbbVar.n();
            }
            if (rbbVar.p0()) {
                rbbVar.s.c(new qab(this, z, runnable));
            } else {
                g(runnable, z);
            }
        }
    }

    public final void g(Runnable runnable, boolean z) {
        boolean z2;
        rbb rbbVar = this.a;
        if (rbbVar.C0 != null) {
            CameraController.getInstance().recordVideo(rbbVar.C0.getCameraSessionObject(), rbbVar.H1, false, new hja(this, (byte) 20), new qab(this, runnable, z), rbbVar.C0, true);
            boolean z3 = true;
            if (rbbVar.P1 != 1) {
                rbbVar.P1 = 1;
                rbbVar.J0.a(false, true);
                if (rbbVar.P1 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rbbVar.h0(z2, true);
                rbbVar.R0.a(rbbVar.P1);
                u59 u59Var = rbbVar.P0;
                if (rbbVar.P1 != 1) {
                    z3 = false;
                }
                u59Var.o0 = -1.0f;
                u59Var.p0 = z3;
                u59Var.invalidate();
            }
        }
    }

    public final void h(defpackage.pcc r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rab.h(pcc):void");
    }
}
