package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class sb5 extends c79 {
    public vc2 c;
    public final int d;
    public ArrayList f;
    public g75 h;
    public final j95 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public sb5(vc2 vc2Var, int i, j95 j95Var) {
        this.c = vc2Var;
        this.d = i;
        this.n = j95Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void E(q95 q95Var, boolean z) {
        if (z) {
            if (q95Var.getRenderer() == null) {
                q95Var.setRenderer(ka5.c(this.f, this.h, null, null, q95Var, q95Var.getParticipant(), this.c, this.n));
            }
        } else if (q95Var.getRenderer() != null) {
            q95Var.getRenderer().setTabletGridView(null);
            q95Var.setRenderer(null);
        }
    }

    public final int F() {
        d79 d79Var = this.n.f4;
        int size = this.e.size();
        if (size <= 1) {
            return d79Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return d79Var.getMeasuredHeight() / 2;
        }
        return (int) (d79Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, g75 g75Var) {
        this.f = arrayList;
        this.h = g75Var;
    }

    public final void H(d79 d79Var, boolean z, boolean z2) {
        this.r = z;
        if (z2) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                View childAt = d79Var.getChildAt(i);
                if (childAt instanceof q95) {
                    q95 q95Var = (q95) childAt;
                    if (q95Var.getParticipant() != null) {
                        E(q95Var, z);
                    }
                }
            }
        }
    }

    public final void I(d79 d79Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            cy7.a(new ak3(this, arrayList2, (byte) 2), true).c(this);
            hl.V3(d79Var);
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
    public final void t(defpackage.f89 r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb5.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        return new f89(new d95(this, viewGroup.getContext()));
    }
}
