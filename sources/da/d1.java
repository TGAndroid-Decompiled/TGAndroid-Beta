package da;
public final class d1 {
    public String f7709a;
    public int f7710b;
    public int f7711c;
    public boolean d;
    public byte f7712e;

    public final e1 a() {
        String str;
        if (this.f7712e == 7 && (str = this.f7709a) != null) {
            return new e1(this.f7710b, this.f7711c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7709a == null) {
            sb2.append(" processName");
        }
        if ((this.f7712e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f7712e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7712e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
