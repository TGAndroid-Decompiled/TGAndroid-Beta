package ca;
public final class m1 {
    public int f4456a;
    public String f4457b;
    public String f4458c;
    public boolean d;
    public byte f4459e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f4459e == 3 && (str = this.f4457b) != null && (str2 = this.f4458c) != null) {
            return new n1(this.f4456a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f4459e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f4457b == null) {
            sb2.append(" version");
        }
        if (this.f4458c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f4459e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
