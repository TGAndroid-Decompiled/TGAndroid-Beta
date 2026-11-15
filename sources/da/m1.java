package da;
public final class m1 {
    public int f7817a;
    public String f7818b;
    public String f7819c;
    public boolean d;
    public byte f7820e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f7820e == 3 && (str = this.f7818b) != null && (str2 = this.f7819c) != null) {
            return new n1(this.f7817a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7820e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f7818b == null) {
            sb2.append(" version");
        }
        if (this.f7819c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f7820e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
