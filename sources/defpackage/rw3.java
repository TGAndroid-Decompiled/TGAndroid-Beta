package defpackage;

import android.content.Context;
public final class rw3 extends t2b {
    public final boolean H3;
    public final sw3 I3;

    public rw3(sw3 sw3Var, Context context, int i, vnb vnbVar, boolean z) {
        super(i, vnbVar, context);
        this.I3 = sw3Var;
        this.H3 = z;
    }

    @Override
    public final q2b[] F1(q2b[] q2bVarArr) {
        if (q2bVarArr != null && this.H3) {
            int i = 0;
            while (true) {
                if (i < q2bVarArr.length) {
                    q2b q2bVar = q2bVarArr[i];
                    if (q2bVar != null && q2bVar.b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                int length = q2bVarArr.length;
                q2b[] q2bVarArr2 = new q2b[length];
                q2bVarArr2[0] = q2bVarArr[i];
                for (int i2 = 1; i2 < length; i2++) {
                    q2bVarArr2[i2] = q2bVarArr[i2 <= i ? i2 - 1 : i2];
                }
                return q2bVarArr2;
            }
        }
        return q2bVarArr;
    }

    @Override
    public final void I1(int i) {
        super.I1(i);
        this.I3.d(false);
    }
}
