package da;
public final class d1 {
    public String f7994a;
    public int f7995b;
    public int f7996c;
    public boolean d;
    public byte f7997e;

    public final e1 a() {
        String str;
        if (this.f7997e == 7 && (str = this.f7994a) != null) {
            return new e1(this.f7995b, this.f7996c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7994a == null) {
            sb2.append(" processName");
        }
        if ((this.f7997e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f7997e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7997e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
