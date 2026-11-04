package ca;
public final class c0 {
    public String f4312a;
    public String f4313b;
    public int f4314c;
    public String d;
    public String f4315e;
    public String f4316f;
    public String f4317g;
    public String h;
    public String f4318i;
    public t2 f4319j;
    public x1 f4320k;
    public u1 f4321l;
    public byte f4322m;

    public final d0 a() {
        if (this.f4322m == 1 && this.f4312a != null && this.f4313b != null && this.d != null && this.h != null && this.f4318i != null) {
            return new d0(this.f4312a, this.f4313b, this.f4314c, this.d, this.f4315e, this.f4316f, this.f4317g, this.h, this.f4318i, this.f4319j, this.f4320k, this.f4321l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4312a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f4313b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f4322m) == 0) {
            sb2.append(" platform");
        }
        if (this.d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f4318i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
