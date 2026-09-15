package j4;
public final class f0 {
    public final String f12679a;
    public final int f12680b;
    public final int f12681c;
    public int d;
    public String e;

    public f0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f12680b;
        } else {
            i10 = i11 + this.f12681c;
        }
        this.d = i10;
        this.e = this.f12679a + this.d;
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
        this.f12679a = str;
        this.f12680b = i11;
        this.f12681c = i12;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
