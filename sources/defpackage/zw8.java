package defpackage;
public class zw8 {
    public static final zw8 d = new zw8(0, 0, (byte) 0);
    public final byte a;
    public int b;
    public int c;

    public zw8(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        int i = this.c;
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            if (i != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public final int b() {
        return this.b | this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(zw8.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return de9.l(sb, this.c, "]");
            default:
                return super.toString();
        }
    }
}
