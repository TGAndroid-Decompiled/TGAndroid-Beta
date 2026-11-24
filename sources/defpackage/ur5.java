package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
public final class ur5 extends np3 {
    public static final int E = 0;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLConfig d;
    public EGLContext e;
    public EGLSurface f;
    public boolean h;
    public final int[] n;
    public float r;
    public long s;
    public final zo4 w;
    public final o04 x;
    public final vr5 y;

    public ur5(vr5 vr5Var, SurfaceTexture surfaceTexture) {
        super("EGLThread", true);
        this.y = vr5Var;
        this.n = new int[24];
        this.w = new zo4((byte) 23);
        this.x = new o04(this, (byte) 15);
        this.a = surfaceTexture;
    }

    public final void a(int i, int i2, int i3, boolean z) {
        Drawable drawable = this.y.getParentActivity().getResources().getDrawable(i);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.n;
            if (z) {
                GLES20.glDeleteTextures(1, iArr, i2);
                GLES20.glGenTextures(1, iArr, i2);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i2]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i3 != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(5);
                paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                createBitmap.recycle();
                return;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public final void b(ku4 ku4Var, int i, boolean z) {
        int[] iArr = this.n;
        if (z) {
            GLES20.glDeleteTextures(1, iArr, i);
            GLES20.glGenTextures(1, iArr, i);
        }
        Bitmap bitmap = (Bitmap) ku4Var.l(null);
        GLES20.glBindTexture(3553, iArr[i]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void c() {
        int[] iArr = this.n;
        Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
    }

    public final void d() {
        int[] iArr = this.n;
        Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
    }

    public final void finish() {
        if (this.f != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.f);
            this.f = null;
        }
        EGLContext eGLContext = this.e;
        if (eGLContext != null) {
            this.b.eglDestroyContext(this.c, eGLContext);
            this.e = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (e21.a) {
                b10.v(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
            if (e21.a) {
                b10.v(this.b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            vr5 vr5Var = this.y;
            if (!this.b.eglChooseConfig(this.c, s34.m(vr5Var.getParentActivity()).h() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (e21.a) {
                    b10.v(this.b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (e21.a) {
                        b10.v(this.b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, this.d, surfaceTexture, null);
                        this.f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.e)) {
                                if (e21.a) {
                                    b10.v(this.b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.n;
                                GLES20.glGenTextures(23, iArr2, 0);
                                a(2131231524, 0, 0, false);
                                a(2131231523, 1, 0, false);
                                a(2131231525, 2, 0, false);
                                a(2131231526, 3, 0, false);
                                a(2131231528, 4, 0, false);
                                a(2131231527, 5, 0, false);
                                a(2131231530, 6, 0, false);
                                a(2131231529, 7, 0, false);
                                a(2131231531, 8, 0, false);
                                a(2131231532, 9, 0, false);
                                a(2131231534, 10, 0, false);
                                a(2131231533, 11, 0, false);
                                a(2131231535, 12, 0, false);
                                a(2131231536, 13, 0, false);
                                a(2131231537, 14, 0, false);
                                a(2131231539, 15, 0, false);
                                a(2131231538, 16, 0, false);
                                a(2131231540, 17, cmb.w0(null, cmb.c6, false), false);
                                a(2131231541, 18, 0, false);
                                a(2131231542, 19, 0, false);
                                a(2131231543, 20, 0, false);
                                a(2131231544, 21, 0, false);
                                b(new zo4((byte) 24), 22, false);
                                b(this.w, 23, false);
                                d();
                                c();
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                vr5Var.K = System.currentTimeMillis() - 1000;
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
        }
        this.h = z;
        super.run();
    }
}
