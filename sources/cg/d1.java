package cg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.GLES20;
import j7.n5;
import j7.p5;
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
public final class d1 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public g2 D;
    public boolean E;
    public final ba F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public o5.i f2317a;
    public e1 f2318b;
    public s1 f2319c;
    public s1 d;
    public p1 f2320f;
    public final jv0 f2321g;
    public RectF h;
    public m f2322i;
    public g2 f2324k;
    public g2 f2325l;
    public final ByteBuffer f2326m;
    public final ByteBuffer f2327n;
    public int f2328o;
    public int f2329p;
    public int f2330q;
    public Map f2331r;
    public int f2332s;
    public final ByteBuffer f2334u;
    public boolean v;
    public b4.e0 f2335w;
    public final float[] f2336x;
    public float[] f2337y;
    public g2 f2338z;
    public final HashMap f2323j = new HashMap();
    public final int[] f2333t = new int[1];
    public boolean G = false;
    public final i1 e = new Object();

    public d1(jv0 jv0Var, Bitmap bitmap, int i10, ba baVar) {
        this.F = baVar;
        this.f2321g = jv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f2334u = ByteBuffer.allocateDirect(((int) jv0Var.f26062a) * ((int) jv0Var.f26063b) * 4);
        this.f2336x = n5.b(jv0Var.f26062a, jv0Var.f26063b);
        if (this.f2326m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f2326m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f2326m.putFloat(0.0f);
        this.f2326m.putFloat(0.0f);
        this.f2326m.putFloat(jv0Var.f26062a);
        this.f2326m.putFloat(0.0f);
        this.f2326m.putFloat(0.0f);
        this.f2326m.putFloat(jv0Var.f26063b);
        this.f2326m.putFloat(jv0Var.f26062a);
        this.f2326m.putFloat(jv0Var.f26063b);
        this.f2326m.rewind();
        if (this.f2327n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f2327n = allocateDirect2;
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
        int i10 = this.f2328o;
        int[] iArr = this.f2333t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f2328o = 0;
        }
        g2 g2Var = this.f2324k;
        if (g2Var != null) {
            g2Var.a(z4);
        }
        g2 g2Var2 = this.D;
        if (g2Var2 != null) {
            g2Var2.a(z4);
        }
        int i11 = this.f2329p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f2329p = 0;
        }
        HashMap hashMap = this.f2323j;
        for (g2 g2Var3 : hashMap.values()) {
            if (g2Var3 != null) {
                g2Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f2330q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f2330q = 0;
        }
        g2 g2Var4 = this.f2338z;
        if (g2Var4 != null) {
            g2Var4.a(true);
        }
        g2 g2Var5 = this.f2325l;
        if (g2Var5 != null) {
            g2Var5.a(true);
        }
        Map map = this.f2331r;
        if (map != null) {
            for (q1 q1Var : map.values()) {
                if (q1Var.f2490a != 0) {
                    GLES20.glDeleteProgram(0);
                    q1Var.f2490a = 0;
                }
            }
            this.f2331r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        p5.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            jv0 jv0Var = this.f2321g;
            GLES20.glViewport(0, 0, (int) jv0Var.f26062a, (int) jv0Var.f26063b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        o5.i iVar = this.f2317a;
        if (iVar != null) {
            iVar.q();
        }
        i1 i1Var = this.e;
        i1Var.h = 0;
        i1Var.f2408g = 0.0d;
        ByteBuffer byteBuffer = i1Var.f2410j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f2318b = null;
        this.J = 0.0f;
    }

    public final void c(e1 e1Var, int i10, boolean z4, g0 g0Var) {
        if (this.f2331r != null && this.f2322i != null) {
            this.f2320f.f(new b1(this, e1Var, i10, z4, g0Var));
        }
    }

    public final b4.e0 d(cg.e1 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: cg.d1.d(cg.e1, int, android.graphics.RectF):b4.e0");
    }

    public final b4.e0 e(s1 s1Var, int i10, RectF rectF) {
        boolean z4;
        m mVar = s1Var.f2499a;
        if (mVar == null) {
            mVar = this.f2322i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z4 = true;
        } else {
            z4 = false;
        }
        b4.e0 m9 = m(rectF, z4);
        this.f2332s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        jv0 jv0Var = this.f2321g;
        GLES20.glViewport(0, 0, (int) jv0Var.f26062a, (int) jv0Var.f26063b);
        q1 q1Var = (q1) this.f2331r.get(mVar.i(1));
        if (q1Var == null) {
            return null;
        }
        GLES20.glUseProgram(q1Var.f2490a);
        GLES20.glUniformMatrix4fv(q1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f2336x));
        GLES20.glUniform1i(q1Var.d("texture"), 0);
        GLES20.glUniform1i(q1Var.d("mask"), 1);
        q1.a(q1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f2338z != null) {
            GLES20.glUniform1i(q1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f2338z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(q1Var.d("type"), s1Var.f2499a.o());
            GLES20.glUniform2f(q1Var.d("resolution"), jv0Var.f26062a, jv0Var.f26063b);
            GLES20.glUniform2f(q1Var.d("center"), s1Var.f2500b, s1Var.f2501c);
            GLES20.glUniform2f(q1Var.d("radius"), s1Var.d, s1Var.e);
            GLES20.glUniform1f(q1Var.d("thickness"), s1Var.f2502f);
            GLES20.glUniform1f(q1Var.d("rounding"), s1Var.f2503g);
            GLES20.glUniform2f(q1Var.d("middle"), s1Var.f2504i, s1Var.f2505j);
            GLES20.glUniform1f(q1Var.d("rotation"), s1Var.h);
            GLES20.glUniform1i(q1Var.d("fill"), s1Var.f2507l ? 1 : 0);
            GLES20.glUniform1f(q1Var.d("arrowTriangleLength"), s1Var.f2506k);
            GLES20.glUniform1i(q1Var.d("composite"), 1);
            GLES20.glUniform1i(q1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f2326m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f2327n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        o5.i iVar = this.f2317a;
        if (iVar != null && this.f2332s <= 0) {
            iVar.q();
        }
        this.f2332s--;
        i1 i1Var = this.e;
        i1Var.h = 0;
        i1Var.f2408g = 0.0d;
        ByteBuffer byteBuffer = i1Var.f2410j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f2318b = null;
        this.f2319c = null;
        return m9;
    }

    public final RectF f() {
        jv0 jv0Var = this.f2321g;
        return new RectF(0.0f, 0.0f, jv0Var.f26062a, jv0Var.f26063b);
    }

    public final int g() {
        if (this.f2329p == 0) {
            this.f2329p = g2.b(this.f2321g);
        }
        return this.f2329p;
    }

    public final af.c h(RectF rectF, boolean z4, boolean z10, boolean z11) {
        String str;
        int j10;
        g2 g2Var;
        af.c cVar;
        q1 q1Var;
        int i10;
        int j11;
        g2 g2Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f2333t, 0);
        int i13 = this.f2333t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f2333t, 0);
        int i14 = this.f2333t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        jv0 jv0Var = this.f2321g;
        GLES20.glViewport(0, 0, (int) jv0Var.f26062a, (int) jv0Var.f26063b);
        Map map = this.f2331r;
        if (map != null) {
            if (z4) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            q1 q1Var2 = (q1) map.get(str);
            if (q1Var2 != null) {
                GLES20.glUseProgram(q1Var2.f2490a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c3 = n5.c(this.f2336x, n5.a(matrix));
                GLES20.glUniformMatrix4fv(q1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                if (!z4 && this.G) {
                    GLES20.glUniform1i(q1Var2.d("texture"), 1);
                    GLES20.glUniform1i(q1Var2.d("mask"), 0);
                    GLES20.glUniform1f(q1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z10 && (g2Var2 = this.D) != null) {
                        j11 = g2Var2.c();
                    } else {
                        j11 = j();
                    }
                    GLES20.glBindTexture(3553, j11);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f2325l.c());
                } else {
                    GLES20.glUniform1i(q1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z10 && (g2Var = this.D) != null) {
                        j10 = g2Var.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f2326m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f2327n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z11 && !z10 && (q1Var = (q1) this.f2331r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(q1Var.f2490a);
                    GLES20.glUniformMatrix4fv(q1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                    GLES20.glUniform1f(q1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(q1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(q1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = this.F.f23602m;
                    if (haVar != null) {
                        i10 = haVar.f25367s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(q1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(q1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f2326m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f2327n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f2334u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f2334u);
                if (z4) {
                    cVar = new af.c(19, (Object) null, this.f2334u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f2334u);
                    cVar = new af.c(19, createBitmap, (Object) null);
                }
                this.f2334u.rewind();
                int[] iArr = this.f2333t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f2333t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return cVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f2328o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f2328o = iArr[0];
            p5.a();
        }
        return this.f2328o;
    }

    public final int j() {
        g2 g2Var = this.f2324k;
        if (g2Var != null) {
            return g2Var.c();
        }
        return 0;
    }

    public final void k(s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        this.f2320f.f(new y0(this, s1Var, 0));
    }

    public final void l(cg.e1 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: cg.d1.l(cg.e1, boolean, boolean):void");
    }

    public final b4.e0 m(RectF rectF, boolean z4) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f2317a.f16439b;
        b4.e0 e0Var = new b4.e0((ByteBuffer) h(rectF, true, z4, false).f157c, z4 ? 1 : 0, rectF);
        ((p1) this.f2317a.f16439b).f2476b.b(UUID.randomUUID(), new a1(this, e0Var, 1));
        return e0Var;
    }

    public final void n(int r19, cg.e1 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: cg.d1.n(int, cg.e1, float):void");
    }

    public final void o(int i10, int i11, s1 s1Var, float f10) {
        q1 q1Var;
        int i12;
        if (s1Var != null) {
            m mVar = this.f2322i;
            l lVar = s1Var.f2499a;
            if (lVar != null && i10 == this.f2330q) {
                mVar = lVar;
            }
            if (mVar != null && this.f2320f != null && (q1Var = (q1) this.f2331r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(q1Var.f2490a);
                GLES20.glUniformMatrix4fv(q1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f2337y));
                GLES20.glUniform1i(q1Var.d("texture"), 0);
                GLES20.glUniform1i(q1Var.d("mask"), 1);
                int currentColor = this.f2320f.getCurrentColor();
                q1.a(q1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f10)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(q1Var.d("type"), ((l) mVar).o());
                    int d = q1Var.d("resolution");
                    jv0 jv0Var = this.f2321g;
                    GLES20.glUniform2f(d, jv0Var.f26062a, jv0Var.f26063b);
                    GLES20.glUniform2f(q1Var.d("center"), s1Var.f2500b, s1Var.f2501c);
                    GLES20.glUniform2f(q1Var.d("radius"), s1Var.d, s1Var.e);
                    GLES20.glUniform1f(q1Var.d("thickness"), s1Var.f2502f);
                    GLES20.glUniform1f(q1Var.d("rounding"), s1Var.f2503g);
                    GLES20.glUniform2f(q1Var.d("middle"), s1Var.f2504i, s1Var.f2505j);
                    GLES20.glUniform1f(q1Var.d("rotation"), s1Var.h);
                    GLES20.glUniform1i(q1Var.d("fill"), s1Var.f2507l ? 1 : 0);
                    GLES20.glUniform1f(q1Var.d("arrowTriangleLength"), s1Var.f2506k);
                    GLES20.glUniform1i(q1Var.d("composite"), 0);
                    int d10 = q1Var.d("clear");
                    if (s1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f2326m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f2327n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                p5.a();
            }
        }
    }

    public final void p(b4.e0 e0Var, boolean z4) {
        ByteBuffer byteBuffer;
        File file;
        o5.i iVar;
        g2 g2Var;
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
            } catch (Exception e) {
                FileLog.e(e);
                byteBuffer = null;
            }
            int j10 = j();
            if (e0Var.f1378b == 1 && (g2Var = this.D) != null) {
                j10 = g2Var.c();
            }
            GLES20.glBindTexture(3553, j10);
            RectF rectF = (RectF) e0Var.f1379c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) e0Var.f1379c).height(), 6408, 5121, byteBuffer);
            if (this.f2332s <= 0 && (iVar = this.f2317a) != null) {
                iVar.q();
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
        this.f2322i = mVar;
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
            p1 p1Var = this.f2320f;
            if (p1Var != null && (c3 = p1Var.c(false, false)) != null) {
                canvas.scale(width / c3.getWidth(), height / c3.getHeight());
                canvas.drawBitmap(c3, 0.0f, 0.0f, this.M);
                c3.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            g2 g2Var = this.f2338z;
            if (g2Var != null) {
                g2Var.a(false);
            }
            this.f2338z = new g2(this.C);
        }
    }
}
