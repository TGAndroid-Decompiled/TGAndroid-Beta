package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16148a;
    public String f16149b;
    public List f16150c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16148a, bVar.f16148a) && Objects.equals(this.f16149b, bVar.f16149b) && Objects.equals(this.f16150c, bVar.f16150c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16148a, this.f16149b, this.f16150c);
    }
}
