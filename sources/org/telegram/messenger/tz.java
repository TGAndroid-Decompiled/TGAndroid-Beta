package org.telegram.messenger;
public class tz {
    public final String f27136c;
    public int d;
    public final uz f27137e;
    public long f27135b = -1;
    public final long f27134a = System.currentTimeMillis();

    public tz(uz uzVar, String str) {
        this.f27137e = uzVar;
        this.f27136c = str;
        uzVar.f27296a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27136c);
        sb2.append(": ");
        if (this.f27135b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f27135b - this.f27134a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
