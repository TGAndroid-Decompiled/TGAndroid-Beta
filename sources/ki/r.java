package ki;

import android.opengl.GLES20;
public class r {
    public final int f13792a;
    public final int f13793b;
    public final int f13794c;
    public final int d;

    public r(String str, String str2) {
        int a2 = v.a(35633, str);
        this.f13793b = a2;
        int a10 = v.a(35632, str2);
        this.f13794c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f13792a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(t8.b.i("Unable to link program: ", glGetProgramInfoLog));
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f13792a);
        GLES20.glDeleteShader(this.f13793b);
        GLES20.glDeleteShader(this.f13794c);
    }
}
