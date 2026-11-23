package da;
public final class m1 {
    public int f8131a;
    public String f8132b;
    public String f8133c;
    public boolean d;
    public byte f8134e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f8134e == 3 && (str = this.f8132b) != null && (str2 = this.f8133c) != null) {
            return new n1(this.f8131a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8134e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f8132b == null) {
            sb2.append(" version");
        }
        if (this.f8133c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f8134e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
