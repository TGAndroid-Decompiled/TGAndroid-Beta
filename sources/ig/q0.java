package ig;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
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
import java.util.Vector;
import java.util.zip.Inflater;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.x9;
import v7.f8;
import v7.h8;
public final class q0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public r1 D;
    public boolean E;
    public final s9 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public a4.l f8410a;
    public r0 f8411b;
    public f1 f8412c;
    public f1 d;
    public c1 f8413f;
    public final pu0 f8414g;
    public RectF h;
    public h f8415i;
    public r1 f8417k;
    public r1 f8418l;
    public final ByteBuffer f8419m;
    public final ByteBuffer f8420n;
    public int f8421o;
    public int f8422p;
    public int f8423q;
    public Map f8424r;
    public int f8425s;
    public final ByteBuffer f8427u;
    public boolean v;
    public a5.a f8428w;
    public final float[] f8429x;
    public float[] f8430y;
    public r1 f8431z;
    public final HashMap f8416j = new HashMap();
    public final int[] f8426t = new int[1];
    public boolean G = false;
    public final v0 e = new Object();

    public q0(pu0 pu0Var, Bitmap bitmap, int i10, s9 s9Var) {
        this.F = s9Var;
        this.f8414g = pu0Var;
        this.A = bitmap;
        this.B = i10;
        this.f8427u = ByteBuffer.allocateDirect(((int) pu0Var.f29435a) * ((int) pu0Var.f29436b) * 4);
        this.f8429x = f8.b(pu0Var.f29435a, pu0Var.f29436b);
        if (this.f8419m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f8419m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f8419m.putFloat(0.0f);
        this.f8419m.putFloat(0.0f);
        this.f8419m.putFloat(pu0Var.f29435a);
        this.f8419m.putFloat(0.0f);
        this.f8419m.putFloat(0.0f);
        this.f8419m.putFloat(pu0Var.f29436b);
        this.f8419m.putFloat(pu0Var.f29435a);
        this.f8419m.putFloat(pu0Var.f29436b);
        this.f8419m.rewind();
        if (this.f8420n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f8420n = allocateDirect2;
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

    public final void a(boolean z10) {
        int i10 = this.f8421o;
        int[] iArr = this.f8426t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f8421o = 0;
        }
        r1 r1Var = this.f8417k;
        if (r1Var != null) {
            r1Var.a(z10);
        }
        r1 r1Var2 = this.D;
        if (r1Var2 != null) {
            r1Var2.a(z10);
        }
        int i11 = this.f8422p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f8422p = 0;
        }
        HashMap hashMap = this.f8416j;
        for (r1 r1Var3 : hashMap.values()) {
            if (r1Var3 != null) {
                r1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f8423q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f8423q = 0;
        }
        r1 r1Var4 = this.f8431z;
        if (r1Var4 != null) {
            r1Var4.a(true);
        }
        r1 r1Var5 = this.f8418l;
        if (r1Var5 != null) {
            r1Var5.a(true);
        }
        Map map = this.f8424r;
        if (map != null) {
            for (d1 d1Var : map.values()) {
                if (d1Var.f8293a != 0) {
                    GLES20.glDeleteProgram(0);
                    d1Var.f8293a = 0;
                }
            }
            this.f8424r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        h8.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            pu0 pu0Var = this.f8414g;
            GLES20.glViewport(0, 0, (int) pu0Var.f29435a, (int) pu0Var.f29436b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        a4.l lVar = this.f8410a;
        if (lVar != null) {
            lVar.u();
        }
        v0 v0Var = this.e;
        v0Var.h = 0;
        v0Var.f8492g = 0.0d;
        ByteBuffer byteBuffer = v0Var.f8494j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f8411b = null;
        this.J = 0.0f;
    }

    public final void c(r0 r0Var, int i10, boolean z10, w wVar) {
        if (this.f8424r != null && this.f8415i != null) {
            this.f8413f.f(new o0(this, r0Var, i10, z10, wVar, 0));
        }
    }

    public final a5.a d(ig.r0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: ig.q0.d(ig.r0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(f1 f1Var, int i10, RectF rectF) {
        boolean z10;
        h hVar = f1Var.f8299a;
        if (hVar == null) {
            hVar = this.f8415i;
        }
        if (this.F != null && (hVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f8425s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        pu0 pu0Var = this.f8414g;
        GLES20.glViewport(0, 0, (int) pu0Var.f29435a, (int) pu0Var.f29436b);
        d1 d1Var = (d1) this.f8424r.get(hVar.i(1));
        if (d1Var == null) {
            return null;
        }
        GLES20.glUseProgram(d1Var.f8293a);
        GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f8429x));
        GLES20.glUniform1i(d1Var.d("texture"), 0);
        GLES20.glUniform1i(d1Var.d("mask"), 1);
        d1.a(d1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((hVar instanceof b) && this.f8431z != null) {
            GLES20.glUniform1i(d1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f8431z.c());
        }
        if (hVar instanceof g) {
            GLES20.glUniform1i(d1Var.d("type"), f1Var.f8299a.o());
            GLES20.glUniform2f(d1Var.d("resolution"), pu0Var.f29435a, pu0Var.f29436b);
            GLES20.glUniform2f(d1Var.d("center"), f1Var.f8300b, f1Var.f8301c);
            GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.e);
            GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f8302f);
            GLES20.glUniform1f(d1Var.d("rounding"), f1Var.f8303g);
            GLES20.glUniform2f(d1Var.d("middle"), f1Var.f8304i, f1Var.f8305j);
            GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
            GLES20.glUniform1i(d1Var.d("fill"), f1Var.f8307l ? 1 : 0);
            GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.f8306k);
            GLES20.glUniform1i(d1Var.d("composite"), 1);
            GLES20.glUniform1i(d1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f8419m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f8420n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        a4.l lVar = this.f8410a;
        if (lVar != null && this.f8425s <= 0) {
            lVar.u();
        }
        this.f8425s--;
        v0 v0Var = this.e;
        v0Var.h = 0;
        v0Var.f8492g = 0.0d;
        ByteBuffer byteBuffer = v0Var.f8494j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f8411b = null;
        this.f8412c = null;
        return m10;
    }

    public final RectF f() {
        pu0 pu0Var = this.f8414g;
        return new RectF(0.0f, 0.0f, pu0Var.f29435a, pu0Var.f29436b);
    }

    public final int g() {
        if (this.f8422p == 0) {
            this.f8422p = r1.b(this.f8414g);
        }
        return this.f8422p;
    }

    public final n4.q h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j10;
        r1 r1Var;
        n4.q qVar;
        d1 d1Var;
        int i10;
        int j11;
        r1 r1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f8426t, 0);
        int i13 = this.f8426t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f8426t, 0);
        int i14 = this.f8426t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        pu0 pu0Var = this.f8414g;
        GLES20.glViewport(0, 0, (int) pu0Var.f29435a, (int) pu0Var.f29436b);
        Map map = this.f8424r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            d1 d1Var2 = (d1) map.get(str);
            if (d1Var2 != null) {
                GLES20.glUseProgram(d1Var2.f8293a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = f8.c(this.f8429x, f8.a(matrix));
                GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(d1Var2.d("texture"), 1);
                    GLES20.glUniform1i(d1Var2.d("mask"), 0);
                    GLES20.glUniform1f(d1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (r1Var2 = this.D) != null) {
                        j11 = r1Var2.c();
                    } else {
                        j11 = j();
                    }
                    GLES20.glBindTexture(3553, j11);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f8418l.c());
                } else {
                    GLES20.glUniform1i(d1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (r1Var = this.D) != null) {
                        j10 = r1Var.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f8419m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f8420n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (d1Var = (d1) this.f8424r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(d1Var.f8293a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    x9 x9Var = this.F.f30202m;
                    if (x9Var != null) {
                        i10 = x9Var.f32444s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f8419m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f8420n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f8427u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f8427u);
                if (z10) {
                    qVar = new n4.q(null, this.f8427u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f8427u);
                    qVar = new n4.q(createBitmap, null);
                }
                this.f8427u.rewind();
                int[] iArr = this.f8426t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f8426t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return qVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f8421o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f8421o = iArr[0];
            h8.a();
        }
        return this.f8421o;
    }

    public final int j() {
        r1 r1Var = this.f8417k;
        if (r1Var != null) {
            return r1Var.c();
        }
        return 0;
    }

    public final void k(f1 f1Var) {
        if (f1Var == null) {
            return;
        }
        this.f8413f.f(new l0(this, f1Var, 0));
    }

    public final void l(r0 r0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        float a2;
        int size;
        float atan2;
        u0 u0Var;
        float f7;
        double d;
        boolean z12;
        u0 u0Var2;
        float f10;
        u0[] u0VarArr;
        double d10;
        float f11;
        float f12;
        float f13;
        char c10;
        char c11;
        float f14;
        this.f8411b = r0Var;
        if (r0Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            h8.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                pu0 pu0Var = this.f8414g;
                GLES20.glViewport(0, 0, (int) pu0Var.f29435a, (int) pu0Var.f29436b);
                float f15 = 0.0f;
                if (z10) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                }
                Map map = this.f8424r;
                if (map != null) {
                    h hVar = r0Var.e;
                    int i12 = 2;
                    d1 d1Var = (d1) map.get(hVar.i(2));
                    if (d1Var == null) {
                        return;
                    }
                    GLES20.glUseProgram(d1Var.f8293a);
                    r1 r1Var = (r1) this.f8416j.get(Integer.valueOf(hVar.l()));
                    if (r1Var == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        r1Var = new r1(BitmapFactory.decodeResource(org.telegram.messenger.w0.f19025b.getResources(), hVar.l(), options));
                        this.f8416j.put(Integer.valueOf(hVar.l()), r1Var);
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, r1Var.c());
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f8429x));
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    if (!z11) {
                        this.e.f8491f = this.f8413f.getScaleX();
                    } else {
                        this.e.f8491f = 1.0f;
                    }
                    v0 v0Var = this.e;
                    v0Var.f8488a = r0Var.d;
                    v0Var.f8489b = r0Var.e.k();
                    if (z11) {
                        a2 = 1.0f;
                    } else {
                        a2 = r0Var.e.a();
                    }
                    v0Var.f8490c = a2;
                    v0Var.d = r0Var.e.b();
                    v0Var.e = r0Var.e.h();
                    Vector vector = r0Var.f8437b;
                    if (vector == null) {
                        size = 0;
                    } else {
                        size = vector.size();
                    }
                    if (size == 0) {
                        i10 = 0;
                    } else {
                        if (size == 1) {
                            Vector vector2 = r0Var.f8437b;
                            u0[] u0VarArr2 = new u0[vector2.size()];
                            vector2.toArray(u0VarArr2);
                            u0 u0Var3 = u0VarArr2[0];
                            float f16 = ((v0Var.f8488a * v0Var.e) * 1.0f) / v0Var.f8491f;
                            u0Var3.getClass();
                            PointF pointF = new PointF((float) u0Var3.f8480a, (float) u0Var3.f8481b);
                            if (Math.abs(v0Var.d) > 0.0f) {
                                f14 = v0Var.d;
                            } else {
                                f14 = 0.0f;
                            }
                            float f17 = v0Var.f8490c;
                            v0Var.c();
                            v0Var.b(1);
                            v0Var.a(pointF, f16, f14, f17, 0);
                        } else {
                            Vector vector3 = r0Var.f8437b;
                            int size2 = vector3.size();
                            u0[] u0VarArr3 = new u0[size2];
                            vector3.toArray(u0VarArr3);
                            v0Var.c();
                            int i13 = 0;
                            while (i13 < size2 - 1) {
                                u0 u0Var4 = u0VarArr3[i13];
                                int i14 = i13 + 1;
                                u0 u0Var5 = u0VarArr3[i14];
                                double a10 = u0Var4.a(u0Var5);
                                int i15 = size2;
                                float f18 = f15;
                                double d11 = u0Var5.f8480a - u0Var4.f8480a;
                                int i16 = i12;
                                double d12 = u0Var5.f8481b - u0Var4.f8481b;
                                double d13 = u0Var5.f8482c;
                                double d14 = d13 - u0Var4.f8482c;
                                u0 u0Var6 = new u0(1.0d, 1.0d, 0.0d);
                                if (Math.abs(v0Var.d) > f18) {
                                    atan2 = v0Var.d;
                                } else {
                                    atan2 = (float) Math.atan2(d12, d11);
                                }
                                float f19 = (float) ((((v0Var.f8488a * d13) * v0Var.e) * 1.0d) / v0Var.f8491f);
                                double max = Math.max(1.0f, v0Var.f8489b * f19);
                                if (a10 > 0.0d) {
                                    double d15 = 1.0d / a10;
                                    u0Var = new u0(d11 * d15, d12 * d15, d14 * d15);
                                } else {
                                    u0Var = u0Var6;
                                }
                                float min = Math.min(1.0f, v0Var.f8490c * 1.15f);
                                boolean z13 = u0Var4.d;
                                boolean z14 = u0Var5.d;
                                float f20 = atan2;
                                int i17 = v0Var.h;
                                v0Var.b((int) Math.ceil((a10 - v0Var.f8492g) / max));
                                ByteBuffer byteBuffer = v0Var.f8494j;
                                if (byteBuffer != null && i17 >= 0) {
                                    f7 = f19;
                                    if (i17 < v0Var.f8493i) {
                                        byteBuffer.position(i17 * 20);
                                    }
                                } else {
                                    f7 = f19;
                                }
                                double d16 = v0Var.f8492g;
                                u0 u0Var7 = new u0(u0Var4.f8480a + (u0Var.f8480a * d16), u0Var4.f8481b + (u0Var.f8481b * d16), u0Var4.f8482c + (u0Var.f8482c * d16));
                                double d17 = d16;
                                u0 u0Var8 = u0Var7;
                                boolean z15 = true;
                                while (true) {
                                    if (d17 <= a10) {
                                        if (z13) {
                                            f12 = min;
                                        } else {
                                            f12 = v0Var.f8490c;
                                        }
                                        d = d17;
                                        z12 = z14;
                                        u0[] u0VarArr4 = u0VarArr3;
                                        d10 = a10;
                                        f11 = f20;
                                        float f21 = f12;
                                        u0 u0Var9 = u0Var8;
                                        u0Var2 = u0Var5;
                                        f10 = f7;
                                        boolean a11 = v0Var.a(new PointF((float) u0Var8.f8480a, (float) u0Var8.f8481b), f10, f11, f21, -1);
                                        if (!a11) {
                                            u0VarArr = u0VarArr4;
                                            z15 = a11;
                                            break;
                                        }
                                        u0 u0Var10 = new u0(u0Var9.f8480a + (u0Var.f8480a * max), u0Var9.f8481b + (u0Var.f8481b * max), u0Var9.f8482c + (u0Var.f8482c * max));
                                        z15 = a11;
                                        f20 = f11;
                                        u0Var8 = u0Var10;
                                        a10 = d10;
                                        u0VarArr3 = u0VarArr4;
                                        z14 = z12;
                                        f7 = f10;
                                        u0Var5 = u0Var2;
                                        d17 = d + max;
                                        z13 = false;
                                    } else {
                                        d = d17;
                                        z12 = z14;
                                        u0Var2 = u0Var5;
                                        f10 = f7;
                                        u0VarArr = u0VarArr3;
                                        d10 = a10;
                                        f11 = f20;
                                        break;
                                    }
                                }
                                if (z15 && z12) {
                                    v0Var.b(1);
                                    v0Var.a(new PointF((float) u0Var2.f8480a, (float) u0Var2.f8481b), f10, f11, min, -1);
                                }
                                v0Var.f8492g = d - d10;
                                size2 = i15;
                                i13 = i14;
                                f15 = f18;
                                i12 = i16;
                                u0VarArr3 = u0VarArr;
                            }
                        }
                        float f22 = f15;
                        int i18 = i12;
                        r0Var.f8436a = v0Var.f8492g;
                        rectF = new RectF(f22, f22, f22, f22);
                        int i19 = v0Var.h;
                        if (i19 <= 0) {
                            i10 = 0;
                        } else {
                            int i20 = i19 - 1;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i20 * 2) + (i19 * 4)) * 20);
                            allocateDirect.order(ByteOrder.nativeOrder());
                            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                            asFloatBuffer.position(0);
                            ByteBuffer byteBuffer2 = v0Var.f8494j;
                            if (byteBuffer2 != null && v0Var.f8493i > 0) {
                                byteBuffer2.position(0);
                            }
                            int i21 = 0;
                            for (int i22 = 0; i22 < i19; i22++) {
                                float f23 = v0Var.f8494j.getFloat();
                                float f24 = v0Var.f8494j.getFloat();
                                float f25 = v0Var.f8494j.getFloat();
                                float f26 = v0Var.f8494j.getFloat();
                                float f27 = v0Var.f8494j.getFloat();
                                RectF rectF2 = new RectF(f23 - f25, f24 - f25, f23 + f25, f24 + f25);
                                float f28 = rectF2.left;
                                float f29 = rectF2.top;
                                float f30 = rectF2.right;
                                float f31 = rectF2.bottom;
                                float[] fArr = new float[8];
                                fArr[0] = f28;
                                fArr[1] = f29;
                                fArr[i18] = f30;
                                fArr[3] = f29;
                                fArr[4] = f28;
                                fArr[5] = f31;
                                fArr[6] = f30;
                                fArr[7] = f31;
                                float centerX = rectF2.centerX();
                                float centerY = rectF2.centerY();
                                Matrix matrix = new Matrix();
                                matrix.setRotate((float) Math.toDegrees(f26), centerX, centerY);
                                matrix.mapPoints(fArr);
                                matrix.mapRect(rectF2);
                                rectF2.left = (int) Math.floor(rectF2.left);
                                rectF2.top = (int) Math.floor(rectF2.top);
                                rectF2.right = (int) Math.ceil(rectF2.right);
                                rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                                rectF.union(rectF2);
                                if (i21 != 0) {
                                    c10 = 0;
                                    asFloatBuffer.put(fArr[0]);
                                    c11 = 1;
                                    asFloatBuffer.put(fArr[1]);
                                    f13 = 0.0f;
                                    asFloatBuffer.put(0.0f);
                                    asFloatBuffer.put(0.0f);
                                    asFloatBuffer.put(f27);
                                    i21++;
                                } else {
                                    f13 = 0.0f;
                                    c10 = 0;
                                    c11 = 1;
                                }
                                asFloatBuffer.put(fArr[c10]);
                                asFloatBuffer.put(fArr[c11]);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(f27);
                                asFloatBuffer.put(fArr[i18]);
                                asFloatBuffer.put(fArr[3]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(f27);
                                asFloatBuffer.put(fArr[4]);
                                asFloatBuffer.put(fArr[5]);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f27);
                                asFloatBuffer.put(fArr[6]);
                                asFloatBuffer.put(fArr[7]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f27);
                                int i23 = i21 + 4;
                                if (i22 != i20) {
                                    asFloatBuffer.put(fArr[6]);
                                    asFloatBuffer.put(fArr[7]);
                                    asFloatBuffer.put(1.0f);
                                    asFloatBuffer.put(1.0f);
                                    asFloatBuffer.put(f27);
                                    i21 += 5;
                                } else {
                                    i21 = i23;
                                }
                            }
                            asFloatBuffer.position(0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(0);
                            asFloatBuffer.position(i18);
                            GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(1);
                            asFloatBuffer.position(4);
                            GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(2);
                            i10 = 0;
                            GLES20.glDrawArrays(5, 0, i21);
                        }
                    }
                    i11 = 36160;
                } else {
                    return;
                }
            } else {
                i10 = 0;
                i11 = 36160;
            }
            GLES20.glBindFramebuffer(i11, i10);
            a4.l lVar = this.f8410a;
            if (lVar != null) {
                lVar.u();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f8410a.f279b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f13527b, z10 ? 1 : 0, rectF);
        ((c1) this.f8410a.f279b).f8283b.b(UUID.randomUUID(), new n0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, ig.r0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ig.q0.n(int, ig.r0, float):void");
    }

    public final void o(int i10, int i11, f1 f1Var, float f7) {
        d1 d1Var;
        int currentColor;
        int i12;
        if (f1Var != null) {
            h hVar = this.f8415i;
            g gVar = f1Var.f8299a;
            if (gVar != null && i10 == this.f8423q) {
                hVar = gVar;
            }
            if (hVar != null && this.f8413f != null && (d1Var = (d1) this.f8424r.get(hVar.i(0))) != null) {
                GLES20.glUseProgram(d1Var.f8293a);
                GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f8430y));
                GLES20.glUniform1i(d1Var.d("texture"), 0);
                GLES20.glUniform1i(d1Var.d("mask"), 1);
                d1.a(d1Var.d("color"), i0.b.o(this.f8413f.getCurrentColor(), (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (hVar instanceof g) {
                    GLES20.glUniform1i(d1Var.d("type"), ((g) hVar).o());
                    int d = d1Var.d("resolution");
                    pu0 pu0Var = this.f8414g;
                    GLES20.glUniform2f(d, pu0Var.f29435a, pu0Var.f29436b);
                    GLES20.glUniform2f(d1Var.d("center"), f1Var.f8300b, f1Var.f8301c);
                    GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.e);
                    GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f8302f);
                    GLES20.glUniform1f(d1Var.d("rounding"), f1Var.f8303g);
                    GLES20.glUniform2f(d1Var.d("middle"), f1Var.f8304i, f1Var.f8305j);
                    GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
                    GLES20.glUniform1i(d1Var.d("fill"), f1Var.f8307l ? 1 : 0);
                    GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.f8306k);
                    GLES20.glUniform1i(d1Var.d("composite"), 0);
                    int d10 = d1Var.d("clear");
                    if (f1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f8419m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f8420n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                h8.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        a4.l lVar;
        r1 r1Var;
        if (aVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) aVar.d);
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
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                byteBuffer = null;
            }
            int j10 = j();
            if (aVar.f281b == 1 && (r1Var = this.D) != null) {
                j10 = r1Var.c();
            }
            GLES20.glBindTexture(3553, j10);
            RectF rectF = (RectF) aVar.f282c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f282c).height(), 6408, 5121, byteBuffer);
            if (this.f8425s <= 0 && (lVar = this.f8410a) != null) {
                lVar.u();
            }
            if (z10 && (file = (File) aVar.d) != null) {
                file.delete();
                aVar.d = null;
            }
        }
    }

    public final void q(h hVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.f8415i = hVar;
        if ((hVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
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
            c1 c1Var = this.f8413f;
            if (c1Var != null && (c10 = c1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            r1 r1Var = this.f8431z;
            if (r1Var != null) {
                r1Var.a(false);
            }
            this.f8431z = new r1(this.C);
        }
    }
}
