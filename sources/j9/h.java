package j9;
public final class h {
    public static final h f9312c = new h(0, 0);
    public final int f9313a;
    public final int f9314b;

    public h(int i10, int i11) {
        this.f9313a = i10;
        this.f9314b = i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f9313a);
        sb.append(", length = ");
        return android.support.v4.media.a.m(this.f9314b, "]", sb);
    }
}
