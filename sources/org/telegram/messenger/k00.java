package org.telegram.messenger;
public class k00 {
    public final String f16502c;
    public int d;
    public final l00 e;
    public long f16501b = -1;
    public final long f16500a = System.currentTimeMillis();

    public k00(l00 l00Var, String str) {
        this.e = l00Var;
        this.f16502c = str;
        l00Var.f16659a++;
    }

    public String toString() {
        String q6;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16502c);
        sb2.append(": ");
        if (this.f16501b < 0) {
            q6 = "not done";
        } else {
            q6 = a1.g.q(new StringBuilder(), this.f16501b - this.f16500a, "ms");
        }
        sb2.append(q6);
        return sb2.toString();
    }
}
