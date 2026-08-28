package k2;

import android.animation.TypeEvaluator;
import f7.i8;
public final class e implements TypeEvaluator {
    public i0.d[] f14531a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (i8.a(dVarArr, dVarArr2)) {
            if (!i8.a(this.f14531a, dVarArr)) {
                this.f14531a = i8.e(dVarArr);
            }
            for (int i9 = 0; i9 < dVarArr.length; i9++) {
                i0.d dVar = this.f14531a[i9];
                i0.d dVar2 = dVarArr[i9];
                i0.d dVar3 = dVarArr2[i9];
                dVar.getClass();
                dVar.f10852a = dVar2.f10852a;
                int i10 = 0;
                while (true) {
                    float[] fArr = dVar2.f10853b;
                    if (i10 < fArr.length) {
                        dVar.f10853b[i10] = (dVar3.f10853b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                        i10++;
                    }
                }
            }
            return this.f14531a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
