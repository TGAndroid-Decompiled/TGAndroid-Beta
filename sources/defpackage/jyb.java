package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class jyb extends q59 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final oyb e;

    public jyb(oyb oybVar) {
        this.e = oybVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z) {
        r59 r59Var = this.e.r;
        if (!z) {
            f();
            return;
        }
        boolean canScrollVertically = r59Var.canScrollVertically(-1);
        ww7.a(new tk3(this, arrayList, (byte) 5), true).c(this);
        if (!canScrollVertically) {
            r59Var.w0(0);
        }
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(defpackage.u69 r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyb.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        nyb nybVar = new nyb(this.e, viewGroup.getContext());
        nybVar.setLayoutParams(new g69(-1, -2));
        return new u69(nybVar);
    }
}
