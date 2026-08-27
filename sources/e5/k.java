package e5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import d5.g0;

public final class k extends Surface {
    public static int d;

    public static boolean f5269e;

    public final boolean f5270a;

    public final j f5271b;

    public boolean f5272c;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f5271b = jVar;
        this.f5270a = z10;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i10 = g0.f4795a;
        if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(g0.f4797c) || "XT1650".equals(g0.d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i10 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f5269e) {
                d = a(context);
                f5269e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    public static k c(Context context, boolean z10) {
        boolean z11 = false;
        d5.a.i(!z10 || b(context));
        j jVar = new j("ExoPlayer:PlaceholderSurface");
        int i10 = z10 ? d : 0;
        jVar.start();
        Handler handler = new Handler(jVar.getLooper(), jVar);
        jVar.f5266b = handler;
        jVar.f5265a = new d5.e(handler);
        synchronized (jVar) {
            jVar.f5266b.obtainMessage(1, i10, 0).sendToTarget();
            while (jVar.f5268e == null && jVar.d == null && jVar.f5267c == null) {
                try {
                    jVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = jVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = jVar.f5267c;
        if (error != null) {
            throw error;
        }
        k kVar = jVar.f5268e;
        kVar.getClass();
        return kVar;
    }

    @Override
    public final void release() {
        super.release();
        synchronized (this.f5271b) {
            try {
                if (!this.f5272c) {
                    j jVar = this.f5271b;
                    jVar.f5266b.getClass();
                    jVar.f5266b.sendEmptyMessage(2);
                    this.f5272c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
