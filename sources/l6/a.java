package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14117a;
    public final int f14118b;
    public final int f14119c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14117a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6226n) {
            z10 = true;
        }
        l.k(z10);
        this.f14118b = i10;
        this.f14119c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14118b), Integer.valueOf(this.f14118b)) && l.l(Integer.valueOf(aVar.f14119c), Integer.valueOf(this.f14119c)) && aVar.f14117a == this.f14117a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14118b), Integer.valueOf(this.f14119c), this.f14117a});
    }
}
