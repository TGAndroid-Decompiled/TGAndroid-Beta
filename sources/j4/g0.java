package j4;
public final class g0 {
    public final String f11592a;
    public final int f11593b;
    public final int f11594c;
    public int d;
    public String e;

    public g0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f11593b;
        } else {
            i10 = i11 + this.f11594c;
        }
        this.d = i10;
        this.e = this.f11592a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public g0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = a4.a.m(i10, "/");
        }
        this.f11592a = str;
        this.f11593b = i11;
        this.f11594c = i12;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
