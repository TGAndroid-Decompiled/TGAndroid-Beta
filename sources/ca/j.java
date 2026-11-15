package ca;

import a8.p0;
public final class j {
    public static final j f4842c = new j(0, 0);
    public final int f4843a;
    public final int f4844b;

    public j(int i7, int i10) {
        this.f4843a = i7;
        this.f4844b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f4843a);
        sb2.append(", length = ");
        return p0.n(this.f4844b, "]", sb2);
    }
}
