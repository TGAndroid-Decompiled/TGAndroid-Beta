package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f14085a;
    public String f14086b;
    public List f14087c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f14085a, cVar.f14085a) && Objects.equals(this.f14086b, cVar.f14086b) && Objects.equals(this.f14087c, cVar.f14087c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14085a, this.f14086b, this.f14087c);
    }
}
