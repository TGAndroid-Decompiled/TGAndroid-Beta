package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14143a;
    public final int f14144b;
    public final int f14145c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14143a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6208n) {
            z10 = true;
        }
        l.k(z10);
        this.f14144b = i10;
        this.f14145c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14144b), Integer.valueOf(this.f14144b)) && l.l(Integer.valueOf(aVar.f14145c), Integer.valueOf(this.f14145c)) && aVar.f14143a == this.f14143a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14144b), Integer.valueOf(this.f14145c), this.f14143a});
    }
}
