package da;
public final class c0 {
    public String f8289a;
    public String f8290b;
    public int f8291c;
    public String d;
    public String f8292e;
    public String f8293f;
    public String f8294g;
    public String h;
    public String f8295i;
    public t2 f8296j;
    public x1 f8297k;
    public u1 f8298l;
    public byte f8299m;

    public final d0 a() {
        if (this.f8299m == 1 && this.f8289a != null && this.f8290b != null && this.d != null && this.h != null && this.f8295i != null) {
            return new d0(this.f8289a, this.f8290b, this.f8291c, this.d, this.f8292e, this.f8293f, this.f8294g, this.h, this.f8295i, this.f8296j, this.f8297k, this.f8298l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8289a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f8290b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f8299m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f8295i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
