package k2;

import android.animation.TypeEvaluator;
import g7.w7;

public final class e implements TypeEvaluator {

    public i0.e[] f14352a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (!w7.a(eVarArr, eVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!w7.a(this.f14352a, eVarArr)) {
            this.f14352a = w7.e(eVarArr);
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            i0.e eVar = this.f14352a[i10];
            i0.e eVar2 = eVarArr[i10];
            i0.e eVar3 = eVarArr2[i10];
            eVar.getClass();
            eVar.f10493a = eVar2.f10493a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVar2.f10494b;
                if (i11 < fArr.length) {
                    eVar.f10494b[i11] = (eVar3.f10494b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                    i11++;
                }
            }
        }
        return this.f14352a;
    }
}
