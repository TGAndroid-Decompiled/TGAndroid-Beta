package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f20476a;
    public String f20477b;
    public List f20478c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f20476a, cVar.f20476a) && Objects.equals(this.f20477b, cVar.f20477b) && Objects.equals(this.f20478c, cVar.f20478c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20476a, this.f20477b, this.f20478c);
    }
}
