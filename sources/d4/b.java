package d4;

import android.opengl.GLES20;
import android.text.TextUtils;
import b8.xb;
import b8.zb;
import org.telegram.ui.Components.l30;
public class b {
    public final int f8529a;
    public final int f8530b;
    public final int f8531c;
    public final int d;
    public final int f8532e;
    public final int f8533f;

    public b(int i3, int i10, int i11, int i12, int i13, int i14) {
        this.f8529a = i3;
        this.f8530b = i10;
        this.f8531c = i11;
        this.d = i12;
        this.f8532e = i13;
        this.f8533f = i14;
    }

    public static b b(String str) {
        char c2;
        zb.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i3 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String c10 = xb.c(split[i14].trim());
            c10.getClass();
            switch (c10.hashCode()) {
                case 100571:
                    if (c10.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3556653:
                    if (c10.equals("text")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 102749521:
                    if (c10.equals("layer")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (c10.equals("start")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (c10.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i3 = i14;
                    break;
                case 3:
                    i10 = i14;
                    break;
                case 4:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new b(i3, i10, i11, i12, i13, split.length);
        }
        return null;
    }

    public void a() {
        GLES20.glDeleteProgram(this.f8529a);
        GLES20.glDeleteShader(this.f8530b);
        GLES20.glDeleteShader(this.f8531c);
    }

    public b(int i3) {
        int a10 = l30.a(35633, 2131624184);
        this.f8530b = a10;
        int a11 = l30.a(35632, i3);
        this.f8531c = a11;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glAttachShader(glCreateProgram, a11);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            glCreateProgram = 0;
        }
        this.f8529a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f8532e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f8533f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }
}
