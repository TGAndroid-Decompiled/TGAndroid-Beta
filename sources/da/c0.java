package da;
public final class c0 {
    public String f7950a;
    public String f7951b;
    public int f7952c;
    public String d;
    public String f7953e;
    public String f7954f;
    public String f7955g;
    public String h;
    public String f7956i;
    public t2 f7957j;
    public x1 f7958k;
    public u1 f7959l;
    public byte f7960m;

    public final d0 a() {
        if (this.f7960m == 1 && this.f7950a != null && this.f7951b != null && this.d != null && this.h != null && this.f7956i != null) {
            return new d0(this.f7950a, this.f7951b, this.f7952c, this.d, this.f7953e, this.f7954f, this.f7955g, this.h, this.f7956i, this.f7957j, this.f7958k, this.f7959l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7950a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7951b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7960m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7956i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
