package k2;

import android.animation.TypeEvaluator;
import j7.z7;
public final class e implements TypeEvaluator {
    public i0.d[] f9624a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (z7.a(dVarArr, dVarArr2)) {
            if (!z7.a(this.f9624a, dVarArr)) {
                this.f9624a = z7.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f9624a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f7200a = dVar2.f7200a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f7201b;
                    if (i11 < fArr.length) {
                        dVar.f7201b[i11] = (dVar3.f7201b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f9624a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
