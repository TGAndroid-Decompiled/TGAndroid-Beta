package d2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.p;
import f2.s;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

public final class a implements Comparator {

    public final int f4700a;

    public a(int i10) {
        this.f4700a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f4700a) {
            case 0:
                return ((b) obj2).b() - ((b) obj).b();
            case 1:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                int i10 = pVar.f5807a - pVar2.f5807a;
                return i10 == 0 ? pVar.f5808b - pVar2.f5808b : i10;
            case 2:
                s sVar = (s) obj;
                s sVar2 = (s) obj2;
                RecyclerView recyclerView = sVar.d;
                if ((recyclerView == null) != (sVar2.d == null)) {
                    if (recyclerView == null) {
                        return 1;
                    }
                    return -1;
                }
                boolean z10 = sVar.f5821a;
                if (z10 != sVar2.f5821a) {
                    if (z10) {
                        return -1;
                    }
                    return 1;
                }
                int i11 = sVar2.f5822b - sVar.f5822b;
                if (i11 != 0) {
                    return i11;
                }
                int i12 = sVar.f5823c - sVar2.f5823c;
                if (i12 != 0) {
                    return i12;
                }
                return 0;
            case 3:
                return ((m2.c) obj).f17547b - ((m2.c) obj2).f17547b;
            case 4:
                m2.d dVar = (m2.d) ((View) obj).getLayoutParams();
                m2.d dVar2 = (m2.d) ((View) obj2).getLayoutParams();
                boolean z11 = dVar.f17550a;
                if (z11 != dVar2.f17550a) {
                    return z11 ? 1 : -1;
                }
                return dVar.f17553e - dVar2.f17553e;
            case 5:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof ne.b ? ((ne.b) runnable2).f18517a : 1) - (runnable instanceof ne.b ? ((ne.b) runnable).f18517a : 1);
            case 6:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
        }
    }
}
