package da;
public final class d1 {
    public String f7986a;
    public int f7987b;
    public int f7988c;
    public boolean d;
    public byte f7989e;

    public final e1 a() {
        String str;
        if (this.f7989e == 7 && (str = this.f7986a) != null) {
            return new e1(this.f7987b, this.f7988c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7986a == null) {
            sb2.append(" processName");
        }
        if ((this.f7989e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f7989e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7989e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
