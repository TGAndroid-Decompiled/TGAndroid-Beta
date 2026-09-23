package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f13908a;
    public final int f13909b;
    public final int f13910c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f13908a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6208n) {
            z10 = true;
        }
        l.k(z10);
        this.f13909b = i10;
        this.f13910c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f13909b), Integer.valueOf(this.f13909b)) && l.l(Integer.valueOf(aVar.f13910c), Integer.valueOf(this.f13910c)) && aVar.f13908a == this.f13908a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13909b), Integer.valueOf(this.f13910c), this.f13908a});
    }
}
