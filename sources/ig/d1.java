package ig;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
public final class d1 {
    public int f8293a;
    public HashMap f8294b;

    public static void a(int i10, int i11) {
        GLES20.glUniform4f(i10, Color.red(i11) / 255.0f, Color.green(i11) / 255.0f, Color.blue(i11) / 255.0f, Color.alpha(i11) / 255.0f);
    }

    public static ac.g b(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && v2.f18448a) {
            f8.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i11 = iArr[0];
        ?? obj = new Object();
        obj.f385a = glCreateShader;
        obj.f386b = i11;
        return obj;
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 != 0) {
            GLES20.glDeleteShader(i10);
        }
        if (i11 != 0) {
            GLES20.glDeleteShader(i11);
        }
        if (i12 != 0) {
            GLES20.glDeleteProgram(i10);
        }
    }

    public final int d(String str) {
        return ((Integer) this.f8294b.get(str)).intValue();
    }
}
