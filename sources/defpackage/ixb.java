package defpackage;

import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
public final class ixb extends ka {
    public final sxb d;

    public ixb(sxb sxbVar) {
        this.d = sxbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        return ((jxb) this.d.b.get(i)).a;
    }

    @Override
    public final void f() {
        this.d.c = b();
        super.f();
    }

    @Override
    public final void t(defpackage.u69 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixb.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        sxb sxbVar = this.d;
        if (i != 0 && i != 3) {
            if (i == 2) {
                hxb hxbVar = new hxb(this, sxbVar.getParentActivity());
                sxbVar.F0 = hxbVar;
                return new u69(hxbVar);
            }
            tk4 tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setViewType(24);
            tk4Var.setIsSingleCell(true);
            tk4Var.x = true;
            return new u69(tk4Var);
        }
        pxb pxbVar = new pxb(sxbVar, viewGroup.getContext(), false);
        if (i == 3) {
            i2 = ((d) sxbVar).currentAccount;
            boolean x = m9c.x(oc7.r1(i2).W1(Long.valueOf(-sxbVar.a)));
            pxbVar.setForumIcon(no4.e(ko4.k[0], ""));
            if (!x) {
                i3 = 2131753031;
            } else {
                i3 = 2131753033;
            }
            pxbVar.setTitleOverride(jb6.M0(i3, null));
            if (!x) {
                i4 = 2131753032;
            } else {
                i4 = 2131753034;
            }
            pxbVar.setCustomMessage(jb6.M0(i4, null));
        }
        z = ((d) sxbVar).inPreviewMode;
        pxbVar.l0 = z;
        pxbVar.setArchivedPullAnimation(sxbVar.x);
        return new u69(pxbVar);
    }
}
