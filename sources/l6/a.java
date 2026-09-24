package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14128a;
    public final int f14129b;
    public final int f14130c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14128a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6208n) {
            z10 = true;
        }
        l.k(z10);
        this.f14129b = i10;
        this.f14130c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14129b), Integer.valueOf(this.f14129b)) && l.l(Integer.valueOf(aVar.f14130c), Integer.valueOf(this.f14130c)) && aVar.f14128a == this.f14128a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14129b), Integer.valueOf(this.f14130c), this.f14128a});
    }
}
