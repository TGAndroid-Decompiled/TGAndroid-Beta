package b4;

import android.opengl.GLES20;
import android.text.TextUtils;
import org.telegram.ui.Components.h40;
import v7.r6;
import v7.t6;
public class b {
    public final int f2450a;
    public final int f2451b;
    public final int f2452c;
    public final int d;
    public final int e;
    public final int f2453f;

    public b(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f2450a = i10;
        this.f2451b = i11;
        this.f2452c = i12;
        this.d = i13;
        this.e = i14;
        this.f2453f = i15;
    }

    public static b b(String str) {
        char c10;
        t6.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < split.length; i15++) {
            String c11 = r6.c(split[i15].trim());
            c11.getClass();
            switch (c11.hashCode()) {
                case 100571:
                    if (c11.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (c11.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102749521:
                    if (c11.equals("layer")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (c11.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (c11.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i12 = i15;
                    break;
                case 1:
                    i14 = i15;
                    break;
                case 2:
                    i10 = i15;
                    break;
                case 3:
                    i11 = i15;
                    break;
                case 4:
                    i13 = i15;
                    break;
            }
        }
        if (i11 != -1 && i12 != -1 && i14 != -1) {
            return new b(i10, i11, i12, i13, i14, split.length);
        }
        return null;
    }

    public void a() {
        GLES20.glDeleteProgram(this.f2450a);
        GLES20.glDeleteShader(this.f2451b);
        GLES20.glDeleteShader(this.f2452c);
    }

    public b(int i10) {
        int a2 = h40.a(35633, 2131624182);
        this.f2451b = a2;
        int a10 = h40.a(35632, i10);
        this.f2452c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            glCreateProgram = 0;
        }
        this.f2450a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f2453f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }
}
