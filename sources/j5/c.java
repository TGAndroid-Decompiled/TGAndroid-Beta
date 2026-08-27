package j5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class c implements Comparator {

    public static final c f12724b = new c(0);

    public final int f12725a;

    public c(int i10) {
        this.f12725a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f12725a) {
            case 0:
                break;
        }
        return ((Scope) obj).f3181b.compareTo(((Scope) obj2).f3181b);
    }
}
