package da;
public final class c0 {
    public String f7955a;
    public String f7956b;
    public int f7957c;
    public String d;
    public String f7958e;
    public String f7959f;
    public String f7960g;
    public String h;
    public String f7961i;
    public t2 f7962j;
    public x1 f7963k;
    public u1 f7964l;
    public byte f7965m;

    public final d0 a() {
        if (this.f7965m == 1 && this.f7955a != null && this.f7956b != null && this.d != null && this.h != null && this.f7961i != null) {
            return new d0(this.f7955a, this.f7956b, this.f7957c, this.d, this.f7958e, this.f7959f, this.f7960g, this.h, this.f7961i, this.f7962j, this.f7963k, this.f7964l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7955a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7956b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7965m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7961i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
