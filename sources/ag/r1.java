package ag;

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
import org.telegram.messenger.x3;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.ga;
public final class r1 extends DispatchQueue {
    public final SurfaceTexture f640a;
    public EGL10 f641b;
    public EGLDisplay f642c;
    public EGLContext d;
    public EGLSurface f643e;
    public boolean f644f;
    public volatile boolean h;
    public int f645n;
    public int f646r;
    public p1 f647s;
    public final ga v;
    public final q1 f648w;
    public final p1 f649x;
    public final t1 f650y;

    public r1(t1 t1Var, SurfaceTexture surfaceTexture, ga gaVar) {
        super("CanvasInternal");
        this.f650y = t1Var;
        this.f648w = new q1(this, 0);
        this.f649x = new p1(this, 0);
        this.v = gaVar;
        this.f640a = surfaceTexture;
    }

    public static void b(r1 r1Var) {
        if (!r1Var.f644f) {
            return;
        }
        if (r1Var.d.equals(r1Var.f641b.eglGetCurrentContext()) && r1Var.f643e.equals(r1Var.f641b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = r1Var.f641b;
        EGLDisplay eGLDisplay = r1Var.f642c;
        EGLSurface eGLSurface = r1Var.f643e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, r1Var.d);
    }

    public final void finish() {
        ga gaVar = this.v;
        if (this.f643e != null) {
            EGL10 egl10 = this.f641b;
            EGLDisplay eGLDisplay = this.f642c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f641b.eglDestroySurface(this.f642c, this.f643e);
            this.f643e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (gaVar != null) {
                synchronized (gaVar.f28852f) {
                    try {
                        if (gaVar.f28853g == eGLContext) {
                            gaVar.f28853g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f641b.eglDestroyContext(this.f642c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f642c;
        if (eGLDisplay2 != null) {
            this.f641b.eglTerminate(eGLDisplay2);
            this.f642c = null;
        }
        if (gaVar != null) {
            p1 p1Var = this.f649x;
            ArrayList arrayList = gaVar.f28851e;
            arrayList.remove(p1Var);
            if (arrayList.isEmpty() && gaVar.d.isEmpty()) {
                gaVar.f28859n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        t1 t1Var = this.f650y;
        Bitmap bitmap2 = t1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f640a;
            ga gaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f641b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f642c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    x3.u(this.f641b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f641b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        x3.u(this.f641b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f641b.eglChooseConfig(this.f642c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            x3.u(this.f641b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (gaVar != null) {
                                synchronized (gaVar.f28852f) {
                                    try {
                                        eGLContext = gaVar.f28853g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f641b.eglCreateContext(this.f642c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    x3.u(this.f641b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (gaVar != null) {
                                    gaVar.a(eglCreateContext);
                                    gaVar.f28851e.add(this.f649x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f641b.eglCreateWindowSurface(this.f642c, eGLConfig, surfaceTexture, null);
                                    this.f643e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f641b.eglMakeCurrent(this.f642c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                x3.u(this.f641b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            f1 f1Var = t1Var.f660c;
                                            f1Var.getClass();
                                            Map map = v1.f685a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : v1.f685a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f678b = new HashMap();
                                                obj.f677a = GLES20.glCreateProgram();
                                                a5.e b10 = u1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f165a;
                                                if (b10.f166b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    u1.c(i11, i10, obj.f677a);
                                                } else {
                                                    a5.e b11 = u1.b(35632, str);
                                                    int i12 = b11.f165a;
                                                    if (b11.f166b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        u1.c(i11, i12, obj.f677a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f677a, i11);
                                                        GLES20.glAttachShader(obj.f677a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f677a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f677a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            u1.c(i11, i12, obj.f677a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f678b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f677a, str2)));
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
                                            f1Var.f484r = DesugarCollections.unmodifiableMap(hashMap);
                                            bv0 bv0Var = f1Var.f474g;
                                            if (t1Var.h.getWidth() != bv0Var.f27238a || t1Var.h.getHeight() != bv0Var.f27239b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) bv0Var.f27238a, (int) bv0Var.f27239b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(t1Var.h, (Rect) null, new RectF(0.0f, 0.0f, bv0Var.f27238a, bv0Var.f27239b), (Paint) null);
                                                t1Var.h = createBitmap;
                                                t1Var.f664r = true;
                                            }
                                            if (t1Var.f663n != null && (bitmap.getWidth() != bv0Var.f27238a || t1Var.f663n.getHeight() != bv0Var.f27239b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) bv0Var.f27238a, (int) bv0Var.f27239b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(t1Var.f663n, (Rect) null, new RectF(0.0f, 0.0f, bv0Var.f27238a, bv0Var.f27239b), (Paint) null);
                                                t1Var.f663n = createBitmap2;
                                                t1Var.f664r = true;
                                            }
                                            Bitmap bitmap3 = t1Var.h;
                                            Bitmap bitmap4 = t1Var.f663n;
                                            if (f1Var.f477k == null) {
                                                f1Var.f477k = new l2(bitmap3);
                                            }
                                            if (f1Var.D == null) {
                                                f1Var.D = new l2(bitmap4);
                                            }
                                            if (f1Var.G && f1Var.f478l == null) {
                                                f1Var.f478l = new l2(f1Var.A);
                                            }
                                            h7.t.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            x3.u(this.f641b, new StringBuilder("createWindowSurface failed "));
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
            this.f644f = z10;
            super.run();
        }
    }
}
