package defpackage;

import java.util.Map;
public final class sf5 extends gp9 {
    public final Map K;
    public qq3 L;

    public sf5(mv6 mv6Var, yq3 yq3Var, vq3 vq3Var, Map map) {
        super(mv6Var, yq3Var, vq3Var);
        this.K = map;
    }

    @Override
    public final fm4 q(fm4 fm4Var) {
        qq3 qq3Var;
        qq3 qq3Var2 = this.L;
        if (qq3Var2 == null) {
            qq3Var2 = fm4Var.x;
        }
        if (qq3Var2 != null && (qq3Var = (qq3) this.K.get(qq3Var2.c)) != null) {
            qq3Var2 = qq3Var;
        }
        ld7 ld7Var = fm4Var.m;
        ld7 ld7Var2 = null;
        if (ld7Var != null) {
            jd7[] jd7VarArr = ld7Var.a;
            int length = jd7VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    jd7 jd7Var = jd7VarArr[i];
                    if ((jd7Var instanceof lj8) && "com.apple.streaming.transportStreamTimestamp".equals(((lj8) jd7Var).b)) {
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
                    jd7[] jd7VarArr2 = new jd7[length - 1];
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 != i) {
                            jd7VarArr2[i2 < i ? i2 : i2 - 1] = jd7VarArr[i2];
                        }
                    }
                    ld7Var2 = new ld7(jd7VarArr2);
                }
            }
            if (qq3Var2 == fm4Var.x || ld7Var != fm4Var.m) {
                em4 a = fm4Var.a();
                a.w = qq3Var2;
                a.l = ld7Var;
                fm4Var = new fm4(a);
            }
            return super.q(fm4Var);
        }
        ld7Var = ld7Var2;
        if (qq3Var2 == fm4Var.x) {
        }
        em4 a2 = fm4Var.a();
        a2.w = qq3Var2;
        a2.l = ld7Var;
        fm4Var = new fm4(a2);
        return super.q(fm4Var);
    }
}
