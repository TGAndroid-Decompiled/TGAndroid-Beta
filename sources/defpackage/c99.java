package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
public final class c99 extends np3 {
    public final e99 E;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public b99 s;
    public final sm0 w;
    public final ei7 x;
    public final b99 y;

    public c99(e99 e99Var, SurfaceTexture surfaceTexture, sm0 sm0Var) {
        super("CanvasInternal", true);
        this.E = e99Var;
        this.x = new ei7(this, (byte) 16);
        this.y = new b99(this, (byte) 0);
        this.w = sm0Var;
        this.a = surfaceTexture;
    }

    public final void a() {
        if (!this.f) {
            return;
        }
        if (this.d.equals(this.b.eglGetCurrentContext()) && this.e.equals(this.b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = this.b;
        EGLDisplay eGLDisplay = this.c;
        EGLSurface eGLSurface = this.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
    }

    public final void finish() {
        sm0 sm0Var = this.w;
        if (this.e != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (sm0Var != null) {
                synchronized (sm0Var.f) {
                    if (sm0Var.g == eGLContext) {
                        sm0Var.g = null;
                    }
                }
            }
            this.b.eglDestroyContext(this.c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
        if (sm0Var != null) {
            b99 b99Var = this.y;
            ArrayList arrayList = sm0Var.e;
            arrayList.remove(b99Var);
            if (arrayList.isEmpty() && sm0Var.d.isEmpty()) {
                sm0Var.n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        int i;
        e99 e99Var = this.E;
        Bitmap bitmap2 = e99Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.a;
            sm0 sm0Var = this.w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.c = eglGetDisplay;
            int i2 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (e21.a) {
                    b10.v(this.b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (e21.a) {
                        b10.v(this.b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (e21.a) {
                            b10.v(this.b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (sm0Var != null) {
                                synchronized (sm0Var.f) {
                                    eGLContext = sm0Var.g;
                                    if (eGLContext == null) {
                                        eGLContext = EGL10.EGL_NO_CONTEXT;
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (e21.a) {
                                    b10.v(this.b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (sm0Var != null) {
                                    sm0Var.a(eglCreateContext);
                                    sm0Var.e.add(this.y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (e21.a) {
                                                b10.v(this.b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            hw7 hw7Var = e99Var.c;
                                            hw7Var.getClass();
                                            Map map = aba.a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : aba.a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.b = new HashMap();
                                                obj.a = GLES20.glCreateProgram();
                                                az8 b = zaa.b(35633, (String) map2.get("vertex"));
                                                int i3 = b.b;
                                                if (b.c == 0) {
                                                    if (e21.a) {
                                                        fc4.d("Vertex shader compilation failed");
                                                    }
                                                    zaa.c(i3, i2, obj.a);
                                                } else {
                                                    az8 b2 = zaa.b(35632, str);
                                                    int i4 = b2.b;
                                                    if (b2.c == 0) {
                                                        if (e21.a) {
                                                            fc4.d("Fragment shader compilation failed");
                                                        }
                                                        zaa.c(i3, i4, obj.a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.a, i3);
                                                        GLES20.glAttachShader(obj.a, i4);
                                                        int i5 = i2;
                                                        while (true) {
                                                            int length = strArr.length;
                                                            i = obj.a;
                                                            if (i5 >= length) {
                                                                break;
                                                            }
                                                            GLES20.glBindAttribLocation(i, i5, strArr[i5]);
                                                            i5++;
                                                        }
                                                        GLES20.glLinkProgram(i);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i, 35714, iArr3, i2);
                                                        if (iArr3[i2] == 0 && e21.a) {
                                                            fc4.d(GLES20.glGetProgramInfoLog(i));
                                                        }
                                                        if (iArr3[i2] == 0) {
                                                            zaa.c(i3, i4, obj.a);
                                                        } else {
                                                            int length2 = strArr2.length;
                                                            for (int i6 = i2; i6 < length2; i6++) {
                                                                String str2 = strArr2[i6];
                                                                obj.b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.a, str2)));
                                                            }
                                                            if (i3 != 0) {
                                                                GLES20.glDeleteShader(i3);
                                                            }
                                                            if (i4 != 0) {
                                                                GLES20.glDeleteShader(i4);
                                                            }
                                                        }
                                                    }
                                                }
                                                hashMap.put((String) entry.getKey(), obj);
                                                i2 = 0;
                                            }
                                            hw7Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                            xka xkaVar = hw7Var.g;
                                            if (e99Var.h.getWidth() != xkaVar.a || e99Var.h.getHeight() != xkaVar.b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) xkaVar.a, (int) xkaVar.b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e99Var.h, (Rect) null, new RectF(0.0f, 0.0f, xkaVar.a, xkaVar.b), (Paint) null);
                                                e99Var.h = createBitmap;
                                                e99Var.r = true;
                                            }
                                            if (e99Var.n != null && (bitmap.getWidth() != xkaVar.a || e99Var.n.getHeight() != xkaVar.b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) xkaVar.a, (int) xkaVar.b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e99Var.n, (Rect) null, new RectF(0.0f, 0.0f, xkaVar.a, xkaVar.b), (Paint) null);
                                                e99Var.n = createBitmap2;
                                                e99Var.r = true;
                                            }
                                            Bitmap bitmap3 = e99Var.h;
                                            Bitmap bitmap4 = e99Var.n;
                                            if (hw7Var.k == null) {
                                                hw7Var.k = new dlb(bitmap3);
                                            }
                                            if (hw7Var.D == null) {
                                                hw7Var.D = new dlb(bitmap4);
                                            }
                                            if (hw7Var.G && hw7Var.l == null) {
                                                hw7Var.l = new dlb(hw7Var.A);
                                            }
                                            sze.a();
                                            z = true;
                                        }
                                    } else {
                                        if (e21.a) {
                                            b10.v(this.b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (e21.a) {
                                fc4.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z = false;
                    }
                }
            }
            this.f = z;
            super.run();
        }
    }
}
