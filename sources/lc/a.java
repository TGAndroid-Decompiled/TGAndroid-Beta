package lc;
public final class a {
    public final String f11735a;
    public final int f11736b;
    public transient String f11737c;

    public a(String str, int i10) {
        this.f11735a = str;
        this.f11736b = i10;
    }

    public final String toString() {
        if (this.f11737c == null) {
            this.f11737c = String.format("%s:%d", this.f11735a, Integer.valueOf(this.f11736b));
        }
        return this.f11737c;
    }
}
