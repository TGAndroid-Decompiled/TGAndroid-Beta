package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class i0c extends c79 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final n0c e;

    public i0c(n0c n0cVar) {
        this.e = n0cVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z) {
        d79 d79Var = this.e.r;
        if (!z) {
            f();
            return;
        }
        boolean canScrollVertically = d79Var.canScrollVertically(-1);
        cy7.a(new ak3(this, arrayList, (byte) 5), true).c(this);
        if (!canScrollVertically) {
            d79Var.x0(0);
        }
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(defpackage.f89 r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0c.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        m0c m0cVar = new m0c(this.e, viewGroup.getContext());
        m0cVar.setLayoutParams(new r79(-1, -2));
        return new f89(m0cVar);
    }
}
