package defpackage;
public class qqb {
    public final String c;
    public int d;
    public final rqb e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public qqb(rqb rqbVar, String str) {
        this.e = rqbVar;
        this.c = str;
        rqbVar.a++;
    }

    public String toString() {
        String q;
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(": ");
        if (this.b < 0) {
            q = "not done";
        } else {
            q = kt6.q(new StringBuilder(), this.b - this.a, "ms");
        }
        sb.append(q);
        return sb.toString();
    }
}
