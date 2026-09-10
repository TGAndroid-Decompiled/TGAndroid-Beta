package og;

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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.em;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.tv0;
public final class f1 extends DispatchQueue {
    public final SurfaceTexture f14354a;
    public EGL10 f14355b;
    public EGLDisplay f14356c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f14357f;
    public volatile boolean h;
    public int f14358n;
    public int f14359r;
    public e1 f14360s;
    public final ia v;
    public final androidx.activity.i f14361w;
    public final e1 f14362x;
    public final h1 f14363y;

    public f1(h1 h1Var, SurfaceTexture surfaceTexture, ia iaVar) {
        super("CanvasInternal");
        this.f14363y = h1Var;
        this.f14361w = new androidx.activity.i(this, 24);
        this.f14362x = new e1(this, 0);
        this.v = iaVar;
        this.f14354a = surfaceTexture;
    }

    public static void b(f1 f1Var) {
        if (!f1Var.f14357f) {
            return;
        }
        if (f1Var.d.equals(f1Var.f14355b.eglGetCurrentContext()) && f1Var.e.equals(f1Var.f14355b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = f1Var.f14355b;
        EGLDisplay eGLDisplay = f1Var.f14356c;
        EGLSurface eGLSurface = f1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, f1Var.d);
    }

    public final void finish() {
        ia iaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f14355b;
            EGLDisplay eGLDisplay = this.f14356c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f14355b.eglDestroySurface(this.f14356c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (iaVar != null) {
                synchronized (iaVar.f23966f) {
                    try {
                        if (iaVar.f23967g == eGLContext) {
                            iaVar.f23967g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f14355b.eglDestroyContext(this.f14356c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f14356c;
        if (eGLDisplay2 != null) {
            this.f14355b.eglTerminate(eGLDisplay2);
            this.f14356c = null;
        }
        if (iaVar != null) {
            e1 e1Var = this.f14362x;
            ArrayList arrayList = iaVar.e;
            arrayList.remove(e1Var);
            if (arrayList.isEmpty() && iaVar.d.isEmpty()) {
                iaVar.f23973n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        h1 h1Var = this.f14363y;
        Bitmap bitmap2 = h1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f14354a;
            ia iaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f14355b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f14356c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    em.s(this.f14355b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f14355b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        em.s(this.f14355b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f14355b.eglChooseConfig(this.f14356c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            em.s(this.f14355b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (iaVar != null) {
                                synchronized (iaVar.f23966f) {
                                    try {
                                        eGLContext = iaVar.f23967g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f14355b.eglCreateContext(this.f14356c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    em.s(this.f14355b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (iaVar != null) {
                                    iaVar.a(eglCreateContext);
                                    iaVar.e.add(this.f14362x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f14355b.eglCreateWindowSurface(this.f14356c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f14355b.eglMakeCurrent(this.f14356c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                em.s(this.f14355b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            v0 v0Var = h1Var.f14390c;
                                            v0Var.getClass();
                                            Map map = j1.f14404a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : j1.f14404a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f14400b = new HashMap();
                                                obj.f14399a = GLES20.glCreateProgram();
                                                b2.q0 b10 = i1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f1896a;
                                                if (b10.f1897b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    i1.c(i11, i10, obj.f14399a);
                                                } else {
                                                    b2.q0 b11 = i1.b(35632, str);
                                                    int i12 = b11.f1896a;
                                                    if (b11.f1897b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        i1.c(i11, i12, obj.f14399a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f14399a, i11);
                                                        GLES20.glAttachShader(obj.f14399a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f14399a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f14399a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            i1.c(i11, i12, obj.f14399a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f14400b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f14399a, str2)));
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
                                            v0Var.f14526r = DesugarCollections.unmodifiableMap(hashMap);
                                            tv0 tv0Var = v0Var.f14516g;
                                            if (h1Var.h.getWidth() != tv0Var.f27499a || h1Var.h.getHeight() != tv0Var.f27500b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) tv0Var.f27499a, (int) tv0Var.f27500b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(h1Var.h, (Rect) null, new RectF(0.0f, 0.0f, tv0Var.f27499a, tv0Var.f27500b), (Paint) null);
                                                h1Var.h = createBitmap;
                                                h1Var.f14393r = true;
                                            }
                                            if (h1Var.f14392n != null && (bitmap.getWidth() != tv0Var.f27499a || h1Var.f14392n.getHeight() != tv0Var.f27500b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) tv0Var.f27499a, (int) tv0Var.f27500b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(h1Var.f14392n, (Rect) null, new RectF(0.0f, 0.0f, tv0Var.f27499a, tv0Var.f27500b), (Paint) null);
                                                h1Var.f14392n = createBitmap2;
                                                h1Var.f14393r = true;
                                            }
                                            Bitmap bitmap3 = h1Var.h;
                                            Bitmap bitmap4 = h1Var.f14392n;
                                            if (v0Var.f14519k == null) {
                                                v0Var.f14519k = new w1(bitmap3);
                                            }
                                            if (v0Var.D == null) {
                                                v0Var.D = new w1(bitmap4);
                                            }
                                            if (v0Var.G && v0Var.f14520l == null) {
                                                v0Var.f14520l = new w1(v0Var.A);
                                            }
                                            w7.j0.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            em.s(this.f14355b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f14357f = z10;
            super.run();
        }
    }
}
