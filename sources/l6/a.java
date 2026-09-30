package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14144a;
    public final int f14145b;
    public final int f14146c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14144a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6208n) {
            z10 = true;
        }
        l.k(z10);
        this.f14145b = i10;
        this.f14146c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14145b), Integer.valueOf(this.f14145b)) && l.l(Integer.valueOf(aVar.f14146c), Integer.valueOf(this.f14146c)) && aVar.f14144a == this.f14144a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14145b), Integer.valueOf(this.f14146c), this.f14144a});
    }
}
