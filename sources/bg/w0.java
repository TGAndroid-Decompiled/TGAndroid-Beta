package bg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.x4;
public final class w0 implements x4, av0, dg.g, dg.l {
    public final h1 f1985a;

    public w0(h1 h1Var) {
        this.f1985a = h1Var;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        h1 h1Var = this.f1985a;
        h1Var.f1816i0 = i9 * 1000;
        h1Var.Z(false, true);
    }

    @Override
    public void h(int i9) {
        String str;
        int i10;
        String string;
        String str2;
        String formatPluralString;
        h1 h1Var = this.f1985a;
        int i11 = h1Var.f1811d0;
        int i12 = dg.e.f4507s;
        if (i11 == 2) {
            h1Var.f1817j0 = i9;
        } else {
            h1Var.f1818k0 = i9;
        }
        h1Var.m0.f4483a.c(h1Var.U(), true);
        if (h1Var.f1811d0 == 3) {
            h1Var.Z(true, true);
        } else {
            h1Var.Z(false, false);
        }
        cg.b bVar = h1Var.f1810c0;
        int U = h1Var.U();
        for (int i13 = 0; i13 < bVar.f2389f.getChildCount(); i13++) {
            View childAt = bVar.f2389f.getChildAt(i13);
            if (childAt instanceof dg.b0) {
                j6 j6Var = ((dg.b0) childAt).f4497r;
                if (U <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", U, Integer.valueOf(U));
                }
                j6Var.a();
                j6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof dg.h) {
                dg.h hVar = (dg.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.f4527w) {
                    if (F >= 1) {
                        if (isChannelAndNotMegaGroup) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        string = LocaleController.formatPluralString(str2, F, new Object[0]);
                    } else {
                        if (isChannelAndNotMegaGroup) {
                            i10 = R.string.DiscussChannel;
                        } else {
                            i10 = R.string.AccDescrGroup;
                        }
                        string = LocaleController.getString(i10);
                    }
                    hVar.setSubtitle(string);
                } else {
                    if (isChannelAndNotMegaGroup) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    hVar.setSubtitle(LocaleController.formatPluralString(str, U, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.f2388e.size() - 12, 12);
    }

    @Override
    public void m() {
    }
}
