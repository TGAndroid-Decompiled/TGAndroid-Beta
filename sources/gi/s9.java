package gi;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
public final class s9 implements e6 {
    public final va f13580a;

    public s9(va vaVar) {
        this.f13580a = vaVar;
    }

    public final void a() {
        va vaVar = this.f13580a;
        ArrayList<f7> content = vaVar.B0.getContent();
        int i3 = 0;
        if (content.size() == 1) {
            vaVar.L1 = content.get(0);
        } else {
            vaVar.L1 = f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
        }
        f7 f7Var = vaVar.L1;
        if (f7Var != null && f7Var.K) {
            i3 = 1;
        }
        vaVar.P1 = i3;
        p9 p9Var = vaVar.R0;
        if (p9Var != null) {
            p9Var.a(i3);
        }
        u8.a(vaVar.f13706c, vaVar.L1);
        vaVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        va vaVar = this.f13580a;
        y9 y9Var = vaVar.C0;
        if (y9Var != null && !vaVar.T1 && !vaVar.Q1 && y9Var.isInited()) {
            va vaVar2 = this.f13580a;
            if (vaVar2.f13720g0 == 0) {
                l3 l3Var = vaVar2.f13740n1;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                if (this.f13580a.p0() && (arrayList = this.f13580a.f13767v2) != null && !arrayList.isEmpty()) {
                    va vaVar3 = this.f13580a;
                    org.telegram.messenger.t0.f25457b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) vaVar3.f13767v2.get(vaVar3.f13764u2)).commit();
                }
                this.f13580a.C0.switchCamera();
                va.Z(this.f13580a.C0.isFrontface());
                if (this.f13580a.p0()) {
                    this.f13580a.f13755s.c(null);
                } else {
                    this.f13580a.f13755s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        va vaVar = this.f13580a;
        if (vaVar.f13720g0 == 0 && !vaVar.Q1 && !vaVar.R1) {
            Activity activity = vaVar.f13702b;
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
                vaVar.e(true);
            }
        }
    }

    public final void d() {
        y9 y9Var;
        va vaVar = this.f13580a;
        if (!vaVar.Q1 && !vaVar.T1 && vaVar.f13720g0 == 0 && (y9Var = vaVar.C0) != null && y9Var.isInited()) {
            vaVar.X0.f(true);
            File file = vaVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.H1 = null;
            }
            c6 c6Var = vaVar.D0;
            if (c6Var != null) {
                c6Var.c(true);
            }
            vaVar.H1 = f7.w(vaVar.f13706c, "jpg");
            vaVar.Q1 = true;
            vaVar.o();
            vaVar.f13711d2 = false;
            if (vaVar.C0.isFrontface() && vaVar.f13764u2 == 1) {
                va.a(vaVar);
            }
            if (vaVar.p0()) {
                n2 n2Var = vaVar.f13755s;
                j8 j8Var = new j8(this, 1);
                n2Var.h(n2Var.f13293p);
                n2Var.e(1.0f, 320L, new j2(n2Var, j8Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j10;
        va vaVar = this.f13580a;
        if (!vaVar.S1 && vaVar.R1) {
            vaVar.S1 = true;
            q9 q9Var = new q9(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            org.telegram.messenger.g0.i3(q9Var, j10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        y9 y9Var;
        va vaVar = this.f13580a;
        if (!vaVar.R1 && !vaVar.S1 && !vaVar.T1 && vaVar.f13720g0 == 0 && (y9Var = vaVar.C0) != null && y9Var.getCameraSession() != null) {
            l3 l3Var = vaVar.m1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            l3 l3Var2 = vaVar.f13740n1;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            vaVar.X0.f(true);
            vaVar.R1 = true;
            c6 c6Var = vaVar.D0;
            if (c6Var != null) {
                c6Var.c(true);
            }
            File file = vaVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.H1 = null;
            }
            vaVar.H1 = f7.x(vaVar.f13706c, true);
            vaVar.o();
            vaVar.f13711d2 = false;
            if (vaVar.C0.isFrontface() && vaVar.f13764u2 == 1) {
                va.a(vaVar);
            }
            if (vaVar.p0()) {
                vaVar.f13755s.c(new r9(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        va vaVar = this.f13580a;
        if (vaVar.C0 != null) {
            CameraController.getInstance().recordVideo(vaVar.C0.getCameraSessionObject(), vaVar.H1, false, new ei.y8(this, 11), new r9(this, runnable, z10), vaVar.C0, true);
            boolean z12 = true;
            if (vaVar.P1 != 1) {
                vaVar.P1 = 1;
                vaVar.J0.a(false, true);
                if (vaVar.P1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vaVar.h0(z11, true);
                vaVar.R0.a(vaVar.P1);
                h6 h6Var = vaVar.P0;
                if (vaVar.P1 != 1) {
                    z12 = false;
                }
                h6Var.f12902o0 = -1.0f;
                h6Var.f12903p0 = z12;
                h6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.u10 r9) {
        throw new UnsupportedOperationException("Method not decompiled: gi.s9.h(org.telegram.messenger.u10):void");
    }
}
