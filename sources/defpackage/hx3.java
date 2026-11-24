package defpackage;

import android.content.Context;
public final class hx3 extends u0b {
    public final boolean H3;
    public final ix3 I3;

    public hx3(ix3 ix3Var, Context context, int i, ylb ylbVar, boolean z) {
        super(i, ylbVar, context);
        this.I3 = ix3Var;
        this.H3 = z;
    }

    @Override
    public final r0b[] E1(r0b[] r0bVarArr) {
        if (r0bVarArr != null && this.H3) {
            int i = 0;
            while (true) {
                if (i < r0bVarArr.length) {
                    r0b r0bVar = r0bVarArr[i];
                    if (r0bVar != null && r0bVar.b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                int length = r0bVarArr.length;
                r0b[] r0bVarArr2 = new r0b[length];
                r0bVarArr2[0] = r0bVarArr[i];
                for (int i2 = 1; i2 < length; i2++) {
                    r0bVarArr2[i2] = r0bVarArr[i2 <= i ? i2 - 1 : i2];
                }
                return r0bVarArr2;
            }
        }
        return r0bVarArr;
    }

    @Override
    public final void H1(int i) {
        super.H1(i);
        this.I3.d(false);
    }
}
