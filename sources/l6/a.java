package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15946a;
    public final int f15947b;
    public final int f15948c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15946a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6546n) {
            z10 = true;
        }
        l.k(z10);
        this.f15947b = i10;
        this.f15948c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15947b), Integer.valueOf(this.f15947b)) && l.l(Integer.valueOf(aVar.f15948c), Integer.valueOf(this.f15948c)) && aVar.f15946a == this.f15946a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15947b), Integer.valueOf(this.f15948c), this.f15946a});
    }
}
