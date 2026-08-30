package gg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.y4;
public final class r0 implements y4, tv0, ig.g, ig.l {
    public final b1 f6740a;

    public r0(b1 b1Var) {
        this.f6740a = b1Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        b1 b1Var = this.f6740a;
        b1Var.f6572j0 = i10 * 1000;
        b1Var.a0(false, true);
    }

    @Override
    public void h(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        b1 b1Var = this.f6740a;
        int i12 = b1Var.f6567e0;
        int i13 = ig.e.f7506s;
        if (i12 == 2) {
            b1Var.f6573k0 = i10;
        } else {
            b1Var.f6574l0 = i10;
        }
        b1Var.f6575n0.f7488a.c(b1Var.V(), true);
        if (b1Var.f6567e0 == 3) {
            b1Var.a0(true, true);
        } else {
            b1Var.a0(false, false);
        }
        hg.b bVar = b1Var.f6566d0;
        int V = b1Var.V();
        for (int i14 = 0; i14 < bVar.f7075f.getChildCount(); i14++) {
            View childAt = bVar.f7075f.getChildAt(i14);
            if (childAt instanceof ig.z) {
                k6 k6Var = ((ig.z) childAt).f7561r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                k6Var.a();
                k6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof ig.h) {
                ig.h hVar = (ig.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.f7520w) {
                    if (F >= 1) {
                        if (isChannelAndNotMegaGroup) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        string = LocaleController.formatPluralString(str2, F, new Object[0]);
                    } else {
                        if (isChannelAndNotMegaGroup) {
                            i11 = R.string.DiscussChannel;
                        } else {
                            i11 = R.string.AccDescrGroup;
                        }
                        string = LocaleController.getString(i11);
                    }
                    hVar.setSubtitle(string);
                } else {
                    if (isChannelAndNotMegaGroup) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    hVar.setSubtitle(LocaleController.formatPluralString(str, V, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override
    public void m() {
    }
}
