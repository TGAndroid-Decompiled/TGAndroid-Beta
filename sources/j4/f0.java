package j4;
public final class f0 {
    public final String f13292a;
    public final int f13293b;
    public final int f13294c;
    public int d;
    public String f13295e;

    public f0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f13293b;
        } else {
            i10 = i11 + this.f13294c;
        }
        this.d = i10;
        this.f13295e = this.f13292a + this.d;
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
        this.f13292a = str;
        this.f13293b = i11;
        this.f13294c = i12;
        this.d = Integer.MIN_VALUE;
        this.f13295e = "";
    }
}
