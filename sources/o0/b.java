package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f15473a;
    public String f15474b;
    public List f15475c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f15473a, bVar.f15473a) && Objects.equals(this.f15474b, bVar.f15474b) && Objects.equals(this.f15475c, bVar.f15475c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15473a, this.f15474b, this.f15475c);
    }
}
