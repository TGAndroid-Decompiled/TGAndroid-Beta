package d5;

import f5.d0;
import java.util.Collections;
import java.util.List;
import l4.j1;
import q8.z;
public final class v implements j3.g {
    public static final String f5380c;
    public static final String d;
    public final j1 f5381a;
    public final z f5382b;

    static {
        int i10 = d0.f6579a;
        f5380c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public v(j1 j1Var, int i10) {
        this(j1Var, z.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f5381a.equals(vVar.f5381a) && this.f5382b.equals(vVar.f5382b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5382b.hashCode() * 31) + this.f5381a.hashCode();
    }

    public v(j1 j1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= j1Var.f14347a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f5381a = j1Var;
        this.f5382b = z.u(list);
    }
}
