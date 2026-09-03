package i5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import h5.d0;
public final class l extends Surface {
    public static int d;
    public static boolean e;
    public final boolean f7290a;
    public final k f7291b;
    public boolean f7292c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f7291b = kVar;
        this.f7290a = z4;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i10 = d0.f6924a;
        if (i10 < 24 || ((i10 < 26 && ("samsung".equals(d0.f6926c) || "XT1650".equals(d0.d))) || ((i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i10 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean e(Context context) {
        boolean z4;
        synchronized (l.class) {
            try {
                z4 = true;
                if (!e) {
                    d = a(context);
                    e = true;
                }
                if (d == 0) {
                    z4 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z4;
    }

    public static l f(Context context, boolean z4) {
        boolean z10;
        int i10;
        boolean z11 = false;
        if (z4 && !e(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        h5.a.i(z10);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z4) {
            i10 = d;
        } else {
            i10 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f7288b = handler;
        handlerThread.f7287a = new h5.f(handler);
        synchronized (handlerThread) {
            handlerThread.f7288b.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThread.e == null && handlerThread.d == null && handlerThread.f7289c == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.d;
        if (runtimeException == null) {
            Error error = handlerThread.f7289c;
            if (error == null) {
                l lVar = handlerThread.e;
                lVar.getClass();
                return lVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override
    public final void release() {
        super.release();
        synchronized (this.f7291b) {
            try {
                if (!this.f7292c) {
                    k kVar = this.f7291b;
                    kVar.f7288b.getClass();
                    kVar.f7288b.sendEmptyMessage(2);
                    this.f7292c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
