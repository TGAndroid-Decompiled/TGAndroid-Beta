package defpackage;

import java.util.List;
public final class e80 {
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public List i;
    public byte j;

    public final f80 a() {
        String str;
        if (this.j == 63 && (str = this.b) != null) {
            return new f80(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb.append(" timestamp");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
