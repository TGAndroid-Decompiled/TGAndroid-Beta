package defpackage;
public final class f2c {
    public static final f2c b;
    public static final String c;
    public final po5 a;

    static {
        no5 no5Var = po5.b;
        b = new f2c(j99.e);
        String str = gcc.a;
        c = "0";
    }

    public f2c(j99 j99Var) {
        this.a = po5.q(j99Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            po5 po5Var = this.a;
            if (i2 >= po5Var.size()) {
                return false;
            }
            e2c e2cVar = (e2c) po5Var.get(i2);
            boolean[] zArr = e2cVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (zArr[i3]) {
                    if (e2cVar.b.c == i) {
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
        if (obj != null && f2c.class == obj.getClass()) {
            return this.a.equals(((f2c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
