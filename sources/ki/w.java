package ki;

import android.opengl.GLES20;
public class w {
    public final int f13886a;
    public final int f13887b;
    public final int f13888c;
    public final int d;

    public w(int i10, int i11, int i12, int i13) {
        this.f13886a = i10;
        this.f13887b = i11;
        this.f13888c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f13886a - this.f13887b <= 1) {
                return false;
            }
        } else if (this.f13888c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f13886a);
        GLES20.glDeleteShader(this.f13887b);
        GLES20.glDeleteShader(this.f13888c);
    }

    public w(String str, String str2) {
        int a2 = a0.a(35633, str);
        this.f13887b = a2;
        int a10 = a0.a(35632, str2);
        this.f13888c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f13886a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(v7.j.g("Unable to link program: ", glGetProgramInfoLog));
    }
}
