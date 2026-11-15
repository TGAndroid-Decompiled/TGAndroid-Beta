package org.telegram.messenger;
public class wz {
    public final String f27439c;
    public int d;
    public final xz f27440e;
    public long f27438b = -1;
    public final long f27437a = System.currentTimeMillis();

    public wz(xz xzVar, String str) {
        this.f27440e = xzVar;
        this.f27439c = str;
        xzVar.f27630a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27439c);
        sb2.append(": ");
        if (this.f27438b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f27438b - this.f27437a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
