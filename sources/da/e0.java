package da;

import java.util.List;
public final class e0 {
    public int f7716a;
    public String f7717b;
    public int f7718c;
    public int d;
    public long f7719e;
    public long f7720f;
    public long f7721g;
    public String h;
    public List f7722i;
    public byte f7723j;

    public final f0 a() {
        String str;
        if (this.f7723j == 63 && (str = this.f7717b) != null) {
            return new f0(this.f7716a, str, this.f7718c, this.d, this.f7719e, this.f7720f, this.f7721g, this.h, this.f7722i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7723j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f7717b == null) {
            sb2.append(" processName");
        }
        if ((this.f7723j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f7723j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7723j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f7723j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f7723j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
