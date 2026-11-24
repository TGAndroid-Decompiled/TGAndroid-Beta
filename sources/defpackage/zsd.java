package defpackage;
public abstract class zsd {
    public static y11 a(int i, w11 w11Var, int i2) {
        int i3 = i2 & 2;
        w11 w11Var2 = w11.a;
        if (i3 != 0) {
            w11Var = w11Var2;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (w11Var == w11Var2) {
                            return new y11(i);
                        }
                        return new ht2(i, w11Var);
                    }
                    return new y11(Integer.MAX_VALUE);
                } else if (w11Var == w11Var2) {
                    return new y11(0);
                } else {
                    return new ht2(1, w11Var);
                }
            } else if (w11Var == w11Var2) {
                return new ht2(1, w11.b);
            } else {
                u36.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (w11Var == w11Var2) {
            wf1.p.getClass();
            return new y11(vf1.b);
        } else {
            return new ht2(1, w11Var);
        }
    }
}
