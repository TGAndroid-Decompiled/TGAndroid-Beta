package dg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.GLES20;
import j7.b7;
import j7.z6;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.zip.Inflater;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jv0;
public final class c1 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public f2 D;
    public boolean E;
    public final ba F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public o5.i f4451a;
    public d1 f4452b;
    public r1 f4453c;
    public r1 d;
    public o1 f4455f;
    public final jv0 f4456g;
    public RectF h;
    public m f4457i;
    public f2 f4459k;
    public f2 f4460l;
    public final ByteBuffer f4461m;
    public final ByteBuffer f4462n;
    public int f4463o;
    public int f4464p;
    public int f4465q;
    public Map f4466r;
    public int f4467s;
    public final ByteBuffer f4469u;
    public boolean v;
    public b4.e0 f4470w;
    public final float[] f4471x;
    public float[] f4472y;
    public f2 f4473z;
    public final HashMap f4458j = new HashMap();
    public final int[] f4468t = new int[1];
    public boolean G = false;
    public final h1 f4454e = new Object();

    public c1(jv0 jv0Var, Bitmap bitmap, int i10, ba baVar) {
        this.F = baVar;
        this.f4456g = jv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f4469u = ByteBuffer.allocateDirect(((int) jv0Var.f28201a) * ((int) jv0Var.f28202b) * 4);
        this.f4471x = z6.b(jv0Var.f28201a, jv0Var.f28202b);
        if (this.f4461m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f4461m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f4461m.putFloat(0.0f);
        this.f4461m.putFloat(0.0f);
        this.f4461m.putFloat(jv0Var.f28201a);
        this.f4461m.putFloat(0.0f);
        this.f4461m.putFloat(0.0f);
        this.f4461m.putFloat(jv0Var.f28202b);
        this.f4461m.putFloat(jv0Var.f28201a);
        this.f4461m.putFloat(jv0Var.f28202b);
        this.f4461m.rewind();
        if (this.f4462n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f4462n = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.rewind();
        }
    }

    public final void a(boolean z4) {
        int i10 = this.f4463o;
        int[] iArr = this.f4468t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f4463o = 0;
        }
        f2 f2Var = this.f4459k;
        if (f2Var != null) {
            f2Var.a(z4);
        }
        f2 f2Var2 = this.D;
        if (f2Var2 != null) {
            f2Var2.a(z4);
        }
        int i11 = this.f4464p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f4464p = 0;
        }
        HashMap hashMap = this.f4458j;
        for (f2 f2Var3 : hashMap.values()) {
            if (f2Var3 != null) {
                f2Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f4465q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f4465q = 0;
        }
        f2 f2Var4 = this.f4473z;
        if (f2Var4 != null) {
            f2Var4.a(true);
        }
        f2 f2Var5 = this.f4460l;
        if (f2Var5 != null) {
            f2Var5.a(true);
        }
        Map map = this.f4466r;
        if (map != null) {
            for (p1 p1Var : map.values()) {
                if (p1Var.f4639a != 0) {
                    GLES20.glDeleteProgram(0);
                    p1Var.f4639a = 0;
                }
            }
            this.f4466r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        b7.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            jv0 jv0Var = this.f4456g;
            GLES20.glViewport(0, 0, (int) jv0Var.f28201a, (int) jv0Var.f28202b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        o5.i iVar = this.f4451a;
        if (iVar != null) {
            iVar.c();
        }
        h1 h1Var = this.f4454e;
        h1Var.h = 0;
        h1Var.f4553g = 0.0d;
        ByteBuffer byteBuffer = h1Var.f4555j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f4452b = null;
        this.J = 0.0f;
    }

    public final void c(d1 d1Var, int i10, boolean z4, g0 g0Var) {
        if (this.f4466r != null && this.f4457i != null) {
            this.f4455f.f(new a1(this, d1Var, i10, z4, g0Var));
        }
    }

    public final b4.e0 d(dg.d1 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: dg.c1.d(dg.d1, int, android.graphics.RectF):b4.e0");
    }

    public final b4.e0 e(r1 r1Var, int i10, RectF rectF) {
        boolean z4;
        m mVar = r1Var.f4651a;
        if (mVar == null) {
            mVar = this.f4457i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z4 = true;
        } else {
            z4 = false;
        }
        b4.e0 m9 = m(rectF, z4);
        this.f4467s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        jv0 jv0Var = this.f4456g;
        GLES20.glViewport(0, 0, (int) jv0Var.f28201a, (int) jv0Var.f28202b);
        p1 p1Var = (p1) this.f4466r.get(mVar.i(1));
        if (p1Var == null) {
            return null;
        }
        GLES20.glUseProgram(p1Var.f4639a);
        GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f4471x));
        GLES20.glUniform1i(p1Var.d("texture"), 0);
        GLES20.glUniform1i(p1Var.d("mask"), 1);
        p1.a(p1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f4473z != null) {
            GLES20.glUniform1i(p1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f4473z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(p1Var.d("type"), r1Var.f4651a.o());
            GLES20.glUniform2f(p1Var.d("resolution"), jv0Var.f28201a, jv0Var.f28202b);
            GLES20.glUniform2f(p1Var.d("center"), r1Var.f4652b, r1Var.f4653c);
            GLES20.glUniform2f(p1Var.d("radius"), r1Var.d, r1Var.f4654e);
            GLES20.glUniform1f(p1Var.d("thickness"), r1Var.f4655f);
            GLES20.glUniform1f(p1Var.d("rounding"), r1Var.f4656g);
            GLES20.glUniform2f(p1Var.d("middle"), r1Var.f4657i, r1Var.f4658j);
            GLES20.glUniform1f(p1Var.d("rotation"), r1Var.h);
            GLES20.glUniform1i(p1Var.d("fill"), r1Var.f4660l ? 1 : 0);
            GLES20.glUniform1f(p1Var.d("arrowTriangleLength"), r1Var.f4659k);
            GLES20.glUniform1i(p1Var.d("composite"), 1);
            GLES20.glUniform1i(p1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f4461m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f4462n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        o5.i iVar = this.f4451a;
        if (iVar != null && this.f4467s <= 0) {
            iVar.c();
        }
        this.f4467s--;
        h1 h1Var = this.f4454e;
        h1Var.h = 0;
        h1Var.f4553g = 0.0d;
        ByteBuffer byteBuffer = h1Var.f4555j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f4452b = null;
        this.f4453c = null;
        return m9;
    }

    public final RectF f() {
        jv0 jv0Var = this.f4456g;
        return new RectF(0.0f, 0.0f, jv0Var.f28201a, jv0Var.f28202b);
    }

    public final int g() {
        if (this.f4464p == 0) {
            this.f4464p = f2.b(this.f4456g);
        }
        return this.f4464p;
    }

    public final bf.b h(RectF rectF, boolean z4, boolean z10, boolean z11) {
        String str;
        int j10;
        f2 f2Var;
        bf.b bVar;
        p1 p1Var;
        int i10;
        int j11;
        f2 f2Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f4468t, 0);
        int i13 = this.f4468t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f4468t, 0);
        int i14 = this.f4468t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        jv0 jv0Var = this.f4456g;
        GLES20.glViewport(0, 0, (int) jv0Var.f28201a, (int) jv0Var.f28202b);
        Map map = this.f4466r;
        if (map != null) {
            if (z4) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            p1 p1Var2 = (p1) map.get(str);
            if (p1Var2 != null) {
                GLES20.glUseProgram(p1Var2.f4639a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c3 = z6.c(this.f4471x, z6.a(matrix));
                GLES20.glUniformMatrix4fv(p1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                if (!z4 && this.G) {
                    GLES20.glUniform1i(p1Var2.d("texture"), 1);
                    GLES20.glUniform1i(p1Var2.d("mask"), 0);
                    GLES20.glUniform1f(p1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z10 && (f2Var2 = this.D) != null) {
                        j11 = f2Var2.c();
                    } else {
                        j11 = j();
                    }
                    GLES20.glBindTexture(3553, j11);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f4460l.c());
                } else {
                    GLES20.glUniform1i(p1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z10 && (f2Var = this.D) != null) {
                        j10 = f2Var.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f4461m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f4462n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z11 && !z10 && (p1Var = (p1) this.f4466r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(p1Var.f4639a);
                    GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                    GLES20.glUniform1f(p1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(p1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(p1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = this.F.f25561m;
                    if (haVar != null) {
                        i10 = haVar.f27460s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(p1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(p1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f4461m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f4462n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f4469u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f4469u);
                if (z4) {
                    bVar = new bf.b(25, (Object) null, this.f4469u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f4469u);
                    bVar = new bf.b(25, createBitmap, (Object) null);
                }
                this.f4469u.rewind();
                int[] iArr = this.f4468t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f4468t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return bVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f4463o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f4463o = iArr[0];
            b7.a();
        }
        return this.f4463o;
    }

    public final int j() {
        f2 f2Var = this.f4459k;
        if (f2Var != null) {
            return f2Var.c();
        }
        return 0;
    }

    public final void k(r1 r1Var) {
        if (r1Var == null) {
            return;
        }
        this.f4455f.f(new x0(this, r1Var, 0));
    }

    public final void l(dg.d1 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: dg.c1.l(dg.d1, boolean, boolean):void");
    }

    public final b4.e0 m(RectF rectF, boolean z4) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f4451a.f16617b;
        b4.e0 e0Var = new b4.e0((ByteBuffer) h(rectF, true, z4, false).f1936c, z4 ? 1 : 0, rectF);
        ((o1) this.f4451a.f16617b).f4625b.b(UUID.randomUUID(), new z0(this, e0Var, 1));
        return e0Var;
    }

    public final void n(int r19, dg.d1 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: dg.c1.n(int, dg.d1, float):void");
    }

    public final void o(int i10, int i11, r1 r1Var, float f10) {
        p1 p1Var;
        int i12;
        if (r1Var != null) {
            m mVar = this.f4457i;
            l lVar = r1Var.f4651a;
            if (lVar != null && i10 == this.f4465q) {
                mVar = lVar;
            }
            if (mVar != null && this.f4455f != null && (p1Var = (p1) this.f4466r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(p1Var.f4639a);
                GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f4472y));
                GLES20.glUniform1i(p1Var.d("texture"), 0);
                GLES20.glUniform1i(p1Var.d("mask"), 1);
                int currentColor = this.f4455f.getCurrentColor();
                p1.a(p1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f10)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(p1Var.d("type"), ((l) mVar).o());
                    int d = p1Var.d("resolution");
                    jv0 jv0Var = this.f4456g;
                    GLES20.glUniform2f(d, jv0Var.f28201a, jv0Var.f28202b);
                    GLES20.glUniform2f(p1Var.d("center"), r1Var.f4652b, r1Var.f4653c);
                    GLES20.glUniform2f(p1Var.d("radius"), r1Var.d, r1Var.f4654e);
                    GLES20.glUniform1f(p1Var.d("thickness"), r1Var.f4655f);
                    GLES20.glUniform1f(p1Var.d("rounding"), r1Var.f4656g);
                    GLES20.glUniform2f(p1Var.d("middle"), r1Var.f4657i, r1Var.f4658j);
                    GLES20.glUniform1f(p1Var.d("rotation"), r1Var.h);
                    GLES20.glUniform1i(p1Var.d("fill"), r1Var.f4660l ? 1 : 0);
                    GLES20.glUniform1f(p1Var.d("arrowTriangleLength"), r1Var.f4659k);
                    GLES20.glUniform1i(p1Var.d("composite"), 0);
                    int d10 = p1Var.d("clear");
                    if (r1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f4461m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f4462n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                b7.a();
            }
        }
    }

    public final void p(b4.e0 e0Var, boolean z4) {
        ByteBuffer byteBuffer;
        File file;
        o5.i iVar;
        f2 f2Var;
        if (e0Var != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) e0Var.d);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Inflater inflater = new Inflater(true);
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        inflater.setInput(bArr, 0, read);
                    }
                    while (true) {
                        int inflate = inflater.inflate(bArr2, 0, 1024);
                        if (inflate == 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, inflate);
                    }
                    if (inflater.finished()) {
                        break;
                    }
                    inflater.needsInput();
                }
                inflater.end();
                ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                byteArrayOutputStream.close();
                fileInputStream.close();
                byteBuffer = wrap;
            } catch (Exception e6) {
                FileLog.e(e6);
                byteBuffer = null;
            }
            int j10 = j();
            if (e0Var.f1474b == 1 && (f2Var = this.D) != null) {
                j10 = f2Var.c();
            }
            GLES20.glBindTexture(3553, j10);
            RectF rectF = (RectF) e0Var.f1475c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) e0Var.f1475c).height(), 6408, 5121, byteBuffer);
            if (this.f4467s <= 0 && (iVar = this.f4451a) != null) {
                iVar.c();
            }
            if (z4 && (file = (File) e0Var.d) != null) {
                file.delete();
                e0Var.d = null;
            }
        }
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap c3;
        this.f4457i = mVar;
        if ((mVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = this.B;
            if (i10 == 90 || i10 == 270 || i10 == -90) {
                height = width;
                width = height;
            }
            if (this.C == null) {
                this.C = Bitmap.createBitmap((int) (width / 8.0f), (int) (height / 8.0f), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.C);
            canvas.save();
            canvas.scale(0.125f, 0.125f);
            if (this.M != null) {
                this.M = new Paint(1);
            }
            canvas.save();
            canvas.rotate(i10);
            if (i10 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i10 == 180) {
                canvas.translate(-width, -height);
            } else if (i10 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            o1 o1Var = this.f4455f;
            if (o1Var != null && (c3 = o1Var.c(false, false)) != null) {
                canvas.scale(width / c3.getWidth(), height / c3.getHeight());
                canvas.drawBitmap(c3, 0.0f, 0.0f, this.M);
                c3.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            f2 f2Var = this.f4473z;
            if (f2Var != null) {
                f2Var.a(false);
            }
            this.f4473z = new f2(this.C);
        }
    }
}
