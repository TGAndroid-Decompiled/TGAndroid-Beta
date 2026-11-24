package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class cvb extends ovb {
    public final qvb p3;

    public cvb(qvb qvbVar, Context context) {
        super(qvbVar, context);
        this.p3 = qvbVar;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.p3.b;
        if (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ivb) arrayList.get(0)).c == null || ((ivb) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.p3.y0();
    }
}
