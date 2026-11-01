package org.telegram.messenger;
public class l00 {
    public final String f16858c;
    public int d;
    public final m00 e;
    public long f16857b = -1;
    public final long f16856a = System.currentTimeMillis();

    public l00(m00 m00Var, String str) {
        this.e = m00Var;
        this.f16858c = str;
        m00Var.f17022a++;
    }

    public String toString() {
        String q6;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16858c);
        sb2.append(": ");
        if (this.f16857b < 0) {
            q6 = "not done";
        } else {
            q6 = a1.g.q(new StringBuilder(), this.f16857b - this.f16856a, "ms");
        }
        sb2.append(q6);
        return sb2.toString();
    }
}
