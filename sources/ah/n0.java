package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.g51;
import org.telegram.ui.qn;
import org.telegram.ui.x51;
public final class n0 extends x51 {
    public final dl0 f833d2;
    public final n2 f834e2;
    public final t0 f835f2;

    public n0(t0 t0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, dl0 dl0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f835f2 = t0Var;
        this.f833d2 = dl0Var;
        this.f834e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f835f2.f868a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        v vVar = this.f835f2.f870c;
        dl0 dl0Var = this.f833d2;
        n2 n2Var = this.f834e2;
        if (n2Var != null && !dl0Var.A0 && dl0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(vVar, null).r(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 5)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                r5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f20282id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f784g = longValue;
            obj.h = longValue;
            dl0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(vVar);
        }
    }

    @Override
    public final void q() {
        t0 t0Var = this.f835f2;
        if (!t0Var.v) {
            t0Var.v = true;
            if (!t0Var.d) {
                t0Var.f869b.updateViewLayout(t0Var.f870c, t0Var.b(true));
            }
            n2 n2Var = this.f834e2;
            if (n2Var instanceof qn) {
                ((qn) n2Var).U9();
            }
            dl0 dl0Var = this.f833d2;
            if (dl0Var.getDelegate() != null) {
                dl0Var.getDelegate().m();
            }
        }
    }

    @Override
    public final void r(g51 g51Var, i1 i1Var) {
        this.f833d2.l(g51Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.f835f2.f870c);
    }

    @Override
    public final boolean u() {
        dl0 dl0Var = this.f833d2;
        if (dl0Var.getDelegate() != null) {
            return dl0Var.getDelegate().m();
        }
        return false;
    }
}
