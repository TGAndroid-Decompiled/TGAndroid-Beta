package da;

import java.util.List;
public final class e0 {
    public int f8327a;
    public String f8328b;
    public int f8329c;
    public int d;
    public long f8330e;
    public long f8331f;
    public long f8332g;
    public String h;
    public List f8333i;
    public byte f8334j;

    public final f0 a() {
        String str;
        if (this.f8334j == 63 && (str = this.f8328b) != null) {
            return new f0(this.f8327a, str, this.f8329c, this.d, this.f8330e, this.f8331f, this.f8332g, this.h, this.f8333i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8334j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f8328b == null) {
            sb2.append(" processName");
        }
        if ((this.f8334j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8334j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8334j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8334j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8334j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
