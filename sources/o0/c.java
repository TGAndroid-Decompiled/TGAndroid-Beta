package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15500a;
    public String f15501b;
    public List f15502c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15500a, cVar.f15500a) && Objects.equals(this.f15501b, cVar.f15501b) && Objects.equals(this.f15502c, cVar.f15502c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15500a, this.f15501b, this.f15502c);
    }
}
