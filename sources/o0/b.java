package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f18745a;
    public String f18746b;
    public List f18747c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f18745a, bVar.f18745a) && Objects.equals(this.f18746b, bVar.f18746b) && Objects.equals(this.f18747c, bVar.f18747c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18745a, this.f18746b, this.f18747c);
    }
}
