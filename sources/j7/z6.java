package j7;

import android.graphics.Matrix;
public abstract class z6 {
    public static float[] a(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[1], 0.0f, 0.0f, fArr[3], fArr[4], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, 1.0f};
    }

    public static float[] b(float f10, float f11) {
        float f12 = f10 - 0.0f;
        float f13 = f11 - 0.0f;
        return new float[]{2.0f / f12, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f13, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, (-(f10 + 0.0f)) / f12, (-(f11 + 0.0f)) / f13, -0.0f, 1.0f};
    }

    public static float[] c(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[4];
        float f13 = fArr2[1];
        float f14 = fArr[8];
        float f15 = fArr2[2];
        float f16 = fArr[12];
        float f17 = fArr2[3];
        float f18 = f16 * f17;
        float f19 = f18 + (f14 * f15) + (f12 * f13) + (f10 * f11);
        float f20 = fArr[1];
        float f21 = fArr[5];
        float f22 = fArr[9];
        float f23 = fArr[13];
        float f24 = f23 * f17;
        float f25 = f24 + (f22 * f15) + (f21 * f13) + (f20 * f11);
        float f26 = fArr[2];
        float f27 = fArr[6];
        float f28 = fArr[10];
        float f29 = fArr[14];
        float f30 = f29 * f17;
        float f31 = f30 + (f28 * f15) + (f27 * f13) + (f26 * f11);
        float f32 = fArr[3];
        float f33 = fArr[7];
        float f34 = fArr[11];
        float f35 = fArr[15];
        float f36 = f17 * f35;
        float f37 = f36 + (f15 * f34) + (f13 * f33) + (f11 * f32);
        float f38 = fArr2[4];
        float f39 = fArr2[5];
        float f40 = fArr2[6];
        float f41 = fArr2[7];
        float f42 = (f16 * f41) + (f14 * f40) + (f12 * f39) + (f10 * f38);
        float f43 = (f23 * f41) + (f22 * f40) + (f21 * f39) + (f20 * f38);
        float f44 = (f29 * f41) + (f28 * f40) + (f27 * f39) + (f26 * f38);
        float f45 = f41 * f35;
        float f46 = f45 + (f40 * f34) + (f39 * f33) + (f38 * f32);
        float f47 = fArr2[8];
        float f48 = fArr2[9];
        float f49 = fArr2[10];
        float f50 = fArr2[11];
        float f51 = (f16 * f50) + (f14 * f49) + (f12 * f48) + (f10 * f47);
        float f52 = (f23 * f50) + (f22 * f49) + (f21 * f48) + (f20 * f47);
        float f53 = (f28 * f49) + (f27 * f48) + (f26 * f47);
        float f54 = f50 * f35;
        float f55 = f54 + (f49 * f34) + (f48 * f33) + (f47 * f32);
        float f56 = fArr2[12];
        float f57 = fArr2[13];
        float f58 = (f12 * f57) + (f10 * f56);
        float f59 = fArr2[14];
        float f60 = (f14 * f59) + f58;
        float f61 = fArr2[15];
        return new float[]{f19, f25, f31, f37, f42, f43, f44, f46, f51, f52, (f29 * f50) + f53, f55, (f16 * f61) + f60, (f23 * f61) + (f22 * f59) + (f21 * f57) + (f20 * f56), (f29 * f61) + (f28 * f59) + (f27 * f57) + (f26 * f56), (f35 * f61) + (f34 * f59) + (f33 * f57) + (f32 * f56)};
    }
}
