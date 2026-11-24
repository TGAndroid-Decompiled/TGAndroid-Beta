package defpackage;

import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
public final class hvb extends ka {
    public final qvb d;

    public hvb(qvb qvbVar) {
        this.d = qvbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 0 && i != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.b.size() + 1;
    }

    @Override
    public final int d(int i) {
        if (i == b() - 1) {
            return 2;
        }
        return ((ivb) this.d.b.get(i)).a;
    }

    @Override
    public final void f() {
        this.d.c = b();
        super.f();
    }

    @Override
    public final void t(defpackage.s49 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvb.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        qvb qvbVar = this.d;
        if (i != 0 && i != 3) {
            if (i == 2) {
                gvb gvbVar = new gvb(this, qvbVar.getParentActivity());
                qvbVar.F0 = gvbVar;
                return new s49(gvbVar);
            }
            pi4 pi4Var = new pi4(viewGroup.getContext(), null);
            pi4Var.setViewType(24);
            pi4Var.setIsSingleCell(true);
            pi4Var.x = true;
            return new s49(pi4Var);
        }
        nvb nvbVar = new nvb(qvbVar, viewGroup.getContext(), false);
        if (i == 3) {
            i2 = ((d) qvbVar).currentAccount;
            boolean x = l7c.x(na7.q1(i2).V1(Long.valueOf(-qvbVar.a)));
            nvbVar.setForumIcon(mm4.e(jm4.k[0], ""));
            if (!x) {
                i3 = 2131753063;
            } else {
                i3 = 2131753065;
            }
            nvbVar.setTitleOverride(k96.M0(i3, null));
            if (!x) {
                i4 = 2131753064;
            } else {
                i4 = 2131753066;
            }
            nvbVar.setCustomMessage(k96.M0(i4, null));
        }
        z = ((d) qvbVar).inPreviewMode;
        nvbVar.l0 = z;
        nvbVar.setArchivedPullAnimation(qvbVar.x);
        return new s49(nvbVar);
    }
}
