package da;

import java.util.List;
public final class e0 {
    public int f8332a;
    public String f8333b;
    public int f8334c;
    public int d;
    public long f8335e;
    public long f8336f;
    public long f8337g;
    public String h;
    public List f8338i;
    public byte f8339j;

    public final f0 a() {
        String str;
        if (this.f8339j == 63 && (str = this.f8333b) != null) {
            return new f0(this.f8332a, str, this.f8334c, this.d, this.f8335e, this.f8336f, this.f8337g, this.h, this.f8338i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8339j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f8333b == null) {
            sb2.append(" processName");
        }
        if ((this.f8339j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8339j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8339j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8339j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8339j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
