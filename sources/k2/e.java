package k2;

import android.animation.TypeEvaluator;
import h7.c8;
public final class e implements TypeEvaluator {
    public i0.d[] f13343a;

    @Override
    public final Object evaluate(float f9, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (c8.a(dVarArr, dVarArr2)) {
            if (!c8.a(this.f13343a, dVarArr)) {
                this.f13343a = c8.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f13343a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f8190a = dVar2.f8190a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f8191b;
                    if (i11 < fArr.length) {
                        dVar.f8191b[i11] = (dVar3.f8191b[i11] * f9) + ((1.0f - f9) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f13343a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
