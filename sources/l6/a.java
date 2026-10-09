package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15438a;
    public final int f15439b;
    public final int f15440c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15438a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6742n) {
            z10 = true;
        }
        l.k(z10);
        this.f15439b = i10;
        this.f15440c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15439b), Integer.valueOf(this.f15439b)) && l.l(Integer.valueOf(aVar.f15440c), Integer.valueOf(this.f15440c)) && aVar.f15438a == this.f15438a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15439b), Integer.valueOf(this.f15440c), this.f15438a});
    }
}
