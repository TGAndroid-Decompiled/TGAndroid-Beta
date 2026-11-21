package da;
public final class d1 {
    public String f8020a;
    public int f8021b;
    public int f8022c;
    public boolean d;
    public byte f8023e;

    public final e1 a() {
        String str;
        if (this.f8023e == 7 && (str = this.f8020a) != null) {
            return new e1(this.f8021b, this.f8022c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8020a == null) {
            sb2.append(" processName");
        }
        if ((this.f8023e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f8023e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8023e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
