package a5;

import android.animation.TypeEvaluator;
import c8.j0;
public final class f implements TypeEvaluator {
    public i0.e[] f217a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (j0.a(eVarArr, eVarArr2)) {
            if (!j0.a(this.f217a, eVarArr)) {
                this.f217a = j0.e(eVarArr);
            }
            for (int i7 = 0; i7 < eVarArr.length; i7++) {
                i0.e eVar = this.f217a[i7];
                i0.e eVar2 = eVarArr[i7];
                i0.e eVar3 = eVarArr2[i7];
                eVar.getClass();
                eVar.f15578a = eVar2.f15578a;
                int i10 = 0;
                while (true) {
                    float[] fArr = eVar2.f15579b;
                    if (i10 < fArr.length) {
                        eVar.f15579b[i10] = (eVar3.f15579b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                        i10++;
                    }
                }
            }
            return this.f217a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
