package da;
public final class m1 {
    public int f7820a;
    public String f7821b;
    public String f7822c;
    public boolean d;
    public byte f7823e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f7823e == 3 && (str = this.f7821b) != null && (str2 = this.f7822c) != null) {
            return new n1(this.f7820a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7823e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f7821b == null) {
            sb2.append(" version");
        }
        if (this.f7822c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f7823e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
