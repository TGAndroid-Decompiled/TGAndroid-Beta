package da;
public final class c0 {
    public String f7984a;
    public String f7985b;
    public int f7986c;
    public String d;
    public String f7987e;
    public String f7988f;
    public String f7989g;
    public String h;
    public String f7990i;
    public t2 f7991j;
    public x1 f7992k;
    public u1 f7993l;
    public byte f7994m;

    public final d0 a() {
        if (this.f7994m == 1 && this.f7984a != null && this.f7985b != null && this.d != null && this.h != null && this.f7990i != null) {
            return new d0(this.f7984a, this.f7985b, this.f7986c, this.d, this.f7987e, this.f7988f, this.f7989g, this.h, this.f7990i, this.f7991j, this.f7992k, this.f7993l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7984a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7985b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7994m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7990i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
