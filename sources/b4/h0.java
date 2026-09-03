package b4;
public final class h0 {
    public final String f1412a;
    public final int f1413b;
    public final int f1414c;
    public int d;
    public String e;

    public h0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f1413b;
        } else {
            i10 = i11 + this.f1414c;
        }
        this.d = i10;
        this.e = this.f1412a + this.d;
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
        this.f1412a = str;
        this.f1413b = i11;
        this.f1414c = i12;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
