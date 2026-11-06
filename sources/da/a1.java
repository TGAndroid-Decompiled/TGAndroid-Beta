package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f8265a;
    public final int f8266b;
    public final List f8267c;

    public a1(String str, int i7, List list) {
        this.f8265a = str;
        this.f8266b = i7;
        this.f8267c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f8265a.equals(a1Var.f8265a) && this.f8266b == a1Var.f8266b && this.f8267c.equals(a1Var.f8267c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8265a.hashCode() ^ 1000003) * 1000003) ^ this.f8266b) * 1000003) ^ this.f8267c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f8265a + ", importance=" + this.f8266b + ", frames=" + this.f8267c + "}";
    }
}
