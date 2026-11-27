package defpackage;
public abstract class mvd {
    public static z01 a(int i, x01 x01Var, int i2) {
        int i3 = i2 & 2;
        x01 x01Var2 = x01.a;
        if (i3 != 0) {
            x01Var = x01Var2;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (x01Var == x01Var2) {
                            return new z01(i);
                        }
                        return new ps2(i, x01Var);
                    }
                    return new z01(Integer.MAX_VALUE);
                } else if (x01Var == x01Var2) {
                    return new z01(0);
                } else {
                    return new ps2(1, x01Var);
                }
            } else if (x01Var == x01Var2) {
                return new ps2(1, x01.b);
            } else {
                lq5.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (x01Var == x01Var2) {
            xe1.p.getClass();
            return new z01(we1.b);
        } else {
            return new ps2(1, x01Var);
        }
    }
}
