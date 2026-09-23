package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15277a;
    public String f15278b;
    public List f15279c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15277a, cVar.f15277a) && Objects.equals(this.f15278b, cVar.f15278b) && Objects.equals(this.f15279c, cVar.f15279c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15277a, this.f15278b, this.f15279c);
    }
}
