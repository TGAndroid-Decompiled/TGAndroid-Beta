package defpackage;

import android.animation.TypeEvaluator;
public final class sn implements TypeEvaluator {
    public ky7[] a;

    @Override
    public final Object evaluate(float f, Object obj, Object obj2) {
        ky7[] ky7VarArr = (ky7[]) obj;
        ky7[] ky7VarArr2 = (ky7[]) obj2;
        if (mqe.a(ky7VarArr, ky7VarArr2)) {
            if (!mqe.a(this.a, ky7VarArr)) {
                this.a = mqe.e(ky7VarArr);
            }
            int i = 0;
            while (true) {
                int length = ky7VarArr.length;
                ky7[] ky7VarArr3 = this.a;
                if (i < length) {
                    ky7 ky7Var = ky7VarArr3[i];
                    ky7 ky7Var2 = ky7VarArr[i];
                    ky7 ky7Var3 = ky7VarArr2[i];
                    ky7Var.getClass();
                    ky7Var.a = ky7Var2.a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = ky7Var2.b;
                        if (i2 < fArr.length) {
                            ky7Var.b[i2] = (ky7Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                    i++;
                } else {
                    return ky7VarArr3;
                }
            }
        } else {
            w26.j("Can't interpolate between two incompatible pathData");
            return null;
        }
    }
}
