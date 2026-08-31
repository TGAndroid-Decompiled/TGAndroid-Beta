package fg;
public class p0 {
    public final int f6481a;
    public final int f6482b;
    public final String f6483c;
    public final String d;
    public final int f6484e;
    public boolean f6485f;

    public p0(int i10, int i11, int i12, String str, String str2) {
        this.f6481a = i10;
        this.f6482b = i11;
        this.f6483c = str;
        this.d = str2;
        this.f6484e = i12;
    }

    public static p0 a(int i10, int i11) {
        return new p0(i10, i11, -1, null, null);
    }

    public static p0 b(int i10, int i11, String str) {
        return new p0(i10, -1, i11, null, str);
    }
}
