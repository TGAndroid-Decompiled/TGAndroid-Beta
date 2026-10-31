package kg;
public class l0 {
    public final int f11164a;
    public final int f11165b;
    public final String f11166c;
    public final String d;
    public final int e;
    public boolean f11167f;

    public l0(int i10, int i11, int i12, String str, String str2) {
        this.f11164a = i10;
        this.f11165b = i11;
        this.f11166c = str;
        this.d = str2;
        this.e = i12;
    }

    public static l0 a(int i10, int i11) {
        return new l0(i10, i11, -1, null, null);
    }

    public static l0 b(int i10, int i11, String str) {
        return new l0(i10, -1, i11, null, str);
    }
}
