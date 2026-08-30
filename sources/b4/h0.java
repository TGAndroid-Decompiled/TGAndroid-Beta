package b4;
public final class h0 {
    public final String f1401a;
    public final int f1402b;
    public final int f1403c;
    public int d;
    public String e;

    public h0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f1402b;
        } else {
            i10 = i11 + this.f1403c;
        }
        this.d = i10;
        this.e = this.f1401a + this.d;
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
        this.f1401a = str;
        this.f1402b = i11;
        this.f1403c = i12;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
