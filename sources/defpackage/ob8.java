package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
public final class ob8 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final nb8 b;
    public boolean c;

    public ob8(nb8 nb8Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = nb8Var;
        this.a = z;
    }

    public static int a(Context context) {
        boolean z;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 24 || (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL) || !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                z = false;
            } else {
                z = wie.b("EGL_EXT_protected_content");
            }
            if (!z) {
                return 0;
            }
            if (wie.b("EGL_KHR_surfaceless_context")) {
                return 1;
            }
            return 2;
        } catch (bw4 e2) {
            lad.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (ob8.class) {
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
                nb8 nb8Var = this.b;
                nb8Var.b.getClass();
                nb8Var.b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
