package eg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.o6;
public final class s0 implements b5, kv0, gg.g, gg.l {
    public final c1 f6124a;

    public s0(c1 c1Var) {
        this.f6124a = c1Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        c1 c1Var = this.f6124a;
        c1Var.f5943i0 = i10 * 1000;
        c1Var.a0(false, true);
    }

    @Override
    public void h(int i10) {
        String str;
        int i11;
        String string;
        String str2;
        String formatPluralString;
        c1 c1Var = this.f6124a;
        int i12 = c1Var.f5938d0;
        int i13 = gg.e.f7296s;
        if (i12 == 2) {
            c1Var.f5944j0 = i10;
        } else {
            c1Var.f5945k0 = i10;
        }
        c1Var.m0.f7276a.c(c1Var.V(), true);
        if (c1Var.f5938d0 == 3) {
            c1Var.a0(true, true);
        } else {
            c1Var.a0(false, false);
        }
        fg.b bVar = c1Var.f5937c0;
        int V = c1Var.V();
        for (int i14 = 0; i14 < bVar.f6728f.getChildCount(); i14++) {
            View childAt = bVar.f6728f.getChildAt(i14);
            if (childAt instanceof gg.z) {
                o6 o6Var = ((gg.z) childAt).f7357r;
                if (V <= 0) {
                    formatPluralString = "";
                } else {
                    formatPluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                }
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof gg.h) {
                gg.h hVar = (gg.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.f7311w) {
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
        bVar.q(bVar.f6727e.size() - 12, 12);
    }

    @Override
    public void m() {
    }
}
