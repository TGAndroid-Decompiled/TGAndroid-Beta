package da;

import java.util.List;
public final class e0 {
    public int f7998a;
    public String f7999b;
    public int f8000c;
    public int d;
    public long f8001e;
    public long f8002f;
    public long f8003g;
    public String h;
    public List f8004i;
    public byte f8005j;

    public final f0 a() {
        String str;
        if (this.f8005j == 63 && (str = this.f7999b) != null) {
            return new f0(this.f7998a, str, this.f8000c, this.d, this.f8001e, this.f8002f, this.f8003g, this.h, this.f8004i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8005j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f7999b == null) {
            sb2.append(" processName");
        }
        if ((this.f8005j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8005j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8005j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8005j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8005j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
