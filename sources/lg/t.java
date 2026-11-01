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
    public final Context f11967a;
    public final Handler f11968b;
    public final int f11969c;
    public final int e;
    public EGLConfig f11976m;
    public a f11977n;
    public a f11978o;
    public a f11979p;
    public long f11980q;
    public long f11981r;
    public int f11982s;
    public final ArrayList f11970f = new ArrayList();
    public volatile v[] f11971g = new v[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f11972i = new int[2];
    public EGLDisplay f11973j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f11974k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f11975l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public t(Context context, int i10) {
        this.f11967a = context;
        this.e = i10;
        this.f11969c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f11968b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f11973j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f11973j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f11976m = eGLConfig;
                this.f11974k = EGL14.eglCreateContext(this.f11973j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f11973j, this.f11976m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f11975l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f11973j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f11974k)) {
                    Context context = this.f11967a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f11977n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f11978o = aVar2;
                    this.f11981r = 0L;
                    this.f11980q = 0L;
                    this.f11982s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f11977n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f11978o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f11979p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f11979p = null;
        this.f11978o = null;
        this.f11977n = null;
        EGLDisplay eGLDisplay = this.f11973j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f11973j, this.f11975l);
        EGL14.eglDestroyContext(this.f11973j, this.f11974k);
        EGL14.eglTerminate(this.f11973j);
        EGL14.eglReleaseThread();
        this.f11973j = EGL14.EGL_NO_DISPLAY;
        this.f11974k = EGL14.EGL_NO_CONTEXT;
        this.f11975l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f11968b.post(new s(this, 0));
        }
    }
}
