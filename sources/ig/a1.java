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
import org.telegram.messenger.a30;
import org.telegram.messenger.f8;
import org.telegram.messenger.s5;
import org.telegram.messenger.v2;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.s9;
import v7.h8;
public final class a1 extends s5 {
    public final c1 D;
    public final SurfaceTexture f8269a;
    public EGL10 f8270b;
    public EGLDisplay f8271c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f8272f;
    public volatile boolean h;
    public int f8273n;
    public int f8274r;
    public z0 f8275s;
    public final s9 f8276w;
    public final androidx.activity.i f8277x;
    public final z0 f8278y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, s9 s9Var) {
        super("CanvasInternal", true);
        this.D = c1Var;
        this.f8277x = new androidx.activity.i(this, 21);
        this.f8278y = new z0(this, 0);
        this.f8276w = s9Var;
        this.f8269a = surfaceTexture;
    }

    public static void a(a1 a1Var) {
        if (!a1Var.f8272f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f8270b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.f8270b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f8270b;
        EGLDisplay eGLDisplay = a1Var.f8271c;
        EGLSurface eGLSurface = a1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        s9 s9Var = this.f8276w;
        if (this.e != null) {
            EGL10 egl10 = this.f8270b;
            EGLDisplay eGLDisplay = this.f8271c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f8270b.eglDestroySurface(this.f8271c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (s9Var != null) {
                synchronized (s9Var.f30242f) {
                    try {
                        if (s9Var.f30243g == eGLContext) {
                            s9Var.f30243g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f8270b.eglDestroyContext(this.f8271c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f8271c;
        if (eGLDisplay2 != null) {
            this.f8270b.eglTerminate(eGLDisplay2);
            this.f8271c = null;
        }
        if (s9Var != null) {
            z0 z0Var = this.f8278y;
            ArrayList arrayList = s9Var.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && s9Var.d.isEmpty()) {
                s9Var.f30249n.c();
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
            SurfaceTexture surfaceTexture = this.f8269a;
            s9 s9Var = this.f8276w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f8270b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f8271c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (v2.f18578a) {
                    a30.t(this.f8270b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f8270b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (v2.f18578a) {
                        a30.t(this.f8270b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f8270b.eglChooseConfig(this.f8271c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (v2.f18578a) {
                            a30.t(this.f8270b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (s9Var != null) {
                                synchronized (s9Var.f30242f) {
                                    try {
                                        eGLContext = s9Var.f30243g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f8270b.eglCreateContext(this.f8271c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (v2.f18578a) {
                                    a30.t(this.f8270b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (s9Var != null) {
                                    s9Var.a(eglCreateContext);
                                    s9Var.e.add(this.f8278y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f8270b.eglCreateWindowSurface(this.f8271c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f8270b.eglMakeCurrent(this.f8271c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (v2.f18578a) {
                                                a30.t(this.f8270b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f8285c;
                                            q0Var.getClass();
                                            Map map = e1.f8299a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f8299a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f8295b = new HashMap();
                                                obj.f8294a = GLES20.glCreateProgram();
                                                ac.g b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f385a;
                                                if (b10.f386b == 0) {
                                                    if (v2.f18578a) {
                                                        f8.d("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f8294a);
                                                } else {
                                                    ac.g b11 = d1.b(35632, str);
                                                    int i12 = b11.f385a;
                                                    if (b11.f386b == 0) {
                                                        if (v2.f18578a) {
                                                            f8.d("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f8294a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f8294a, i11);
                                                        GLES20.glAttachShader(obj.f8294a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f8294a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f8294a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && v2.f18578a) {
                                                            f8.d(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f8294a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f8295b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f8294a, str2)));
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
                                            q0Var.f8425r = DesugarCollections.unmodifiableMap(hashMap);
                                            qu0 qu0Var = q0Var.f8415g;
                                            if (c1Var.h.getWidth() != qu0Var.f29808a || c1Var.h.getHeight() != qu0Var.f29809b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) qu0Var.f29808a, (int) qu0Var.f29809b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, qu0Var.f29808a, qu0Var.f29809b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f8288r = true;
                                            }
                                            if (c1Var.f8287n != null && (bitmap.getWidth() != qu0Var.f29808a || c1Var.f8287n.getHeight() != qu0Var.f29809b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) qu0Var.f29808a, (int) qu0Var.f29809b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f8287n, (Rect) null, new RectF(0.0f, 0.0f, qu0Var.f29808a, qu0Var.f29809b), (Paint) null);
                                                c1Var.f8287n = createBitmap2;
                                                c1Var.f8288r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f8287n;
                                            if (q0Var.f8418k == null) {
                                                q0Var.f8418k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f8419l == null) {
                                                q0Var.f8419l = new r1(q0Var.A);
                                            }
                                            h8.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (v2.f18578a) {
                                            a30.t(this.f8270b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (v2.f18578a) {
                                f8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f8272f = z10;
            super.run();
        }
    }
}
