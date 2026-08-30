package cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import j$.util.DesugarCollections;
import j7.p5;
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
import org.telegram.messenger.y3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.jv0;
public final class n1 extends DispatchQueue {
    public final SurfaceTexture f2476a;
    public EGL10 f2477b;
    public EGLDisplay f2478c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f2479f;
    public volatile boolean h;
    public int f2480n;
    public int f2481r;
    public m1 f2482s;
    public final ba v;
    public final androidx.activity.i f2483w;
    public final m1 f2484x;
    public final p1 f2485y;

    public n1(p1 p1Var, SurfaceTexture surfaceTexture, ba baVar) {
        super("CanvasInternal");
        this.f2485y = p1Var;
        this.f2483w = new androidx.activity.i(this, 9);
        this.f2484x = new m1(this, 0);
        this.v = baVar;
        this.f2476a = surfaceTexture;
    }

    public static void b(n1 n1Var) {
        if (!n1Var.f2479f) {
            return;
        }
        if (n1Var.d.equals(n1Var.f2477b.eglGetCurrentContext()) && n1Var.e.equals(n1Var.f2477b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = n1Var.f2477b;
        EGLDisplay eGLDisplay = n1Var.f2478c;
        EGLSurface eGLSurface = n1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, n1Var.d);
    }

    public final void finish() {
        ba baVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f2477b;
            EGLDisplay eGLDisplay = this.f2478c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f2477b.eglDestroySurface(this.f2478c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (baVar != null) {
                synchronized (baVar.f23610f) {
                    try {
                        if (baVar.f23611g == eGLContext) {
                            baVar.f23611g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f2477b.eglDestroyContext(this.f2478c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f2478c;
        if (eGLDisplay2 != null) {
            this.f2477b.eglTerminate(eGLDisplay2);
            this.f2478c = null;
        }
        if (baVar != null) {
            m1 m1Var = this.f2484x;
            ArrayList arrayList = baVar.e;
            arrayList.remove(m1Var);
            if (arrayList.isEmpty() && baVar.d.isEmpty()) {
                baVar.f23617n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        p1 p1Var = this.f2485y;
        Bitmap bitmap2 = p1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f2476a;
            ba baVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f2477b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f2478c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z4 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    y3.u(this.f2477b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f2477b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        y3.u(this.f2477b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f2477b.eglChooseConfig(this.f2478c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            y3.u(this.f2477b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (baVar != null) {
                                synchronized (baVar.f23610f) {
                                    try {
                                        eGLContext = baVar.f23611g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f2477b.eglCreateContext(this.f2478c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    y3.u(this.f2477b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (baVar != null) {
                                    baVar.a(eglCreateContext);
                                    baVar.e.add(this.f2484x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f2477b.eglCreateWindowSurface(this.f2478c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f2477b.eglMakeCurrent(this.f2478c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                y3.u(this.f2477b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            d1 d1Var = p1Var.f2494c;
                                            d1Var.getClass();
                                            Map map = r1.f2512a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : r1.f2512a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f2508b = new HashMap();
                                                obj.f2507a = GLES20.glCreateProgram();
                                                c5.e b10 = q1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f2085a;
                                                if (b10.f2086b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    q1.c(i11, i10, obj.f2507a);
                                                } else {
                                                    c5.e b11 = q1.b(35632, str);
                                                    int i12 = b11.f2085a;
                                                    if (b11.f2086b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        q1.c(i11, i12, obj.f2507a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f2507a, i11);
                                                        GLES20.glAttachShader(obj.f2507a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f2507a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f2507a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            q1.c(i11, i12, obj.f2507a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f2508b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f2507a, str2)));
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
                                            d1Var.f2348r = DesugarCollections.unmodifiableMap(hashMap);
                                            jv0 jv0Var = d1Var.f2338g;
                                            if (p1Var.h.getWidth() != jv0Var.f26052a || p1Var.h.getHeight() != jv0Var.f26053b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) jv0Var.f26052a, (int) jv0Var.f26053b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(p1Var.h, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f26052a, jv0Var.f26053b), (Paint) null);
                                                p1Var.h = createBitmap;
                                                p1Var.f2497r = true;
                                            }
                                            if (p1Var.f2496n != null && (bitmap.getWidth() != jv0Var.f26052a || p1Var.f2496n.getHeight() != jv0Var.f26053b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) jv0Var.f26052a, (int) jv0Var.f26053b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(p1Var.f2496n, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f26052a, jv0Var.f26053b), (Paint) null);
                                                p1Var.f2496n = createBitmap2;
                                                p1Var.f2497r = true;
                                            }
                                            Bitmap bitmap3 = p1Var.h;
                                            Bitmap bitmap4 = p1Var.f2496n;
                                            if (d1Var.f2341k == null) {
                                                d1Var.f2341k = new g2(bitmap3);
                                            }
                                            if (d1Var.D == null) {
                                                d1Var.D = new g2(bitmap4);
                                            }
                                            if (d1Var.G && d1Var.f2342l == null) {
                                                d1Var.f2342l = new g2(d1Var.A);
                                            }
                                            p5.a();
                                            z4 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            y3.u(this.f2477b, new StringBuilder("createWindowSurface failed "));
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
                        z4 = false;
                    }
                }
            }
            this.f2479f = z4;
            super.run();
        }
    }
}
