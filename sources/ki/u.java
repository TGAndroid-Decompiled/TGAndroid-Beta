package ki;

import android.opengl.GLES20;
public class u {
    public final int f13850a;
    public final int f13851b;
    public final int f13852c;
    public final int d;

    public u(String str, String str2) {
        int a2 = x.a(35633, str);
        this.f13851b = a2;
        int a10 = x.a(35632, str2);
        this.f13852c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f13850a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(v7.j0.g("Unable to link program: ", glGetProgramInfoLog));
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f13850a);
        GLES20.glDeleteShader(this.f13851b);
        GLES20.glDeleteShader(this.f13852c);
    }
}
