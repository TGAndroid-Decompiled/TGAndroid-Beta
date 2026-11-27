package defpackage;

import android.opengl.GLES20;
import java.util.Locale;
public final class sf4 {
    public final String a;
    public final String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public sf4(float f, float f2, boolean z) {
        int i;
        float f3;
        int i2;
        double d;
        double d2 = 6.283185307179586d;
        if (z) {
            f3 = Math.round(f);
            if (f3 >= 1.0f) {
                double d3 = f3;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d3, 2.0d) * 6.283185307179586d) * 0.00390625d) * Math.pow(d3, 2.0d) * (-2.0d)));
                i = (floor % 2) + floor;
            } else {
                i = 0;
            }
        } else {
            i = (int) f;
            f3 = f2;
        }
        int i3 = 1;
        int i4 = (i << 1) + 1;
        float[] fArr = new float[i4];
        int i5 = 0;
        float f4 = 0.0f;
        while (true) {
            i2 = i + 1;
            d = d2;
            if (i5 >= i2) {
                break;
            }
            double d4 = f3;
            int i6 = i3;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i5, 2.0d)) / (Math.pow(d4, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d4, 2.0d) * d)));
            fArr2[i5] = exp;
            if (i5 == 0) {
                f4 += exp;
            } else {
                f4 = (float) ((exp * 2.0d) + f4);
            }
            i5++;
            i3 = i6;
            d2 = d;
            fArr = fArr2;
        }
        int i7 = i3;
        float[] fArr3 = fArr;
        for (int i8 = 0; i8 < i2; i8++) {
            fArr3[i8] = fArr3[i8] / f4;
        }
        char c = 2;
        int i9 = (i % 2) + (i / 2);
        int min = Math.min(i9, 7);
        StringBuilder sb = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb.append("varying highp vec2 blurCoordinates[" + ((min << 1) + 1) + "];\n");
        sb.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
        Object[] objArr = new Object[i7];
        objArr[0] = Float.valueOf(fArr3[0]);
        sb.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", objArr));
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = i10 << 1;
            int i12 = i11 + 1;
            int i13 = i11 + 2;
            float f5 = fArr3[i12] + fArr3[i13];
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i12), Float.valueOf(f5)));
            sb.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i13), Float.valueOf(f5)));
        }
        if (i9 > min) {
            sb.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i9) {
                int i14 = min << 1;
                int i15 = i14 + 1;
                float f6 = fArr3[i15];
                int i16 = i14 + 2;
                float f7 = fArr3[i16];
                float f8 = f6 + f7;
                float z2 = c00.z(f7, i16, f6 * i15, f8);
                Locale locale3 = Locale.US;
                sb.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(z2), Float.valueOf(f8)));
                sb.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(z2), Float.valueOf(f8)));
                min++;
            }
        }
        sb.append("gl_FragColor = sum;\n}\n");
        this.b = sb.toString();
        float[] fArr4 = new float[i4];
        int i17 = 0;
        float f9 = 0.0f;
        while (i17 < i2) {
            double d5 = f3;
            char c2 = c;
            float f10 = f9;
            float exp2 = (float) (Math.exp((-Math.pow(i17, 2.0d)) / (Math.pow(d5, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d5, 2.0d) * d)));
            fArr4[i17] = exp2;
            if (i17 == 0) {
                f9 = f10 + exp2;
            } else {
                f9 = (float) ((exp2 * 2.0d) + f10);
            }
            i17++;
            c = c2;
        }
        char c3 = c;
        float f11 = f9;
        for (int i18 = 0; i18 < i2; i18++) {
            fArr4[i18] = fArr4[i18] / f11;
        }
        int min2 = Math.min(i9, 7);
        float[] fArr5 = new float[min2];
        for (int i19 = 0; i19 < min2; i19++) {
            int i20 = i19 << 1;
            int i21 = i20 + 1;
            float f12 = fArr4[i21];
            int i22 = i20 + 2;
            float f13 = fArr4[i22];
            fArr5[i19] = c00.z(f13, i22, f12 * i21, f12 + f13);
        }
        StringBuilder sb2 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
        Locale locale4 = Locale.US;
        sb2.append("varying vec2 blurCoordinates[" + ((min2 << 1) + 1) + "];\n");
        sb2.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i23 = 0; i23 < min2; i23++) {
            Locale locale5 = Locale.US;
            int i24 = i23 << 1;
            Integer valueOf = Integer.valueOf(i24 + 1);
            Float valueOf2 = Float.valueOf(fArr5[i23]);
            Integer valueOf3 = Integer.valueOf(i24 + 2);
            Float valueOf4 = Float.valueOf(fArr5[i23]);
            Object[] objArr2 = new Object[4];
            objArr2[0] = valueOf;
            objArr2[1] = valueOf2;
            objArr2[c3] = valueOf3;
            objArr2[3] = valueOf4;
            sb2.append(String.format(locale5, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", objArr2));
        }
        sb2.append("}");
        this.a = sb2.toString();
    }

    public final boolean a() {
        int h = uf4.h(35633, this.a);
        int h2 = uf4.h(35632, this.b);
        if (h == 0 || h2 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.c, h2);
        GLES20.glBindAttribLocation(this.c, 0, "position");
        GLES20.glBindAttribLocation(this.c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.c, 35714, iArr, 0);
        int i = iArr[0];
        int i2 = this.c;
        if (i == 0) {
            GLES20.glDeleteProgram(i2);
            this.c = 0;
            return true;
        }
        this.d = GLES20.glGetAttribLocation(i2, "position");
        this.e = GLES20.glGetAttribLocation(this.c, "inputTexCoord");
        this.f = GLES20.glGetUniformLocation(this.c, "sTexture");
        this.g = GLES20.glGetUniformLocation(this.c, "texelWidthOffset");
        this.h = GLES20.glGetUniformLocation(this.c, "texelHeightOffset");
        return true;
    }
}
