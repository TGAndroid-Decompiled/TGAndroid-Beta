package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f18986a;
    public String f18987b;
    public List f18988c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f18986a, bVar.f18986a) && Objects.equals(this.f18987b, bVar.f18987b) && Objects.equals(this.f18988c, bVar.f18988c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18986a, this.f18987b, this.f18988c);
    }
}
