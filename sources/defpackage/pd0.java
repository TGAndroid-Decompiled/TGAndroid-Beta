package defpackage;

import android.opengl.GLES20;
public class pd0 {
    public int a;
    public int b;
    public int c;

    public pd0(String str, String str2) {
        int l = um9.l(35633, str);
        this.b = l;
        int l2 = um9.l(35632, str2);
        this.c = l2;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, l);
        GLES20.glAttachShader(glCreateProgram, l2);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.a = glCreateProgram;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        dq9.m(b10.h("Unable to link program: ", glGetProgramInfoLog));
        throw null;
    }

    public static pd0 a(int i, byte[] bArr) {
        ?? obj = new Object();
        obj.a = bArr;
        obj.b = Math.min(i, bArr.length);
        if (obj.b() == -1590787827) {
            obj.c();
            obj.b();
            int b = obj.b();
            if (!obj.d && b > 0) {
                int b2 = obj.b();
                obj.c();
                int b3 = obj.b();
                obj.b();
                if (!obj.d && b2 >= 0) {
                    long j = obj.c + b2;
                    if (j <= i) {
                        int i2 = (int) j;
                        return new pd0(b3, i2, i - i2);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void b() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public pd0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public pd0() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}
