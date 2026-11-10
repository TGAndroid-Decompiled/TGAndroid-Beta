package da;
public final class d1 {
    public String f8325a;
    public int f8326b;
    public int f8327c;
    public boolean d;
    public byte f8328e;

    public final e1 a() {
        String str;
        if (this.f8328e == 7 && (str = this.f8325a) != null) {
            return new e1(this.f8326b, this.f8327c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8325a == null) {
            sb2.append(" processName");
        }
        if ((this.f8328e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f8328e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8328e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
