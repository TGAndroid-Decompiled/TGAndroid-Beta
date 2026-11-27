package defpackage;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yvc {
    public String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public int f;
    public TLRPC.TL_wallPaper g;
    public float h;
    public final boolean i;
    public final boolean j;
    public TLRPC.WallPaper k;
    public Bitmap l;

    public yvc(String str, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        this.a = str;
        this.b = i | (-16777216);
        if (i2 == 0) {
            i6 = 0;
        } else {
            i6 = i2 | (-16777216);
        }
        this.c = i6;
        if (i3 == 0) {
            i7 = 0;
        } else {
            i7 = i3 | (-16777216);
        }
        this.d = i7;
        this.e = i4 != 0 ? i4 | (-16777216) : 0;
        this.f = i6 == 0 ? 45 : i5;
        this.h = f;
        this.i = z;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.b));
        sb.append(this.c);
        sb.append(this.d);
        sb.append(this.e);
        sb.append(this.f);
        sb.append(this.h);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return Utilities.a(sb.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i = this.c;
        if (i != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i >> 16)) & 255), Integer.valueOf(((byte) (i >> 8)) & 255), Byte.valueOf((byte) (i & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i2 = this.b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (i2 >> 8)) & 255), Byte.valueOf((byte) (i2 & 255))).toLowerCase();
        int i3 = this.d;
        if (i3 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (i3 >> 8)) & 255), Byte.valueOf((byte) (i3 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i4 = this.e;
        if (i4 != 0) {
            str3 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i4 >> 16)) & 255), Integer.valueOf(((byte) (i4 >> 8)) & 255), Byte.valueOf((byte) (i4 & 255))).toLowerCase();
        }
        if (str != null) {
            if (str2 != null) {
                if (str3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(lowerCase);
                    sb.append("~");
                    sb.append(str);
                    sb.append("~");
                    sb.append(str2);
                    lowerCase = c00.k(sb, "~", str3);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else {
                String p = qd4.p(lowerCase, "-", str);
                if (this.g != null) {
                    StringBuilder l = c00.l(p, "&rotation=");
                    l.append(hl.q1(this.f, true));
                    lowerCase = l.toString();
                } else {
                    StringBuilder l2 = c00.l(p, "?rotation=");
                    l2.append(hl.q1(this.f, true));
                    lowerCase = l2.toString();
                }
            }
        }
        TLRPC.TL_wallPaper tL_wallPaper = this.g;
        int i5 = yac.t0;
        if (tL_wallPaper != null) {
            String str4 = "https://" + uc7.s1(i5).N2 + "/bg/" + this.g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.i) {
                return str4.concat("&mode=motion");
            }
            return str4;
        }
        return qu6.o(uc7.s1(i5).N2, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public yvc(int i, int i2, int i3, int i4, String str) {
        this.a = str;
        this.b = i | (-16777216);
        this.c = i2 == 0 ? 0 : i2 | (-16777216);
        this.d = i3 == 0 ? 0 : i3 | (-16777216);
        this.e = i4 != 0 ? i4 | (-16777216) : 0;
        this.h = 1.0f;
        this.j = true;
    }

    public yvc(int i, int i2, int i3, String str) {
        this.a = str;
        this.b = i | (-16777216);
        int i4 = i2 == 0 ? 0 : i2 | (-16777216);
        this.c = i4;
        this.f = i4 == 0 ? 0 : i3;
        this.h = 1.0f;
    }
}
