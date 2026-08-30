package mg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.q61;
import org.telegram.ui.xn;
import org.telegram.ui.y51;
public final class z extends q61 {
    public final pk0 a2;
    public final p2 f14167b2;
    public final d0 f14168c2;

    public z(d0 d0Var, p2 p2Var, Context context, int i10, boolean z4, f6 f6Var, pk0 pk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z4, f6Var, 16);
        this.f14168c2 = d0Var;
        this.a2 = pk0Var;
        this.f14167b2 = p2Var2;
    }

    @Override
    public final void m() {
        this.f14168c2.f13972a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ah.d dVar = this.f14168c2.f13974c;
        pk0 pk0Var = this.a2;
        p2 p2Var = this.f14167b2;
        if (p2Var != null && !pk0Var.f27923x0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                dVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new qc(dVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new lh.b(this, 20)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                l5.h(UserConfig.selectedAccount).e(document);
            }
            if (l10 == null) {
                longValue = document.f19190id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f14108g = longValue;
            obj.h = longValue;
            pk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(dVar);
        }
    }

    @Override
    public final void q() {
        d0 d0Var = this.f14168c2;
        if (!d0Var.v) {
            d0Var.v = true;
            if (!d0Var.d) {
                d0Var.f13973b.updateViewLayout(d0Var.f13974c, d0Var.b(true));
            }
            p2 p2Var = this.f14167b2;
            if (p2Var instanceof xn) {
                ((xn) p2Var).P9();
            }
            pk0 pk0Var = this.a2;
            if (pk0Var.getDelegate() != null) {
                pk0Var.getDelegate().j();
            }
        }
    }

    @Override
    public final void r(y51 y51Var, q0 q0Var) {
        this.a2.l(y51Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.f14168c2.f13974c);
    }

    @Override
    public final boolean u() {
        pk0 pk0Var = this.a2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().j();
        }
        return false;
    }
}
