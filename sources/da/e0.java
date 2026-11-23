package da;

import java.util.List;
public final class e0 {
    public int f7993a;
    public String f7994b;
    public int f7995c;
    public int d;
    public long f7996e;
    public long f7997f;
    public long f7998g;
    public String h;
    public List f7999i;
    public byte f8000j;

    public final f0 a() {
        String str;
        if (this.f8000j == 63 && (str = this.f7994b) != null) {
            return new f0(this.f7993a, str, this.f7995c, this.d, this.f7996e, this.f7997f, this.f7998g, this.h, this.f7999i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8000j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f7994b == null) {
            sb2.append(" processName");
        }
        if ((this.f8000j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8000j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8000j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8000j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8000j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
