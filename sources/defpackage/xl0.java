package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class xl0 {
    public FloatBuffer e;
    public FloatBuffer f;
    public FloatBuffer g;
    public boolean h;
    public int l;
    public int m;
    public ByteBuffer o;
    public Bitmap p;
    public boolean q;
    public sl0 t;
    public int a = 1;
    public int b = 1;
    public boolean c = false;
    public final tl0[] d = new tl0[2];
    public final float[] i = new float[9];
    public final float[] j = new float[16];
    public final Object k = new Object();
    public final Object n = new Object();
    public final int[] r = new int[3];
    public final int[] s = new int[3];
    public final oz u = new oz(this, (byte) 11);
    public final Matrix v = new Matrix();

    public final void a(int i, int i2, int i3, float[] fArr) {
        char c;
        float f;
        Object obj;
        if (fArr != null) {
            c = 1;
        } else {
            c = 0;
        }
        tl0 tl0Var = this.d[c];
        if (tl0Var != null) {
            GLES20.glBindFramebuffer(36160, this.r[0]);
            GLES20.glViewport(0, 0, this.a, this.b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(tl0Var.a);
            GLES20.glUniform1i(tl0Var.e, 0);
            GLES20.glActiveTexture(33984);
            if (c != 0) {
                GLES20.glBindTexture(36197, i);
            } else {
                GLES20.glBindTexture(3553, i);
            }
            GLES20.glEnableVertexAttribArray(tl0Var.c);
            GLES20.glVertexAttribPointer(tl0Var.c, 2, 5126, false, 8, (Buffer) this.g);
            GLES20.glEnableVertexAttribArray(tl0Var.b);
            GLES20.glVertexAttribPointer(tl0Var.b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(tl0Var.f, this.a, this.b);
            float f2 = i2;
            float f3 = i3;
            GLES20.glUniform2f(tl0Var.g, f2, f3);
            GLES20.glUniform1i(tl0Var.j, 0);
            int i4 = tl0Var.k;
            float f4 = 1.0f;
            if (c != 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            GLES20.glUniform1f(i4, f);
            if (c != 0) {
                GLES20.glUniformMatrix4fv(tl0Var.l, 1, false, fArr, 0);
            }
            int i5 = tl0Var.m;
            if (c == 0) {
                f4 = 0.0f;
            }
            GLES20.glUniform1f(i5, f4);
            z8a.a(tl0Var.h, this.l);
            z8a.a(tl0Var.i, this.m);
            synchronized (this.k) {
                GLES20.glUniformMatrix4fv(tl0Var.d, 1, false, this.j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c != 0) {
                tl0Var = this.d[0];
                if (tl0Var == null) {
                    return;
                }
                GLES20.glUseProgram(tl0Var.a);
                GLES20.glEnableVertexAttribArray(tl0Var.c);
                GLES20.glVertexAttribPointer(tl0Var.c, 2, 5126, false, 8, (Buffer) this.g);
                GLES20.glEnableVertexAttribArray(tl0Var.b);
                GLES20.glVertexAttribPointer(tl0Var.b, 2, 5126, false, 8, (Buffer) this.e);
                GLES20.glUniform2f(tl0Var.f, this.a, this.b);
                GLES20.glUniform2f(tl0Var.g, f2, f3);
                GLES20.glUniform1i(tl0Var.j, 0);
                z8a.a(tl0Var.h, this.l);
                z8a.a(tl0Var.i, this.m);
                GLES20.glUniform1f(tl0Var.k, 0.0f);
                synchronized (this.k) {
                    GLES20.glUniformMatrix4fv(tl0Var.d, 1, false, this.j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.r[1]);
            GLES20.glUniform1i(tl0Var.j, 1);
            GLES20.glUniform1i(tl0Var.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.r[2]);
            int i6 = this.a;
            int i7 = (this.c ? 1 : 0) << 1;
            GLES20.glViewport(0, 0, i6 + i7, this.b + i7);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(tl0Var.b);
            GLES20.glVertexAttribPointer(tl0Var.b, 2, 5126, false, 8, (Buffer) this.f);
            GLES20.glUniform1i(tl0Var.j, 2);
            GLES20.glUniform1i(tl0Var.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.s[1]);
            sl0 sl0Var = this.t;
            if (sl0Var != null) {
                obj = sl0Var.h;
            } else {
                obj = null;
            }
            if (obj != null) {
                synchronized (obj) {
                    GLES20.glDrawArrays(5, 0, 4);
                }
            } else {
                GLES20.glDrawArrays(5, 0, 4);
            }
            ByteBuffer byteBuffer = this.o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i8 = this.a;
                int i9 = (this.c ? 1 : 0) << 1;
                GLES20.glReadPixels(0, 0, i8 + i9, this.b + i9, 6408, 5121, this.o);
                synchronized (this.n) {
                    this.p.copyPixelsFromBuffer(this.o);
                    this.q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            gl.r(this.u);
            gl.d3(this.u);
        }
    }

    public final boolean b(float f, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.a = (int) Math.round(Math.sqrt(f * 324.0f));
        this.b = (int) Math.round(Math.sqrt(324.0f / f));
        this.c = i;
        if (!this.h) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.v;
            matrix.invert(matrix2);
            matrix2.preScale(1.0f, 1.0f);
            matrix2.postScale(1.0f, 1.0f);
            c(matrix2);
        }
        float[] fArr = new float[8];
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        fArr[4] = -1.0f;
        fArr[5] = -1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.e.position(0);
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = i6 << 1;
            fArr[i7] = ((i4 - i) / this.a) * fArr[i7];
            int i8 = i7 + 1;
            fArr[i8] = ((i5 - i) / this.b) * fArr[i8];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.g.position(0);
        String v2 = gl.v2(null, 2131623943);
        String v22 = gl.v2(null, 2131623942);
        if (v2 != null && v22 != null) {
            int i9 = 0;
            while (true) {
                if (i9 < 2) {
                    if (i9 == 1) {
                        v22 = "#extension GL_OES_EGL_image_external : require\n" + v22.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = wd4.h(35633, v2);
                    int h2 = wd4.h(35632, v22);
                    if (h == 0 || h2 == 0) {
                        break;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(glCreateProgram, h2);
                    GLES20.glBindAttribLocation(glCreateProgram, 0, "p");
                    GLES20.glBindAttribLocation(glCreateProgram, 1, "inputuv");
                    GLES20.glLinkProgram(glCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(glCreateProgram);
                        return false;
                    }
                    ?? obj = new Object();
                    obj.a = glCreateProgram;
                    obj.b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i9] = obj;
                    i9++;
                } else {
                    int[] iArr2 = this.r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i10 = 0; i10 < 3; i10++) {
                        GLES20.glBindTexture(3553, iArr3[i10]);
                        int i11 = this.a;
                        if (i10 == 2) {
                            i2 = i << 1;
                        } else {
                            i2 = 0;
                        }
                        int i12 = i11 + i2;
                        int i13 = this.b;
                        if (i10 == 2) {
                            i3 = i << 1;
                        } else {
                            i3 = 0;
                        }
                        GLES20.glTexImage2D(3553, 0, 6408, i12, i13 + i3, 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glBindFramebuffer(36160, iArr2[i10]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[i10], 0);
                        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                        }
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    int i14 = i << 1;
                    this.p = Bitmap.createBitmap(this.a + i14, this.b + i14, Bitmap.Config.ARGB_8888);
                    this.o = ByteBuffer.allocateDirect(((i14 + this.b) * (this.a + i14)) << 2);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.i);
        synchronized (this.k) {
            float[] fArr = this.j;
            float[] fArr2 = this.i;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
    }
}
