package da;
public final class c0 {
    public String f7676a;
    public String f7677b;
    public int f7678c;
    public String d;
    public String f7679e;
    public String f7680f;
    public String f7681g;
    public String h;
    public String f7682i;
    public t2 f7683j;
    public x1 f7684k;
    public u1 f7685l;
    public byte f7686m;

    public final d0 a() {
        if (this.f7686m == 1 && this.f7676a != null && this.f7677b != null && this.d != null && this.h != null && this.f7682i != null) {
            return new d0(this.f7676a, this.f7677b, this.f7678c, this.d, this.f7679e, this.f7680f, this.f7681g, this.h, this.f7682i, this.f7683j, this.f7684k, this.f7685l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7676a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7677b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7686m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7682i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
