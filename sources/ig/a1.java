package ig;

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
import org.telegram.messenger.f8;
import org.telegram.messenger.s5;
import org.telegram.messenger.v2;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;
import v7.h8;
public final class a1 extends s5 {
    public final c1 D;
    public final SurfaceTexture f8268a;
    public EGL10 f8269b;
    public EGLDisplay f8270c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f8271f;
    public volatile boolean h;
    public int f8272n;
    public int f8273r;
    public z0 f8274s;
    public final s9 f8275w;
    public final androidx.activity.i f8276x;
    public final z0 f8277y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, s9 s9Var) {
        super("CanvasInternal", true);
        this.D = c1Var;
        this.f8276x = new androidx.activity.i(this, 21);
        this.f8277y = new z0(this, 0);
        this.f8275w = s9Var;
        this.f8268a = surfaceTexture;
    }

    public static void a(a1 a1Var) {
        if (!a1Var.f8271f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f8269b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.f8269b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f8269b;
        EGLDisplay eGLDisplay = a1Var.f8270c;
        EGLSurface eGLSurface = a1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        s9 s9Var = this.f8275w;
        if (this.e != null) {
            EGL10 egl10 = this.f8269b;
            EGLDisplay eGLDisplay = this.f8270c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f8269b.eglDestroySurface(this.f8270c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (s9Var != null) {
                synchronized (s9Var.f30196f) {
                    try {
                        if (s9Var.f30197g == eGLContext) {
                            s9Var.f30197g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f8269b.eglDestroyContext(this.f8270c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f8270c;
        if (eGLDisplay2 != null) {
            this.f8269b.eglTerminate(eGLDisplay2);
            this.f8270c = null;
        }
        if (s9Var != null) {
            z0 z0Var = this.f8277y;
            ArrayList arrayList = s9Var.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && s9Var.d.isEmpty()) {
                s9Var.f30203n.c();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.D;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f8268a;
            s9 s9Var = this.f8275w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f8269b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f8270c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (v2.f18448a) {
                    z20.t(this.f8269b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f8269b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (v2.f18448a) {
                        z20.t(this.f8269b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f8269b.eglChooseConfig(this.f8270c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (v2.f18448a) {
                            z20.t(this.f8269b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (s9Var != null) {
                                synchronized (s9Var.f30196f) {
                                    try {
                                        eGLContext = s9Var.f30197g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f8269b.eglCreateContext(this.f8270c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (v2.f18448a) {
                                    z20.t(this.f8269b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (s9Var != null) {
                                    s9Var.a(eglCreateContext);
                                    s9Var.e.add(this.f8277y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f8269b.eglCreateWindowSurface(this.f8270c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f8269b.eglMakeCurrent(this.f8270c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (v2.f18448a) {
                                                z20.t(this.f8269b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f8284c;
                                            q0Var.getClass();
                                            Map map = e1.f8298a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f8298a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f8294b = new HashMap();
                                                obj.f8293a = GLES20.glCreateProgram();
                                                ac.g b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f385a;
                                                if (b10.f386b == 0) {
                                                    if (v2.f18448a) {
                                                        f8.d("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f8293a);
                                                } else {
                                                    ac.g b11 = d1.b(35632, str);
                                                    int i12 = b11.f385a;
                                                    if (b11.f386b == 0) {
                                                        if (v2.f18448a) {
                                                            f8.d("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f8293a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f8293a, i11);
                                                        GLES20.glAttachShader(obj.f8293a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f8293a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f8293a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && v2.f18448a) {
                                                            f8.d(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f8293a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f8294b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f8293a, str2)));
                                                            }
                                                            if (i11 != 0) {
                                                                GLES20.glDeleteShader(i11);
                                                            }
                                                            if (i12 != 0) {
                                                                GLES20.glDeleteShader(i12);
                                                            }
                                                        }
                                                    }
                                                }
                                                hashMap.put((String) entry.getKey(), obj);
                                                i10 = 0;
                                            }
                                            q0Var.f8424r = DesugarCollections.unmodifiableMap(hashMap);
                                            pu0 pu0Var = q0Var.f8414g;
                                            if (c1Var.h.getWidth() != pu0Var.f29435a || c1Var.h.getHeight() != pu0Var.f29436b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) pu0Var.f29435a, (int) pu0Var.f29436b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, pu0Var.f29435a, pu0Var.f29436b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f8287r = true;
                                            }
                                            if (c1Var.f8286n != null && (bitmap.getWidth() != pu0Var.f29435a || c1Var.f8286n.getHeight() != pu0Var.f29436b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) pu0Var.f29435a, (int) pu0Var.f29436b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f8286n, (Rect) null, new RectF(0.0f, 0.0f, pu0Var.f29435a, pu0Var.f29436b), (Paint) null);
                                                c1Var.f8286n = createBitmap2;
                                                c1Var.f8287r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f8286n;
                                            if (q0Var.f8417k == null) {
                                                q0Var.f8417k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f8418l == null) {
                                                q0Var.f8418l = new r1(q0Var.A);
                                            }
                                            h8.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (v2.f18448a) {
                                            z20.t(this.f8269b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (v2.f18448a) {
                                f8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f8271f = z10;
            super.run();
        }
    }
}
