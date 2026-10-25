package a6;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
public final class d implements Comparator {
    public static final d f337b = new d(0);
    public final int f338a;

    public d(int i10) {
        this.f338a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f338a) {
            case 0:
                return ((Scope) obj).f6462b.compareTo(((Scope) obj2).f6462b);
            default:
                return ((Scope) obj).f6462b.compareTo(((Scope) obj2).f6462b);
        }
    }
}
