package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15337a;
    public final int f15338b;
    public final int f15339c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15337a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f5190n) {
            z10 = true;
        }
        l.k(z10);
        this.f15338b = i10;
        this.f15339c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15338b), Integer.valueOf(this.f15338b)) && l.l(Integer.valueOf(aVar.f15339c), Integer.valueOf(this.f15339c)) && aVar.f15337a == this.f15337a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15338b), Integer.valueOf(this.f15339c), this.f15337a});
    }
}
