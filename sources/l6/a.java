package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14159a;
    public final int f14160b;
    public final int f14161c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14159a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6220n) {
            z10 = true;
        }
        l.k(z10);
        this.f14160b = i10;
        this.f14161c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14160b), Integer.valueOf(this.f14160b)) && l.l(Integer.valueOf(aVar.f14161c), Integer.valueOf(this.f14161c)) && aVar.f14159a == this.f14159a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14160b), Integer.valueOf(this.f14161c), this.f14159a});
    }
}
