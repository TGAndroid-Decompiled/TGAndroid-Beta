package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15485a;
    public String f15486b;
    public List f15487c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15485a, cVar.f15485a) && Objects.equals(this.f15486b, cVar.f15486b) && Objects.equals(this.f15487c, cVar.f15487c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15485a, this.f15486b, this.f15487c);
    }
}
