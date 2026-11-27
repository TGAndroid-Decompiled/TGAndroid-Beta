package defpackage;
public final class c61 extends ka {
    public final u51 c;

    public c61(int i, u51 u51Var) {
        super(i, false);
        this.c = u51Var;
    }

    public final boolean equals(Object obj) {
        u51 u51Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || c61.class != obj.getClass()) {
            return false;
        }
        c61 c61Var = (c61) obj;
        if (this.a != c61Var.a) {
            return false;
        }
        u51 u51Var2 = this.c;
        if (u51Var2 == null || (u51Var = c61Var.c) == null || u51Var2.a == u51Var.a) {
            return true;
        }
        return false;
    }
}
