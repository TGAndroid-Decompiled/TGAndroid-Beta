package da;
public final class d1 {
    public String f7712a;
    public int f7713b;
    public int f7714c;
    public boolean d;
    public byte f7715e;

    public final e1 a() {
        String str;
        if (this.f7715e == 7 && (str = this.f7712a) != null) {
            return new e1(this.f7713b, this.f7714c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7712a == null) {
            sb2.append(" processName");
        }
        if ((this.f7715e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f7715e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7715e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
