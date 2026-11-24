package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class hm8 implements ku4, h59, jc5 {
    public final km8 a;

    public hm8(km8 km8Var) {
        this.a = km8Var;
    }

    @Override
    public final void a(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.a.a0();
        } else {
            Long l = (Long) it.next();
            throw null;
        }
    }

    @Override
    public final boolean g(int i, View view) {
        km8 km8Var = this.a;
        if (i >= km8Var.r && i < km8Var.s) {
            if (km8Var.E) {
                km8Var.Z(Long.valueOf(km8Var.getMessagesController().x0.keyAt(i - km8Var.r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final Object l(Object obj) {
        if (((Integer) obj).intValue() != this.a.x) {
            return null;
        }
        return Integer.valueOf(cmb.p1(0.12f, cmb.w0(null, cmb.o7, false)));
    }
}
