package hi;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
public final class q9 implements c6 {
    public final ta f15296a;

    public q9(ta taVar) {
        this.f15296a = taVar;
    }

    public final void a() {
        ta taVar = this.f15296a;
        ArrayList<d7> content = taVar.B0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            taVar.L1 = content.get(0);
        } else {
            taVar.L1 = d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
        }
        d7 d7Var = taVar.L1;
        if (d7Var != null && d7Var.K) {
            i7 = 1;
        }
        taVar.P1 = i7;
        n9 n9Var = taVar.R0;
        if (n9Var != null) {
            n9Var.a(i7);
        }
        r8.a(taVar.f15431c, taVar.L1);
        taVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ta taVar = this.f15296a;
        w9 w9Var = taVar.C0;
        if (w9Var != null && !taVar.T1 && !taVar.Q1 && w9Var.isInited()) {
            ta taVar2 = this.f15296a;
            if (taVar2.f15445g0 == 0) {
                m3 m3Var = taVar2.n1;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                if (this.f15296a.p0() && (arrayList = this.f15296a.f15492v2) != null && !arrayList.isEmpty()) {
                    ta taVar3 = this.f15296a;
                    org.telegram.messenger.t0.f26915b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) taVar3.f15492v2.get(taVar3.f15489u2)).commit();
                }
                this.f15296a.C0.switchCamera();
                ta.Z(this.f15296a.C0.isFrontface());
                if (this.f15296a.p0()) {
                    this.f15296a.f15480s.c(null);
                } else {
                    this.f15296a.f15480s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        ta taVar = this.f15296a;
        if (taVar.f15445g0 == 0 && !taVar.Q1 && !taVar.R1) {
            Activity activity = taVar.f15427b;
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
                taVar.e(true);
            }
        }
    }

    public final void d() {
        w9 w9Var;
        ta taVar = this.f15296a;
        if (!taVar.Q1 && !taVar.T1 && taVar.f15445g0 == 0 && (w9Var = taVar.C0) != null && w9Var.isInited()) {
            taVar.X0.f(true);
            File file = taVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                taVar.H1 = null;
            }
            a6 a6Var = taVar.D0;
            if (a6Var != null) {
                a6Var.c(true);
            }
            taVar.H1 = d7.w(taVar.f15431c, "jpg");
            taVar.Q1 = true;
            taVar.o();
            taVar.d2 = false;
            if (taVar.C0.isFrontface() && taVar.f15489u2 == 1) {
                ta.a(taVar);
            }
            if (taVar.p0()) {
                o2 o2Var = taVar.f15480s;
                t6 t6Var = new t6(this, 3);
                o2Var.h(o2Var.f15153p);
                o2Var.e(1.0f, 320L, new k2(o2Var, t6Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j3;
        ta taVar = this.f15296a;
        if (!taVar.S1 && taVar.R1) {
            taVar.S1 = true;
            o9 o9Var = new o9(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            org.telegram.messenger.g0.h3(o9Var, j3);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        w9 w9Var;
        ta taVar = this.f15296a;
        if (!taVar.R1 && !taVar.S1 && !taVar.T1 && taVar.f15445g0 == 0 && (w9Var = taVar.C0) != null && w9Var.getCameraSession() != null) {
            m3 m3Var = taVar.f15462m1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            m3 m3Var2 = taVar.n1;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            taVar.X0.f(true);
            taVar.R1 = true;
            a6 a6Var = taVar.D0;
            if (a6Var != null) {
                a6Var.c(true);
            }
            File file = taVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                taVar.H1 = null;
            }
            taVar.H1 = d7.x(taVar.f15431c, true);
            taVar.o();
            taVar.d2 = false;
            if (taVar.C0.isFrontface() && taVar.f15489u2 == 1) {
                ta.a(taVar);
            }
            if (taVar.p0()) {
                taVar.f15480s.c(new p9(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        ta taVar = this.f15296a;
        if (taVar.C0 != null) {
            CameraController.getInstance().recordVideo(taVar.C0.getCameraSessionObject(), taVar.H1, false, new di.c7(this, 22), new p9(this, runnable, z10), taVar.C0, true);
            boolean z12 = true;
            if (taVar.P1 != 1) {
                taVar.P1 = 1;
                taVar.J0.a(false, true);
                if (taVar.P1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                taVar.h0(z11, true);
                taVar.R0.a(taVar.P1);
                e6 e6Var = taVar.P0;
                if (taVar.P1 != 1) {
                    z12 = false;
                }
                e6Var.f14580o0 = -1.0f;
                e6Var.f14581p0 = z12;
                e6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.x10 r9) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q9.h(org.telegram.messenger.x10):void");
    }
}
