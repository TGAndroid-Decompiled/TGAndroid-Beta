package eg;
public class p0 {
    public final int f5410a;
    public final int f5411b;
    public final String f5412c;
    public final String d;
    public final int e;
    public boolean f5413f;

    public p0(int i10, int i11, int i12, String str, String str2) {
        this.f5410a = i10;
        this.f5411b = i11;
        this.f5412c = str;
        this.d = str2;
        this.e = i12;
    }

    public static p0 a(int i10, int i11) {
        return new p0(i10, i11, -1, null, null);
    }

    public static p0 b(int i10, int i11, String str) {
        return new p0(i10, -1, i11, null, str);
    }
}
