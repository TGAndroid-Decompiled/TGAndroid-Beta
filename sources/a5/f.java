package a5;

import android.animation.TypeEvaluator;
import c8.m0;
public final class f implements TypeEvaluator {
    public i0.d[] f217a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (m0.a(dVarArr, dVarArr2)) {
            if (!m0.a(this.f217a, dVarArr)) {
                this.f217a = m0.e(dVarArr);
            }
            for (int i7 = 0; i7 < dVarArr.length; i7++) {
                i0.d dVar = this.f217a[i7];
                i0.d dVar2 = dVarArr[i7];
                i0.d dVar3 = dVarArr2[i7];
                dVar.getClass();
                dVar.f15887a = dVar2.f15887a;
                int i10 = 0;
                while (true) {
                    float[] fArr = dVar2.f15888b;
                    if (i10 < fArr.length) {
                        dVar.f15888b[i10] = (dVar3.f15888b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                        i10++;
                    }
                }
            }
            return this.f217a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
