package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14604a;
    public final int f14605b;
    public final int f14606c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14604a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f5091n) {
            z10 = true;
        }
        l.k(z10);
        this.f14605b = i10;
        this.f14606c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14605b), Integer.valueOf(this.f14605b)) && l.l(Integer.valueOf(aVar.f14606c), Integer.valueOf(this.f14606c)) && aVar.f14604a == this.f14604a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14605b), Integer.valueOf(this.f14606c), this.f14604a});
    }
}
