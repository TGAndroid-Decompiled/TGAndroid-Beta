package o0;

import j$.util.Objects;
import java.util.List;
public final class d {
    public String f15523a;
    public String f15524b;
    public List f15525c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Objects.equals(this.f15523a, dVar.f15523a) && Objects.equals(this.f15524b, dVar.f15524b) && Objects.equals(this.f15525c, dVar.f15525c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15523a, this.f15524b, this.f15525c);
    }
}
