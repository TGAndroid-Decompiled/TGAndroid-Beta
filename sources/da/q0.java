package da;
public final class q0 {
    public int f7864a;
    public String f7865b;
    public int f7866c;
    public long d;
    public long f7867e;
    public boolean f7868f;
    public int f7869g;
    public String h;
    public String f7870i;
    public byte f7871j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f7871j == 63 && (str = this.f7865b) != null && (str2 = this.h) != null && (str3 = this.f7870i) != null) {
            return new r0(this.f7864a, str, this.f7866c, this.d, this.f7867e, this.f7868f, this.f7869g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7871j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f7865b == null) {
            sb2.append(" model");
        }
        if ((this.f7871j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f7871j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f7871j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f7871j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f7871j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f7870i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
