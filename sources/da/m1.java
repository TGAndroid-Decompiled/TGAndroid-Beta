package da;
public final class m1 {
    public int f8093a;
    public String f8094b;
    public String f8095c;
    public boolean d;
    public byte f8096e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f8096e == 3 && (str = this.f8094b) != null && (str2 = this.f8095c) != null) {
            return new n1(this.f8093a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8096e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f8094b == null) {
            sb2.append(" version");
        }
        if (this.f8095c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f8096e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
