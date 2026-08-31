package b4;
public final class h0 {
    public final String f1511a;
    public final int f1512b;
    public final int f1513c;
    public int d;
    public String f1514e;

    public h0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f1512b;
        } else {
            i10 = i11 + this.f1513c;
        }
        this.d = i10;
        this.f1514e = this.f1511a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public h0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = android.support.v4.media.a.l(i10, "/");
        }
        this.f1511a = str;
        this.f1512b = i11;
        this.f1513c = i12;
        this.d = Integer.MIN_VALUE;
        this.f1514e = "";
    }
}
