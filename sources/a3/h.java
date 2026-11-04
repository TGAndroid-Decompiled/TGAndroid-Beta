package a3;

import android.opengl.GLES20;
import wi.c0;
public class h {
    public final int f89a;
    public final int f90b;
    public final int f91c;
    public final int d;

    public h(int i3, int i10, int i11, int i12) {
        this.f89a = i3;
        this.f90b = i10;
        this.f91c = i11;
        this.d = i12;
    }

    public boolean a(int i3) {
        if (i3 == 1) {
            if (this.f89a - this.f90b <= 1) {
                return false;
            }
        } else if (this.f91c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f89a);
        GLES20.glDeleteShader(this.f90b);
        GLES20.glDeleteShader(this.f91c);
    }

    public h(String str, String str2) {
        int a10 = c0.a(35633, str);
        this.f90b = a10;
        int a11 = c0.a(35632, str2);
        this.f91c = a11;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glAttachShader(glCreateProgram, a11);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f89a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(t4.c.f("Unable to link program: ", glGetProgramInfoLog));
    }
}
