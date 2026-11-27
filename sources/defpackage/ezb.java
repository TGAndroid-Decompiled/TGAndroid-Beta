package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class ezb extends rzb {
    public final tzb p3;

    public ezb(tzb tzbVar, Context context) {
        super(tzbVar, context);
        this.p3 = tzbVar;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.p3.b;
        if (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((kzb) arrayList.get(0)).c == null || ((kzb) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.p3.z0();
    }
}
