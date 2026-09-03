package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import j$.util.DesugarCollections;
import j7.b7;
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
public final class m1 extends DispatchQueue {
    public final SurfaceTexture f4605a;
    public EGL10 f4606b;
    public EGLDisplay f4607c;
    public EGLContext d;
    public EGLSurface f4608e;
    public boolean f4609f;
    public volatile boolean h;
    public int f4610n;
    public int f4611r;
    public l1 f4612s;
    public final ba v;
    public final androidx.activity.i f4613w;
    public final l1 f4614x;
    public final o1 f4615y;

    public m1(o1 o1Var, SurfaceTexture surfaceTexture, ba baVar) {
        super("CanvasInternal");
        this.f4615y = o1Var;
        this.f4613w = new androidx.activity.i(this, 16);
        this.f4614x = new l1(this, 0);
        this.v = baVar;
        this.f4605a = surfaceTexture;
    }

    public static void b(m1 m1Var) {
        if (!m1Var.f4609f) {
            return;
        }
        if (m1Var.d.equals(m1Var.f4606b.eglGetCurrentContext()) && m1Var.f4608e.equals(m1Var.f4606b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = m1Var.f4606b;
        EGLDisplay eGLDisplay = m1Var.f4607c;
        EGLSurface eGLSurface = m1Var.f4608e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, m1Var.d);
    }

    public final void finish() {
        ba baVar = this.v;
        if (this.f4608e != null) {
            EGL10 egl10 = this.f4606b;
            EGLDisplay eGLDisplay = this.f4607c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f4606b.eglDestroySurface(this.f4607c, this.f4608e);
            this.f4608e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (baVar != null) {
                synchronized (baVar.f25555f) {
                    try {
                        if (baVar.f25556g == eGLContext) {
                            baVar.f25556g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f4606b.eglDestroyContext(this.f4607c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f4607c;
        if (eGLDisplay2 != null) {
            this.f4606b.eglTerminate(eGLDisplay2);
            this.f4607c = null;
        }
        if (baVar != null) {
            l1 l1Var = this.f4614x;
            ArrayList arrayList = baVar.f25554e;
            arrayList.remove(l1Var);
            if (arrayList.isEmpty() && baVar.d.isEmpty()) {
                baVar.f25562n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        o1 o1Var = this.f4615y;
        Bitmap bitmap2 = o1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f4605a;
            ba baVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f4606b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f4607c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z4 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    y3.u(this.f4606b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f4606b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        y3.u(this.f4606b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f4606b.eglChooseConfig(this.f4607c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            y3.u(this.f4606b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (baVar != null) {
                                synchronized (baVar.f25555f) {
                                    try {
                                        eGLContext = baVar.f25556g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f4606b.eglCreateContext(this.f4607c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    y3.u(this.f4606b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (baVar != null) {
                                    baVar.a(eglCreateContext);
                                    baVar.f25554e.add(this.f4614x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f4606b.eglCreateWindowSurface(this.f4607c, eGLConfig, surfaceTexture, null);
                                    this.f4608e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f4606b.eglMakeCurrent(this.f4607c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                y3.u(this.f4606b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            c1 c1Var = o1Var.f4626c;
                                            c1Var.getClass();
                                            Map map = q1.f4643a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : q1.f4643a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f4640b = new HashMap();
                                                obj.f4639a = GLES20.glCreateProgram();
                                                c5.e b10 = p1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f2268a;
                                                if (b10.f2269b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    p1.c(i11, i10, obj.f4639a);
                                                } else {
                                                    c5.e b11 = p1.b(35632, str);
                                                    int i12 = b11.f2268a;
                                                    if (b11.f2269b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        p1.c(i11, i12, obj.f4639a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f4639a, i11);
                                                        GLES20.glAttachShader(obj.f4639a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f4639a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f4639a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            p1.c(i11, i12, obj.f4639a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f4640b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f4639a, str2)));
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
                                            c1Var.f4466r = DesugarCollections.unmodifiableMap(hashMap);
                                            jv0 jv0Var = c1Var.f4456g;
                                            if (o1Var.h.getWidth() != jv0Var.f28201a || o1Var.h.getHeight() != jv0Var.f28202b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) jv0Var.f28201a, (int) jv0Var.f28202b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(o1Var.h, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f28201a, jv0Var.f28202b), (Paint) null);
                                                o1Var.h = createBitmap;
                                                o1Var.f4630r = true;
                                            }
                                            if (o1Var.f4629n != null && (bitmap.getWidth() != jv0Var.f28201a || o1Var.f4629n.getHeight() != jv0Var.f28202b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) jv0Var.f28201a, (int) jv0Var.f28202b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(o1Var.f4629n, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f28201a, jv0Var.f28202b), (Paint) null);
                                                o1Var.f4629n = createBitmap2;
                                                o1Var.f4630r = true;
                                            }
                                            Bitmap bitmap3 = o1Var.h;
                                            Bitmap bitmap4 = o1Var.f4629n;
                                            if (c1Var.f4459k == null) {
                                                c1Var.f4459k = new f2(bitmap3);
                                            }
                                            if (c1Var.D == null) {
                                                c1Var.D = new f2(bitmap4);
                                            }
                                            if (c1Var.G && c1Var.f4460l == null) {
                                                c1Var.f4460l = new f2(c1Var.A);
                                            }
                                            b7.a();
                                            z4 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            y3.u(this.f4606b, new StringBuilder("createWindowSurface failed "));
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
            this.f4609f = z4;
            super.run();
        }
    }
}
