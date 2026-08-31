package hg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.y4;
public final class r0 implements y4, uv0, jg.g, jg.l {
    public final b1 f7593a;

    public r0(b1 b1Var) {
        this.f7593a = b1Var;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        b1 b1Var = this.f7593a;
        b1Var.f7411j0 = i10 * 1000;
        b1Var.a0(false, true);
    }

    @Override
    public void i(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        b1 b1Var = this.f7593a;
        int i12 = b1Var.f7406e0;
        int i13 = jg.e.f10026s;
        if (i12 == 2) {
            b1Var.f7412k0 = i10;
        } else {
            b1Var.f7413l0 = i10;
        }
        b1Var.f7414n0.f10006a.c(b1Var.V(), true);
        if (b1Var.f7406e0 == 3) {
            b1Var.a0(true, true);
        } else {
            b1Var.a0(false, false);
        }
        ig.b bVar = b1Var.f7405d0;
        int V = b1Var.V();
        for (int i14 = 0; i14 < bVar.f8070f.getChildCount(); i14++) {
            View childAt = bVar.f8070f.getChildAt(i14);
            if (childAt instanceof jg.z) {
                k6 k6Var = ((jg.z) childAt).f10087r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                k6Var.a();
                k6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof jg.h) {
                jg.h hVar = (jg.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.f10041w) {
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
        bVar.q(bVar.f8069e.size() - 12, 12);
    }

    @Override
    public void m() {
    }
}
