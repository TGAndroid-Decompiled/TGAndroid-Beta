package fi;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
public final class r9 implements e6 {
    public final va f12762a;

    public r9(va vaVar) {
        this.f12762a = vaVar;
    }

    public final void a() {
        va vaVar = this.f12762a;
        ArrayList<e7> content = vaVar.A0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            vaVar.K1 = content.get(0);
        } else {
            vaVar.K1 = e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
        }
        e7 e7Var = vaVar.K1;
        if (e7Var != null && e7Var.K) {
            i7 = 1;
        }
        vaVar.O1 = i7;
        o9 o9Var = vaVar.Q0;
        if (o9Var != null) {
            o9Var.a(i7);
        }
        t8.a(vaVar.f12944c, vaVar.K1);
        vaVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        va vaVar = this.f12762a;
        y9 y9Var = vaVar.B0;
        if (y9Var != null && !vaVar.S1 && !vaVar.P1 && y9Var.isInited()) {
            va vaVar2 = this.f12762a;
            if (vaVar2.f12955f0 == 0) {
                m3 m3Var = vaVar2.f12975m1;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                if (this.f12762a.p0() && (arrayList = this.f12762a.f13002u2) != null && !arrayList.isEmpty()) {
                    va vaVar3 = this.f12762a;
                    org.telegram.messenger.t0.f25570b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) vaVar3.f13002u2.get(vaVar3.f12999t2)).commit();
                }
                this.f12762a.B0.switchCamera();
                va.Z(this.f12762a.B0.isFrontface());
                if (this.f12762a.p0()) {
                    this.f12762a.f12993s.c(null);
                } else {
                    this.f12762a.f12993s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z9;
        va vaVar = this.f12762a;
        if (vaVar.f12955f0 == 0 && !vaVar.P1 && !vaVar.Q1) {
            Activity activity = vaVar.f12940b;
            if (activity != null) {
                boolean z10 = false;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        z10 = true;
                    }
                    if (z10) {
                        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
                    }
                } else {
                    if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z10 = true;
                    }
                    if (z10) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
                    }
                }
                z9 = !z10;
            } else {
                z9 = true;
            }
            if (z9) {
                vaVar.e(true);
            }
        }
    }

    public final void d() {
        y9 y9Var;
        va vaVar = this.f12762a;
        if (!vaVar.P1 && !vaVar.S1 && vaVar.f12955f0 == 0 && (y9Var = vaVar.B0) != null && y9Var.isInited()) {
            vaVar.W0.f(true);
            File file = vaVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.G1 = null;
            }
            c6 c6Var = vaVar.C0;
            if (c6Var != null) {
                c6Var.c(true);
            }
            vaVar.G1 = e7.w(vaVar.f12944c, "jpg");
            vaVar.P1 = true;
            vaVar.o();
            vaVar.f12947c2 = false;
            if (vaVar.B0.isFrontface() && vaVar.f12999t2 == 1) {
                va.a(vaVar);
            }
            if (vaVar.p0()) {
                p2 p2Var = vaVar.f12993s;
                ai.i iVar = new ai.i(this, 28);
                p2Var.h(p2Var.f12589p);
                p2Var.e(1.0f, 320L, new l2(p2Var, iVar, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z9) {
        long j3;
        va vaVar = this.f12762a;
        if (!vaVar.R1 && vaVar.Q1) {
            vaVar.R1 = true;
            p9 p9Var = new p9(this, 0);
            if (z9) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            org.telegram.messenger.g0.i3(p9Var, j3);
        }
    }

    public final void f(Runnable runnable, boolean z9) {
        y9 y9Var;
        va vaVar = this.f12762a;
        if (!vaVar.Q1 && !vaVar.R1 && !vaVar.S1 && vaVar.f12955f0 == 0 && (y9Var = vaVar.B0) != null && y9Var.getCameraSession() != null) {
            m3 m3Var = vaVar.l1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            m3 m3Var2 = vaVar.f12975m1;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            vaVar.W0.f(true);
            vaVar.Q1 = true;
            c6 c6Var = vaVar.C0;
            if (c6Var != null) {
                c6Var.c(true);
            }
            File file = vaVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.G1 = null;
            }
            vaVar.G1 = e7.x(vaVar.f12944c, true);
            vaVar.o();
            vaVar.f12947c2 = false;
            if (vaVar.B0.isFrontface() && vaVar.f12999t2 == 1) {
                va.a(vaVar);
            }
            if (vaVar.p0()) {
                vaVar.f12993s.c(new q9(this, z9, runnable));
            } else {
                g(runnable, z9);
            }
        }
    }

    public final void g(Runnable runnable, boolean z9) {
        boolean z10;
        va vaVar = this.f12762a;
        if (vaVar.B0 != null) {
            CameraController.getInstance().recordVideo(vaVar.B0.getCameraSessionObject(), vaVar.G1, false, new di.r4(this, 15), new q9(this, runnable, z9), vaVar.B0, true);
            boolean z11 = true;
            if (vaVar.O1 != 1) {
                vaVar.O1 = 1;
                vaVar.I0.a(false, true);
                if (vaVar.O1 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vaVar.h0(z10, true);
                vaVar.Q0.a(vaVar.O1);
                g6 g6Var = vaVar.O0;
                if (vaVar.O1 != 1) {
                    z11 = false;
                }
                g6Var.f12093n0 = -1.0f;
                g6Var.f12094o0 = z11;
                g6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.c20 r9) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r9.h(org.telegram.messenger.c20):void");
    }
}
