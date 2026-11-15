package ca;

import a8.p0;
public final class j {
    public static final j f4845c = new j(0, 0);
    public final int f4846a;
    public final int f4847b;

    public j(int i7, int i10) {
        this.f4846a = i7;
        this.f4847b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f4846a);
        sb2.append(", length = ");
        return p0.n(this.f4847b, "]", sb2);
    }
}
