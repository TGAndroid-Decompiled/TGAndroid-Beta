package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f14145a;
    public final int f14146b;
    public final int f14147c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f14145a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6209n) {
            z10 = true;
        }
        l.k(z10);
        this.f14146b = i10;
        this.f14147c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f14146b), Integer.valueOf(this.f14146b)) && l.l(Integer.valueOf(aVar.f14147c), Integer.valueOf(this.f14147c)) && aVar.f14145a == this.f14145a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14146b), Integer.valueOf(this.f14147c), this.f14145a});
    }
}
