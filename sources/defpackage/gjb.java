package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
public final class gjb extends do3 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public volatile boolean T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final ArrayList X;
    public boolean a;
    public final AtomicBoolean b;
    public final SurfaceTexture c;
    public djb d;
    public int e;
    public int f;
    public EGL10 h;
    public EGLDisplay n;
    public EGLConfig r;
    public EGLSurface s;
    public EGLContext w;
    public int x;
    public int y;

    public gjb(SurfaceTexture surfaceTexture, djb djbVar, djb djbVar2, int i, int i2) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.c = surfaceTexture;
        this.d = djbVar2;
        this.e = i;
        this.f = i2;
        start();
    }

    public final void a(fjb fjbVar) {
        int i = 0;
        GLES20.glGenTextures(1, fjbVar.A, 0);
        GLES20.glBindTexture(3553, fjbVar.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, fjbVar.C, 0);
        GLES20.glBindTexture(3553, 0);
        fjbVar.C.recycle();
        fjbVar.C = null;
        if (fjbVar.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((fjb) obj).a();
            }
            this.U.clear();
        }
        this.U.add(fjbVar);
        this.T = true;
    }

    public final void b(float f, View view, Runnable runnable) {
        if (!this.b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                gl.c3(runnable);
            }
            djb djbVar = this.d;
            if (djbVar != null) {
                gl.c3(djbVar);
                this.d = null;
                return;
            }
            return;
        }
        fjb fjbVar = new fjb(this, view, f, runnable);
        getHandler();
        this.T = true;
        postRunnable(new ejb(this, fjbVar, (byte) 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            gl.c3(new cua(runnable, runnable2, (byte) 1));
            ijb.b(this.d);
            this.d = null;
            return;
        }
        fjb fjbVar = new fjb(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.T = true;
        postRunnable(new ejb(this, fjbVar, (byte) 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.b.get()) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((View) arrayList.get(i)).setVisibility(8);
            }
            if (runnable != null) {
                gl.c3(runnable);
            }
            djb djbVar = this.d;
            if (djbVar != null) {
                gl.c3(djbVar);
                this.d = null;
                return;
            }
            return;
        }
        fjb fjbVar = new fjb(this, arrayList, runnable);
        this.T = true;
        postRunnable(new ejb(this, fjbVar, (byte) 0));
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        int j2;
        int i4;
        int i5;
        int i6;
        if (this.b.get()) {
            GLES20.glClear(16384);
            int i7 = 0;
            int i8 = 0;
            while (i8 < this.U.size()) {
                fjb fjbVar = (fjb) this.U.get(i8);
                if (fjbVar.d) {
                    ArrayList arrayList3 = this.U;
                    int i9 = 0;
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        i9 += ((fjb) arrayList3.get(i10)).u;
                    }
                    float f5 = fjbVar.u;
                    float f6 = f5 / i9;
                    int[] iArr = fjbVar.B;
                    int i11 = fjbVar.t;
                    int o = gba.o();
                    int i12 = 120000;
                    if (o != 1) {
                        if (o != 2) {
                            i3 = 30000;
                        } else {
                            i3 = 120000;
                        }
                    } else {
                        i3 = 60000;
                    }
                    if (!fjbVar.E.a) {
                        i12 = i3;
                    }
                    if (fjbVar.D) {
                        i12 /= 2;
                    }
                    float max = Math.max(gl.N(0.4f), 1.0f);
                    fjbVar.s = Utilities.j((int) ((i2 * i11) / (max * max)), (int) (i12 * f6), 10);
                    float f7 = i11;
                    float f8 = f7 / f5;
                    int round = (int) Math.round(Math.sqrt(j2 / f8));
                    fjbVar.w = round;
                    fjbVar.v = Math.round(fjbVar.s / round);
                    while (true) {
                        i4 = fjbVar.v;
                        i5 = fjbVar.w;
                        i6 = i4 * i5;
                        if (i6 >= fjbVar.s) {
                            break;
                        } else if (i4 / i5 < f8) {
                            fjbVar.v = i4 + 1;
                        } else {
                            fjbVar.w = i5 + 1;
                        }
                    }
                    fjbVar.s = i6;
                    fjbVar.x = Math.max(f7 / i4, f5 / i5);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i13 = 0; i13 < 2; i13++) {
                        GLES20.glBindBuffer(34962, iArr[i13]);
                        GLES20.glBufferData(34962, fjbVar.s * 28, null, 35048);
                    }
                    if (fjbVar.e != null) {
                        this.V.add(fjbVar);
                    }
                }
                this.W = true;
                int[] iArr2 = fjbVar.B;
                boolean z = fjbVar.D;
                float f9 = fjbVar.m;
                int i14 = fjbVar.u;
                int i15 = fjbVar.t;
                Matrix matrix = fjbVar.r;
                gjb gjbVar = fjbVar.E;
                long nanoTime = System.nanoTime();
                if (fjbVar.b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j) / 1.0E9d;
                }
                fjbVar.b = nanoTime;
                if (fjbVar.n && !fjbVar.o) {
                    matrix.reset();
                    matrix.postScale(i15, i14);
                    matrix.postTranslate(fjbVar.i, fjbVar.j);
                    fjbVar.c();
                }
                fjbVar.c = (float) ((f9 * d) + fjbVar.c);
                GLES20.glUniformMatrix3fv(gjbVar.y, 1, false, fjbVar.p, 0);
                int i16 = gjbVar.E;
                if (fjbVar.d) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                GLES20.glUniform1f(i16, f);
                GLES20.glUniform1f(gjbVar.F, fjbVar.c);
                GLES20.glUniform1f(gjbVar.G, ((float) d) * f9);
                GLES20.glUniform1f(gjbVar.H, fjbVar.s);
                GLES20.glUniform3f(gjbVar.J, fjbVar.v, fjbVar.w, fjbVar.x);
                GLES20.glUniform2f(gjbVar.Q, fjbVar.g, fjbVar.h);
                int i17 = gjbVar.R;
                if (z) {
                    f2 = 0.8f;
                } else {
                    f2 = 1.0f;
                }
                GLES20.glUniform1f(i17, f2);
                int i18 = gjbVar.S;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.6f;
                }
                GLES20.glUniform1f(i18, f3);
                GLES20.glUniform2f(gjbVar.K, i15, i14);
                GLES20.glUniform1f(gjbVar.L, fjbVar.y);
                GLES20.glUniform2f(gjbVar.M, 0.0f, 0.0f);
                GLES20.glUniform1f(gjbVar.O, fjbVar.k);
                GLES20.glUniform1f(gjbVar.P, fjbVar.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, fjbVar.A[0]);
                GLES20.glUniform1i(gjbVar.N, 0);
                GLES20.glBindBuffer(34962, iArr2[fjbVar.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - fjbVar.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, fjbVar.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                fjbVar.d = false;
                fjbVar.z = 1 - fjbVar.z;
                float f10 = fjbVar.c;
                float f11 = fjbVar.l;
                if (fjbVar.D) {
                    f4 = 2.0f;
                } else {
                    f4 = 0.9f;
                }
                if (f10 > f11 + f4) {
                    fjbVar.a();
                    this.U.remove(i8);
                    i = 1;
                    this.T = !this.U.isEmpty();
                    i8--;
                } else {
                    i = 1;
                }
                i8 += i;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    fa4.d("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        int i19 = 0;
                        while (true) {
                            int size = this.V.size();
                            arrayList = this.V;
                            if (i19 >= size) {
                                break;
                            }
                            gl.c3(((fjb) arrayList.get(i19)).e);
                            i19++;
                        }
                        arrayList.clear();
                        while (true) {
                            int size2 = this.U.size();
                            ArrayList arrayList4 = this.U;
                            if (i7 < size2) {
                                ((fjb) arrayList4.get(i7)).a();
                                i7++;
                            } else {
                                arrayList4.clear();
                                gl.c3(new cza((byte) 4));
                                h();
                                return;
                            }
                        }
                    }
                }
            }
            this.h.eglSwapBuffers(this.n, this.s);
            while (true) {
                int size3 = this.V.size();
                arrayList2 = this.V;
                if (i7 >= size3) {
                    break;
                }
                gl.c3(((fjb) arrayList2.get(i7)).e);
                i7++;
            }
            arrayList2.clear();
            if (this.U.isEmpty() && this.W) {
                h();
            }
        }
    }

    public final void f() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            fa4.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            h();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            fa4.d("ThanosEffect: failed eglInitialize");
            h();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                fa4.d("ThanosEffect: failed eglChooseConfig");
                g();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.w = eglCreateContext;
            if (eglCreateContext == null) {
                fa4.d("ThanosEffect: eglContext == null");
                h();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.n, this.r, this.c, null);
            this.s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                fa4.d("ThanosEffect: eglSurface == null");
                h();
            } else if (!this.h.eglMakeCurrent(this.n, eglCreateWindowSurface, eglCreateWindowSurface, this.w)) {
                fa4.d("ThanosEffect: failed eglMakeCurrent");
                h();
            } else {
                int glCreateShader = GLES20.glCreateShader(35633);
                int glCreateShader2 = GLES20.glCreateShader(35632);
                if (glCreateShader != 0 && glCreateShader2 != 0) {
                    GLES20.glShaderSource(glCreateShader, gl.v2(null, 2131624283));
                    GLES20.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        fa4.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                        GLES20.glDeleteShader(glCreateShader);
                        h();
                        return;
                    }
                    GLES20.glShaderSource(glCreateShader2, gl.v2(null, 2131624282));
                    GLES20.glCompileShader(glCreateShader2);
                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        fa4.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                        GLES20.glDeleteShader(glCreateShader2);
                        h();
                        return;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        fa4.d("ThanosEffect: drawProgram == 0");
                        h();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.x);
                    GLES20.glGetProgramiv(this.x, 35714, iArr, 0);
                    int i = iArr[0];
                    int i2 = this.x;
                    if (i != 1) {
                        fa4.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(i2));
                        h();
                        return;
                    }
                    this.y = GLES20.glGetUniformLocation(i2, "matrix");
                    this.K = GLES20.glGetUniformLocation(this.x, "rectSize");
                    this.M = GLES20.glGetUniformLocation(this.x, "rectPos");
                    this.E = GLES20.glGetUniformLocation(this.x, "reset");
                    this.F = GLES20.glGetUniformLocation(this.x, "time");
                    this.G = GLES20.glGetUniformLocation(this.x, "deltaTime");
                    this.H = GLES20.glGetUniformLocation(this.x, "particlesCount");
                    this.I = GLES20.glGetUniformLocation(this.x, "size");
                    this.J = GLES20.glGetUniformLocation(this.x, "gridSize");
                    this.N = GLES20.glGetUniformLocation(this.x, "tex");
                    this.L = GLES20.glGetUniformLocation(this.x, "seed");
                    this.O = GLES20.glGetUniformLocation(this.x, "dp");
                    this.P = GLES20.glGetUniformLocation(this.x, "longevity");
                    this.Q = GLES20.glGetUniformLocation(this.x, "offset");
                    this.R = GLES20.glGetUniformLocation(this.x, "scale");
                    this.S = GLES20.glGetUniformLocation(this.x, "uvOffset");
                    GLES20.glViewport(0, 0, this.e, this.f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.x);
                    GLES20.glUniform2f(this.I, this.e, this.f);
                    return;
                }
                fa4.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                h();
            }
        }
    }

    public final void g() {
        if (!this.b.get()) {
            fa4.b("ThanosEffect: kill failed, already dead");
            return;
        }
        fa4.b("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    public final void h() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            fa4.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        fa4.b("ThanosEffect: killInternal");
        int i = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.U;
            if (i >= arrayList.size()) {
                break;
            }
            ((fjb) arrayList.get(i)).a();
            i++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        ijb.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ArrayList arrayList = this.U;
                        if (i != 4) {
                            if (i == 5) {
                                View view = (View) message.obj;
                                while (i2 < arrayList.size()) {
                                    fjb fjbVar = (fjb) arrayList.get(i2);
                                    if (fjbVar.a.contains(view)) {
                                        fjbVar.a();
                                        arrayList.remove(i2);
                                        i2--;
                                    }
                                    i2++;
                                }
                                return;
                            }
                            return;
                        }
                        while (i2 < arrayList.size()) {
                            fjb fjbVar2 = (fjb) arrayList.get(i2);
                            fjbVar2.g += message.arg1;
                            fjbVar2.h += message.arg2;
                            i2++;
                        }
                        return;
                    }
                    a((fjb) message.obj);
                    return;
                }
                h();
                return;
            }
            int i3 = message.arg1;
            int i4 = message.arg2;
            if (this.b.get()) {
                this.e = i3;
                this.f = i4;
                GLES20.glViewport(0, 0, i3, i4);
                GLES20.glUniform2f(this.I, i3, i4);
            }
            e();
            return;
        }
        e();
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.X;
        int i = 0;
        try {
            f();
            if (!arrayList.isEmpty()) {
                while (i < arrayList.size()) {
                    a((fjb) arrayList.get(i));
                    i++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            fa4.g(e, true);
            while (i < arrayList.size()) {
                fjb fjbVar = (fjb) arrayList.get(i);
                Runnable runnable = fjbVar.e;
                if (runnable != null) {
                    gl.c3(runnable);
                }
                fjbVar.a();
                i++;
            }
            arrayList.clear();
            gl.c3(new cza((byte) 3));
            h();
        }
    }
}
