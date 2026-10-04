package ki;

import android.opengl.GLES20;
public class w {
    public final int f15091a;
    public final int f15092b;
    public final int f15093c;
    public final int d;

    public w(int i10, int i11, int i12, int i13) {
        this.f15091a = i10;
        this.f15092b = i11;
        this.f15093c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f15091a - this.f15092b <= 1) {
                return false;
            }
        } else if (this.f15093c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f15091a);
        GLES20.glDeleteShader(this.f15092b);
        GLES20.glDeleteShader(this.f15093c);
    }

    public w(String str, String str2) {
        int a2 = a0.a(35633, str);
        this.f15092b = a2;
        int a10 = a0.a(35632, str2);
        this.f15093c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f15091a = glCreateProgram;
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
}
