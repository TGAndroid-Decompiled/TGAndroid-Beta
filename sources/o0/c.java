package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15469a;
    public String f15470b;
    public List f15471c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15469a, cVar.f15469a) && Objects.equals(this.f15470b, cVar.f15470b) && Objects.equals(this.f15471c, cVar.f15471c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15469a, this.f15470b, this.f15471c);
    }
}
