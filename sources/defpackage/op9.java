package defpackage;

import j$.util.Objects;
public final class op9 extends ja {
    public final qp9 c;
    public final String d;

    public op9(int i, String str) {
        super(i, false);
        this.d = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        qp9 qp9Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || op9.class != obj.getClass()) {
            return false;
        }
        op9 op9Var = (op9) obj;
        if (this.a != op9Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, op9Var.d);
        }
        qp9 qp9Var2 = this.c;
        if (qp9Var2 == null || (qp9Var = op9Var.c) == null || qp9Var2.d == qp9Var.d) {
            return true;
        }
        return false;
    }

    public op9(qp9 qp9Var) {
        super(2, false);
        this.c = qp9Var;
    }

    public op9(int i) {
        super(i, false);
        this.c = null;
    }
}
