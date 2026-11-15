package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7655a;
    public final int f7656b;
    public final List f7657c;

    public a1(String str, int i7, List list) {
        this.f7655a = str;
        this.f7656b = i7;
        this.f7657c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7655a.equals(a1Var.f7655a) && this.f7656b == a1Var.f7656b && this.f7657c.equals(a1Var.f7657c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7655a.hashCode() ^ 1000003) * 1000003) ^ this.f7656b) * 1000003) ^ this.f7657c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7655a + ", importance=" + this.f7656b + ", frames=" + this.f7657c + "}";
    }
}
