package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15939a;
    public final int f15940b;
    public final int f15941c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15939a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6545n) {
            z10 = true;
        }
        l.k(z10);
        this.f15940b = i10;
        this.f15941c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15940b), Integer.valueOf(this.f15940b)) && l.l(Integer.valueOf(aVar.f15941c), Integer.valueOf(this.f15941c)) && aVar.f15939a == this.f15939a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15940b), Integer.valueOf(this.f15941c), this.f15939a});
    }
}
