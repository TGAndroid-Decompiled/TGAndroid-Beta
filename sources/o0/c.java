package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15441a;
    public String f15442b;
    public List f15443c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15441a, cVar.f15441a) && Objects.equals(this.f15442b, cVar.f15442b) && Objects.equals(this.f15443c, cVar.f15443c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15441a, this.f15442b, this.f15443c);
    }
}
