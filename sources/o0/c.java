package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15488a;
    public String f15489b;
    public List f15490c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15488a, cVar.f15488a) && Objects.equals(this.f15489b, cVar.f15489b) && Objects.equals(this.f15490c, cVar.f15490c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15488a, this.f15489b, this.f15490c);
    }
}
