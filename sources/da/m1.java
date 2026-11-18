package da;
public final class m1 {
    public int f8099a;
    public String f8100b;
    public String f8101c;
    public boolean d;
    public byte f8102e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f8102e == 3 && (str = this.f8100b) != null && (str2 = this.f8101c) != null) {
            return new n1(this.f8099a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8102e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f8100b == null) {
            sb2.append(" version");
        }
        if (this.f8101c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f8102e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
