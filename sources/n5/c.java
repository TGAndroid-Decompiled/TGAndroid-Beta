package n5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f15253b = new c(0);
    public final int f15254a;

    public c(int i10) {
        this.f15254a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f15254a) {
            case 0:
                return ((Scope) obj).f2641b.compareTo(((Scope) obj2).f2641b);
            default:
                return ((Scope) obj).f2641b.compareTo(((Scope) obj2).f2641b);
        }
    }
}
