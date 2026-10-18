package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f17513a;
    public String f17514b;
    public List f17515c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f17513a, bVar.f17513a) && Objects.equals(this.f17514b, bVar.f17514b) && Objects.equals(this.f17515c, bVar.f17515c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17513a, this.f17514b, this.f17515c);
    }
}
