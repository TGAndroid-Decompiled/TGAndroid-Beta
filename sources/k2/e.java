package k2;

import android.animation.TypeEvaluator;
import j7.y7;
public final class e implements TypeEvaluator {
    public i0.d[] f9643a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (y7.a(dVarArr, dVarArr2)) {
            if (!y7.a(this.f9643a, dVarArr)) {
                this.f9643a = y7.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f9643a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f7217a = dVar2.f7217a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f7218b;
                    if (i11 < fArr.length) {
                        dVar.f7218b[i11] = (dVar3.f7218b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f9643a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
