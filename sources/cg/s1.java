package cg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;

public final class s1 extends yk0 {

    public final z1 f2817c;

    public s1(z1 z1Var) {
        this.f2817c = z1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 3;
    }

    @Override
    public final int h() {
        return this.f2817c.U.size() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        z1 z1Var = this.f2817c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) z1Var.U.get(i10 - 3);
            gg.o oVar = (gg.o) view;
            oVar.setBoost(tL_myBoost);
            oVar.c(z1Var.T.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            j4 j4Var = (j4) view;
            j4Var.setTextSize(15.0f);
            j4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            j4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i11 == 0) {
            y1 y1Var = (y1) view;
            z1Var.X = y1Var;
            TLRPC.Chat chat = z1Var.V;
            p80 p80Var = y1Var.f2867e;
            try {
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), g6.gc, 2, new af.e(z1Var, 25));
                int iIndexOf = TextUtils.indexOf(spannableStringBuilderReplaceTags, "%3$s");
                spannableStringBuilderReplaceTags.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableStringBuilderReplaceSingleTag);
                p80Var.setText(spannableStringBuilderReplaceTags, TextView.BufferType.EDITABLE);
                p80Var.post(new w1(y1Var, iIndexOf, 0));
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = viewGroup.getContext();
        z1 z1Var = this.f2817c;
        if (i10 == 0) {
            y1 y1Var = new y1(context);
            y1Var.a(z1Var.T, z1Var.V);
            w6Var = y1Var;
        } else if (i10 == 1) {
            w6Var = new w6(context, g6.w0(null, g6.f22999a7, false), 0);
        } else if (i10 != 2) {
            w6Var = i10 != 3 ? new View(context) : new gg.o(context, true, false, ((e3) z1Var).resourcesProvider, true);
        } else {
            w6Var = new j4(context, 22);
        }
        return pa.l(w6Var, w6Var, -1, -2);
    }
}
