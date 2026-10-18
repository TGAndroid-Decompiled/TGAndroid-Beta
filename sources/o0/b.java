package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f17509a;
    public String f17510b;
    public List f17511c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f17509a, bVar.f17509a) && Objects.equals(this.f17510b, bVar.f17510b) && Objects.equals(this.f17511c, bVar.f17511c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17509a, this.f17510b, this.f17511c);
    }
}
