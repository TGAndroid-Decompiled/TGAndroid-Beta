package defpackage;
public class pob {
    public final String c;
    public int d;
    public final qob e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public pob(qob qobVar, String str) {
        this.e = qobVar;
        this.c = str;
        qobVar.a++;
    }

    public String toString() {
        String p;
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(": ");
        if (this.b < 0) {
            p = "not done";
        } else {
            p = ls6.p(new StringBuilder(), this.b - this.a, "ms");
        }
        sb.append(p);
        return sb.toString();
    }
}
