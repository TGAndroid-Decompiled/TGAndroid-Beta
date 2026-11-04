package ca;
public final class q0 {
    public int f4500a;
    public String f4501b;
    public int f4502c;
    public long d;
    public long f4503e;
    public boolean f4504f;
    public int f4505g;
    public String h;
    public String f4506i;
    public byte f4507j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f4507j == 63 && (str = this.f4501b) != null && (str2 = this.h) != null && (str3 = this.f4506i) != null) {
            return new r0(this.f4500a, str, this.f4502c, this.d, this.f4503e, this.f4504f, this.f4505g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f4507j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f4501b == null) {
            sb2.append(" model");
        }
        if ((this.f4507j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f4507j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f4507j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f4507j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f4507j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f4506i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
