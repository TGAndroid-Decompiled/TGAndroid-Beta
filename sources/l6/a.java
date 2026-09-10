package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f12817a;
    public final int f12818b;
    public final int f12819c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f12817a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f4999n) {
            z10 = true;
        }
        l.k(z10);
        this.f12818b = i10;
        this.f12819c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f12818b), Integer.valueOf(this.f12818b)) && l.l(Integer.valueOf(aVar.f12819c), Integer.valueOf(this.f12819c)) && aVar.f12817a == this.f12817a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12818b), Integer.valueOf(this.f12819c), this.f12817a});
    }
}
