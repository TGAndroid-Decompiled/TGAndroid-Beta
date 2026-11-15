package da;

import java.util.List;
public final class e0 {
    public int f7719a;
    public String f7720b;
    public int f7721c;
    public int d;
    public long f7722e;
    public long f7723f;
    public long f7724g;
    public String h;
    public List f7725i;
    public byte f7726j;

    public final f0 a() {
        String str;
        if (this.f7726j == 63 && (str = this.f7720b) != null) {
            return new f0(this.f7719a, str, this.f7721c, this.d, this.f7722e, this.f7723f, this.f7724g, this.h, this.f7725i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7726j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f7720b == null) {
            sb2.append(" processName");
        }
        if ((this.f7726j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f7726j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7726j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f7726j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f7726j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
