package e9;

import java.util.Map;
import java.util.Set;
public abstract class o {
    public transient Set f8984a;
    public transient n f8985b;
    public transient Map f8986c;

    public abstract Map a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return ((v0) this).a().equals(((v0) ((o) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
