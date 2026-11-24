package defpackage;

import android.graphics.PointF;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class lc1 {
    public static final lc1 b;
    public int[] a;

    static {
        ?? obj = new Object();
        obj.a = new int[]{1, 2};
        b = obj;
    }

    public static float[] a(ArrayList arrayList) {
        float f;
        int i;
        int i2;
        float f2;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f3;
        float f4;
        int i3;
        float f5;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            f = 255.0f;
            if (i5 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i5);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i5++;
        }
        int size2 = arrayList.size();
        int i6 = 1;
        double d3 = 1.0d;
        if (size2 > 0 && size2 != 1) {
            char c = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d4 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i7 = 1;
            while (true) {
                i3 = size2 - 1;
                if (i7 >= i3) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i7 - 1);
                PointF pointF3 = (PointF) arrayList.get(i7);
                int i8 = i7 + 1;
                double d5 = d3;
                PointF pointF4 = (PointF) arrayList.get(i8);
                double[] dArr5 = dArr2[i7];
                char c2 = c;
                float f6 = pointF3.x;
                double d6 = d4;
                int i9 = i4;
                int i10 = i6;
                double d7 = f6 - pointF2.x;
                dArr5[i9] = d7 / 6.0d;
                float f7 = pointF4.x;
                float f8 = f;
                dArr5[i10] = (f7 - f5) / 3.0d;
                double d8 = f7 - f6;
                dArr5[c2] = d8 / 6.0d;
                float f9 = pointF4.y;
                float f10 = pointF3.y;
                dArr3[i7] = ((f9 - f10) / d8) - ((f10 - pointF2.y) / d7);
                i7 = i8;
                c = c2;
                d3 = d5;
                d4 = d6;
                i4 = i9;
                i6 = i10;
                f = f8;
            }
            i = i4;
            i2 = i6;
            f2 = f;
            d = d3;
            char c3 = c;
            double d9 = d4;
            d2 = 6.0d;
            dArr3[i] = d9;
            dArr3[i3] = d9;
            double[] dArr6 = dArr2[i3];
            dArr6[i2] = d;
            dArr6[i] = d9;
            dArr6[c3] = d9;
            for (int i11 = i2; i11 < size2; i11++) {
                double[] dArr7 = dArr2[i11];
                double d10 = dArr7[i];
                int i12 = i11 - 1;
                double[] dArr8 = dArr2[i12];
                double d11 = d10 / dArr8[i2];
                dArr7[i2] = dArr7[i2] - (dArr8[c3] * d11);
                dArr7[i] = d9;
                dArr3[i11] = dArr3[i11] - (d11 * dArr3[i12]);
            }
            for (int i13 = size2 - 2; i13 >= 0; i13--) {
                double[] dArr9 = dArr2[i13];
                double d12 = dArr9[c3];
                int i14 = i13 + 1;
                double[] dArr10 = dArr2[i14];
                double d13 = d12 / dArr10[i2];
                dArr9[i2] = dArr9[i2] - (dArr10[i] * d13);
                dArr9[c3] = d9;
                dArr3[i13] = dArr3[i13] - (d13 * dArr3[i14]);
            }
            dArr = new double[size2];
            for (int i15 = i; i15 < size2; i15++) {
                dArr[i15] = dArr3[i15] / dArr2[i15][i2];
            }
        } else {
            i = 0;
            i2 = 1;
            f2 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        }
        int length = dArr.length;
        if (length < i2) {
            arrayList2 = null;
            f3 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i16 = i;
            while (i16 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                PointF pointF6 = (PointF) arrayList.get(i17);
                int i18 = (int) pointF5.x;
                while (true) {
                    float f11 = pointF6.x;
                    if (i18 < ((int) f11)) {
                        float f12 = i18;
                        PointF pointF7 = pointF5;
                        double d14 = f11 - pointF5.x;
                        double d15 = (f12 - f4) / d14;
                        double d16 = d - d15;
                        int i19 = length;
                        double[] dArr11 = dArr;
                        float f13 = (float) (((((((d15 * d15) * d15) - d15) * dArr11[i17]) + ((((d16 * d16) * d16) - d16) * dArr11[i16])) * ((d14 * d14) / d2)) + (pointF6.y * d15) + (pointF7.y * d16));
                        if (f13 > f2) {
                            f13 = f2;
                        } else if (f13 < 0.0f) {
                            f13 = 0.0f;
                        }
                        arrayList2.add(new PointF(f12, f13));
                        i18++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i19;
                    }
                }
                i16 = i17;
            }
            f3 = 0.0f;
            arrayList2.add((PointF) b00.f(1, arrayList));
        }
        int i20 = i;
        float f14 = ((PointF) arrayList2.get(i20)).x;
        if (f14 > f3) {
            for (int i21 = (int) f14; i21 >= 0; i21--) {
                arrayList2.add(i20, new PointF(i21, f3));
            }
        }
        float f15 = ((PointF) b00.f(1, arrayList2)).x;
        if (f15 < f2) {
            for (int i22 = ((int) f15) + 1; i22 <= 255; i22++) {
                arrayList2.add(new PointF(i22, f2));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i20 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i20);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i20] = sqrt;
            i20++;
        }
        return fArr;
    }

    public final void b(CarIcon carIcon) {
        if (carIcon != null && carIcon.getType() == 1) {
            IconCompat icon = carIcon.getIcon();
            if (icon != null) {
                int i = icon.i();
                for (int i2 : this.a) {
                    if (i == i2) {
                        if (i == 4 && !"content".equalsIgnoreCase(icon.j().getScheme())) {
                            w26.i(icon, "Unsupported URI scheme for: ");
                            return;
                        }
                        return;
                    }
                }
                w26.j(de9.k(i, "Custom icon type is not allowed: "));
                return;
            }
            sc8.j("Custom icon does not have a backing IconCompat");
        }
    }
}
