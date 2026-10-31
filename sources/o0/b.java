package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f13909a;
    public String f13910b;
    public List f13911c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f13909a, bVar.f13909a) && Objects.equals(this.f13910b, bVar.f13910b) && Objects.equals(this.f13911c, bVar.f13911c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13909a, this.f13910b, this.f13911c);
    }
}
