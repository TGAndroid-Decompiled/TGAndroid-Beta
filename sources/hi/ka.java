package hi;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
public final class ka implements l6 {
    public final nb f14800a;

    public ka(nb nbVar) {
        this.f14800a = nbVar;
    }

    public final void a() {
        nb nbVar = this.f14800a;
        ArrayList<x7> content = nbVar.B0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            nbVar.L1 = content.get(0);
        } else {
            nbVar.L1 = x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
        }
        x7 x7Var = nbVar.L1;
        if (x7Var != null && x7Var.K) {
            i7 = 1;
        }
        nbVar.P1 = i7;
        ha haVar = nbVar.R0;
        if (haVar != null) {
            haVar.a(i7);
        }
        l9.a(nbVar.f15062c, nbVar.L1);
        nbVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        nb nbVar = this.f14800a;
        qa qaVar = nbVar.C0;
        if (qaVar != null && !nbVar.T1 && !nbVar.Q1 && qaVar.isInited()) {
            nb nbVar2 = this.f14800a;
            if (nbVar2.f15076g0 == 0) {
                u3 u3Var = nbVar2.n1;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                if (this.f14800a.p0() && (arrayList = this.f14800a.f15123v2) != null && !arrayList.isEmpty()) {
                    nb nbVar3 = this.f14800a;
                    org.telegram.messenger.t0.f27013b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) nbVar3.f15123v2.get(nbVar3.f15120u2)).commit();
                }
                this.f14800a.C0.switchCamera();
                nb.Z(this.f14800a.C0.isFrontface());
                if (this.f14800a.p0()) {
                    this.f14800a.f15111s.c(null);
                } else {
                    this.f14800a.f15111s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        nb nbVar = this.f14800a;
        if (nbVar.f15076g0 == 0 && !nbVar.Q1 && !nbVar.R1) {
            Activity activity = nbVar.f15058b;
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
                nbVar.e(true);
            }
        }
    }

    public final void d() {
        qa qaVar;
        nb nbVar = this.f14800a;
        if (!nbVar.Q1 && !nbVar.T1 && nbVar.f15076g0 == 0 && (qaVar = nbVar.C0) != null && qaVar.isInited()) {
            nbVar.X0.f(true);
            File file = nbVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                nbVar.H1 = null;
            }
            j6 j6Var = nbVar.D0;
            if (j6Var != null) {
                j6Var.c(true);
            }
            nbVar.H1 = x7.w(nbVar.f15062c, "jpg");
            nbVar.Q1 = true;
            nbVar.o();
            nbVar.d2 = false;
            if (nbVar.C0.isFrontface() && nbVar.f15120u2 == 1) {
                nb.a(nbVar);
            }
            if (nbVar.p0()) {
                w2 w2Var = nbVar.f15111s;
                c7 c7Var = new c7(this, 3);
                w2Var.h(w2Var.f15666p);
                w2Var.e(1.0f, 320L, new s2(w2Var, c7Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j3;
        nb nbVar = this.f14800a;
        if (!nbVar.S1 && nbVar.R1) {
            nbVar.S1 = true;
            ia iaVar = new ia(this, 0);
            if (z10) {
                j3 = 0;
            } else {
                j3 = 400;
            }
            org.telegram.messenger.g0.h3(iaVar, j3);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        qa qaVar;
        nb nbVar = this.f14800a;
        if (!nbVar.R1 && !nbVar.S1 && !nbVar.T1 && nbVar.f15076g0 == 0 && (qaVar = nbVar.C0) != null && qaVar.getCameraSession() != null) {
            u3 u3Var = nbVar.f15093m1;
            if (u3Var != null) {
                u3Var.f(true);
            }
            u3 u3Var2 = nbVar.n1;
            if (u3Var2 != null) {
                u3Var2.f(true);
            }
            nbVar.X0.f(true);
            nbVar.R1 = true;
            j6 j6Var = nbVar.D0;
            if (j6Var != null) {
                j6Var.c(true);
            }
            File file = nbVar.H1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                nbVar.H1 = null;
            }
            nbVar.H1 = x7.x(nbVar.f15062c, true);
            nbVar.o();
            nbVar.d2 = false;
            if (nbVar.C0.isFrontface() && nbVar.f15120u2 == 1) {
                nb.a(nbVar);
            }
            if (nbVar.p0()) {
                nbVar.f15111s.c(new ja(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        nb nbVar = this.f14800a;
        if (nbVar.C0 != null) {
            CameraController.getInstance().recordVideo(nbVar.C0.getCameraSessionObject(), nbVar.H1, false, new di.v6(this, 25), new ja(this, runnable, z10), nbVar.C0, true);
            boolean z12 = true;
            if (nbVar.P1 != 1) {
                nbVar.P1 = 1;
                nbVar.J0.a(false, true);
                if (nbVar.P1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nbVar.h0(z11, true);
                nbVar.R0.a(nbVar.P1);
                n6 n6Var = nbVar.P0;
                if (nbVar.P1 != 1) {
                    z12 = false;
                }
                n6Var.f15032o0 = -1.0f;
                n6Var.f15033p0 = z12;
                n6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.w10 r9) {
        throw new UnsupportedOperationException("Method not decompiled: hi.ka.h(org.telegram.messenger.w10):void");
    }
}
