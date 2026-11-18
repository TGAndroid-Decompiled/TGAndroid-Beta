package org.telegram.messenger;
public class sz {
    public final String f26908c;
    public int d;
    public final tz f26909e;
    public long f26907b = -1;
    public final long f26906a = System.currentTimeMillis();

    public sz(tz tzVar, String str) {
        this.f26909e = tzVar;
        this.f26908c = str;
        tzVar.f27098a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26908c);
        sb2.append(": ");
        if (this.f26907b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26907b - this.f26906a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
