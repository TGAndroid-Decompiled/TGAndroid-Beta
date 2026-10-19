package l6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import n6.l;
public abstract class a {
    public final DataHolder f15947a;
    public final int f15948b;
    public final int f15949c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f15947a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f6545n) {
            z10 = true;
        }
        l.k(z10);
        this.f15948b = i10;
        this.f15949c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f15948b), Integer.valueOf(this.f15948b)) && l.l(Integer.valueOf(aVar.f15949c), Integer.valueOf(this.f15949c)) && aVar.f15947a == this.f15947a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15948b), Integer.valueOf(this.f15949c), this.f15947a});
    }
}
