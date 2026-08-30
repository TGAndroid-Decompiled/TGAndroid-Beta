package gg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.yh;
public final class q1 extends rl0 {
    public final w1 f6739c;

    public q1(w1 w1Var) {
        this.f6739c = w1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f6739c.V.size() + 3;
    }

    @Override
    public final int j(int i10) {
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
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        w1 w1Var = this.f6739c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) w1Var.V.get(i10 - 3);
            kg.n nVar = (kg.n) view;
            nVar.setBoost(tL_myBoost);
            nVar.c(w1Var.U.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            v1 v1Var = (v1) view;
            w1Var.Y = v1Var;
            TLRPC.Chat chat = w1Var.W;
            e90 e90Var = v1Var.e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), j6.f19966gc, 2, new ef.e(w1Var, 14));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                e90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                e90Var.post(new af.b(v1Var, indexOf, 5));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        f6 f6Var;
        Context context = viewGroup.getContext();
        w1 w1Var = this.f6739c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        f6Var = ((g3) w1Var).resourcesProvider;
                        view = new kg.n(context, true, false, f6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new m4(context, 22);
                }
            } else {
                view = new z6(context, j6.w0(null, j6.f19852a7, false), 0);
            }
        } else {
            v1 v1Var = new v1(context);
            v1Var.a(w1Var.U, w1Var.W);
            view = v1Var;
        }
        return yh.o(view, view, -1, -2);
    }
}
