package org.telegram.messenger;
public class rz {
    public final String f25257c;
    public int d;
    public final sz f25258e;
    public long f25256b = -1;
    public final long f25255a = System.currentTimeMillis();

    public rz(sz szVar, String str) {
        this.f25258e = szVar;
        this.f25257c = str;
        szVar.f25451a++;
    }

    public String toString() {
        String r5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25257c);
        sb2.append(": ");
        if (this.f25256b < 0) {
            r5 = "not done";
        } else {
            r5 = a1.g.r(new StringBuilder(), this.f25256b - this.f25255a, "ms");
        }
        sb2.append(r5);
        return sb2.toString();
    }
}
