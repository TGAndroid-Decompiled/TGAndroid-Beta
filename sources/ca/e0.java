package ca;

import java.util.List;
public final class e0 {
    public int f4355a;
    public String f4356b;
    public int f4357c;
    public int d;
    public long f4358e;
    public long f4359f;
    public long f4360g;
    public String h;
    public List f4361i;
    public byte f4362j;

    public final f0 a() {
        String str;
        if (this.f4362j == 63 && (str = this.f4356b) != null) {
            return new f0(this.f4355a, str, this.f4357c, this.d, this.f4358e, this.f4359f, this.f4360g, this.h, this.f4361i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f4362j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f4356b == null) {
            sb2.append(" processName");
        }
        if ((this.f4362j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f4362j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f4362j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f4362j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f4362j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
