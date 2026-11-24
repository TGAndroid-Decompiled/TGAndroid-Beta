package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
public final class rd8 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final qd8 b;
    public boolean c;

    public rd8(qd8 qd8Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = qd8Var;
        this.a = z;
    }

    public static int a(Context context) {
        boolean z;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 24 || (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL) || !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                z = false;
            } else {
                z = xke.b("EGL_EXT_protected_content");
            }
            if (!z) {
                return 0;
            }
            if (xke.b("EGL_KHR_surfaceless_context")) {
                return 1;
            }
            return 2;
        } catch (dy4 e2) {
            ncd.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (rd8.class) {
            z = true;
            if (!e) {
                d = a(context);
                e = true;
            }
            if (d == 0) {
                z = false;
            }
        }
        return z;
    }

    @Override
    public final void release() {
        super.release();
        synchronized (this.b) {
            if (!this.c) {
                qd8 qd8Var = this.b;
                qd8Var.b.getClass();
                qd8Var.b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
