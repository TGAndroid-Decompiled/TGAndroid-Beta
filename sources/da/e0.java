package da;

import java.util.List;
public final class e0 {
    public int f7992a;
    public String f7993b;
    public int f7994c;
    public int d;
    public long f7995e;
    public long f7996f;
    public long f7997g;
    public String h;
    public List f7998i;
    public byte f7999j;

    public final f0 a() {
        String str;
        if (this.f7999j == 63 && (str = this.f7993b) != null) {
            return new f0(this.f7992a, str, this.f7994c, this.d, this.f7995e, this.f7996f, this.f7997g, this.h, this.f7998i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7999j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f7993b == null) {
            sb2.append(" processName");
        }
        if ((this.f7999j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f7999j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f7999j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f7999j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f7999j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
