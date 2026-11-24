package defpackage;

import android.animation.TypeEvaluator;
public final class to implements TypeEvaluator {
    public m08[] a;

    @Override
    public final Object evaluate(float f, Object obj, Object obj2) {
        m08[] m08VarArr = (m08[]) obj;
        m08[] m08VarArr2 = (m08[]) obj2;
        if (pse.a(m08VarArr, m08VarArr2)) {
            if (!pse.a(this.a, m08VarArr)) {
                this.a = pse.e(m08VarArr);
            }
            int i = 0;
            while (true) {
                int length = m08VarArr.length;
                m08[] m08VarArr3 = this.a;
                if (i < length) {
                    m08 m08Var = m08VarArr3[i];
                    m08 m08Var2 = m08VarArr[i];
                    m08 m08Var3 = m08VarArr2[i];
                    m08Var.getClass();
                    m08Var.a = m08Var2.a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = m08Var2.b;
                        if (i2 < fArr.length) {
                            m08Var.b[i2] = (m08Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                    i++;
                } else {
                    return m08VarArr3;
                }
            }
        } else {
            u36.j("Can't interpolate between two incompatible pathData");
            return null;
        }
    }
}
