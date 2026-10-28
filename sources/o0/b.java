package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f18920a;
    public String f18921b;
    public List f18922c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f18920a, bVar.f18920a) && Objects.equals(this.f18921b, bVar.f18921b) && Objects.equals(this.f18922c, bVar.f18922c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18920a, this.f18921b, this.f18922c);
    }
}
