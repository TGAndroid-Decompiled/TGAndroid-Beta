package org.telegram.messenger;
public class wz {
    public final String f27438c;
    public int d;
    public final xz f27439e;
    public long f27437b = -1;
    public final long f27436a = System.currentTimeMillis();

    public wz(xz xzVar, String str) {
        this.f27439e = xzVar;
        this.f27438c = str;
        xzVar.f27628a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27438c);
        sb2.append(": ");
        if (this.f27437b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f27437b - this.f27436a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
