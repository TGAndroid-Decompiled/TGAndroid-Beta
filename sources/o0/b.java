package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21558a;
    public String f21559b;
    public List f21560c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21558a, bVar.f21558a) && Objects.equals(this.f21559b, bVar.f21559b) && Objects.equals(this.f21560c, bVar.f21560c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21558a, this.f21559b, this.f21560c);
    }
}
