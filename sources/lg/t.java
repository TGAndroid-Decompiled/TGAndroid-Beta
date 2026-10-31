package lg;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class t {
    public final Context f11966a;
    public final Handler f11967b;
    public final int f11968c;
    public final int e;
    public EGLConfig f11975m;
    public a f11976n;
    public a f11977o;
    public a f11978p;
    public long f11979q;
    public long f11980r;
    public int f11981s;
    public final ArrayList f11969f = new ArrayList();
    public volatile v[] f11970g = new v[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f11971i = new int[2];
    public EGLDisplay f11972j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f11973k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f11974l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public t(Context context, int i10) {
        this.f11966a = context;
        this.e = i10;
        this.f11968c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f11967b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f11972j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f11972j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f11975m = eGLConfig;
                this.f11973k = EGL14.eglCreateContext(this.f11972j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f11972j, this.f11975m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f11974l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f11972j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f11973k)) {
                    Context context = this.f11966a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f11976n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f11977o = aVar2;
                    this.f11980r = 0L;
                    this.f11979q = 0L;
                    this.f11981s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f11976n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f11977o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f11978p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f11978p = null;
        this.f11977o = null;
        this.f11976n = null;
        EGLDisplay eGLDisplay = this.f11972j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f11972j, this.f11974l);
        EGL14.eglDestroyContext(this.f11972j, this.f11973k);
        EGL14.eglTerminate(this.f11972j);
        EGL14.eglReleaseThread();
        this.f11972j = EGL14.EGL_NO_DISPLAY;
        this.f11973k = EGL14.EGL_NO_CONTEXT;
        this.f11974l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f11967b.post(new s(this, 0));
        }
    }
}
