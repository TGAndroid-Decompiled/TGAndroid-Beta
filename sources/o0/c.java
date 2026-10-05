package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f16939a;
    public String f16940b;
    public List f16941c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f16939a, cVar.f16939a) && Objects.equals(this.f16940b, cVar.f16940b) && Objects.equals(this.f16941c, cVar.f16941c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16939a, this.f16940b, this.f16941c);
    }
}
