package ca;

import a8.p0;
public final class j {
    public static final j f6020c = new j(0, 0);
    public final int f6021a;
    public final int f6022b;

    public j(int i7, int i10) {
        this.f6021a = i7;
        this.f6022b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f6021a);
        sb2.append(", length = ");
        return p0.n(this.f6022b, "]", sb2);
    }
}
