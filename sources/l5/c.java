package l5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f14485b = new c(0);
    public final int f14486a;

    public c(int i10) {
        this.f14486a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14486a) {
            case 0:
                return ((Scope) obj).f3750b.compareTo(((Scope) obj2).f3750b);
            default:
                return ((Scope) obj).f3750b.compareTo(((Scope) obj2).f3750b);
        }
    }
}
