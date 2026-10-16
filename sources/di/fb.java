package di;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class fb implements g7 {
    public final kc f6957a;

    public fb(kc kcVar) {
        this.f6957a = kcVar;
    }

    public final void a() {
        kc kcVar = this.f6957a;
        ArrayList<k8> content = kcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            kcVar.K1 = content.get(0);
        } else {
            kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null && k8Var.K) {
            i10 = 1;
        }
        kcVar.O1 = i10;
        cb cbVar = kcVar.Q0;
        if (cbVar != null) {
            cbVar.a(i10);
        }
        fa.a(kcVar.f7244c, kcVar.K1);
        kcVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        kc kcVar = this.f6957a;
        nb nbVar = kcVar.B0;
        if (nbVar != null && !kcVar.S1 && !kcVar.P1 && nbVar.isInited()) {
            kc kcVar2 = this.f6957a;
            if (kcVar2.f7255f0 == 0) {
                d4 d4Var = kcVar2.f7275m1;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                if (this.f6957a.p0() && (arrayList = this.f6957a.f7303u2) != null && !arrayList.isEmpty()) {
                    kc kcVar3 = this.f6957a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) kcVar3.f7303u2.get(kcVar3.f7300t2)).commit();
                }
                this.f6957a.B0.switchCamera();
                kc.Z(this.f6957a.B0.isFrontface());
                if (this.f6957a.p0()) {
                    this.f6957a.f7294s.c(null);
                } else {
                    this.f6957a.f7294s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        kc kcVar = this.f6957a;
        if (kcVar.f7255f0 == 0 && !kcVar.P1 && !kcVar.Q1) {
            Activity activity = kcVar.f7240b;
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
                kcVar.e(true);
            }
        }
    }

    public final void d() {
        nb nbVar;
        kc kcVar = this.f6957a;
        if (!kcVar.P1 && !kcVar.S1 && kcVar.f7255f0 == 0 && (nbVar = kcVar.B0) != null && nbVar.isInited()) {
            kcVar.W0.e(true);
            File file = kcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.G1 = null;
            }
            e7 e7Var = kcVar.C0;
            if (e7Var != null) {
                e7Var.c(true);
            }
            kcVar.G1 = k8.w(kcVar.f7244c, "jpg");
            kcVar.P1 = true;
            kcVar.o();
            kcVar.f7247c2 = false;
            if (kcVar.B0.isFrontface() && kcVar.f7300t2 == 1) {
                kc.a(kcVar);
            }
            if (kcVar.p0()) {
                w2 w2Var = kcVar.f7294s;
                bi.o1 o1Var = new bi.o1(this, 17);
                w2Var.h(w2Var.f8042p);
                w2Var.e(1.0f, 320L, new s2(w2Var, o1Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j10;
        kc kcVar = this.f6957a;
        if (!kcVar.R1 && kcVar.Q1) {
            kcVar.R1 = true;
            db dbVar = new db(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(dbVar, j10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        nb nbVar;
        kc kcVar = this.f6957a;
        if (!kcVar.Q1 && !kcVar.R1 && !kcVar.S1 && kcVar.f7255f0 == 0 && (nbVar = kcVar.B0) != null && nbVar.getCameraSession() != null) {
            d4 d4Var = kcVar.l1;
            if (d4Var != null) {
                d4Var.e(true);
            }
            d4 d4Var2 = kcVar.f7275m1;
            if (d4Var2 != null) {
                d4Var2.e(true);
            }
            kcVar.W0.e(true);
            kcVar.Q1 = true;
            e7 e7Var = kcVar.C0;
            if (e7Var != null) {
                e7Var.c(true);
            }
            File file = kcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.G1 = null;
            }
            kcVar.G1 = k8.x(kcVar.f7244c, true);
            kcVar.o();
            kcVar.f7247c2 = false;
            if (kcVar.B0.isFrontface() && kcVar.f7300t2 == 1) {
                kc.a(kcVar);
            }
            if (kcVar.p0()) {
                kcVar.f7294s.c(new eb(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        kc kcVar = this.f6957a;
        if (kcVar.B0 != null) {
            CameraController.getInstance().recordVideo(kcVar.B0.getCameraSessionObject(), kcVar.G1, false, new a1.c(this, 27), new eb(this, runnable, z10), kcVar.B0, true);
            boolean z12 = true;
            if (kcVar.O1 != 1) {
                kcVar.O1 = 1;
                kcVar.I0.a(false, true);
                if (kcVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kcVar.h0(z11, true);
                kcVar.Q0.a(kcVar.O1);
                i7 i7Var = kcVar.O0;
                if (kcVar.O1 != 1) {
                    z12 = false;
                }
                i7Var.f7065n0 = -1.0f;
                i7Var.f7066o0 = z12;
                i7Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: di.fb.h(org.telegram.messenger.Utilities$Callback):void");
    }
}
