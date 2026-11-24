package defpackage;

import android.graphics.Point;
import j$.util.concurrent.ConcurrentHashMap;
public final class mi5 {
    public final byte a;
    public int b;
    public String c;

    public mi5(String str, byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.c = str;
                this.b = 0;
                return;
            default:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.b = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.c = str;
                    return;
                }
                i98.g();
                throw null;
        }
    }

    public static mi5 c(String str) {
        ConcurrentHashMap concurrentHashMap = btc.a;
        Point point = gm.q;
        int min = Math.min(1440, Math.min(point.x, point.y));
        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(str)) {
            return new mi5("r-default_pattern", min);
        }
        StringBuilder sb = new StringBuilder("s-");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '-' && charAt != '_'))) {
                charAt = '.';
            }
            sb2.append(charAt);
        }
        sb.append(sb2.toString());
        return new mi5(sb.toString(), min);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(this.c);
        sb.append("_w");
        return hg9.k(sb, this.b, "_v1.pgm.gz");
    }

    public final int b() {
        String str = this.c;
        int i = this.b;
        this.b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = this.b;
            this.b = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 >= 55296) {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
            } else {
                return i2 | (charAt2 << i3);
            }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return this.b + ": " + this.c;
            case 2:
                return this.c;
            default:
                return super.toString();
        }
    }

    public mi5(int i, String str, Object[] objArr) {
        this.a = (byte) 1;
        this.c = String.format(str, objArr);
        this.b = i;
    }

    public mi5(int i, String str) {
        this.a = (byte) 0;
        this.b = i;
        this.c = str;
    }

    public mi5(String str, int i) {
        this.a = (byte) 3;
        this.c = str;
        this.b = i;
    }
}
