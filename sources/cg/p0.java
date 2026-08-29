package cg;
public class p0 {
    public final int f3258a;
    public final int f3259b;
    public final String f3260c;
    public final String d;
    public final int f3261e;
    public boolean f3262f;

    public p0(int i10, int i11, int i12, String str, String str2) {
        this.f3258a = i10;
        this.f3259b = i11;
        this.f3260c = str;
        this.d = str2;
        this.f3261e = i12;
    }

    public static p0 a(int i10, int i11) {
        return new p0(i10, i11, -1, null, null);
    }

    public static p0 b(int i10, int i11, String str) {
        return new p0(i10, -1, i11, null, str);
    }
}
