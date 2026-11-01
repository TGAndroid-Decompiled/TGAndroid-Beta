package lc;
public final class a {
    public final String f11736a;
    public final int f11737b;
    public transient String f11738c;

    public a(String str, int i10) {
        this.f11736a = str;
        this.f11737b = i10;
    }

    public final String toString() {
        if (this.f11738c == null) {
            this.f11738c = String.format("%s:%d", this.f11736a, Integer.valueOf(this.f11737b));
        }
        return this.f11738c;
    }
}
