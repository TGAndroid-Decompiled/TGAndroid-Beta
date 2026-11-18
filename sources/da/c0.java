package da;
public final class c0 {
    public String f7958a;
    public String f7959b;
    public int f7960c;
    public String d;
    public String f7961e;
    public String f7962f;
    public String f7963g;
    public String h;
    public String f7964i;
    public t2 f7965j;
    public x1 f7966k;
    public u1 f7967l;
    public byte f7968m;

    public final d0 a() {
        if (this.f7968m == 1 && this.f7958a != null && this.f7959b != null && this.d != null && this.h != null && this.f7964i != null) {
            return new d0(this.f7958a, this.f7959b, this.f7960c, this.d, this.f7961e, this.f7962f, this.f7963g, this.h, this.f7964i, this.f7965j, this.f7966k, this.f7967l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7958a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7959b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7968m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7964i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
