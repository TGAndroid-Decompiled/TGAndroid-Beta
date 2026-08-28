package f9;
public final class h {
    public static final h f6009c = new h(0, 0);
    public final int f6010a;
    public final int f6011b;

    public h(int i9, int i10) {
        this.f6010a = i9;
        this.f6011b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f6010a);
        sb2.append(", length = ");
        return aa.d.l(this.f6011b, "]", sb2);
    }
}
