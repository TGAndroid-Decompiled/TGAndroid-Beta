package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15373a;
    public final int f15374b;
    public final int f15375c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15373a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6689n) {
            z10 = true;
        }
        l.k(z10);
        this.f15374b = i10;
        this.f15375c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15374b), Integer.valueOf(this.f15374b)) && l.l(Integer.valueOf(aVar.f15375c), Integer.valueOf(this.f15375c)) && aVar.f15373a == this.f15373a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15374b), Integer.valueOf(this.f15375c), this.f15373a});
    }
}
