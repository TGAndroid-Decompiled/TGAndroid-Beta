package defpackage;

import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e;
public final class jzb extends la {
    public final tzb d;

    public jzb(tzb tzbVar) {
        this.d = tzbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        return ((kzb) this.d.b.get(i)).a;
    }

    @Override
    public final void f() {
        this.d.c = b();
        super.f();
    }

    @Override
    public final void t(defpackage.f89 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzb.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        tzb tzbVar = this.d;
        if (i != 0 && i != 3) {
            if (i == 2) {
                izb izbVar = new izb(this, tzbVar.getParentActivity());
                tzbVar.F0 = izbVar;
                return new f89(izbVar);
            }
            tk4 tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setViewType(24);
            tk4Var.setIsSingleCell(true);
            tk4Var.x = true;
            return new f89(tk4Var);
        }
        qzb qzbVar = new qzb(tzbVar, viewGroup.getContext(), false);
        if (i == 3) {
            i2 = ((e) tzbVar).currentAccount;
            boolean x = lbc.x(uc7.s1(i2).X1(Long.valueOf(-tzbVar.a)));
            qzbVar.setForumIcon(ro4.e(oo4.k[0], ""));
            if (!x) {
                i3 = 2131753059;
            } else {
                i3 = 2131753061;
            }
            qzbVar.setTitleOverride(ob6.M0(i3, null));
            if (!x) {
                i4 = 2131753060;
            } else {
                i4 = 2131753062;
            }
            qzbVar.setCustomMessage(ob6.M0(i4, null));
        }
        z = ((e) tzbVar).inPreviewMode;
        qzbVar.l0 = z;
        qzbVar.setArchivedPullAnimation(tzbVar.x);
        return new f89(qzbVar);
    }
}
