package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15944a;
    public final int f15945b;
    public final int f15946c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15944a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6544n) {
            z10 = true;
        }
        l.k(z10);
        this.f15945b = i10;
        this.f15946c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15945b), Integer.valueOf(this.f15945b)) && l.l(Integer.valueOf(aVar.f15946c), Integer.valueOf(this.f15946c)) && aVar.f15944a == this.f15944a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15945b), Integer.valueOf(this.f15946c), this.f15944a});
    }
}
