package mg;

import ag.d3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
public final class i1 extends tk0 {
    public final o1 f13138c;

    public i1(o1 o1Var) {
        this.f13138c = o1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f13138c.Q1.size() + 3;
    }

    @Override
    public final int d(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    return 3;
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        o1 o1Var = this.f13138c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) o1Var.Q1.get(i10 - 3);
            qg.k kVar = (qg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(o1Var.P1.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            p4 p4Var = (p4) view;
            p4Var.setTextSize(15.0f);
            p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(2.0f));
            p4Var.setText(dd.L0(2131753295, null));
        } else if (i11 == 0) {
            n1 n1Var = (n1) view;
            o1Var.T1 = n1Var;
            TLRPC.Chat chat = o1Var.R1;
            p80 p80Var = n1Var.e;
            try {
                int i12 = (int) wp.r1(e20.f15506s0).f19227r0;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.G(i12, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(dd.L0(2131753320, "BoostingReassignBoostTextLink"), t6.Uc, 2, new l1(o1Var, 0), null);
                int indexOf = TextUtils.indexOf(W2, "%3$s");
                W2.replace(indexOf, indexOf + 4, (CharSequence) R2);
                p80Var.setText(W2, TextView.BufferType.EDITABLE);
                p80Var.post(new d3(n1Var, indexOf, 10));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        o1 o1Var = this.f13138c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new View(context);
                    } else {
                        view = new qg.k(context, true, false, o1Var.I0, true);
                    }
                } else {
                    view = new p4(context, 22);
                }
            } else {
                int i11 = t6.f20873a7;
                view = new c7(context, t6.x0(null, i11, false), 0);
                a7.i(i11, view, null);
            }
        } else {
            n1 n1Var = new n1(context);
            n1Var.a(o1Var.P1, o1Var.R1);
            view = n1Var;
        }
        return sc.e.o(view, view, -1, -2);
    }
}
