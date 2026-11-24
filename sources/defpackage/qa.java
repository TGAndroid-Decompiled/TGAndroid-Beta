package defpackage;
public final class qa {
    public final String a;
    public final int b;
    public transient String c;

    public qa(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        String str = this.c;
        if (str == null) {
            String format = String.format("%s:%d", this.a, Integer.valueOf(this.b));
            this.c = format;
            return format;
        }
        return str;
    }
}
