package defpackage;

import java.util.Map;
public final class rh5 extends hr9 {
    public final Map K;
    public as3 L;

    public rh5(mx6 mx6Var, is3 is3Var, fs3 fs3Var, Map map) {
        super(mx6Var, is3Var, fs3Var);
        this.K = map;
    }

    @Override
    public final go4 q(go4 go4Var) {
        as3 as3Var;
        as3 as3Var2 = this.L;
        if (as3Var2 == null) {
            as3Var2 = go4Var.x;
        }
        if (as3Var2 != null && (as3Var = (as3) this.K.get(as3Var2.c)) != null) {
            as3Var2 = as3Var;
        }
        nf7 nf7Var = go4Var.m;
        nf7 nf7Var2 = null;
        if (nf7Var != null) {
            lf7[] lf7VarArr = nf7Var.a;
            int length = lf7VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    lf7 lf7Var = lf7VarArr[i];
                    if ((lf7Var instanceof ol8) && "com.apple.streaming.transportStreamTimestamp".equals(((ol8) lf7Var).b)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                if (length != 1) {
                    lf7[] lf7VarArr2 = new lf7[length - 1];
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 != i) {
                            lf7VarArr2[i2 < i ? i2 : i2 - 1] = lf7VarArr[i2];
                        }
                    }
                    nf7Var2 = new nf7(lf7VarArr2);
                }
            }
            if (as3Var2 == go4Var.x || nf7Var != go4Var.m) {
                fo4 a = go4Var.a();
                a.w = as3Var2;
                a.l = nf7Var;
                go4Var = new go4(a);
            }
            return super.q(go4Var);
        }
        nf7Var = nf7Var2;
        if (as3Var2 == go4Var.x) {
        }
        fo4 a2 = go4Var.a();
        a2.w = as3Var2;
        a2.l = nf7Var;
        go4Var = new go4(a2);
        return super.q(go4Var);
    }
}
