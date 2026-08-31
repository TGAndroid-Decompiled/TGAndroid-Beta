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
    public static boolean f7860e;
    public final boolean f7861a;
    public final k f7862b;
    public boolean f7863c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f7862b = kVar;
        this.f7861a = z4;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i10 = d0.f7237a;
        if (i10 < 24 || ((i10 < 26 && ("samsung".equals(d0.f7239c) || "XT1650".equals(d0.d))) || ((i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
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
                if (!f7860e) {
                    d = a(context);
                    f7860e = true;
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
        handlerThread.f7857b = handler;
        handlerThread.f7856a = new h5.f(handler);
        synchronized (handlerThread) {
            handlerThread.f7857b.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThread.f7859e == null && handlerThread.d == null && handlerThread.f7858c == null) {
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
            Error error = handlerThread.f7858c;
            if (error == null) {
                l lVar = handlerThread.f7859e;
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
        synchronized (this.f7862b) {
            try {
                if (!this.f7863c) {
                    k kVar = this.f7862b;
                    kVar.f7857b.getClass();
                    kVar.f7857b.sendEmptyMessage(2);
                    this.f7863c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
