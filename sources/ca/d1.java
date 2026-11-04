package ca;
public final class d1 {
    public String f4348a;
    public int f4349b;
    public int f4350c;
    public boolean d;
    public byte f4351e;

    public final e1 a() {
        String str;
        if (this.f4351e == 7 && (str = this.f4348a) != null) {
            return new e1(this.f4349b, this.f4350c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4348a == null) {
            sb2.append(" processName");
        }
        if ((this.f4351e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f4351e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f4351e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
