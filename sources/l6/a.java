package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.m;
public abstract class a {
    public final DataHolder f15441a;
    public final int f15442b;
    public final int f15443c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f15441a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6741n) {
            z10 = true;
        }
        m.k(z10);
        this.f15442b = i10;
        this.f15443c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f15442b), Integer.valueOf(this.f15442b)) && m.l(Integer.valueOf(aVar.f15443c), Integer.valueOf(this.f15443c)) && aVar.f15441a == this.f15441a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15442b), Integer.valueOf(this.f15443c), this.f15441a});
    }
}
