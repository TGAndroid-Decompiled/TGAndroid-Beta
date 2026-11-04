package ca;

import java.util.List;
public final class a1 extends h2 {
    public final String f4291a;
    public final int f4292b;
    public final List f4293c;

    public a1(String str, int i3, List list) {
        this.f4291a = str;
        this.f4292b = i3;
        this.f4293c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f4291a.equals(a1Var.f4291a) && this.f4292b == a1Var.f4292b && this.f4293c.equals(a1Var.f4293c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4291a.hashCode() ^ 1000003) * 1000003) ^ this.f4292b) * 1000003) ^ this.f4293c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f4291a + ", importance=" + this.f4292b + ", frames=" + this.f4293c + "}";
    }
}
