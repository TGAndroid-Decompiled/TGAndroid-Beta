package defpackage;
public final class l29 extends ja {
    public final k39 c;

    public l29(int i, k39 k39Var) {
        super(i, false);
        this.c = k39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l29.class == obj.getClass()) {
            l29 l29Var = (l29) obj;
            int i = this.a;
            int i2 = l29Var.a;
            if (i == i2 && (i == 0 || i == 3)) {
                k39 k39Var = this.c;
                if (k39Var != null && k39Var.equals(l29Var.c)) {
                    return true;
                }
                return false;
            } else if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
