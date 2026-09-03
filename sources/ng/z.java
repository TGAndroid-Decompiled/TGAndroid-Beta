package ng;

import android.content.Context;
import android.view.View;
import lh.c3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.f61;
import org.telegram.ui.w61;
import org.telegram.ui.xn;
public final class z extends w61 {
    public final qk0 a2;
    public final p2 f16243b2;
    public final d0 f16244c2;

    public z(d0 d0Var, p2 p2Var, Context context, int i10, boolean z4, g6 g6Var, qk0 qk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z4, g6Var, 16);
        this.f16244c2 = d0Var;
        this.a2 = qk0Var;
        this.f16243b2 = p2Var2;
    }

    @Override
    public final void m() {
        this.f16244c2.f16035a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ag.l lVar = this.f16244c2.f16037c;
        qk0 qk0Var = this.a2;
        p2 p2Var = this.f16243b2;
        if (p2Var != null && !qk0Var.f30462x0 && qk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                lVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new qc(lVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new c3(this, 21)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                l5.h(UserConfig.selectedAccount).e(document);
            }
            if (l10 == null) {
                longValue = document.f20851id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f16181g = longValue;
            obj.h = longValue;
            qk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(lVar);
        }
    }

    @Override
    public final void q() {
        d0 d0Var = this.f16244c2;
        if (!d0Var.v) {
            d0Var.v = true;
            if (!d0Var.d) {
                d0Var.f16036b.updateViewLayout(d0Var.f16037c, d0Var.b(true));
            }
            p2 p2Var = this.f16243b2;
            if (p2Var instanceof xn) {
                ((xn) p2Var).P9();
            }
            qk0 qk0Var = this.a2;
            if (qk0Var.getDelegate() != null) {
                qk0Var.getDelegate().h();
            }
        }
    }

    @Override
    public final void r(f61 f61Var, q0 q0Var) {
        this.a2.l(f61Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.f16244c2.f16037c);
    }

    @Override
    public final boolean u() {
        qk0 qk0Var = this.a2;
        if (qk0Var.getDelegate() != null) {
            return qk0Var.getDelegate().h();
        }
        return false;
    }
}
