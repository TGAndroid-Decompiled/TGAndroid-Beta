package b3;

import android.opengl.GLES20;
import zi.e0;
public class h {
    public final int f2901a;
    public final int f2902b;
    public final int f2903c;
    public final int d;

    public h(int i7, int i10, int i11, int i12) {
        this.f2901a = i7;
        this.f2902b = i10;
        this.f2903c = i11;
        this.d = i12;
    }

    public boolean a(int i7) {
        if (i7 == 1) {
            if (this.f2901a - this.f2902b <= 1) {
                return false;
            }
        } else if (this.f2903c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f2901a);
        GLES20.glDeleteShader(this.f2902b);
        GLES20.glDeleteShader(this.f2903c);
    }

    public h(String str, String str2) {
        int a10 = e0.a(35633, str);
        this.f2902b = a10;
        int a11 = e0.a(35632, str2);
        this.f2903c = a11;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glAttachShader(glCreateProgram, a11);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f2901a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(r.b.k("Unable to link program: ", glGetProgramInfoLog));
    }
}
