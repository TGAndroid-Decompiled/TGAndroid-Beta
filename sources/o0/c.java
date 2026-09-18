package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15312a;
    public String f15313b;
    public List f15314c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15312a, cVar.f15312a) && Objects.equals(this.f15313b, cVar.f15313b) && Objects.equals(this.f15314c, cVar.f15314c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15312a, this.f15313b, this.f15314c);
    }
}
