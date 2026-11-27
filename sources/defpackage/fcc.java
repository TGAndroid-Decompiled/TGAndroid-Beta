package defpackage;
public abstract class fcc {
    public static final dcc a;

    static {
        dcc dccVar;
        if (dac.e && dac.d && !xj.a()) {
            dccVar = new dcc((byte) 1);
        } else {
            dccVar = new dcc((byte) 0);
        }
        a = dccVar;
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) >= 65536) {
                                i++;
                            } else {
                                throw new ecc(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        p3d.g(i2 + 4294967296L);
        return 0;
    }
}
