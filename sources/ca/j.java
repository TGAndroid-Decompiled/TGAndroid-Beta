package ca;

import a8.p0;
public final class j {
    public static final j f5124c = new j(0, 0);
    public final int f5125a;
    public final int f5126b;

    public j(int i7, int i10) {
        this.f5125a = i7;
        this.f5126b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f5125a);
        sb2.append(", length = ");
        return p0.n(this.f5126b, "]", sb2);
    }
}
