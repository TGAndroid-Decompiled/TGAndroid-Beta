package da;

import java.util.List;
public final class e0 {
    public int f8027a;
    public String f8028b;
    public int f8029c;
    public int d;
    public long f8030e;
    public long f8031f;
    public long f8032g;
    public String h;
    public List f8033i;
    public byte f8034j;

    public final f0 a() {
        String str;
        if (this.f8034j == 63 && (str = this.f8028b) != null) {
            return new f0(this.f8027a, str, this.f8029c, this.d, this.f8030e, this.f8031f, this.f8032g, this.h, this.f8033i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8034j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f8028b == null) {
            sb2.append(" processName");
        }
        if ((this.f8034j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8034j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8034j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8034j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8034j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
