package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21651a;
    public String f21652b;
    public List f21653c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21651a, bVar.f21651a) && Objects.equals(this.f21652b, bVar.f21652b) && Objects.equals(this.f21653c, bVar.f21653c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21651a, this.f21652b, this.f21653c);
    }
}
