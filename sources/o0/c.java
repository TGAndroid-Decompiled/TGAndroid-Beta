package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15484a;
    public String f15485b;
    public List f15486c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15484a, cVar.f15484a) && Objects.equals(this.f15485b, cVar.f15485b) && Objects.equals(this.f15486c, cVar.f15486c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15484a, this.f15485b, this.f15486c);
    }
}
