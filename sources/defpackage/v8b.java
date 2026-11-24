package defpackage;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
public final class v8b implements i49 {
    public final v9b a;

    public v8b(v9b v9bVar) {
        this.a = v9bVar;
    }

    public final void a() {
        g6b a;
        v9b v9bVar = this.a;
        ArrayList<g6b> content = v9bVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            v9bVar.L1 = a;
        } else {
            a = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
            v9bVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        v9bVar.P1 = i;
        s8b s8bVar = v9bVar.R0;
        if (s8bVar != null) {
            s8bVar.a(i);
        }
        c8b.a(v9bVar.c, v9bVar.L1);
        v9bVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        v9b v9bVar = this.a;
        a9b a9bVar = v9bVar.C0;
        if (a9bVar != null && !v9bVar.T1 && !v9bVar.Q1 && a9bVar.isInited()) {
            v9b v9bVar2 = this.a;
            if (v9bVar2.g0 == 0) {
                hg5 hg5Var = v9bVar2.n1;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                    v9b v9bVar3 = this.a;
                    a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) v9bVar3.v2.get(v9bVar3.u2)).commit();
                }
                this.a.C0.switchCamera();
                oc7.d1().edit().putBoolean("stories_camera", this.a.C0.isFrontface()).apply();
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
        v9b v9bVar = this.a;
        if (v9bVar.g0 == 0 && !v9bVar.Q1 && !v9bVar.R1) {
            Activity activity = v9bVar.b;
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
                v9bVar.c(true);
            }
        }
    }

    public final void d() {
        a9b a9bVar;
        v9b v9bVar = this.a;
        if (!v9bVar.Q1 && !v9bVar.T1 && v9bVar.g0 == 0 && (a9bVar = v9bVar.C0) != null && a9bVar.isInited()) {
            v9bVar.X0.f(true);
            File file = v9bVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                v9bVar.H1 = null;
            }
            ex8 ex8Var = v9bVar.D0;
            if (ex8Var != null) {
                ex8Var.f(true);
            }
            v9bVar.H1 = g6b.w(v9bVar.c, "jpg");
            v9bVar.Q1 = true;
            v9bVar.m();
            v9bVar.d2 = false;
            if (v9bVar.C0.isFrontface() && v9bVar.u2 == 1) {
                v9bVar.n();
            }
            if (v9bVar.p0()) {
                rk4 rk4Var = v9bVar.s;
                eg9 eg9Var = new eg9(this, (byte) 18);
                rk4Var.h(rk4Var.p);
                rk4Var.e(1.0f, 320L, new mk4(rk4Var, eg9Var, (byte) 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z) {
        long j;
        v9b v9bVar = this.a;
        if (!v9bVar.S1 && v9bVar.R1) {
            v9bVar.S1 = true;
            t8b t8bVar = new t8b(this, (byte) 0);
            if (z) {
                j = 0;
            } else {
                j = 400;
            }
            gm.d3(t8bVar, j);
        }
    }

    public final void f(Runnable runnable, boolean z) {
        a9b a9bVar;
        v9b v9bVar = this.a;
        if (!v9bVar.R1 && !v9bVar.S1 && !v9bVar.T1 && v9bVar.g0 == 0 && (a9bVar = v9bVar.C0) != null && a9bVar.getCameraSession() != null) {
            hg5 hg5Var = v9bVar.m1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            hg5 hg5Var2 = v9bVar.n1;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
            v9bVar.X0.f(true);
            v9bVar.R1 = true;
            ex8 ex8Var = v9bVar.D0;
            if (ex8Var != null) {
                ex8Var.f(true);
            }
            File file = v9bVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                v9bVar.H1 = null;
            }
            v9bVar.H1 = g6b.w(v9bVar.c, "mp4");
            v9bVar.m();
            v9bVar.d2 = false;
            if (v9bVar.C0.isFrontface() && v9bVar.u2 == 1) {
                v9bVar.n();
            }
            if (v9bVar.p0()) {
                v9bVar.s.c(new u8b(this, z, runnable));
            } else {
                g(runnable, z);
            }
        }
    }

    public final void g(Runnable runnable, boolean z) {
        boolean z2;
        v9b v9bVar = this.a;
        if (v9bVar.C0 != null) {
            CameraController.getInstance().recordVideo(v9bVar.C0.getCameraSessionObject(), v9bVar.H1, false, new wta(this, (byte) 11), new u8b(this, runnable, z), v9bVar.C0, true);
            boolean z3 = true;
            if (v9bVar.P1 != 1) {
                v9bVar.P1 = 1;
                v9bVar.J0.a(false, true);
                if (v9bVar.P1 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                v9bVar.h0(z2, true);
                v9bVar.R0.a(v9bVar.P1);
                j49 j49Var = v9bVar.P0;
                if (v9bVar.P1 != 1) {
                    z3 = false;
                }
                j49Var.o0 = -1.0f;
                j49Var.p0 = z3;
                j49Var.invalidate();
            }
        }
    }

    public final void h(defpackage.qac r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8b.h(qac):void");
    }
}
