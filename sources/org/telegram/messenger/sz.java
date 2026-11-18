package org.telegram.messenger;
public class sz {
    public final String f26910c;
    public int d;
    public final tz f26911e;
    public long f26909b = -1;
    public final long f26908a = System.currentTimeMillis();

    public sz(tz tzVar, String str) {
        this.f26911e = tzVar;
        this.f26910c = str;
        tzVar.f27100a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26910c);
        sb2.append(": ");
        if (this.f26909b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26909b - this.f26908a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
