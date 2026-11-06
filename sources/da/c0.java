package da;
public final class c0 {
    public String f8286a;
    public String f8287b;
    public int f8288c;
    public String d;
    public String f8289e;
    public String f8290f;
    public String f8291g;
    public String h;
    public String f8292i;
    public t2 f8293j;
    public x1 f8294k;
    public u1 f8295l;
    public byte f8296m;

    public final d0 a() {
        if (this.f8296m == 1 && this.f8286a != null && this.f8287b != null && this.d != null && this.h != null && this.f8292i != null) {
            return new d0(this.f8286a, this.f8287b, this.f8288c, this.d, this.f8289e, this.f8290f, this.f8291g, this.h, this.f8292i, this.f8293j, this.f8294k, this.f8295l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8286a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f8287b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f8296m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f8292i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
