package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.m;
public abstract class a {
    public final DataHolder f15188a;
    public final int f15189b;
    public final int f15190c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f15188a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6740n) {
            z10 = true;
        }
        m.k(z10);
        this.f15189b = i10;
        this.f15190c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f15189b), Integer.valueOf(this.f15189b)) && m.l(Integer.valueOf(aVar.f15190c), Integer.valueOf(this.f15190c)) && aVar.f15188a == this.f15188a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15189b), Integer.valueOf(this.f15190c), this.f15188a});
    }
}
