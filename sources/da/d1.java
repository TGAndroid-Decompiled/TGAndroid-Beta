package da;
public final class d1 {
    public String f8322a;
    public int f8323b;
    public int f8324c;
    public boolean d;
    public byte f8325e;

    public final e1 a() {
        String str;
        if (this.f8325e == 7 && (str = this.f8322a) != null) {
            return new e1(this.f8323b, this.f8324c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8322a == null) {
            sb2.append(" processName");
        }
        if ((this.f8325e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f8325e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8325e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
