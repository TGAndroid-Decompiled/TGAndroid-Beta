package defpackage;
public final class fa4 {
    public final Long a;
    public final int b;
    public final String c;

    public fa4(Long l, int i, String str) {
        this.a = l;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fa4) && obj.toString().equals(toString())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String l;
        StringBuilder sb = new StringBuilder();
        String str = "-";
        Long l2 = this.a;
        if (l2 == null) {
            l = "-";
        } else {
            l = l2.toString();
        }
        sb.append(l);
        sb.append("#");
        sb.append(this.b);
        sb.append(" ");
        String str2 = this.c;
        if (str2 != null) {
            str = str2;
        }
        sb.append(str);
        return sb.toString();
    }
}
