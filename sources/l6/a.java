package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f16008a;
    public final int f16009b;
    public final int f16010c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f16008a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6555n) {
            z10 = true;
        }
        l.k(z10);
        this.f16009b = i10;
        this.f16010c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f16009b), Integer.valueOf(this.f16009b)) && l.l(Integer.valueOf(aVar.f16010c), Integer.valueOf(this.f16010c)) && aVar.f16008a == this.f16008a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16009b), Integer.valueOf(this.f16010c), this.f16008a});
    }
}
