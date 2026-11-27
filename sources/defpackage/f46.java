package defpackage;
public class f46 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public f46(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    public static f46 a(int i, int i2) {
        return new f46(i, i2, -1, null, null);
    }

    public static f46 b(int i, int i2, String str) {
        return new f46(i, -1, i2, null, str);
    }
}
