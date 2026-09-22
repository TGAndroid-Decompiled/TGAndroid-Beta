package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f13920a;
    public final int f13921b;
    public final int f13922c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f13920a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6222n) {
            z10 = true;
        }
        l.k(z10);
        this.f13921b = i10;
        this.f13922c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f13921b), Integer.valueOf(this.f13921b)) && l.l(Integer.valueOf(aVar.f13922c), Integer.valueOf(this.f13922c)) && aVar.f13920a == this.f13920a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13921b), Integer.valueOf(this.f13922c), this.f13920a});
    }
}
