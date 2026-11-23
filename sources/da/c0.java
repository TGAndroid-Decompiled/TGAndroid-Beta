package da;
public final class c0 {
    public String f7949a;
    public String f7950b;
    public int f7951c;
    public String d;
    public String f7952e;
    public String f7953f;
    public String f7954g;
    public String h;
    public String f7955i;
    public t2 f7956j;
    public x1 f7957k;
    public u1 f7958l;
    public byte f7959m;

    public final d0 a() {
        if (this.f7959m == 1 && this.f7949a != null && this.f7950b != null && this.d != null && this.h != null && this.f7955i != null) {
            return new d0(this.f7949a, this.f7950b, this.f7951c, this.d, this.f7952e, this.f7953f, this.f7954g, this.h, this.f7955i, this.f7956j, this.f7957k, this.f7958l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7949a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7950b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7959m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7955i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
