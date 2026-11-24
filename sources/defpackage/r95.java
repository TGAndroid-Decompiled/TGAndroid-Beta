package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class r95 extends n39 {
    public fc2 c;
    public final int d;
    public ArrayList f;
    public e55 h;
    public final h75 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public r95(fc2 fc2Var, int i, h75 h75Var) {
        this.c = fc2Var;
        this.d = i;
        this.n = h75Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void E(o75 o75Var, boolean z) {
        if (z) {
            if (o75Var.getRenderer() == null) {
                o75Var.setRenderer(h85.c(this.f, this.h, null, null, o75Var, o75Var.getParticipant(), this.c, this.n));
            }
        } else if (o75Var.getRenderer() != null) {
            o75Var.getRenderer().setTabletGridView(null);
            o75Var.setRenderer(null);
        }
    }

    public final int F() {
        o39 o39Var = this.n.f4;
        int size = this.e.size();
        if (size <= 1) {
            return o39Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return o39Var.getMeasuredHeight() / 2;
        }
        return (int) (o39Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, e55 e55Var) {
        this.f = arrayList;
        this.h = e55Var;
    }

    public final void H(o39 o39Var, boolean z, boolean z2) {
        this.r = z;
        if (z2) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                View childAt = o39Var.getChildAt(i);
                if (childAt instanceof o75) {
                    o75 o75Var = (o75) childAt;
                    if (o75Var.getParticipant() != null) {
                        E(o75Var, z);
                    }
                }
            }
        }
    }

    public final void I(o39 o39Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            vu7.a(new ij3(this, arrayList2, (byte) 2), true).c(this);
            gl.V3(o39Var);
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
    public final void t(defpackage.s49 r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r95.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new b75(this, viewGroup.getContext()));
    }
}
