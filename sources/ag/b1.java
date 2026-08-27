package ag;

public class b1 {

    public final int f305a;

    public final int f306b;

    public final String f307c;
    public final String d;

    public final int f308e;

    public boolean f309f;

    public b1(int i10, int i11, int i12, String str, String str2) {
        this.f305a = i10;
        this.f306b = i11;
        this.f307c = str;
        this.d = str2;
        this.f308e = i12;
    }

    public static b1 a(int i10, int i11) {
        return new b1(i10, i11, -1, null, null);
    }

    public static b1 b(int i10, int i11, String str) {
        return new b1(i10, -1, i11, null, str);
    }
}
