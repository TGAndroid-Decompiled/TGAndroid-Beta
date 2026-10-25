package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f18921a;
    public String f18922b;
    public List f18923c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f18921a, bVar.f18921a) && Objects.equals(this.f18922b, bVar.f18922b) && Objects.equals(this.f18923c, bVar.f18923c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18921a, this.f18922b, this.f18923c);
    }
}
