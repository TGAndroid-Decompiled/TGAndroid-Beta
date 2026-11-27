package defpackage;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
public final class qca {
    public int a;
    public HashMap b;

    public static void a(int i, int i2) {
        GLES20.glUniform4f(i, Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, Color.alpha(i2) / 255.0f);
    }

    public static m09 b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && f11.a) {
            cc4.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i2 = iArr[0];
        m09 m09Var = new m09((byte) 5);
        m09Var.b = glCreateShader;
        m09Var.c = i2;
        return m09Var;
    }

    public static void c(int i, int i2, int i3) {
        if (i != 0) {
            GLES20.glDeleteShader(i);
        }
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
        }
        if (i3 != 0) {
            GLES20.glDeleteProgram(i);
        }
    }

    public final int d(String str) {
        return ((Integer) this.b.get(str)).intValue();
    }
}
