package da;
public final class c0 {
    public String f7673a;
    public String f7674b;
    public int f7675c;
    public String d;
    public String f7676e;
    public String f7677f;
    public String f7678g;
    public String h;
    public String f7679i;
    public t2 f7680j;
    public x1 f7681k;
    public u1 f7682l;
    public byte f7683m;

    public final d0 a() {
        if (this.f7683m == 1 && this.f7673a != null && this.f7674b != null && this.d != null && this.h != null && this.f7679i != null) {
            return new d0(this.f7673a, this.f7674b, this.f7675c, this.d, this.f7676e, this.f7677f, this.f7678g, this.h, this.f7679i, this.f7680j, this.f7681k, this.f7682l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7673a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7674b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7683m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7679i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
