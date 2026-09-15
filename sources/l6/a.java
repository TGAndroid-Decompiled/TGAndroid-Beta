package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f13922a;
    public final int f13923b;
    public final int f13924c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f13922a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6220n) {
            z10 = true;
        }
        l.k(z10);
        this.f13923b = i10;
        this.f13924c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f13923b), Integer.valueOf(this.f13923b)) && l.l(Integer.valueOf(aVar.f13924c), Integer.valueOf(this.f13924c)) && aVar.f13922a == this.f13922a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13923b), Integer.valueOf(this.f13924c), this.f13922a});
    }
}
