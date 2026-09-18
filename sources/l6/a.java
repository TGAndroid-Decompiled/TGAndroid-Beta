package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14078a;
    public final int f14079b;
    public final int f14080c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14078a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6225n) {
            z10 = true;
        }
        l.k(z10);
        this.f14079b = i10;
        this.f14080c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14079b), Integer.valueOf(this.f14079b)) && l.l(Integer.valueOf(aVar.f14080c), Integer.valueOf(this.f14080c)) && aVar.f14078a == this.f14078a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14079b), Integer.valueOf(this.f14080c), this.f14078a});
    }
}
