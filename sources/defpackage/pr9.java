package defpackage;

import j$.util.Objects;
public final class pr9 extends ja {
    public final rr9 c;
    public final String d;

    public pr9(int i, String str) {
        super(i, false);
        this.d = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        rr9 rr9Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || pr9.class != obj.getClass()) {
            return false;
        }
        pr9 pr9Var = (pr9) obj;
        if (this.a != pr9Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, pr9Var.d);
        }
        rr9 rr9Var2 = this.c;
        if (rr9Var2 == null || (rr9Var = pr9Var.c) == null || rr9Var2.d == rr9Var.d) {
            return true;
        }
        return false;
    }

    public pr9(rr9 rr9Var) {
        super(2, false);
        this.c = rr9Var;
    }

    public pr9(int i) {
        super(i, false);
        this.c = null;
    }
}
