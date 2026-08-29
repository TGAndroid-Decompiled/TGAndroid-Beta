package ag;

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
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.ma;
public final class f1 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public l2 D;
    public boolean E;
    public final ga F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public o1 f469a;
    public g1 f470b;
    public w1 f471c;
    public w1 d;
    public t1 f473f;
    public final bv0 f474g;
    public RectF h;
    public m f475i;
    public l2 f477k;
    public l2 f478l;
    public final ByteBuffer f479m;
    public final ByteBuffer f480n;
    public int f481o;
    public int f482p;
    public int f483q;
    public Map f484r;
    public int f485s;
    public final ByteBuffer f487u;
    public boolean v;
    public j2 f488w;
    public final float[] f489x;
    public float[] f490y;
    public l2 f491z;
    public final HashMap f476j = new HashMap();
    public final int[] f486t = new int[1];
    public boolean G = false;
    public final k1 f472e = new Object();

    public f1(bv0 bv0Var, Bitmap bitmap, int i10, ga gaVar) {
        this.F = gaVar;
        this.f474g = bv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f487u = ByteBuffer.allocateDirect(((int) bv0Var.f27238a) * ((int) bv0Var.f27239b) * 4);
        this.f489x = h7.r.b(bv0Var.f27238a, bv0Var.f27239b);
        if (this.f479m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f479m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f479m.putFloat(0.0f);
        this.f479m.putFloat(0.0f);
        this.f479m.putFloat(bv0Var.f27238a);
        this.f479m.putFloat(0.0f);
        this.f479m.putFloat(0.0f);
        this.f479m.putFloat(bv0Var.f27239b);
        this.f479m.putFloat(bv0Var.f27238a);
        this.f479m.putFloat(bv0Var.f27239b);
        this.f479m.rewind();
        if (this.f480n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f480n = allocateDirect2;
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
        int i10 = this.f481o;
        int[] iArr = this.f486t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f481o = 0;
        }
        l2 l2Var = this.f477k;
        if (l2Var != null) {
            l2Var.a(z10);
        }
        l2 l2Var2 = this.D;
        if (l2Var2 != null) {
            l2Var2.a(z10);
        }
        int i11 = this.f482p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f482p = 0;
        }
        HashMap hashMap = this.f476j;
        for (l2 l2Var3 : hashMap.values()) {
            if (l2Var3 != null) {
                l2Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f483q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f483q = 0;
        }
        l2 l2Var4 = this.f491z;
        if (l2Var4 != null) {
            l2Var4.a(true);
        }
        l2 l2Var5 = this.f478l;
        if (l2Var5 != null) {
            l2Var5.a(true);
        }
        Map map = this.f484r;
        if (map != null) {
            for (u1 u1Var : map.values()) {
                if (u1Var.f677a != 0) {
                    GLES20.glDeleteProgram(0);
                    u1Var.f677a = 0;
                }
            }
            this.f484r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        h7.t.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            bv0 bv0Var = this.f474g;
            GLES20.glViewport(0, 0, (int) bv0Var.f27238a, (int) bv0Var.f27239b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        o1 o1Var = this.f469a;
        if (o1Var != null) {
            o1Var.c();
        }
        k1 k1Var = this.f472e;
        k1Var.h = 0;
        k1Var.f568g = 0.0d;
        ByteBuffer byteBuffer = k1Var.f570j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f470b = null;
        this.J = 0.0f;
    }

    public final void c(g1 g1Var, int i10, boolean z10, h0 h0Var) {
        if (this.f484r != null && this.f475i != null) {
            this.f473f.f(new d1(this, g1Var, i10, z10, h0Var));
        }
    }

    public final ag.j2 d(ag.g1 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: ag.f1.d(ag.g1, int, android.graphics.RectF):ag.j2");
    }

    public final j2 e(w1 w1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = w1Var.f694a;
        if (mVar == null) {
            mVar = this.f475i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        j2 m10 = m(rectF, z10);
        this.f485s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        bv0 bv0Var = this.f474g;
        GLES20.glViewport(0, 0, (int) bv0Var.f27238a, (int) bv0Var.f27239b);
        u1 u1Var = (u1) this.f484r.get(mVar.i(1));
        if (u1Var == null) {
            return null;
        }
        GLES20.glUseProgram(u1Var.f677a);
        GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f489x));
        GLES20.glUniform1i(u1Var.d("texture"), 0);
        GLES20.glUniform1i(u1Var.d("mask"), 1);
        u1.a(u1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f491z != null) {
            GLES20.glUniform1i(u1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f491z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(u1Var.d("type"), w1Var.f694a.o());
            GLES20.glUniform2f(u1Var.d("resolution"), bv0Var.f27238a, bv0Var.f27239b);
            GLES20.glUniform2f(u1Var.d("center"), w1Var.f695b, w1Var.f696c);
            GLES20.glUniform2f(u1Var.d("radius"), w1Var.d, w1Var.f697e);
            GLES20.glUniform1f(u1Var.d("thickness"), w1Var.f698f);
            GLES20.glUniform1f(u1Var.d("rounding"), w1Var.f699g);
            GLES20.glUniform2f(u1Var.d("middle"), w1Var.f700i, w1Var.f701j);
            GLES20.glUniform1f(u1Var.d("rotation"), w1Var.h);
            GLES20.glUniform1i(u1Var.d("fill"), w1Var.f703l ? 1 : 0);
            GLES20.glUniform1f(u1Var.d("arrowTriangleLength"), w1Var.f702k);
            GLES20.glUniform1i(u1Var.d("composite"), 1);
            GLES20.glUniform1i(u1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f479m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f480n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        o1 o1Var = this.f469a;
        if (o1Var != null && this.f485s <= 0) {
            o1Var.c();
        }
        this.f485s--;
        k1 k1Var = this.f472e;
        k1Var.h = 0;
        k1Var.f568g = 0.0d;
        ByteBuffer byteBuffer = k1Var.f570j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f470b = null;
        this.f471c = null;
        return m10;
    }

    public final RectF f() {
        bv0 bv0Var = this.f474g;
        return new RectF(0.0f, 0.0f, bv0Var.f27238a, bv0Var.f27239b);
    }

    public final int g() {
        if (this.f482p == 0) {
            this.f482p = l2.b(this.f474g);
        }
        return this.f482p;
    }

    public final ze.b h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j10;
        l2 l2Var;
        ze.b bVar;
        u1 u1Var;
        int i10;
        int j11;
        l2 l2Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f486t, 0);
        int i13 = this.f486t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f486t, 0);
        int i14 = this.f486t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        bv0 bv0Var = this.f474g;
        GLES20.glViewport(0, 0, (int) bv0Var.f27238a, (int) bv0Var.f27239b);
        Map map = this.f484r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            u1 u1Var2 = (u1) map.get(str);
            if (u1Var2 != null) {
                GLES20.glUseProgram(u1Var2.f677a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c3 = h7.r.c(this.f489x, h7.r.a(matrix));
                GLES20.glUniformMatrix4fv(u1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(u1Var2.d("texture"), 1);
                    GLES20.glUniform1i(u1Var2.d("mask"), 0);
                    GLES20.glUniform1f(u1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (l2Var2 = this.D) != null) {
                        j11 = l2Var2.c();
                    } else {
                        j11 = j();
                    }
                    GLES20.glBindTexture(3553, j11);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f478l.c());
                } else {
                    GLES20.glUniform1i(u1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (l2Var = this.D) != null) {
                        j10 = l2Var.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f479m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f480n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (u1Var = (u1) this.f484r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(u1Var.f677a);
                    GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                    GLES20.glUniform1f(u1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(u1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(u1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ma maVar = this.F.f28858m;
                    if (maVar != null) {
                        i10 = maVar.f30625s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(u1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(u1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f479m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f480n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f487u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f487u);
                if (z10) {
                    bVar = new ze.b((Object) null, this.f487u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f487u);
                    bVar = new ze.b(createBitmap, (Object) null);
                }
                this.f487u.rewind();
                int[] iArr = this.f486t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f486t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return bVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f481o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f481o = iArr[0];
            h7.t.a();
        }
        return this.f481o;
    }

    public final int j() {
        l2 l2Var = this.f477k;
        if (l2Var != null) {
            return l2Var.c();
        }
        return 0;
    }

    public final void k(w1 w1Var) {
        if (w1Var == null) {
            return;
        }
        this.f473f.f(new a1(this, w1Var, 0));
    }

    public final void l(ag.g1 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: ag.f1.l(ag.g1, boolean, boolean):void");
    }

    public final j2 m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f469a.f624b;
        j2 j2Var = new j2((ByteBuffer) h(rectF, true, z10, false).f50825b, z10 ? 1 : 0, rectF);
        ((t1) this.f469a.f624b).f659b.b(UUID.randomUUID(), new c1(this, j2Var, 1));
        return j2Var;
    }

    public final void n(int r19, ag.g1 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: ag.f1.n(int, ag.g1, float):void");
    }

    public final void o(int i10, int i11, w1 w1Var, float f9) {
        u1 u1Var;
        int i12;
        if (w1Var != null) {
            m mVar = this.f475i;
            l lVar = w1Var.f694a;
            if (lVar != null && i10 == this.f483q) {
                mVar = lVar;
            }
            if (mVar != null && this.f473f != null && (u1Var = (u1) this.f484r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(u1Var.f677a);
                GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f490y));
                GLES20.glUniform1i(u1Var.d("texture"), 0);
                GLES20.glUniform1i(u1Var.d("mask"), 1);
                int currentColor = this.f473f.getCurrentColor();
                u1.a(u1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f9)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(u1Var.d("type"), ((l) mVar).o());
                    int d = u1Var.d("resolution");
                    bv0 bv0Var = this.f474g;
                    GLES20.glUniform2f(d, bv0Var.f27238a, bv0Var.f27239b);
                    GLES20.glUniform2f(u1Var.d("center"), w1Var.f695b, w1Var.f696c);
                    GLES20.glUniform2f(u1Var.d("radius"), w1Var.d, w1Var.f697e);
                    GLES20.glUniform1f(u1Var.d("thickness"), w1Var.f698f);
                    GLES20.glUniform1f(u1Var.d("rounding"), w1Var.f699g);
                    GLES20.glUniform2f(u1Var.d("middle"), w1Var.f700i, w1Var.f701j);
                    GLES20.glUniform1f(u1Var.d("rotation"), w1Var.h);
                    GLES20.glUniform1i(u1Var.d("fill"), w1Var.f703l ? 1 : 0);
                    GLES20.glUniform1f(u1Var.d("arrowTriangleLength"), w1Var.f702k);
                    GLES20.glUniform1i(u1Var.d("composite"), 0);
                    int d10 = u1Var.d("clear");
                    if (w1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f479m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f480n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                h7.t.a();
            }
        }
    }

    public final void p(j2 j2Var, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        o1 o1Var;
        l2 l2Var;
        if (j2Var != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) j2Var.d);
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
            } catch (Exception e10) {
                FileLog.e(e10);
                byteBuffer = null;
            }
            int j10 = j();
            if (j2Var.f558b == 1 && (l2Var = this.D) != null) {
                j10 = l2Var.c();
            }
            GLES20.glBindTexture(3553, j10);
            RectF rectF = (RectF) j2Var.f559c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) j2Var.f559c).height(), 6408, 5121, byteBuffer);
            if (this.f485s <= 0 && (o1Var = this.f469a) != null) {
                o1Var.c();
            }
            if (z10 && (file = (File) j2Var.d) != null) {
                file.delete();
                j2Var.d = null;
            }
        }
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap c3;
        this.f475i = mVar;
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
            t1 t1Var = this.f473f;
            if (t1Var != null && (c3 = t1Var.c(false, false)) != null) {
                canvas.scale(width / c3.getWidth(), height / c3.getHeight());
                canvas.drawBitmap(c3, 0.0f, 0.0f, this.M);
                c3.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            l2 l2Var = this.f491z;
            if (l2Var != null) {
                l2Var.a(false);
            }
            this.f491z = new l2(this.C);
        }
    }
}
