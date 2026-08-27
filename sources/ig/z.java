package ig;

import ag.y1;
import android.content.Context;
import android.view.View;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.a61;
import org.telegram.ui.j51;
import org.telegram.ui.rn;

public final class z extends a61 {
    public final wj0 Z1;
    public final n2 a2;

    public final d0 f11475b2;

    public z(d0 d0Var, n2 n2Var, Context context, int i10, boolean z10, c6 c6Var, wj0 wj0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, c6Var, 16);
        this.f11475b2 = d0Var;
        this.Z1 = wj0Var;
        this.a2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f11475b2.f11268a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y1 y1Var = this.f11475b2.f11270c;
        wj0 wj0Var = this.Z1;
        n2 n2Var = this.a2;
        if (n2Var != null && !wj0Var.f34269w0 && wj0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                y1Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new mc(y1Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new y9(this, 6)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            k5.h(UserConfig.selectedAccount).e(document);
        }
        long jLongValue = l10 == null ? document.f22386id : l10.longValue();
        q0 q0Var = new q0();
        q0Var.f11413g = jLongValue;
        q0Var.h = jLongValue;
        wj0Var.l(view, q0Var, false);
        AndroidUtilities.hideKeyboard(y1Var);
    }

    @Override
    public final void q() {
        d0 d0Var = this.f11475b2;
        if (d0Var.v) {
            return;
        }
        d0Var.v = true;
        if (!d0Var.d) {
            d0Var.f11269b.updateViewLayout(d0Var.f11270c, d0Var.b(true));
        }
        n2 n2Var = this.a2;
        if (n2Var instanceof rn) {
            ((rn) n2Var).P9();
        }
        wj0 wj0Var = this.Z1;
        if (wj0Var.getDelegate() != null) {
            wj0Var.getDelegate().m();
        }
    }

    @Override
    public final void r(j51 j51Var, q0 q0Var) {
        this.Z1.l(j51Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.f11475b2.f11270c);
    }

    @Override
    public final boolean u() {
        wj0 wj0Var = this.Z1;
        if (wj0Var.getDelegate() != null) {
            return wj0Var.getDelegate().m();
        }
        return false;
    }
}
