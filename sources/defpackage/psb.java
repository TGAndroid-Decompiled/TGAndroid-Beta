package defpackage;
public class psb {
    public final String c;
    public int d;
    public final qsb e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public psb(qsb qsbVar, String str) {
        this.e = qsbVar;
        this.c = str;
        qsbVar.a++;
    }

    public String toString() {
        String p;
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(": ");
        if (this.b < 0) {
            p = "not done";
        } else {
            p = qu6.p(new StringBuilder(), this.b - this.a, "ms");
        }
        sb.append(p);
        return sb.toString();
    }
}
