package da;
public final class m1 {
    public int f8433a;
    public String f8434b;
    public String f8435c;
    public boolean d;
    public byte f8436e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f8436e == 3 && (str = this.f8434b) != null && (str2 = this.f8435c) != null) {
            return new n1(this.f8433a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8436e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f8434b == null) {
            sb2.append(" version");
        }
        if (this.f8435c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f8436e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
