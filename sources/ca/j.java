package ca;

import a8.p0;
public final class j {
    public static final j f6015c = new j(0, 0);
    public final int f6016a;
    public final int f6017b;

    public j(int i7, int i10) {
        this.f6016a = i7;
        this.f6017b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f6016a);
        sb2.append(", length = ");
        return p0.n(this.f6017b, "]", sb2);
    }
}
