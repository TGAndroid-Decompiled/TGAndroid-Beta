package j4;
public final class f0 {
    public final String f13318a;
    public final int f13319b;
    public final int f13320c;
    public int d;
    public String f13321e;

    public f0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f13319b;
        } else {
            i10 = i11 + this.f13320c;
        }
        this.d = i10;
        this.f13321e = this.f13318a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public f0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = a4.a.m(i10, "/");
        }
        this.f13318a = str;
        this.f13319b = i11;
        this.f13320c = i12;
        this.d = Integer.MIN_VALUE;
        this.f13321e = "";
    }
}
