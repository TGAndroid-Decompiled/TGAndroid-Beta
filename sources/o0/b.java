package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f20678a;
    public String f20679b;
    public List f20680c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f20678a, bVar.f20678a) && Objects.equals(this.f20679b, bVar.f20679b) && Objects.equals(this.f20680c, bVar.f20680c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20678a, this.f20679b, this.f20680c);
    }
}
