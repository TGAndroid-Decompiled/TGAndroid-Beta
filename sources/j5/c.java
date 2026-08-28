package j5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class c implements Comparator {
    public static final c f13626b = new c(0);
    public final int f13627a;

    public c(int i9) {
        this.f13627a = i9;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f13627a) {
            case 0:
                return ((Scope) obj).f2736b.compareTo(((Scope) obj2).f2736b);
            default:
                return ((Scope) obj).f2736b.compareTo(((Scope) obj2).f2736b);
        }
    }
}
