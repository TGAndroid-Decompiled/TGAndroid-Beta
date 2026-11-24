package defpackage;
public final class b71 extends ja {
    public final t61 c;

    public b71(int i, t61 t61Var) {
        super(i, false);
        this.c = t61Var;
    }

    public final boolean equals(Object obj) {
        t61 t61Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || b71.class != obj.getClass()) {
            return false;
        }
        b71 b71Var = (b71) obj;
        if (this.a != b71Var.a) {
            return false;
        }
        t61 t61Var2 = this.c;
        if (t61Var2 == null || (t61Var = b71Var.c) == null || t61Var2.a == t61Var.a) {
            return true;
        }
        return false;
    }
}
