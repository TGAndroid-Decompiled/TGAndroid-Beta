package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15442a;
    public final int f15443b;
    public final int f15444c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15442a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6742n) {
            z10 = true;
        }
        l.k(z10);
        this.f15443b = i10;
        this.f15444c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15443b), Integer.valueOf(this.f15443b)) && l.l(Integer.valueOf(aVar.f15444c), Integer.valueOf(this.f15444c)) && aVar.f15442a == this.f15442a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15443b), Integer.valueOf(this.f15444c), this.f15442a});
    }
}
