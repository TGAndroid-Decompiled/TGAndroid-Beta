package defpackage;
public final class l4c {
    public final String a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    public l4c(int i, int i2, int i3) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = aq1.n(i, "/");
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i;
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.b;
        } else {
            i = i2 + this.c;
        }
        this.d = i;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        dq9.m("generateNewId() must be called before retrieving ids.");
    }

    public l4c(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
