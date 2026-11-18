package da;

import java.util.List;
public final class e0 {
    public int f8001a;
    public String f8002b;
    public int f8003c;
    public int d;
    public long f8004e;
    public long f8005f;
    public long f8006g;
    public String h;
    public List f8007i;
    public byte f8008j;

    public final f0 a() {
        String str;
        if (this.f8008j == 63 && (str = this.f8002b) != null) {
            return new f0(this.f8001a, str, this.f8003c, this.d, this.f8004e, this.f8005f, this.f8006g, this.h, this.f8007i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8008j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f8002b == null) {
            sb2.append(" processName");
        }
        if ((this.f8008j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f8008j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f8008j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f8008j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f8008j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
