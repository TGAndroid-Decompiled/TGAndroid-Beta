package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15374a;
    public final int f15375b;
    public final int f15376c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15374a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6689n) {
            z10 = true;
        }
        l.k(z10);
        this.f15375b = i10;
        this.f15376c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15375b), Integer.valueOf(this.f15375b)) && l.l(Integer.valueOf(aVar.f15376c), Integer.valueOf(this.f15376c)) && aVar.f15374a == this.f15374a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15375b), Integer.valueOf(this.f15376c), this.f15374a});
    }
}
