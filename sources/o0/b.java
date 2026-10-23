package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f17573a;
    public String f17574b;
    public List f17575c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f17573a, bVar.f17573a) && Objects.equals(this.f17574b, bVar.f17574b) && Objects.equals(this.f17575c, bVar.f17575c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17573a, this.f17574b, this.f17575c);
    }
}
