package ki;

import android.opengl.GLES20;
public class w {
    public final int f15092a;
    public final int f15093b;
    public final int f15094c;
    public final int d;

    public w(int i10, int i11, int i12, int i13) {
        this.f15092a = i10;
        this.f15093b = i11;
        this.f15094c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f15092a - this.f15093b <= 1) {
                return false;
            }
        } else if (this.f15094c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f15092a);
        GLES20.glDeleteShader(this.f15093b);
        GLES20.glDeleteShader(this.f15094c);
    }

    public w(String str, String str2) {
        int a2 = a0.a(35633, str);
        this.f15093b = a2;
        int a10 = a0.a(35632, str2);
        this.f15094c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f15092a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(sa.e.i("Unable to link program: ", glGetProgramInfoLog));
    }
}
