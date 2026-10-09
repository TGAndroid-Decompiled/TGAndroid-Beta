package ci;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class gb implements h7 {
    public final lc f5132a;

    public gb(lc lcVar) {
        this.f5132a = lcVar;
    }

    public final void a() {
        lc lcVar = this.f5132a;
        ArrayList<l8> content = lcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            lcVar.K1 = content.get(0);
        } else {
            lcVar.K1 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null && l8Var.K) {
            i10 = 1;
        }
        lcVar.O1 = i10;
        db dbVar = lcVar.Q0;
        if (dbVar != null) {
            dbVar.a(i10);
        }
        ga.a(lcVar.f5465c, lcVar.K1);
        lcVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        lc lcVar = this.f5132a;
        ob obVar = lcVar.B0;
        if (obVar != null && !lcVar.S1 && !lcVar.P1 && obVar.isInited()) {
            lc lcVar2 = this.f5132a;
            if (lcVar2.f5477f0 == 0) {
                d4 d4Var = lcVar2.f5497m1;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                if (this.f5132a.p0() && (arrayList = this.f5132a.f5525u2) != null && !arrayList.isEmpty()) {
                    lc lcVar3 = this.f5132a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) lcVar3.f5525u2.get(lcVar3.f5522t2)).commit();
                }
                this.f5132a.B0.switchCamera();
                lc.Z(this.f5132a.B0.isFrontface());
                if (this.f5132a.p0()) {
                    this.f5132a.f5516s.c(null);
                } else {
                    this.f5132a.f5516s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        lc lcVar = this.f5132a;
        if (lcVar.f5477f0 == 0 && !lcVar.P1 && !lcVar.Q1) {
            Activity activity = lcVar.f5461b;
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
                lcVar.e(true);
            }
        }
    }

    public final void d() {
        ob obVar;
        lc lcVar = this.f5132a;
        if (!lcVar.P1 && !lcVar.S1 && lcVar.f5477f0 == 0 && (obVar = lcVar.B0) != null && obVar.isInited()) {
            lcVar.W0.e(true);
            File file = lcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.G1 = null;
            }
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            lcVar.G1 = l8.w(lcVar.f5465c, "jpg");
            lcVar.P1 = true;
            lcVar.o();
            lcVar.f5468c2 = false;
            if (lcVar.B0.isFrontface() && lcVar.f5522t2 == 1) {
                lc.a(lcVar);
            }
            if (lcVar.p0()) {
                w2 w2Var = lcVar.f5516s;
                ai.y1 y1Var = new ai.y1(this, 17);
                w2Var.h(w2Var.f6196p);
                w2Var.e(1.0f, 320L, new s2(w2Var, y1Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j3;
        lc lcVar = this.f5132a;
        if (!lcVar.R1 && lcVar.Q1) {
            lcVar.R1 = true;
            eb ebVar = new eb(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            AndroidUtilities.runOnUIThread(ebVar, j3);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        ob obVar;
        lc lcVar = this.f5132a;
        if (!lcVar.Q1 && !lcVar.R1 && !lcVar.S1 && lcVar.f5477f0 == 0 && (obVar = lcVar.B0) != null && obVar.getCameraSession() != null) {
            d4 d4Var = lcVar.l1;
            if (d4Var != null) {
                d4Var.e(true);
            }
            d4 d4Var2 = lcVar.f5497m1;
            if (d4Var2 != null) {
                d4Var2.e(true);
            }
            lcVar.W0.e(true);
            lcVar.Q1 = true;
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            File file = lcVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.G1 = null;
            }
            lcVar.G1 = l8.x(lcVar.f5465c, true);
            lcVar.o();
            lcVar.f5468c2 = false;
            if (lcVar.B0.isFrontface() && lcVar.f5522t2 == 1) {
                lc.a(lcVar);
            }
            if (lcVar.p0()) {
                lcVar.f5516s.c(new fb(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        lc lcVar = this.f5132a;
        if (lcVar.B0 != null) {
            CameraController.getInstance().recordVideo(lcVar.B0.getCameraSessionObject(), lcVar.G1, false, new a1.c(this, 20), new fb(this, runnable, z10), lcVar.B0, true);
            boolean z12 = true;
            if (lcVar.O1 != 1) {
                lcVar.O1 = 1;
                lcVar.I0.a(false, true);
                if (lcVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lcVar.h0(z11, true);
                lcVar.Q0.a(lcVar.O1);
                j7 j7Var = lcVar.O0;
                if (lcVar.O1 != 1) {
                    z12 = false;
                }
                j7Var.f5268n0 = -1.0f;
                j7Var.f5269o0 = z12;
                j7Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ci.gb.h(org.telegram.messenger.Utilities$Callback):void");
    }
}
