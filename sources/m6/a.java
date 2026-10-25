package m6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import o6.l;
public abstract class a {
    public final DataHolder f18358a;
    public final int f18359b;
    public final int f18360c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f18358a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6668n) {
            z10 = true;
        }
        l.k(z10);
        this.f18359b = i10;
        this.f18360c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f18359b), Integer.valueOf(this.f18359b)) && l.l(Integer.valueOf(aVar.f18360c), Integer.valueOf(this.f18360c)) && aVar.f18358a == this.f18358a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18359b), Integer.valueOf(this.f18360c), this.f18358a});
    }
}
