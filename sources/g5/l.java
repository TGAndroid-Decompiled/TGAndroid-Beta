package g5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import f5.d0;
public final class l extends Surface {
    public static int d;
    public static boolean f7067e;
    public final boolean f7068a;
    public final k f7069b;
    public boolean f7070c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7069b = kVar;
        this.f7068a = z10;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i10 = d0.f6579a;
        if (i10 < 24 || ((i10 < 26 && ("samsung".equals(d0.f6581c) || "XT1650".equals(d0.d))) || ((i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i10 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (l.class) {
            try {
                z10 = true;
                if (!f7067e) {
                    d = a(context);
                    f7067e = true;
                }
                if (d == 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static l c(Context context, boolean z10) {
        boolean z11;
        int i10;
        boolean z12 = false;
        if (z10 && !b(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        f5.a.i(z11);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z10) {
            i10 = d;
        } else {
            i10 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f7064b = handler;
        handlerThread.f7063a = new f5.e(handler);
        synchronized (handlerThread) {
            handlerThread.f7064b.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThread.f7066e == null && handlerThread.d == null && handlerThread.f7065c == null) {
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
            Error error = handlerThread.f7065c;
            if (error == null) {
                l lVar = handlerThread.f7066e;
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
        synchronized (this.f7069b) {
            try {
                if (!this.f7070c) {
                    k kVar = this.f7069b;
                    kVar.f7064b.getClass();
                    kVar.f7064b.sendEmptyMessage(2);
                    this.f7070c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
