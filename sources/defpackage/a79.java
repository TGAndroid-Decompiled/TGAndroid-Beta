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
public final class a79 extends do3 {
    public final c79 E;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public z69 s;
    public final sl0 w;
    public final bg7 x;
    public final z69 y;

    public a79(c79 c79Var, SurfaceTexture surfaceTexture, sl0 sl0Var) {
        super("CanvasInternal", true);
        this.E = c79Var;
        this.x = new bg7(this, (byte) 16);
        this.y = new z69(this, (byte) 0);
        this.w = sl0Var;
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
        sl0 sl0Var = this.w;
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
            if (sl0Var != null) {
                synchronized (sl0Var.f) {
                    if (sl0Var.g == eGLContext) {
                        sl0Var.g = null;
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
        if (sl0Var != null) {
            z69 z69Var = this.y;
            ArrayList arrayList = sl0Var.e;
            arrayList.remove(z69Var);
            if (arrayList.isEmpty() && sl0Var.d.isEmpty()) {
                sl0Var.n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        int i;
        c79 c79Var = this.E;
        Bitmap bitmap2 = c79Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.a;
            sl0 sl0Var = this.w;
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
                if (w01.a) {
                    b00.v(this.b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (w01.a) {
                        b00.v(this.b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (w01.a) {
                            b00.v(this.b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (sl0Var != null) {
                                synchronized (sl0Var.f) {
                                    eGLContext = sl0Var.g;
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
                                if (w01.a) {
                                    b00.v(this.b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (sl0Var != null) {
                                    sl0Var.a(eglCreateContext);
                                    sl0Var.e.add(this.y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (w01.a) {
                                                b00.v(this.b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            gu7 gu7Var = c79Var.c;
                                            gu7Var.getClass();
                                            Map map = a9a.a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : a9a.a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.b = new HashMap();
                                                obj.a = GLES20.glCreateProgram();
                                                zw8 b = z8a.b(35633, (String) map2.get("vertex"));
                                                int i3 = b.b;
                                                if (b.c == 0) {
                                                    if (w01.a) {
                                                        fa4.d("Vertex shader compilation failed");
                                                    }
                                                    z8a.c(i3, i2, obj.a);
                                                } else {
                                                    zw8 b2 = z8a.b(35632, str);
                                                    int i4 = b2.b;
                                                    if (b2.c == 0) {
                                                        if (w01.a) {
                                                            fa4.d("Fragment shader compilation failed");
                                                        }
                                                        z8a.c(i3, i4, obj.a);
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
                                                        if (iArr3[i2] == 0 && w01.a) {
                                                            fa4.d(GLES20.glGetProgramInfoLog(i));
                                                        }
                                                        if (iArr3[i2] == 0) {
                                                            z8a.c(i3, i4, obj.a);
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
                                            gu7Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                            via viaVar = gu7Var.g;
                                            if (c79Var.h.getWidth() != viaVar.a || c79Var.h.getHeight() != viaVar.b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) viaVar.a, (int) viaVar.b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c79Var.h, (Rect) null, new RectF(0.0f, 0.0f, viaVar.a, viaVar.b), (Paint) null);
                                                c79Var.h = createBitmap;
                                                c79Var.r = true;
                                            }
                                            if (c79Var.n != null && (bitmap.getWidth() != viaVar.a || c79Var.n.getHeight() != viaVar.b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) viaVar.a, (int) viaVar.b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c79Var.n, (Rect) null, new RectF(0.0f, 0.0f, viaVar.a, viaVar.b), (Paint) null);
                                                c79Var.n = createBitmap2;
                                                c79Var.r = true;
                                            }
                                            Bitmap bitmap3 = c79Var.h;
                                            Bitmap bitmap4 = c79Var.n;
                                            if (gu7Var.k == null) {
                                                gu7Var.k = new cjb(bitmap3);
                                            }
                                            if (gu7Var.D == null) {
                                                gu7Var.D = new cjb(bitmap4);
                                            }
                                            if (gu7Var.G && gu7Var.l == null) {
                                                gu7Var.l = new cjb(gu7Var.A);
                                            }
                                            qxe.a();
                                            z = true;
                                        }
                                    } else {
                                        if (w01.a) {
                                            b00.v(this.b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (w01.a) {
                                fa4.d("eglConfig not initialized");
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
