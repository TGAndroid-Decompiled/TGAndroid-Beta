package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f17512a;
    public String f17513b;
    public List f17514c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f17512a, bVar.f17512a) && Objects.equals(this.f17513b, bVar.f17513b) && Objects.equals(this.f17514c, bVar.f17514c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17512a, this.f17513b, this.f17514c);
    }
}
