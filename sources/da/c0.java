package da;
public final class c0 {
    public String f8284a;
    public String f8285b;
    public int f8286c;
    public String d;
    public String f8287e;
    public String f8288f;
    public String f8289g;
    public String h;
    public String f8290i;
    public t2 f8291j;
    public x1 f8292k;
    public u1 f8293l;
    public byte f8294m;

    public final d0 a() {
        if (this.f8294m == 1 && this.f8284a != null && this.f8285b != null && this.d != null && this.h != null && this.f8290i != null) {
            return new d0(this.f8284a, this.f8285b, this.f8286c, this.d, this.f8287e, this.f8288f, this.f8289g, this.h, this.f8290i, this.f8291j, this.f8292k, this.f8293l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8284a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f8285b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f8294m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f8290i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
