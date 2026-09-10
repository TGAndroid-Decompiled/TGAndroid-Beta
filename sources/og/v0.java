package og;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
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
import java.util.zip.Inflater;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.tv0;
public final class v0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public w1 D;
    public boolean E;
    public final ia F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public l2.h f14512a;
    public w0 f14513b;
    public k1 f14514c;
    public k1 d;
    public h1 f14515f;
    public final tv0 f14516g;
    public RectF h;
    public m f14517i;
    public w1 f14519k;
    public w1 f14520l;
    public final ByteBuffer f14521m;
    public final ByteBuffer f14522n;
    public int f14523o;
    public int f14524p;
    public int f14525q;
    public Map f14526r;
    public int f14527s;
    public final ByteBuffer f14529u;
    public boolean v;
    public a5.a f14530w;
    public final float[] f14531x;
    public float[] f14532y;
    public w1 f14533z;
    public final HashMap f14518j = new HashMap();
    public final int[] f14528t = new int[1];
    public boolean G = false;
    public final a1 e = new Object();

    public v0(tv0 tv0Var, Bitmap bitmap, int i10, ia iaVar) {
        this.F = iaVar;
        this.f14516g = tv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f14529u = ByteBuffer.allocateDirect(((int) tv0Var.f27499a) * ((int) tv0Var.f27500b) * 4);
        this.f14531x = w7.h0.b(tv0Var.f27499a, tv0Var.f27500b);
        if (this.f14521m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f14521m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f14521m.putFloat(0.0f);
        this.f14521m.putFloat(0.0f);
        this.f14521m.putFloat(tv0Var.f27499a);
        this.f14521m.putFloat(0.0f);
        this.f14521m.putFloat(0.0f);
        this.f14521m.putFloat(tv0Var.f27500b);
        this.f14521m.putFloat(tv0Var.f27499a);
        this.f14521m.putFloat(tv0Var.f27500b);
        this.f14521m.rewind();
        if (this.f14522n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f14522n = allocateDirect2;
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
        int i10 = this.f14523o;
        int[] iArr = this.f14528t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f14523o = 0;
        }
        w1 w1Var = this.f14519k;
        if (w1Var != null) {
            w1Var.a(z10);
        }
        w1 w1Var2 = this.D;
        if (w1Var2 != null) {
            w1Var2.a(z10);
        }
        int i11 = this.f14524p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f14524p = 0;
        }
        HashMap hashMap = this.f14518j;
        for (w1 w1Var3 : hashMap.values()) {
            if (w1Var3 != null) {
                w1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f14525q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f14525q = 0;
        }
        w1 w1Var4 = this.f14533z;
        if (w1Var4 != null) {
            w1Var4.a(true);
        }
        w1 w1Var5 = this.f14520l;
        if (w1Var5 != null) {
            w1Var5.a(true);
        }
        Map map = this.f14526r;
        if (map != null) {
            for (i1 i1Var : map.values()) {
                if (i1Var.f14399a != 0) {
                    GLES20.glDeleteProgram(0);
                    i1Var.f14399a = 0;
                }
            }
            this.f14526r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        w7.j0.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            tv0 tv0Var = this.f14516g;
            GLES20.glViewport(0, 0, (int) tv0Var.f27499a, (int) tv0Var.f27500b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        l2.h hVar = this.f14512a;
        if (hVar != null) {
            hVar.n();
        }
        a1 a1Var = this.e;
        a1Var.h = 0;
        a1Var.f14326g = 0.0d;
        ByteBuffer byteBuffer = a1Var.f14328j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f14513b = null;
        this.J = 0.0f;
    }

    public final void c(w0 w0Var, int i10, boolean z10, c0 c0Var) {
        if (this.f14526r != null && this.f14517i != null) {
            this.f14515f.f(new m4.f0(this, w0Var, i10, z10, c0Var));
        }
    }

    public final a5.a d(og.w0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: og.v0.d(og.w0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(k1 k1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = k1Var.f14405a;
        if (mVar == null) {
            mVar = this.f14517i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f14527s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        tv0 tv0Var = this.f14516g;
        GLES20.glViewport(0, 0, (int) tv0Var.f27499a, (int) tv0Var.f27500b);
        i1 i1Var = (i1) this.f14526r.get(mVar.i(1));
        if (i1Var == null) {
            return null;
        }
        GLES20.glUseProgram(i1Var.f14399a);
        GLES20.glUniformMatrix4fv(i1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f14531x));
        GLES20.glUniform1i(i1Var.d("texture"), 0);
        GLES20.glUniform1i(i1Var.d("mask"), 1);
        i1.a(i1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f14533z != null) {
            GLES20.glUniform1i(i1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f14533z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(i1Var.d("type"), k1Var.f14405a.o());
            GLES20.glUniform2f(i1Var.d("resolution"), tv0Var.f27499a, tv0Var.f27500b);
            GLES20.glUniform2f(i1Var.d("center"), k1Var.f14406b, k1Var.f14407c);
            GLES20.glUniform2f(i1Var.d("radius"), k1Var.d, k1Var.e);
            GLES20.glUniform1f(i1Var.d("thickness"), k1Var.f14408f);
            GLES20.glUniform1f(i1Var.d("rounding"), k1Var.f14409g);
            GLES20.glUniform2f(i1Var.d("middle"), k1Var.f14410i, k1Var.f14411j);
            GLES20.glUniform1f(i1Var.d("rotation"), k1Var.h);
            GLES20.glUniform1i(i1Var.d("fill"), k1Var.f14413l ? 1 : 0);
            GLES20.glUniform1f(i1Var.d("arrowTriangleLength"), k1Var.f14412k);
            GLES20.glUniform1i(i1Var.d("composite"), 1);
            GLES20.glUniform1i(i1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f14521m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f14522n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        l2.h hVar = this.f14512a;
        if (hVar != null && this.f14527s <= 0) {
            hVar.n();
        }
        this.f14527s--;
        a1 a1Var = this.e;
        a1Var.h = 0;
        a1Var.f14326g = 0.0d;
        ByteBuffer byteBuffer = a1Var.f14328j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f14513b = null;
        this.f14514c = null;
        return m10;
    }

    public final RectF f() {
        tv0 tv0Var = this.f14516g;
        return new RectF(0.0f, 0.0f, tv0Var.f27499a, tv0Var.f27500b);
    }

    public final int g() {
        if (this.f14524p == 0) {
            this.f14524p = w1.b(this.f14516g);
        }
        return this.f14524p;
    }

    public final u0 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        w1 w1Var;
        u0 u0Var;
        i1 i1Var;
        int i10;
        int j10;
        w1 w1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f14528t, 0);
        int i13 = this.f14528t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f14528t, 0);
        int i14 = this.f14528t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        tv0 tv0Var = this.f14516g;
        GLES20.glViewport(0, 0, (int) tv0Var.f27499a, (int) tv0Var.f27500b);
        Map map = this.f14526r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            i1 i1Var2 = (i1) map.get(str);
            if (i1Var2 != null) {
                GLES20.glUseProgram(i1Var2.f14399a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = w7.h0.c(this.f14531x, w7.h0.a(matrix));
                GLES20.glUniformMatrix4fv(i1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(i1Var2.d("texture"), 1);
                    GLES20.glUniform1i(i1Var2.d("mask"), 0);
                    GLES20.glUniform1f(i1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (w1Var2 = this.D) != null) {
                        j10 = w1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f14520l.c());
                } else {
                    GLES20.glUniform1i(i1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (w1Var = this.D) != null) {
                        j3 = w1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f14521m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f14522n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (i1Var = (i1) this.f14526r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(i1Var.f14399a);
                    GLES20.glUniformMatrix4fv(i1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(i1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(i1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(i1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    oa oaVar = this.F.f23972m;
                    if (oaVar != null) {
                        i10 = oaVar.f25751s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(i1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(i1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f14521m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f14522n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f14529u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f14529u);
                if (z10) {
                    u0Var = new u0(0, (Object) null, this.f14529u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f14529u);
                    u0Var = new u0(0, createBitmap, (Object) null);
                }
                this.f14529u.rewind();
                int[] iArr = this.f14528t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f14528t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return u0Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f14523o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f14523o = iArr[0];
            w7.j0.a();
        }
        return this.f14523o;
    }

    public final int j() {
        w1 w1Var = this.f14519k;
        if (w1Var != null) {
            return w1Var.c();
        }
        return 0;
    }

    public final void k(k1 k1Var) {
        if (k1Var == null) {
            return;
        }
        this.f14515f.f(new q0(this, k1Var, 0));
    }

    public final void l(og.w0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: og.v0.l(og.w0, boolean, boolean):void");
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f14512a.f12721b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f14498c, z10 ? 1 : 0, rectF);
        ((h1) this.f14512a.f12721b).f14389b.b(UUID.randomUUID(), new s0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, og.w0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: og.v0.n(int, og.w0, float):void");
    }

    public final void o(int i10, int i11, k1 k1Var, float f7) {
        i1 i1Var;
        int i12;
        if (k1Var != null) {
            m mVar = this.f14517i;
            l lVar = k1Var.f14405a;
            if (lVar != null && i10 == this.f14525q) {
                mVar = lVar;
            }
            if (mVar != null && this.f14515f != null && (i1Var = (i1) this.f14526r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(i1Var.f14399a);
                GLES20.glUniformMatrix4fv(i1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f14532y));
                GLES20.glUniform1i(i1Var.d("texture"), 0);
                GLES20.glUniform1i(i1Var.d("mask"), 1);
                int currentColor = this.f14515f.getCurrentColor();
                i1.a(i1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(i1Var.d("type"), ((l) mVar).o());
                    int d = i1Var.d("resolution");
                    tv0 tv0Var = this.f14516g;
                    GLES20.glUniform2f(d, tv0Var.f27499a, tv0Var.f27500b);
                    GLES20.glUniform2f(i1Var.d("center"), k1Var.f14406b, k1Var.f14407c);
                    GLES20.glUniform2f(i1Var.d("radius"), k1Var.d, k1Var.e);
                    GLES20.glUniform1f(i1Var.d("thickness"), k1Var.f14408f);
                    GLES20.glUniform1f(i1Var.d("rounding"), k1Var.f14409g);
                    GLES20.glUniform2f(i1Var.d("middle"), k1Var.f14410i, k1Var.f14411j);
                    GLES20.glUniform1f(i1Var.d("rotation"), k1Var.h);
                    GLES20.glUniform1i(i1Var.d("fill"), k1Var.f14413l ? 1 : 0);
                    GLES20.glUniform1f(i1Var.d("arrowTriangleLength"), k1Var.f14412k);
                    GLES20.glUniform1i(i1Var.d("composite"), 0);
                    int d10 = i1Var.d("clear");
                    if (k1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f14521m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f14522n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                w7.j0.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        l2.h hVar;
        w1 w1Var;
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
                FileLog.e(e);
                byteBuffer = null;
            }
            int j3 = j();
            if (aVar.f275b == 1 && (w1Var = this.D) != null) {
                j3 = w1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f276c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f276c).height(), 6408, 5121, byteBuffer);
            if (this.f14527s <= 0 && (hVar = this.f14512a) != null) {
                hVar.n();
            }
            if (z10 && (file = (File) aVar.d) != null) {
                file.delete();
                aVar.d = null;
            }
        }
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.f14517i = mVar;
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
            h1 h1Var = this.f14515f;
            if (h1Var != null && (c10 = h1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            w1 w1Var = this.f14533z;
            if (w1Var != null) {
                w1Var.a(false);
            }
            this.f14533z = new w1(this.C);
        }
    }
}
