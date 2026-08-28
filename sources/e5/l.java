package e5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import d5.f0;
public final class l extends Surface {
    public static int d;
    public static boolean f4912e;
    public final boolean f4913a;
    public final k f4914b;
    public boolean f4915c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f4914b = kVar;
        this.f4913a = z10;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i9 = f0.f4349a;
        if (i9 < 24 || ((i9 < 26 && ("samsung".equals(f0.f4351c) || "XT1650".equals(f0.d))) || ((i9 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i9 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (l.class) {
            try {
                z10 = true;
                if (!f4912e) {
                    d = a(context);
                    f4912e = true;
                }
                if (d == 0) {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public static l c(Context context, boolean z10) {
        boolean z11;
        int i9;
        boolean z12 = false;
        if (z10 && !b(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        d5.a.i(z11);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z10) {
            i9 = d;
        } else {
            i9 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f4909b = handler;
        handlerThread.f4908a = new d5.e(handler);
        synchronized (handlerThread) {
            handlerThread.f4909b.obtainMessage(1, i9, 0).sendToTarget();
            while (handlerThread.f4911e == null && handlerThread.d == null && handlerThread.f4910c == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.d;
        if (runtimeException == null) {
            Error error = handlerThread.f4910c;
            if (error == null) {
                l lVar = handlerThread.f4911e;
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
        synchronized (this.f4914b) {
            try {
                if (!this.f4915c) {
                    k kVar = this.f4914b;
                    kVar.f4909b.getClass();
                    kVar.f4909b.sendEmptyMessage(2);
                    this.f4915c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
