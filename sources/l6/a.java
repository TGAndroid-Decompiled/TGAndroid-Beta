package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.m;
public abstract class a {
    public final DataHolder f15187a;
    public final int f15188b;
    public final int f15189c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f15187a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6740n) {
            z10 = true;
        }
        m.k(z10);
        this.f15188b = i10;
        this.f15189c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f15188b), Integer.valueOf(this.f15188b)) && m.l(Integer.valueOf(aVar.f15189c), Integer.valueOf(this.f15189c)) && aVar.f15187a == this.f15187a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15188b), Integer.valueOf(this.f15189c), this.f15187a});
    }
}
