package da;
public final class c0 {
    public String f7987a;
    public String f7988b;
    public int f7989c;
    public String d;
    public String f7990e;
    public String f7991f;
    public String f7992g;
    public String h;
    public String f7993i;
    public t2 f7994j;
    public x1 f7995k;
    public u1 f7996l;
    public byte f7997m;

    public final d0 a() {
        if (this.f7997m == 1 && this.f7987a != null && this.f7988b != null && this.d != null && this.h != null && this.f7993i != null) {
            return new d0(this.f7987a, this.f7988b, this.f7989c, this.d, this.f7990e, this.f7991f, this.f7992g, this.h, this.f7993i, this.f7994j, this.f7995k, this.f7996l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7987a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f7988b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f7997m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f7993i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
