package defpackage;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
public final class t6b implements e29 {
    public final t7b a;

    public t6b(t7b t7bVar) {
        this.a = t7bVar;
    }

    public final void a() {
        f4b a;
        t7b t7bVar = this.a;
        ArrayList<f4b> content = t7bVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            t7bVar.L1 = a;
        } else {
            a = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
            t7bVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        t7bVar.P1 = i;
        q6b q6bVar = t7bVar.R0;
        if (q6bVar != null) {
            q6bVar.a(i);
        }
        a6b.a(t7bVar.c, t7bVar.L1);
        t7bVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        t7b t7bVar = this.a;
        y6b y6bVar = t7bVar.C0;
        if (y6bVar != null && !t7bVar.T1 && !t7bVar.Q1 && y6bVar.isInited()) {
            t7b t7bVar2 = this.a;
            if (t7bVar2.g0 == 0) {
                je5 je5Var = t7bVar2.n1;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                    t7b t7bVar3 = this.a;
                    a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) t7bVar3.v2.get(t7bVar3.u2)).commit();
                }
                this.a.C0.switchCamera();
                na7.c1().edit().putBoolean("stories_camera", this.a.C0.isFrontface()).apply();
                boolean p0 = this.a.p0();
                mi4 mi4Var = this.a.s;
                if (p0) {
                    mi4Var.c(null);
                } else {
                    mi4Var.d();
                }
            }
        }
    }

    public final void c() {
        boolean z;
        t7b t7bVar = this.a;
        if (t7bVar.g0 == 0 && !t7bVar.Q1 && !t7bVar.R1) {
            Activity activity = t7bVar.b;
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
                t7bVar.c(true);
            }
        }
    }

    public final void d() {
        y6b y6bVar;
        t7b t7bVar = this.a;
        if (!t7bVar.Q1 && !t7bVar.T1 && t7bVar.g0 == 0 && (y6bVar = t7bVar.C0) != null && y6bVar.isInited()) {
            t7bVar.X0.f(true);
            File file = t7bVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                t7bVar.H1 = null;
            }
            dv8 dv8Var = t7bVar.D0;
            if (dv8Var != null) {
                dv8Var.f(true);
            }
            t7bVar.H1 = f4b.w(t7bVar.c, "jpg");
            t7bVar.Q1 = true;
            t7bVar.m();
            t7bVar.d2 = false;
            if (t7bVar.C0.isFrontface() && t7bVar.u2 == 1) {
                t7bVar.n();
            }
            if (t7bVar.p0()) {
                mi4 mi4Var = t7bVar.s;
                ae9 ae9Var = new ae9(this, (byte) 18);
                mi4Var.h(mi4Var.p);
                mi4Var.e(1.0f, 320L, new hi4(mi4Var, ae9Var, (byte) 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z) {
        long j;
        t7b t7bVar = this.a;
        if (!t7bVar.S1 && t7bVar.R1) {
            t7bVar.S1 = true;
            r6b r6bVar = new r6b(this, (byte) 0);
            if (z) {
                j = 0;
            } else {
                j = 400;
            }
            gl.e3(r6bVar, j);
        }
    }

    public final void f(Runnable runnable, boolean z) {
        y6b y6bVar;
        t7b t7bVar = this.a;
        if (!t7bVar.R1 && !t7bVar.S1 && !t7bVar.T1 && t7bVar.g0 == 0 && (y6bVar = t7bVar.C0) != null && y6bVar.getCameraSession() != null) {
            je5 je5Var = t7bVar.m1;
            if (je5Var != null) {
                je5Var.f(true);
            }
            je5 je5Var2 = t7bVar.n1;
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
            t7bVar.X0.f(true);
            t7bVar.R1 = true;
            dv8 dv8Var = t7bVar.D0;
            if (dv8Var != null) {
                dv8Var.f(true);
            }
            File file = t7bVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                t7bVar.H1 = null;
            }
            t7bVar.H1 = f4b.w(t7bVar.c, "mp4");
            t7bVar.m();
            t7bVar.d2 = false;
            if (t7bVar.C0.isFrontface() && t7bVar.u2 == 1) {
                t7bVar.n();
            }
            if (t7bVar.p0()) {
                t7bVar.s.c(new s6b(this, z, runnable));
            } else {
                g(runnable, z);
            }
        }
    }

    public final void g(Runnable runnable, boolean z) {
        boolean z2;
        t7b t7bVar = this.a;
        if (t7bVar.C0 != null) {
            CameraController.getInstance().recordVideo(t7bVar.C0.getCameraSessionObject(), t7bVar.H1, false, new hza(this, (byte) 7), new s6b(this, runnable, z), t7bVar.C0, true);
            boolean z3 = true;
            if (t7bVar.P1 != 1) {
                t7bVar.P1 = 1;
                t7bVar.J0.a(false, true);
                if (t7bVar.P1 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                t7bVar.h0(z2, true);
                t7bVar.R0.a(t7bVar.P1);
                f29 f29Var = t7bVar.P0;
                if (t7bVar.P1 != 1) {
                    z3 = false;
                }
                f29Var.o0 = -1.0f;
                f29Var.p0 = z3;
                f29Var.invalidate();
            }
        }
    }

    public final void h(defpackage.p8c r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6b.h(p8c):void");
    }
}
