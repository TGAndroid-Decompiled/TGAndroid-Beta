package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15310a;
    public final int f15311b;
    public final int f15312c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15310a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f5163n) {
            z10 = true;
        }
        l.k(z10);
        this.f15311b = i10;
        this.f15312c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15311b), Integer.valueOf(this.f15311b)) && l.l(Integer.valueOf(aVar.f15312c), Integer.valueOf(this.f15312c)) && aVar.f15310a == this.f15310a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15311b), Integer.valueOf(this.f15312c), this.f15310a});
    }
}
