package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
public final class a98 {
    public float a = 0.0f;
    public float b = 25.0f;
    public float c = 50.0f;
    public float d = 75.0f;
    public float e = 100.0f;
    public float[] f;

    public final float[] a() {
        float f = this.a;
        float f2 = this.e;
        char c = 2;
        int i = 5;
        char c2 = '\f';
        char c3 = '\r';
        float[] fArr = {-0.001f, f / 100.0f, 0.0f, f / 100.0f, 0.25f, this.b / 100.0f, 0.5f, this.c / 100.0f, 0.75f, this.d / 100.0f, 1.0f, f2 / 100.0f, 1.001f, f2 / 100.0f};
        int i2 = 100;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(Float.valueOf(fArr[0]));
        arrayList2.add(Float.valueOf(fArr[1]));
        int i3 = 1;
        while (i3 < i) {
            int i4 = (i3 - 1) << 1;
            float f3 = fArr[i4];
            float f4 = fArr[i4 + 1];
            int i5 = i3 << 1;
            float f5 = fArr[i5];
            float f6 = fArr[i5 + 1];
            int i6 = i3 + 1;
            int i7 = i6 << 1;
            char c4 = c;
            float f7 = fArr[i7];
            char c5 = c2;
            float f8 = fArr[i7 + 1];
            int i8 = (i3 + 2) << 1;
            float f9 = fArr[i8];
            float f10 = fArr[i8 + 1];
            char c6 = c3;
            int i9 = 1;
            while (i9 < i2) {
                float f11 = i9 * 0.01f;
                float f12 = f11 * f11;
                float f13 = f12 * f11;
                float A = ((((((f5 * 3.0f) - f3) - (f7 * 3.0f)) + f9) * f13) + ((((f7 * 4.0f) + ((f3 * 2.0f) - (f5 * 5.0f))) - f9) * f12) + qd4.A(f7, f3, f11, f5 * 2.0f)) * 0.5f;
                float max = Math.max(0.0f, Math.min(1.0f, ((((((f6 * 3.0f) - f4) - (f8 * 3.0f)) + f10) * f13) + ((((4.0f * f8) + ((2.0f * f4) - (5.0f * f6))) - f10) * f12) + qd4.A(f8, f4, f11, f6 * 2.0f)) * 0.5f));
                if (A > f3) {
                    arrayList2.add(Float.valueOf(A));
                    arrayList2.add(Float.valueOf(max));
                }
                if ((i9 - 1) % 2 == 0) {
                    arrayList.add(Float.valueOf(max));
                }
                i9++;
                i2 = 100;
            }
            arrayList2.add(Float.valueOf(f7));
            arrayList2.add(Float.valueOf(f8));
            i3 = i6;
            c = c4;
            c2 = c5;
            c3 = c6;
            i = 5;
            i2 = 100;
        }
        arrayList2.add(Float.valueOf(fArr[c2]));
        arrayList2.add(Float.valueOf(fArr[c3]));
        this.f = new float[arrayList.size()];
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f;
            if (i10 >= fArr2.length) {
                break;
            }
            fArr2[i10] = ((Float) arrayList.get(i10)).floatValue();
            i10++;
        }
        int size = arrayList2.size();
        float[] fArr3 = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            fArr3[i11] = ((Float) arrayList2.get(i11)).floatValue();
        }
        return fArr3;
    }

    public final boolean b() {
        if (Math.abs(this.a - 0.0f) < 1.0E-5d && Math.abs(this.b - 25.0f) < 1.0E-5d && Math.abs(this.c - 50.0f) < 1.0E-5d && Math.abs(this.d - 75.0f) < 1.0E-5d && Math.abs(this.e - 100.0f) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final void c(NativeByteBuffer nativeByteBuffer) {
        this.a = nativeByteBuffer.readFloat(true);
        this.b = nativeByteBuffer.readFloat(true);
        this.c = nativeByteBuffer.readFloat(true);
        this.d = nativeByteBuffer.readFloat(true);
        this.e = nativeByteBuffer.readFloat(true);
    }

    public final void d(NativeByteBuffer nativeByteBuffer) {
        nativeByteBuffer.writeFloat(this.a);
        nativeByteBuffer.writeFloat(this.b);
        nativeByteBuffer.writeFloat(this.c);
        nativeByteBuffer.writeFloat(this.d);
        nativeByteBuffer.writeFloat(this.e);
    }
}
