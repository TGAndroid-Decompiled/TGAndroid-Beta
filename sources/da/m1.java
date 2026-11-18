package da;
public final class m1 {
    public int f8102a;
    public String f8103b;
    public String f8104c;
    public boolean d;
    public byte f8105e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f8105e == 3 && (str = this.f8103b) != null && (str2 = this.f8104c) != null) {
            return new n1(this.f8102a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8105e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f8103b == null) {
            sb2.append(" version");
        }
        if (this.f8104c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f8105e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
