package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f13910a;
    public String f13911b;
    public List f13912c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f13910a, bVar.f13910a) && Objects.equals(this.f13911b, bVar.f13911b) && Objects.equals(this.f13912c, bVar.f13912c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13910a, this.f13911b, this.f13912c);
    }
}
