package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15945a;
    public final int f15946b;
    public final int f15947c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15945a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6543n) {
            z10 = true;
        }
        l.k(z10);
        this.f15946b = i10;
        this.f15947c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15946b), Integer.valueOf(this.f15946b)) && l.l(Integer.valueOf(aVar.f15947c), Integer.valueOf(this.f15947c)) && aVar.f15945a == this.f15945a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15946b), Integer.valueOf(this.f15947c), this.f15945a});
    }
}
