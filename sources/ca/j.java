package ca;

import a8.p0;
public final class j {
    public static final j f5153c = new j(0, 0);
    public final int f5154a;
    public final int f5155b;

    public j(int i7, int i10) {
        this.f5154a = i7;
        this.f5155b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f5154a);
        sb2.append(", length = ");
        return p0.n(this.f5155b, "]", sb2);
    }
}
