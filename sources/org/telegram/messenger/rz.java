package org.telegram.messenger;
public class rz {
    public final String f26817c;
    public int d;
    public final sz f26818e;
    public long f26816b = -1;
    public final long f26815a = System.currentTimeMillis();

    public rz(sz szVar, String str) {
        this.f26818e = szVar;
        this.f26817c = str;
        szVar.f27007a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26817c);
        sb2.append(": ");
        if (this.f26816b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26816b - this.f26815a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
