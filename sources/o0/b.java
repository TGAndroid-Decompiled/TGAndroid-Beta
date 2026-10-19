package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f17510a;
    public String f17511b;
    public List f17512c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f17510a, bVar.f17510a) && Objects.equals(this.f17511b, bVar.f17511b) && Objects.equals(this.f17512c, bVar.f17512c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17510a, this.f17511b, this.f17512c);
    }
}
