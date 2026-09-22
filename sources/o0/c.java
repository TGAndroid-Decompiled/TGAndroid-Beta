package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15300a;
    public String f15301b;
    public List f15302c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15300a, cVar.f15300a) && Objects.equals(this.f15301b, cVar.f15301b) && Objects.equals(this.f15302c, cVar.f15302c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15300a, this.f15301b, this.f15302c);
    }
}
