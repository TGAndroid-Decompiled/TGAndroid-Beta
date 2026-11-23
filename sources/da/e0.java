package da;

import java.util.List;
public final class e0 {
    public int f8030a;
    public String f8031b;
    public int f8032c;
    public int d;
    public long f8033e;
    public long f8034f;
    public long f8035g;
    public String h;
    public List f8036i;
    public byte f8037j;

    public final f0 a() {
        String str;
        if (this.f8037j == 63 && (str = this.f8031b) != null) {
            return new f0(this.f8030a, str, this.f8032c, this.d, this.f8033e, this.f8034f, this.f8035g, this.h, this.f8036i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8037j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f8031b == null) {
            sb2.append(" processName");
        }
        if ((this.f8037j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8037j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8037j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8037j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8037j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
