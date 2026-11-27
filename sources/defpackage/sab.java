package defpackage;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
public final class sab implements t59 {
    public final sbb a;

    public sab(sbb sbbVar) {
        this.a = sbbVar;
    }

    public final void a() {
        c8b a;
        sbb sbbVar = this.a;
        ArrayList<c8b> content = sbbVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            sbbVar.L1 = a;
        } else {
            a = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
            sbbVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        sbbVar.P1 = i;
        pab pabVar = sbbVar.R0;
        if (pabVar != null) {
            pabVar.a(i);
        }
        y9b.a(sbbVar.c, sbbVar.L1);
        sbbVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sbb sbbVar = this.a;
        xab xabVar = sbbVar.C0;
        if (xabVar != null && !sbbVar.T1 && !sbbVar.Q1 && xabVar.isInited()) {
            sbb sbbVar2 = this.a;
            if (sbbVar2.g0 == 0) {
                kg5 kg5Var = sbbVar2.n1;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                    sbb sbbVar3 = this.a;
                    a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) sbbVar3.v2.get(sbbVar3.u2)).commit();
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
        sbb sbbVar = this.a;
        if (sbbVar.g0 == 0 && !sbbVar.Q1 && !sbbVar.R1) {
            Activity activity = sbbVar.b;
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
                sbbVar.c(true);
            }
        }
    }

    public final void d() {
        xab xabVar;
        sbb sbbVar = this.a;
        if (!sbbVar.Q1 && !sbbVar.T1 && sbbVar.g0 == 0 && (xabVar = sbbVar.C0) != null && xabVar.isInited()) {
            sbbVar.X0.f(true);
            File file = sbbVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbbVar.H1 = null;
            }
            oy8 oy8Var = sbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(true);
            }
            sbbVar.H1 = c8b.w(sbbVar.c, "jpg");
            sbbVar.Q1 = true;
            sbbVar.m();
            sbbVar.d2 = false;
            if (sbbVar.C0.isFrontface() && sbbVar.u2 == 1) {
                sbbVar.n();
            }
            if (sbbVar.p0()) {
                rk4 rk4Var = sbbVar.s;
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
        sbb sbbVar = this.a;
        if (!sbbVar.S1 && sbbVar.R1) {
            sbbVar.S1 = true;
            qab qabVar = new qab(this, (byte) 0);
            if (z) {
                j = 0;
            } else {
                j = 400;
            }
            hl.d3(qabVar, j);
        }
    }

    public final void f(Runnable runnable, boolean z) {
        xab xabVar;
        sbb sbbVar = this.a;
        if (!sbbVar.R1 && !sbbVar.S1 && !sbbVar.T1 && sbbVar.g0 == 0 && (xabVar = sbbVar.C0) != null && xabVar.getCameraSession() != null) {
            kg5 kg5Var = sbbVar.m1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = sbbVar.n1;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
            sbbVar.X0.f(true);
            sbbVar.R1 = true;
            oy8 oy8Var = sbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(true);
            }
            File file = sbbVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbbVar.H1 = null;
            }
            sbbVar.H1 = c8b.w(sbbVar.c, "mp4");
            sbbVar.m();
            sbbVar.d2 = false;
            if (sbbVar.C0.isFrontface() && sbbVar.u2 == 1) {
                sbbVar.n();
            }
            if (sbbVar.p0()) {
                sbbVar.s.c(new rab(this, z, runnable));
            } else {
                g(runnable, z);
            }
        }
    }

    public final void g(Runnable runnable, boolean z) {
        boolean z2;
        sbb sbbVar = this.a;
        if (sbbVar.C0 != null) {
            CameraController.getInstance().recordVideo(sbbVar.C0.getCameraSessionObject(), sbbVar.H1, false, new hja(this, (byte) 20), new rab(this, runnable, z), sbbVar.C0, true);
            boolean z3 = true;
            if (sbbVar.P1 != 1) {
                sbbVar.P1 = 1;
                sbbVar.J0.a(false, true);
                if (sbbVar.P1 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbbVar.h0(z2, true);
                sbbVar.R0.a(sbbVar.P1);
                u59 u59Var = sbbVar.P0;
                if (sbbVar.P1 != 1) {
                    z3 = false;
                }
                u59Var.o0 = -1.0f;
                u59Var.p0 = z3;
                u59Var.invalidate();
            }
        }
    }

    public final void h(defpackage.pcc r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sab.h(pcc):void");
    }
}
