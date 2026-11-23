package hi;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
public final class p9 implements b6 {
    public final sa f15282a;

    public p9(sa saVar) {
        this.f15282a = saVar;
    }

    public final void a() {
        sa saVar = this.f15282a;
        ArrayList<c7> content = saVar.B0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            saVar.L1 = content.get(0);
        } else {
            saVar.L1 = c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
        }
        c7 c7Var = saVar.L1;
        if (c7Var != null && c7Var.K) {
            i7 = 1;
        }
        saVar.P1 = i7;
        m9 m9Var = saVar.R0;
        if (m9Var != null) {
            m9Var.a(i7);
        }
        q8.a(saVar.f15392c, saVar.L1);
        saVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sa saVar = this.f15282a;
        v9 v9Var = saVar.C0;
        if (v9Var != null && !saVar.T1 && !saVar.Q1 && v9Var.isInited()) {
            sa saVar2 = this.f15282a;
            if (saVar2.f15406g0 == 0) {
                l3 l3Var = saVar2.n1;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                if (this.f15282a.p0() && (arrayList = this.f15282a.f15453v2) != null && !arrayList.isEmpty()) {
                    sa saVar3 = this.f15282a;
                    org.telegram.messenger.t0.f26931b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) saVar3.f15453v2.get(saVar3.f15450u2)).commit();
                }
                this.f15282a.C0.switchCamera();
                sa.Z(this.f15282a.C0.isFrontface());
                if (this.f15282a.p0()) {
                    this.f15282a.f15441s.c(null);
                } else {
                    this.f15282a.f15441s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        sa saVar = this.f15282a;
        if (saVar.f15406g0 == 0 && !saVar.Q1 && !saVar.R1) {
            Activity activity = saVar.f15388b;
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
                saVar.e(true);
            }
        }
    }

    public final void d() {
        v9 v9Var;
        sa saVar = this.f15282a;
        if (!saVar.Q1 && !saVar.T1 && saVar.f15406g0 == 0 && (v9Var = saVar.C0) != null && v9Var.isInited()) {
            saVar.X0.f(true);
            File file = saVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.H1 = null;
            }
            z5 z5Var = saVar.D0;
            if (z5Var != null) {
                z5Var.c(true);
            }
            saVar.H1 = c7.w(saVar.f15392c, "jpg");
            saVar.Q1 = true;
            saVar.o();
            saVar.d2 = false;
            if (saVar.C0.isFrontface() && saVar.f15450u2 == 1) {
                sa.a(saVar);
            }
            if (saVar.p0()) {
                n2 n2Var = saVar.f15441s;
                s6 s6Var = new s6(this, 3);
                n2Var.h(n2Var.f15086p);
                n2Var.e(1.0f, 320L, new j2(n2Var, s6Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j3;
        sa saVar = this.f15282a;
        if (!saVar.S1 && saVar.R1) {
            saVar.S1 = true;
            n9 n9Var = new n9(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            org.telegram.messenger.g0.h3(n9Var, j3);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        v9 v9Var;
        sa saVar = this.f15282a;
        if (!saVar.R1 && !saVar.S1 && !saVar.T1 && saVar.f15406g0 == 0 && (v9Var = saVar.C0) != null && v9Var.getCameraSession() != null) {
            l3 l3Var = saVar.f15423m1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            l3 l3Var2 = saVar.n1;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            saVar.X0.f(true);
            saVar.R1 = true;
            z5 z5Var = saVar.D0;
            if (z5Var != null) {
                z5Var.c(true);
            }
            File file = saVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.H1 = null;
            }
            saVar.H1 = c7.x(saVar.f15392c, true);
            saVar.o();
            saVar.d2 = false;
            if (saVar.C0.isFrontface() && saVar.f15450u2 == 1) {
                sa.a(saVar);
            }
            if (saVar.p0()) {
                saVar.f15441s.c(new o9(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        sa saVar = this.f15282a;
        if (saVar.C0 != null) {
            CameraController.getInstance().recordVideo(saVar.C0.getCameraSessionObject(), saVar.H1, false, new di.v6(this, 23), new o9(this, runnable, z10), saVar.C0, true);
            boolean z12 = true;
            if (saVar.P1 != 1) {
                saVar.P1 = 1;
                saVar.J0.a(false, true);
                if (saVar.P1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                saVar.h0(z11, true);
                saVar.R0.a(saVar.P1);
                d6 d6Var = saVar.P0;
                if (saVar.P1 != 1) {
                    z12 = false;
                }
                d6Var.f14531o0 = -1.0f;
                d6Var.f14532p0 = z12;
                d6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.y10 r9) {
        throw new UnsupportedOperationException("Method not decompiled: hi.p9.h(org.telegram.messenger.y10):void");
    }
}
