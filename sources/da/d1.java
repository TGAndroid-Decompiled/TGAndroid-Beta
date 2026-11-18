package da;
public final class d1 {
    public String f7991a;
    public int f7992b;
    public int f7993c;
    public boolean d;
    public byte f7994e;

    public final e1 a() {
        String str;
        if (this.f7994e == 7 && (str = this.f7991a) != null) {
            return new e1(this.f7992b, this.f7993c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7991a == null) {
            sb2.append(" processName");
        }
        if ((this.f7994e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f7994e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7994e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
