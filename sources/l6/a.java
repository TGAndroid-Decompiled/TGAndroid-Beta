package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.m;
public abstract class a {
    public final DataHolder f15477a;
    public final int f15478b;
    public final int f15479c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f15477a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6741n) {
            z10 = true;
        }
        m.k(z10);
        this.f15478b = i10;
        this.f15479c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f15478b), Integer.valueOf(this.f15478b)) && m.l(Integer.valueOf(aVar.f15479c), Integer.valueOf(this.f15479c)) && aVar.f15477a == this.f15477a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15478b), Integer.valueOf(this.f15479c), this.f15477a});
    }
}
