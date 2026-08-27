package lh;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;

public final class oa implements w6 {

    public final sb f16494a;

    public oa(sb sbVar) {
        this.f16494a = sbVar;
    }

    public final void a() {
        sb sbVar = this.f16494a;
        ArrayList<z7> content = sbVar.f16814w0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            sbVar.G1 = content.get(0);
        } else {
            sbVar.G1 = z7.a(sbVar.f16814w0.getLayout(), sbVar.f16814w0.getContent());
        }
        z7 z7Var = sbVar.G1;
        if (z7Var != null && z7Var.K) {
            i10 = 1;
        }
        sbVar.K1 = i10;
        la laVar = sbVar.M0;
        if (laVar != null) {
            laVar.a(i10);
        }
        r9.a(sbVar.f16749c, sbVar.G1);
        sbVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sb sbVar = this.f16494a;
        wa waVar = sbVar.f16818x0;
        if (waVar == null || sbVar.O1 || sbVar.L1 || !waVar.isInited()) {
            return;
        }
        sb sbVar2 = this.f16494a;
        if (sbVar2.f16746b0 != 0) {
            return;
        }
        w3 w3Var = sbVar2.f16771i1;
        if (w3Var != null) {
            w3Var.e(true);
        }
        if (this.f16494a.q0() && (arrayList = this.f16494a.f16795q2) != null && !arrayList.isEmpty()) {
            sb sbVar3 = this.f16494a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) sbVar3.f16795q2.get(sbVar3.f16792p2)).commit();
        }
        this.f16494a.f16818x0.switchCamera();
        sb.a0(this.f16494a.f16818x0.isFrontface());
        if (this.f16494a.q0()) {
            this.f16494a.f16800s.c(null);
        } else {
            this.f16494a.f16800s.d();
        }
    }

    public final void c() {
        wa waVar;
        sb sbVar = this.f16494a;
        if (sbVar.L1 || sbVar.O1 || sbVar.f16746b0 != 0 || (waVar = sbVar.f16818x0) == null || !waVar.isInited()) {
            return;
        }
        sbVar.S0.e(true);
        File file = sbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbVar.C1 = null;
        }
        u6 u6Var = sbVar.f16822y0;
        if (u6Var != null) {
            u6Var.c(true);
        }
        sbVar.C1 = z7.w(sbVar.f16749c, "jpg");
        sbVar.L1 = true;
        sbVar.p();
        sbVar.Y1 = false;
        if (sbVar.f16818x0.isFrontface() && sbVar.f16792p2 == 1) {
            sb.a(sbVar);
        }
        if (!sbVar.q0()) {
            g(null);
            return;
        }
        r2 r2Var = sbVar.f16800s;
        n6 n6Var = new n6(this, 3);
        r2Var.h(r2Var.f16639p);
        r2Var.e(1.0f, 320L, new n2(r2Var, n6Var, 0));
    }

    public final void d(boolean z10) {
        sb sbVar = this.f16494a;
        if (sbVar.N1 || !sbVar.M1) {
            return;
        }
        sbVar.N1 = true;
        AndroidUtilities.runOnUIThread(new ma(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        wa waVar;
        sb sbVar = this.f16494a;
        if (sbVar.M1 || sbVar.N1 || sbVar.O1 || sbVar.f16746b0 != 0 || (waVar = sbVar.f16818x0) == null || waVar.getCameraSession() == null) {
            return;
        }
        w3 w3Var = sbVar.f16768h1;
        if (w3Var != null) {
            w3Var.e(true);
        }
        w3 w3Var2 = sbVar.f16771i1;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        sbVar.S0.e(true);
        sbVar.M1 = true;
        u6 u6Var = sbVar.f16822y0;
        if (u6Var != null) {
            u6Var.c(true);
        }
        File file = sbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbVar.C1 = null;
        }
        sbVar.C1 = z7.x(sbVar.f16749c, true);
        sbVar.p();
        sbVar.Y1 = false;
        if (sbVar.f16818x0.isFrontface() && sbVar.f16792p2 == 1) {
            sb.a(sbVar);
        }
        if (sbVar.q0()) {
            sbVar.f16800s.c(new na(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        sb sbVar = this.f16494a;
        if (sbVar.f16818x0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(sbVar.f16818x0.getCameraSessionObject(), sbVar.C1, false, new p(this, 6), new na(this, runnable, z10), sbVar.f16818x0, true);
        if (sbVar.K1 != 1) {
            sbVar.K1 = 1;
            sbVar.E0.a(false, true);
            sbVar.i0(sbVar.K1 == 1, true);
            sbVar.M0.a(sbVar.K1);
            y6 y6Var = sbVar.K0;
            boolean z11 = sbVar.K1 == 1;
            y6Var.f17098j0 = -1.0f;
            y6Var.f17099k0 = z11;
            y6Var.invalidate();
        }
    }

    public final void g(Utilities.Callback callback) {
        boolean z10;
        sb sbVar = this.f16494a;
        int i10 = sbVar.f16749c;
        if (!sbVar.q0()) {
            sbVar.f16818x0.startTakePictureAnimation(true);
        }
        if ((sbVar.f16818x0.isDual() && TextUtils.equals(sbVar.f16818x0.getCameraSession().getCurrentFlashMode(), "off")) || sbVar.f16814w0.j()) {
            if (!sbVar.f16814w0.j()) {
                sbVar.f16818x0.pauseAsTakingPicture();
            }
            Bitmap bitmap = sbVar.f16818x0.getTextureView().getBitmap();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(sbVar.C1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    try {
                        fileOutputStream.close();
                        z10 = true;
                    } catch (Exception e9) {
                        e = e9;
                        z10 = true;
                        FileLog.e(e);
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                z10 = false;
            }
            bitmap.recycle();
        } else {
            z10 = false;
        }
        if (!z10) {
            u6 u6Var = sbVar.f16822y0;
            if (u6Var != null) {
                u6Var.c(true);
            }
            sbVar.L1 = CameraController.getInstance().takePicture(sbVar.C1, true, sbVar.f16818x0.getCameraSessionObject(), new gh.d1(15, this, callback));
            return;
        }
        sbVar.L1 = false;
        u6 u6Var2 = sbVar.f16822y0;
        if (u6Var2 != null) {
            u6Var2.c(false);
        }
        z7 z7VarM = z7.m(0, sbVar.C1);
        z7VarM.J0 = sbVar.f16797r0;
        z7VarM.K0 = sbVar.f16801s0;
        if (!sbVar.f16814w0.j()) {
            sbVar.G1 = z7VarM;
            r9.a(i10, z7VarM);
            sbVar.H1 = false;
            if (callback != null) {
                callback.run(new ma(this, 1));
                return;
            } else {
                sbVar.K(1, true);
                return;
            }
        }
        sbVar.C1 = null;
        if (sbVar.f16814w0.l(z7VarM)) {
            z7 z7VarA = z7.a(sbVar.f16814w0.getLayout(), sbVar.f16814w0.getContent());
            sbVar.G1 = z7VarA;
            r9.a(i10, z7VarA);
            sbVar.H1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        sbVar.m0(true);
    }
}
