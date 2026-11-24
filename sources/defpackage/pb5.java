package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class pb5 extends q59 {
    public qd2 c;
    public final int d;
    public ArrayList f;
    public c75 h;
    public final g95 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public pb5(qd2 qd2Var, int i, g95 g95Var) {
        this.c = qd2Var;
        this.d = i;
        this.n = g95Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    public final void E(n95 n95Var, boolean z) {
        if (z) {
            if (n95Var.getRenderer() == null) {
                n95Var.setRenderer(ha5.c(this.f, this.h, null, null, n95Var, n95Var.getParticipant(), this.c, this.n));
            }
        } else if (n95Var.getRenderer() != null) {
            n95Var.getRenderer().setTabletGridView(null);
            n95Var.setRenderer(null);
        }
    }

    public final int F() {
        r59 r59Var = this.n.f4;
        int size = this.e.size();
        if (size <= 1) {
            return r59Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return r59Var.getMeasuredHeight() / 2;
        }
        return (int) (r59Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, c75 c75Var) {
        this.f = arrayList;
        this.h = c75Var;
    }

    public final void H(r59 r59Var, boolean z, boolean z2) {
        this.r = z;
        if (z2) {
            for (int i = 0; i < r59Var.getChildCount(); i++) {
                View childAt = r59Var.getChildAt(i);
                if (childAt instanceof n95) {
                    n95 n95Var = (n95) childAt;
                    if (n95Var.getParticipant() != null) {
                        E(n95Var, z);
                    }
                }
            }
        }
    }

    public final void I(r59 r59Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            ww7.a(new tk3(this, arrayList2, (byte) 2), true).c(this);
            gm.V3(r59Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.c.f);
        f();
    }

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final void t(defpackage.u69 r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb5.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new a95(this, viewGroup.getContext()));
    }
}
