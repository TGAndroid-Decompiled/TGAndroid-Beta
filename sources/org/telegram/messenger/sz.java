package org.telegram.messenger;
public class sz {
    public final String f26936c;
    public int d;
    public final tz f26937e;
    public long f26935b = -1;
    public final long f26934a = System.currentTimeMillis();

    public sz(tz tzVar, String str) {
        this.f26937e = tzVar;
        this.f26936c = str;
        tzVar.f27126a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26936c);
        sb2.append(": ");
        if (this.f26935b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26935b - this.f26934a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
