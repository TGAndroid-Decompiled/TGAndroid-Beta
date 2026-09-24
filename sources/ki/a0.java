package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Size;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.RLottieNative;
public final class a0 {
    public static final String A;
    public final int f13638a;
    public Size f13639b;
    public int f13640c;
    public final boolean d;
    public final w f13642g;
    public final z h;
    public final v f13643i;
    public final x f13644j;
    public final FloatBuffer f13645k;
    public final FloatBuffer f13646l;
    public FloatBuffer f13647m;
    public FloatBuffer f13648n;
    public final int[] f13650p;
    public int f13651q;
    public long v;
    public boolean f13656w;
    public boolean f13657x;
    public final int[] f13649o = new int[8];
    public int f13652r = 0;
    public int f13653s = 1;
    public int f13654t = 0;
    public int f13655u = 1;
    public float f13658y = -1.0f;
    public float f13659z = -1.0f;
    public final u e = new u("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    public final y f13641f = new y();

    static {
        double d = 0.0d;
        for (int i10 = -16; i10 <= 16; i10++) {
            double d10 = 7.0f;
            d += Math.exp((-(i10 * i10)) / ((2.0d * d10) * d10));
        }
        StringBuilder sb2 = new StringBuilder(4096);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = vec3(0.0);\n");
        for (int i11 = -16; i11 <= 16; i11++) {
            double d11 = 7.0f;
            sb2.append("    color += texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(i11));
            sb2.append(").rgb * ");
            sb2.append(Float.toString((float) (Math.exp((-(i11 * i11)) / ((d11 * 2.0d) * d11)) / d)));
            sb2.append(";\n");
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        A = sb2.toString();
    }

    public a0(int i10, Size size, int i11, boolean z10) {
        x xVar;
        int round;
        Bitmap bitmap;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr = new int[10];
        this.f13650p = iArr;
        this.f13638a = i10;
        this.f13639b = size;
        this.f13640c = i11;
        this.d = z10;
        ?? uVar = new u("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n");
        int glGetUniformLocation = GLES20.glGetUniformLocation(uVar.f13875a, "bTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(uVar.f13875a, "mTexture");
        GLES20.glUseProgram(uVar.f13875a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
        GLES20.glUniform1i(glGetUniformLocation2, 2);
        this.f13642g = uVar;
        this.h = new z();
        this.f13643i = new v();
        if (z10) {
            xVar = new x(AndroidUtilities.readRes(R.raw.round_blur_vert), AndroidUtilities.readRes(R.raw.round_blur_stage_3_frag));
        } else {
            xVar = null;
        }
        this.f13644j = xVar;
        float[] fArr = new float[656];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 1.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 1.0f;
        fArr[7] = 1.0f;
        float[] fArr2 = new float[48];
        fArr2[0] = -1.0f;
        fArr2[1] = -1.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 1.0f;
        fArr2[4] = -1.0f;
        fArr2[5] = 0.0f;
        fArr2[6] = -1.0f;
        fArr2[7] = 1.0f;
        fArr2[8] = 0.0f;
        fArr2[9] = 1.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        this.f13647m = j(size, i11, false);
        this.f13648n = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        k(0, 48, 48);
        k(1, 48, 48);
        h(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
        float f7 = i10 * 0.5f;
        float f10 = f7 + 2.0f;
        for (int i16 = 0; i16 < i10; i16++) {
            float f11 = (i16 + 0.5f) - f7;
            int i17 = 0;
            while (i17 < i10) {
                float f12 = (i17 + 0.5f) - f7;
                allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f10 + 0.5f) - ((float) Math.sqrt((f11 * f11) + (f12 * f12))))) * 255.0f));
                i17++;
                f10 = f10;
            }
        }
        allocateDirect.position(0);
        GLES20.glPixelStorei(3317, 1);
        int i18 = this.f13638a;
        GLES20.glTexImage2D(3553, 0, 6406, i18, i18, 0, 6406, 5121, allocateDirect);
        GLES20.glPixelStorei(3317, 4);
        if (z10) {
            h(3);
            float f13 = this.f13638a;
            int round2 = Math.round((372.0f * f13) / 1536.0f);
            int round3 = Math.round(0.2f * f13);
            int round4 = round3 - (Math.round((28.0f * f13) / 1536.0f) * 2);
            int i19 = round4 * 4;
            int max = Math.max(round4 * 8, round2);
            int i20 = i19 + round2;
            RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
            if (b10 != null) {
                Bitmap createBitmap = Bitmap.createBitmap(round3, round3, Bitmap.Config.ARGB_8888);
                Bitmap createBitmap2 = Bitmap.createBitmap(max, i20, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(createBitmap2);
                int i21 = 0;
                while (i21 < 27) {
                    int i22 = i21 * 24;
                    RLottieNative rLottieNative = b10;
                    float f14 = i20;
                    float f15 = i19 / f14;
                    float f16 = max;
                    r(fArr, i22 + 8, 0.0f, f15, round2 / f16, 1.0f);
                    int i23 = i21;
                    r(fArr, i22 + 20, (round4 * (i21 % 8)) / f16, (round4 * (i21 / 8)) / f14, ((i12 + 1) * round4) / f16, ((i13 + 1) * round4) / f14);
                    rLottieNative.c(i23 * 2, createBitmap, true);
                    canvas.drawBitmap(createBitmap, i14 - round, i15 - round, (Paint) null);
                    i21 = i23 + 1;
                    b10 = rLottieNative;
                    i20 = i20;
                    max = max;
                }
                RLottieNative rLottieNative2 = b10;
                Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                if (bitmapFromRaw != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round2, round2, true);
                    Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                    bitmap = createBitmap;
                    canvas.drawBitmap(extractAlpha, 0.0f, i19, (Paint) null);
                    extractAlpha.recycle();
                    createScaledBitmap.recycle();
                    bitmapFromRaw.recycle();
                } else {
                    bitmap = createBitmap;
                }
                float f17 = (round2 / f13) * 2.0f;
                s(fArr2, 12, 1.0f - f17, 1.0f, f17 - 1.0f);
                float e = a4.a.e(round4, f13, 2.0f, -1.0f);
                s(fArr2, 30, -1.0f, e, e);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                bitmap.recycle();
                rLottieNative2.d();
            } else {
                throw new IllegalStateException("Unable to load watermark animation");
            }
        }
        k(4, i10, i10);
        k(5, i10, i10);
        k(6, i10, i10);
        k(7, i10, i10);
        k(8, i10, i10);
        k(9, 48, 48);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.f13649o;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        b(0, 0);
        b(1, 1);
        b(2, 4);
        b(3, 5);
        b(4, 6);
        b(5, 7);
        b(6, 8);
        b(7, 9);
        for (int i24 : this.f13649o) {
            GLES20.glBindFramebuffer(36160, i24);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.f13645k = i(fArr2);
        this.f13646l = i(fArr);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(v7.j.g("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer i10 = ok.i(ByteBuffer.allocateDirect(fArr.length * 4));
        i10.put(fArr).position(0);
        return i10;
    }

    public static FloatBuffer j(Size size, int i10, boolean z10) {
        int width;
        int height;
        int min = Math.min(i10, Math.min(size.getWidth(), size.getHeight()));
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        if (z10) {
            height = size.getWidth();
        } else {
            height = size.getHeight();
        }
        float f7 = min;
        float f10 = f7 / (width * 2.0f);
        float f11 = f7 / (height * 2.0f);
        float f12 = 0.5f - f10;
        float f13 = 0.5f - f11;
        float f14 = f10 + 0.5f;
        float f15 = f11 + 0.5f;
        return i(new float[]{f12, f13, f14, f13, f12, f15, f14, f15});
    }

    public static void r(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f7;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f7;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = f11;
        fArr[i10 + 9] = f12;
        fArr[i10 + 10] = f11;
        fArr[i10 + 11] = f10;
    }

    public static void s(float[] fArr, int i10, float f7, float f10, float f11) {
        t(fArr, i10, f7, -1.0f);
        t(fArr, i10 + 3, f10, -1.0f);
        t(fArr, i10 + 6, f7, f11);
        t(fArr, i10 + 9, f7, f11);
        t(fArr, i10 + 12, f10, -1.0f);
        t(fArr, i10 + 15, f10, f11);
    }

    public static void t(float[] fArr, int i10, float f7, float f10) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f10;
        fArr[i10 + 2] = 0.0f;
    }

    public final void b(int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f13649o[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f13650p[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(u uVar, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(uVar.f13875a);
        this.f13645k.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f13645k);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.f13648n;
        } else {
            floatBuffer = this.f13647m;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(uVar.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(uVar.e, 1, false, fArr, 0);
    }

    public final void e(x xVar, int i10, int i11) {
        GLES20.glUseProgram(xVar.f13875a);
        this.f13645k.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f13645k);
        this.f13646l.position(i10);
        GLES20.glVertexAttribPointer(xVar.d, 2, 5126, false, 8, (Buffer) this.f13646l);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.f13650p[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        char c10;
        a0 a0Var;
        GLES20.glDisable(3042);
        if (z10 && this.f13657x) {
            return;
        }
        if (z10) {
            c10 = 3;
        } else {
            c10 = 2;
        }
        GLES20.glBindFramebuffer(36160, this.f13649o[c10]);
        int i11 = this.f13638a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.e, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.f13653s;
            this.f13655u = i12;
            if (this.d) {
                p(i10, fArr, i12, 0.0f);
                int i13 = this.f13655u;
                a0Var = this;
                a0Var.m(i13, 0.0052083335f, 7, 48, 0.0f, 48);
                a0Var.m(9, 0.0f, i13, 48, 0.0052083335f, 48);
            } else {
                a0Var = this;
            }
            o(1.0f, true);
            a0Var.f13657x = true;
            return;
        }
        this.f13654t = this.f13652r;
        this.f13655u = this.f13653s;
        this.f13657x = false;
        this.f13658y = -1.0f;
        this.f13659z = -1.0f;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.f13650p[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i10, int i11, int i12) {
        h(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void l(int i10, float[] fArr, long j3, int i11, int i12) {
        a0 a0Var = this;
        GLES20.glDisable(3042);
        if (a0Var.d) {
            int i13 = a0Var.f13653s;
            float f7 = 0.0f;
            if (a0Var.f13656w) {
                long j10 = a0Var.v;
                if (j10 != 0) {
                    long j11 = j3 - j10;
                    if (j11 > 0 && j11 <= 100000000) {
                        f7 = (float) Math.exp((-j11) / 2.8E8d);
                    }
                }
            }
            a0Var.p(i10, fArr, i13, f7);
            int i14 = a0Var.f13653s;
            a0Var.m(i14, 0.0052083335f, 7, 48, 0.0f, 48);
            a0Var = this;
            a0Var.m(9, 0.0f, i14, 48, 0.0052083335f, 48);
            int i15 = a0Var.f13652r;
            int i16 = a0Var.f13653s;
            a0Var.f13652r = i16;
            a0Var.f13653s = i15;
            a0Var.f13656w = true;
            a0Var.v = j3;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            a0Var.c(a0Var.f13642g, fArr);
            d(i10);
            a0Var.f(1, i16);
            a0Var.f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            a0Var.c(a0Var.e, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        a0Var.q();
    }

    public final void m(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.f13649o[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        v vVar = this.f13643i;
        e(vVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(vVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void n(float f7, float f10, float f11, int i10, int i11) {
        float f12 = 0.0f;
        if (f7 > 0.0f) {
            o(f7, false);
        }
        if (f10 > 0.0f && this.f13657x) {
            o(f10, true);
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        z zVar = this.h;
        e(zVar, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        f(4, this.f13654t);
        f(5, this.f13655u);
        f(6, 2);
        GLES20.glUniform1f(zVar.e, f7);
        GLES20.glUniform1f(zVar.f13880f, f10);
        GLES20.glUniform1f(zVar.f13881g, f11);
        int i12 = zVar.h;
        if (this.d) {
            f12 = 1.0f;
        }
        GLES20.glUniform1f(i12, f12);
        GLES20.glDrawArrays(5, 0, 4);
        q();
    }

    public final void o(float f7, boolean z10) {
        float f10;
        int i10;
        int i11;
        if (z10) {
            f10 = this.f13659z;
        } else {
            f10 = this.f13658y;
        }
        if (Math.abs(f10 - f7) < 0.01f) {
            return;
        }
        if (z10) {
            i10 = 5;
        } else {
            i10 = 4;
        }
        if (z10) {
            i11 = 5;
        } else {
            i11 = 4;
        }
        int i12 = this.f13638a;
        float f11 = (28.0f * f7) / (i12 * 16);
        m(i11, f11, 6, i12, 0.0f, i12);
        int i13 = this.f13638a;
        m(8, 0.0f, i10, i13, f11, i13);
        if (z10) {
            this.f13659z = f7;
        } else {
            this.f13658y = f7;
        }
    }

    public final void p(int i10, float[] fArr, int i11, float f7) {
        boolean z10;
        int width;
        int height;
        GLES20.glBindFramebuffer(36160, this.f13649o[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        y yVar = this.f13641f;
        c(yVar, fArr);
        d(i10);
        f(1, this.f13652r);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(this.f13640c, Math.min(this.f13639b.getWidth(), this.f13639b.getHeight()));
        Size size = this.f13639b;
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        float f10 = width;
        if (z10) {
            height = this.f13639b.getWidth();
        } else {
            height = this.f13639b.getHeight();
        }
        float f11 = min;
        float f12 = ((f11 / f10) / 48.0f) * 0.45f;
        float f13 = ((f11 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(yVar.f13878f, fArr[0] * f12, fArr[1] * f12);
        GLES20.glUniform2f(yVar.f13879g, fArr[4] * f13, fArr[5] * f13);
        GLES20.glUniform1f(yVar.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q() {
        x xVar;
        if (this.d && (xVar = this.f13644j) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i10 = this.f13651q;
            this.f13651q = i10 + 1;
            e(xVar, ((i10 % 27) * 24) + 8, 12);
            f(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }

    public final void u(Size size, int i10) {
        this.f13639b = size;
        this.f13640c = i10;
        this.f13647m = j(size, i10, false);
        this.f13648n = j(size, i10, true);
        this.f13656w = false;
        this.v = 0L;
    }
}
