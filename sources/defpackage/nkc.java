package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.webrtc.GlShader;
import org.webrtc.GlUtil;
public final class nkc {
    public static final FloatBuffer m = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    public static final FloatBuffer n = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    public final GlShader[][] a = (GlShader[][]) Array.newInstance(GlShader.class, 3, 3);
    public final int[][] b;
    public final int[][] c;
    public final int[][] d;
    public final int[][] e;
    public final int[] f;
    public int[] g;
    public float[] h;
    public final int[] i;
    public final int[] j;
    public float[] k;
    public float l;

    public nkc() {
        Class cls = Integer.TYPE;
        this.b = (int[][]) Array.newInstance(cls, 3, 3);
        this.c = (int[][]) Array.newInstance(cls, 3, 3);
        this.d = (int[][]) Array.newInstance(cls, 3, 3);
        this.e = (int[][]) Array.newInstance(cls, 3, 3);
        this.f = new int[2];
        this.i = new int[2];
        this.j = new int[2];
    }

    public final GlShader a(int i, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision highp float;\n");
        if (!z) {
            sb.append("varying vec2 tc;\n");
        }
        if (i == 2) {
            sb.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\nvoid main() {\n  gl_FragColor = sample(tc);\n}\n");
        } else {
            if (i == 0) {
                str = "samplerExternalOES";
            } else {
                str = "sampler2D";
            }
            ik8.z("uniform ", str, " tex;\n", sb);
            if (z) {
                sb.append("precision mediump float;\nvarying vec2 tc;\nconst mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nvoid main(){\nint rad = 3;\nint diameter = 2 * rad + 1;\nvec4 sampleTex = vec4(0, 0, 0, 0);\nvec3 col = vec3(0, 0, 0);\nfloat weightSum = 0.0;\nfor(int i = 0; i < diameter; i++) {\nvec2 offset = vec2(float(i - rad) * texelWidthOffset, float(i - rad) * texelHeightOffset);\nsampleTex = vec4(texture2D(tex, tc.st+offset));\nfloat index = float(i);\nfloat boxWeight = float(rad) + 1.0 - abs(index - float(rad));\ncol += sampleTex.rgb * boxWeight;\nweightSum += boxWeight;\n}\nvec3 result = col / weightSum;\nlowp float satLuminance = dot(result.rgb, satLuminanceWeighting);\nlowp vec3 greyScaleColor = vec3(satLuminance);\ngl_FragColor = vec4(clamp(mix(greyScaleColor, result.rgb, 1.1), 0.0, 1.0), 1.0);\n}\n");
            } else {
                sb.append("void main() {\n  gl_FragColor = sample(tc);\n}\n".replace("sample(", "texture2D(tex, "));
            }
        }
        return new GlShader("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n", sb.toString());
    }

    public final void b(int i, int i2, int i3) {
        int[] iArr = this.g;
        int[] iArr2 = this.f;
        if (iArr == null) {
            int[] iArr3 = new int[2];
            this.g = iArr3;
            GLES20.glGenFramebuffers(2, iArr3, 0);
            GLES20.glGenTextures(2, iArr2, 0);
            for (int i4 : iArr2) {
                GLES20.glBindTexture(3553, i4);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
            }
            float[] fArr = new float[16];
            this.h = fArr;
            Matrix.setIdentityM(fArr, 0);
        }
        int[] iArr4 = this.i;
        if (iArr4[i3] != i) {
            this.l = Math.max(1.0f, Math.max(i, i2) / 50.0f);
            GLES20.glBindTexture(3553, iArr2[i3]);
            float f = this.l;
            GLES20.glTexImage2D(3553, 0, 6408, (int) (i / f), (int) (i2 / f), 0, 6408, 5121, null);
            iArr4[i3] = i;
            this.j[i3] = i2;
        }
    }

    public final void c(int i, float[] fArr, int i2, int i3, int i4) {
        boolean z;
        float f;
        if (i4 != 0) {
            z = true;
        } else {
            z = false;
        }
        GlShader[][] glShaderArr = this.a;
        GlShader glShader = glShaderArr[i][i4];
        int[][] iArr = this.d;
        int[][] iArr2 = this.c;
        int[][] iArr3 = this.b;
        int[][] iArr4 = this.e;
        if (glShader == null) {
            try {
                glShader = a(i, z);
                glShaderArr[i][i4] = glShader;
                glShader.useProgram();
                if (i == 2) {
                    GLES20.glUniform1i(glShader.getUniformLocation("y_tex"), 0);
                    GLES20.glUniform1i(glShader.getUniformLocation("u_tex"), 1);
                    GLES20.glUniform1i(glShader.getUniformLocation("v_tex"), 2);
                } else {
                    GLES20.glUniform1i(glShader.getUniformLocation("tex"), 0);
                }
                GlUtil.checkNoGLES2Error("Create shader");
                if (z) {
                    iArr4[i][0] = glShader.getUniformLocation("texelWidthOffset");
                    iArr4[i][1] = glShader.getUniformLocation("texelHeightOffset");
                }
                iArr[i][i4] = glShader.getUniformLocation("tex_mat");
                iArr3[i][i4] = glShader.getAttribLocation("in_pos");
                iArr2[i][i4] = glShader.getAttribLocation("in_tc");
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        glShader.useProgram();
        if (z) {
            int i5 = iArr4[i][0];
            float f2 = 0.0f;
            if (i4 == 1) {
                f = 1.0f / i2;
            } else {
                f = 0.0f;
            }
            GLES20.glUniform1f(i5, f);
            int i6 = iArr4[i][1];
            if (i4 == 2) {
                f2 = 1.0f / i3;
            }
            GLES20.glUniform1f(i6, f2);
        }
        GLES20.glEnableVertexAttribArray(iArr3[i][i4]);
        GLES20.glVertexAttribPointer(iArr3[i][i4], 2, 5126, false, 0, (Buffer) m);
        GLES20.glEnableVertexAttribArray(iArr2[i][i4]);
        GLES20.glVertexAttribPointer(iArr2[i][i4], 2, 5126, false, 0, (Buffer) n);
        GLES20.glUniformMatrix4fv(iArr[i][i4], 1, false, fArr, 0);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public final void d() {
        int i = 0;
        while (true) {
            GlShader[][] glShaderArr = this.a;
            if (i >= glShaderArr.length) {
                break;
            }
            int i2 = 0;
            while (true) {
                GlShader[] glShaderArr2 = glShaderArr[i];
                if (i2 < glShaderArr2.length) {
                    GlShader glShader = glShaderArr2[i2];
                    if (glShader != null) {
                        glShader.release();
                        glShaderArr[i][i2] = null;
                    }
                    i2++;
                }
            }
            i++;
        }
        int[] iArr = this.g;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(2, iArr, 0);
            GLES20.glDeleteTextures(2, this.f, 0);
        }
    }
}
