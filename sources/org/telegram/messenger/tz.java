package org.telegram.messenger;
public class tz {
    public final String f27100c;
    public int d;
    public final uz f27101e;
    public long f27099b = -1;
    public final long f27098a = System.currentTimeMillis();

    public tz(uz uzVar, String str) {
        this.f27101e = uzVar;
        this.f27100c = str;
        uzVar.f27260a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27100c);
        sb2.append(": ");
        if (this.f27099b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f27099b - this.f27098a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
