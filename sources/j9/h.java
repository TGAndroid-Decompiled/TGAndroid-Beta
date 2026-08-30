package j9;
public final class h {
    public static final h f9330c = new h(0, 0);
    public final int f9331a;
    public final int f9332b;

    public h(int i10, int i11) {
        this.f9331a = i10;
        this.f9332b = i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f9331a);
        sb.append(", length = ");
        return android.support.v4.media.a.m(this.f9332b, "]", sb);
    }
}
