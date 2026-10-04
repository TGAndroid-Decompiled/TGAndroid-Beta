package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15375a;
    public final int f15376b;
    public final int f15377c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15375a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6690n) {
            z10 = true;
        }
        l.k(z10);
        this.f15376b = i10;
        this.f15377c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15376b), Integer.valueOf(this.f15376b)) && l.l(Integer.valueOf(aVar.f15377c), Integer.valueOf(this.f15377c)) && aVar.f15375a == this.f15375a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15376b), Integer.valueOf(this.f15377c), this.f15375a});
    }
}
