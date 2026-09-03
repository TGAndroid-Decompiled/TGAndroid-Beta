package n5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f14257b = new c(0);
    public final int f14258a;

    public c(int i10) {
        this.f14258a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14258a) {
            case 0:
                return ((Scope) obj).f2697b.compareTo(((Scope) obj2).f2697b);
            default:
                return ((Scope) obj).f2697b.compareTo(((Scope) obj2).f2697b);
        }
    }
}
