package da;
public final class d1 {
    public String f7985a;
    public int f7986b;
    public int f7987c;
    public boolean d;
    public byte f7988e;

    public final e1 a() {
        String str;
        if (this.f7988e == 7 && (str = this.f7985a) != null) {
            return new e1(this.f7986b, this.f7987c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7985a == null) {
            sb2.append(" processName");
        }
        if ((this.f7988e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f7988e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7988e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
