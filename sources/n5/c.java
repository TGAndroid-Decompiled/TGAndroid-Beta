package n5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f14272b = new c(0);
    public final int f14273a;

    public c(int i10) {
        this.f14273a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14273a) {
            case 0:
                return ((Scope) obj).f2714b.compareTo(((Scope) obj2).f2714b);
            default:
                return ((Scope) obj).f2714b.compareTo(((Scope) obj2).f2714b);
        }
    }
}
