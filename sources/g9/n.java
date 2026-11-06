package g9;

import java.io.Serializable;
import java.util.List;
public final class n implements m, Serializable {
    public final List f13592a;

    public n(List list) {
        this.f13592a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f13592a;
            if (i7 < list.size()) {
                if (!((m) list.get(i7)).apply(obj)) {
                    return false;
                }
                i7++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f13592a.equals(((n) obj).f13592a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13592a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z9 = true;
        for (Object obj : this.f13592a) {
            if (!z9) {
                sb2.append(',');
            }
            sb2.append(obj);
            z9 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
