package defpackage;

import android.content.Context;
public final class wv3 extends tya {
    public final boolean H3;
    public final xv3 I3;

    public wv3(xv3 xv3Var, Context context, int i, wjb wjbVar, boolean z) {
        super(i, wjbVar, context);
        this.I3 = xv3Var;
        this.H3 = z;
    }

    @Override
    public final qya[] E1(qya[] qyaVarArr) {
        if (qyaVarArr != null && this.H3) {
            int i = 0;
            while (true) {
                if (i < qyaVarArr.length) {
                    qya qyaVar = qyaVarArr[i];
                    if (qyaVar != null && qyaVar.b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                int length = qyaVarArr.length;
                qya[] qyaVarArr2 = new qya[length];
                qyaVarArr2[0] = qyaVarArr[i];
                for (int i2 = 1; i2 < length; i2++) {
                    qyaVarArr2[i2] = qyaVarArr[i2 <= i ? i2 - 1 : i2];
                }
                return qyaVarArr2;
            }
        }
        return qyaVarArr;
    }

    @Override
    public final void H1(int i) {
        super.H1(i);
        this.I3.d(false);
    }
}
