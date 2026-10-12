package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16637a;
    public String f16638b;
    public List f16639c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16637a, bVar.f16637a) && Objects.equals(this.f16638b, bVar.f16638b) && Objects.equals(this.f16639c, bVar.f16639c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16637a, this.f16638b, this.f16639c);
    }
}
