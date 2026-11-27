package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class tn8 implements nu4, t69, mc5 {
    public final vn8 a;

    public tn8(vn8 vn8Var) {
        this.a = vn8Var;
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
    public final boolean e(int i, View view) {
        vn8 vn8Var = this.a;
        if (i >= vn8Var.r && i < vn8Var.s) {
            if (vn8Var.E) {
                vn8Var.Y(Long.valueOf(vn8Var.getMessagesController().x0.keyAt(i - vn8Var.r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final Object h(Object obj) {
        if (((Integer) obj).intValue() != this.a.x) {
            return null;
        }
        return Integer.valueOf(aob.p1(0.12f, aob.w0(null, aob.p7, false)));
    }
}
