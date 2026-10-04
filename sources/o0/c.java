package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f16929a;
    public String f16930b;
    public List f16931c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f16929a, cVar.f16929a) && Objects.equals(this.f16930b, cVar.f16930b) && Objects.equals(this.f16931c, cVar.f16931c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16929a, this.f16930b, this.f16931c);
    }
}
