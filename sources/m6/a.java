package m6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import o6.l;
public abstract class a {
    public final DataHolder f18357a;
    public final int f18358b;
    public final int f18359c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f18357a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6668n) {
            z10 = true;
        }
        l.k(z10);
        this.f18358b = i10;
        this.f18359c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f18358b), Integer.valueOf(this.f18358b)) && l.l(Integer.valueOf(aVar.f18359c), Integer.valueOf(this.f18359c)) && aVar.f18357a == this.f18357a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18358b), Integer.valueOf(this.f18359c), this.f18357a});
    }
}
