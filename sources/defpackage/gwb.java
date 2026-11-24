package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class gwb extends n39 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final lwb e;

    public gwb(lwb lwbVar) {
        this.e = lwbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z) {
        o39 o39Var = this.e.r;
        if (!z) {
            f();
            return;
        }
        boolean canScrollVertically = o39Var.canScrollVertically(-1);
        vu7.a(new ij3(this, arrayList, (byte) 5), true).c(this);
        if (!canScrollVertically) {
            o39Var.w0(0);
        }
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(defpackage.s49 r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwb.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        kwb kwbVar = new kwb(this.e, viewGroup.getContext());
        kwbVar.setLayoutParams(new e49(-1, -2));
        return new s49(kwbVar);
    }
}
