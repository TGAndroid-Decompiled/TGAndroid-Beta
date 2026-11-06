package da;

import java.util.List;
public final class e0 {
    public int f8329a;
    public String f8330b;
    public int f8331c;
    public int d;
    public long f8332e;
    public long f8333f;
    public long f8334g;
    public String h;
    public List f8335i;
    public byte f8336j;

    public final f0 a() {
        String str;
        if (this.f8336j == 63 && (str = this.f8330b) != null) {
            return new f0(this.f8329a, str, this.f8331c, this.d, this.f8332e, this.f8333f, this.f8334g, this.h, this.f8335i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8336j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f8330b == null) {
            sb2.append(" processName");
        }
        if ((this.f8336j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8336j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8336j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8336j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8336j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
