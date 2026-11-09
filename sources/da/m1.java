package da;
public final class m1 {
    public int f8428a;
    public String f8429b;
    public String f8430c;
    public boolean d;
    public byte f8431e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f8431e == 3 && (str = this.f8429b) != null && (str2 = this.f8430c) != null) {
            return new n1(this.f8428a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8431e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f8429b == null) {
            sb2.append(" version");
        }
        if (this.f8430c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f8431e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
