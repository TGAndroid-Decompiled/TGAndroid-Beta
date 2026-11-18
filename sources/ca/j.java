package ca;

import a8.p0;
public final class j {
    public static final j f5127c = new j(0, 0);
    public final int f5128a;
    public final int f5129b;

    public j(int i7, int i10) {
        this.f5128a = i7;
        this.f5129b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f5128a);
        sb2.append(", length = ");
        return p0.n(this.f5129b, "]", sb2);
    }
}
