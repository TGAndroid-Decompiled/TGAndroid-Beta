package oc;
public final class a {
    public final String f20956a;
    public final int f20957b;
    public transient String f20958c;

    public a(String str, int i3) {
        this.f20956a = str;
        this.f20957b = i3;
    }

    public final String toString() {
        if (this.f20958c == null) {
            this.f20958c = String.format("%s:%d", this.f20956a, Integer.valueOf(this.f20957b));
        }
        return this.f20958c;
    }
}
