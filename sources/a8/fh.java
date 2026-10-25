package a8;

import java.util.Map;
import java.util.Set;
public abstract class fh implements p {
    public transient nd f466a;
    public transient pb f467b;

    public final Map a() {
        pb pbVar = this.f467b;
        if (pbVar == null) {
            gh ghVar = (gh) this;
            pb pbVar2 = new pb(ghVar, ghVar.f508c, 0);
            this.f467b = pbVar2;
            return pbVar2;
        }
        return pbVar;
    }

    public final Set b() {
        nd ndVar = this.f466a;
        if (ndVar == null) {
            gh ghVar = (gh) this;
            nd ndVar2 = new nd(ghVar, ghVar.f508c);
            this.f466a = ndVar2;
            return ndVar2;
        }
        return ndVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return a().equals(((fh) ((p) obj)).a());
    }

    public final int hashCode() {
        return ((pb) a()).f739b.hashCode();
    }

    public final String toString() {
        return ((pb) a()).f739b.toString();
    }
}
