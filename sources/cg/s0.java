package cg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.x4;

public final class s0 implements x4, cv0, eg.g, eg.l {

    public final d1 f2816a;

    public s0(d1 d1Var) {
        this.f2816a = d1Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        d1 d1Var = this.f2816a;
        d1Var.f2642i0 = ((long) i10) * 1000;
        d1Var.a0(false, true);
    }

    @Override
    public void j(int i10) {
        d1 d1Var = this.f2816a;
        int i11 = d1Var.f2637d0;
        int i12 = eg.e.f5401s;
        if (i11 == 2) {
            d1Var.f2643j0 = i10;
        } else {
            d1Var.f2644k0 = i10;
        }
        d1Var.m0.f5382a.c(d1Var.V(), true);
        if (d1Var.f2637d0 == 3) {
            d1Var.a0(true, true);
        } else {
            d1Var.a0(false, false);
        }
        dg.b bVar = d1Var.f2636c0;
        int iV = d1Var.V();
        for (int i13 = 0; i13 < bVar.f4933f.getChildCount(); i13++) {
            View childAt = bVar.f4933f.getChildAt(i13);
            if (childAt instanceof eg.a0) {
                j6 j6Var = ((eg.a0) childAt).f5386r;
                String pluralString = iV <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", iV, Integer.valueOf(iV));
                j6Var.a();
                j6Var.c(pluralString, true, true);
            }
            if (childAt instanceof eg.h) {
                eg.h hVar = (eg.h) childAt;
                int iF = bVar.F(hVar.getChat());
                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.f5418w) {
                    hVar.setSubtitle(iF >= 1 ? LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "Subscribers" : "Members", iF, new Object[0]) : LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    hVar.setSubtitle(LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", iV, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.f4932e.size() - 12, 12);
    }

    @Override
    public void m() {
    }
}
