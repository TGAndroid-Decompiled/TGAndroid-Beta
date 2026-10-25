package fi;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class ma implements u6 {
    public final sb f11270a;

    public ma(sb sbVar) {
        this.f11270a = sbVar;
    }

    public final void a() {
        sb sbVar = this.f11270a;
        ArrayList<w7> content = sbVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            sbVar.K1 = content.get(0);
        } else {
            sbVar.K1 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
        }
        w7 w7Var = sbVar.K1;
        if (w7Var != null && w7Var.K) {
            i10 = 1;
        }
        sbVar.O1 = i10;
        ja jaVar = sbVar.Q0;
        if (jaVar != null) {
            jaVar.a(i10);
        }
        o9.a(sbVar.f11612c, sbVar.K1);
        sbVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sb sbVar = this.f11270a;
        va vaVar = sbVar.B0;
        if (vaVar != null && !sbVar.S1 && !sbVar.P1 && vaVar.isInited()) {
            sb sbVar2 = this.f11270a;
            if (sbVar2.f11623f0 == 0) {
                v3 v3Var = sbVar2.f11643m1;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                if (this.f11270a.p0() && (arrayList = this.f11270a.f11671u2) != null && !arrayList.isEmpty()) {
                    sb sbVar3 = this.f11270a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) sbVar3.f11671u2.get(sbVar3.f11668t2)).commit();
                }
                this.f11270a.B0.switchCamera();
                sb.Z(this.f11270a.B0.isFrontface());
                if (this.f11270a.p0()) {
                    this.f11270a.f11662s.c(null);
                } else {
                    this.f11270a.f11662s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        sb sbVar = this.f11270a;
        if (sbVar.f11623f0 == 0 && !sbVar.P1 && !sbVar.Q1) {
            Activity activity = sbVar.f11608b;
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
                sbVar.e(true);
            }
        }
    }

    public final void d() {
        va vaVar;
        sb sbVar = this.f11270a;
        if (!sbVar.P1 && !sbVar.S1 && sbVar.f11623f0 == 0 && (vaVar = sbVar.B0) != null && vaVar.isInited()) {
            sbVar.W0.e(true);
            File file = sbVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.G1 = null;
            }
            s6 s6Var = sbVar.C0;
            if (s6Var != null) {
                s6Var.c(true);
            }
            sbVar.G1 = w7.w(sbVar.f11612c, "jpg");
            sbVar.P1 = true;
            sbVar.o();
            sbVar.f11615c2 = false;
            if (sbVar.B0.isFrontface() && sbVar.f11668t2 == 1) {
                sb.a(sbVar);
            }
            if (sbVar.p0()) {
                q2 q2Var = sbVar.f11662s;
                ai.i iVar = new ai.i(this, 27);
                q2Var.h(q2Var.f11477p);
                q2Var.e(1.0f, 320L, new m2(q2Var, iVar, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j10;
        sb sbVar = this.f11270a;
        if (!sbVar.R1 && sbVar.Q1) {
            sbVar.R1 = true;
            ka kaVar = new ka(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(kaVar, j10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        va vaVar;
        sb sbVar = this.f11270a;
        if (!sbVar.Q1 && !sbVar.R1 && !sbVar.S1 && sbVar.f11623f0 == 0 && (vaVar = sbVar.B0) != null && vaVar.getCameraSession() != null) {
            v3 v3Var = sbVar.l1;
            if (v3Var != null) {
                v3Var.e(true);
            }
            v3 v3Var2 = sbVar.f11643m1;
            if (v3Var2 != null) {
                v3Var2.e(true);
            }
            sbVar.W0.e(true);
            sbVar.Q1 = true;
            s6 s6Var = sbVar.C0;
            if (s6Var != null) {
                s6Var.c(true);
            }
            File file = sbVar.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.G1 = null;
            }
            sbVar.G1 = w7.x(sbVar.f11612c, true);
            sbVar.o();
            sbVar.f11615c2 = false;
            if (sbVar.B0.isFrontface() && sbVar.f11668t2 == 1) {
                sb.a(sbVar);
            }
            if (sbVar.p0()) {
                sbVar.f11662s.c(new la(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        sb sbVar = this.f11270a;
        if (sbVar.B0 != null) {
            CameraController.getInstance().recordVideo(sbVar.B0.getCameraSessionObject(), sbVar.G1, false, new e1.c(this, 11), new la(this, runnable, z10), sbVar.B0, true);
            boolean z12 = true;
            if (sbVar.O1 != 1) {
                sbVar.O1 = 1;
                sbVar.I0.a(false, true);
                if (sbVar.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sbVar.h0(z11, true);
                sbVar.Q0.a(sbVar.O1);
                w6 w6Var = sbVar.O0;
                if (sbVar.O1 != 1) {
                    z12 = false;
                }
                w6Var.f11870n0 = -1.0f;
                w6Var.f11871o0 = z12;
                w6Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: fi.ma.h(org.telegram.messenger.Utilities$Callback):void");
    }
}
