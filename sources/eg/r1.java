package eg;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;
public final class r1 extends il0 {
    public final x1 f6123c;

    public r1(x1 x1Var) {
        this.f6123c = x1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f6123c.U.size() + 3;
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
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        x1 x1Var = this.f6123c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) x1Var.U.get(i10 - 3);
            ig.n nVar = (ig.n) view;
            nVar.setBoost(tL_myBoost);
            nVar.c(x1Var.T.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            k4 k4Var = (k4) view;
            k4Var.setTextSize(15.0f);
            k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            k4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            w1 w1Var = (w1) view;
            x1Var.X = w1Var;
            TLRPC.Chat chat = x1Var.V;
            y80 y80Var = w1Var.f6161e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), g6.gc, 2, new cg.m2(x1Var, 12));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                y80Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                y80Var.post(new bg.f(w1Var, indexOf, 3));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        c6 c6Var;
        Context context = viewGroup.getContext();
        x1 x1Var = this.f6123c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        c6Var = ((f3) x1Var).resourcesProvider;
                        view = new ig.n(context, true, false, c6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new k4(context, 22);
                }
            } else {
                view = new x6(context, g6.w0(null, g6.f23009a7, false), 0);
            }
        } else {
            w1 w1Var = new w1(context);
            w1Var.a(x1Var.T, x1Var.V);
            view = w1Var;
        }
        return th.m(view, view, -1, -2);
    }
}
