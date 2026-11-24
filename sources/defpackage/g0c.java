package defpackage;
public final class g0c {
    public static final g0c b;
    public static final String c;
    public final mo5 a;

    static {
        ko5 ko5Var = mo5.b;
        b = new g0c(y79.e);
        String str = hac.a;
        c = "0";
    }

    public g0c(y79 y79Var) {
        this.a = mo5.q(y79Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            mo5 mo5Var = this.a;
            if (i2 >= mo5Var.size()) {
                return false;
            }
            f0c f0cVar = (f0c) mo5Var.get(i2);
            boolean[] zArr = f0cVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (zArr[i3]) {
                    if (f0cVar.b.c == i) {
                        return true;
                    }
                } else {
                    i3++;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0c.class == obj.getClass()) {
            return this.a.equals(((g0c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
