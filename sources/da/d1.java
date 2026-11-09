package da;
public final class d1 {
    public String f8320a;
    public int f8321b;
    public int f8322c;
    public boolean d;
    public byte f8323e;

    public final e1 a() {
        String str;
        if (this.f8323e == 7 && (str = this.f8320a) != null) {
            return new e1(this.f8321b, this.f8322c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8320a == null) {
            sb2.append(" processName");
        }
        if ((this.f8323e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f8323e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8323e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
