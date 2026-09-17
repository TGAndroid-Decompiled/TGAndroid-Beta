package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f13932a;
    public final int f13933b;
    public final int f13934c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f13932a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6225n) {
            z10 = true;
        }
        l.k(z10);
        this.f13933b = i10;
        this.f13934c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f13933b), Integer.valueOf(this.f13933b)) && l.l(Integer.valueOf(aVar.f13934c), Integer.valueOf(this.f13934c)) && aVar.f13932a == this.f13932a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13933b), Integer.valueOf(this.f13934c), this.f13932a});
    }
}
