package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class ek8 implements js4, e39, la5 {
    public final gk8 a;

    public ek8(gk8 gk8Var) {
        this.a = gk8Var;
    }

    @Override
    public final void a(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.a.Z();
        } else {
            Long l = (Long) it.next();
            throw null;
        }
    }

    @Override
    public final boolean d(int i, View view) {
        gk8 gk8Var = this.a;
        if (i >= gk8Var.r && i < gk8Var.s) {
            if (gk8Var.E) {
                gk8Var.Y(Long.valueOf(gk8Var.getMessagesController().x0.keyAt(i - gk8Var.r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final Object m(Object obj) {
        if (((Integer) obj).intValue() != this.a.x) {
            return null;
        }
        return Integer.valueOf(bkb.p1(0.12f, bkb.w0(null, bkb.o7, false)));
    }
}
