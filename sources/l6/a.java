package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14132a;
    public final int f14133b;
    public final int f14134c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14132a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6224n) {
            z10 = true;
        }
        l.k(z10);
        this.f14133b = i10;
        this.f14134c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14133b), Integer.valueOf(this.f14133b)) && l.l(Integer.valueOf(aVar.f14134c), Integer.valueOf(this.f14134c)) && aVar.f14132a == this.f14132a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14133b), Integer.valueOf(this.f14134c), this.f14132a});
    }
}
