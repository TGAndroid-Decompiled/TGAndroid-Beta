package li;

import android.opengl.GLES20;
public class c0 {
    public final int f12033a;
    public final int f12034b;
    public final int f12035c;
    public final int d;

    public c0(int i10, int i11, int i12, int i13) {
        this.f12033a = i10;
        this.f12034b = i11;
        this.f12035c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f12033a - this.f12034b <= 1) {
                return false;
            }
        } else if (this.f12035c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f12033a);
        GLES20.glDeleteShader(this.f12034b);
        GLES20.glDeleteShader(this.f12035c);
    }

    public c0(String str, String str2) {
        int a2 = g0.a(35633, str);
        this.f12034b = a2;
        int a10 = g0.a(35632, str2);
        this.f12035c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f12033a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(sc.e.h("Unable to link program: ", glGetProgramInfoLog));
    }
}
