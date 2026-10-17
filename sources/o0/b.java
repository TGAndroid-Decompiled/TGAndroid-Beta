package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f17506a;
    public String f17507b;
    public List f17508c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f17506a, bVar.f17506a) && Objects.equals(this.f17507b, bVar.f17507b) && Objects.equals(this.f17508c, bVar.f17508c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17506a, this.f17507b, this.f17508c);
    }
}
