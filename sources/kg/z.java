package kg;

import android.content.Context;
import android.view.View;
import bg.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.tc;
import org.telegram.ui.d61;
import org.telegram.ui.m51;
import org.telegram.ui.tn;
public final class z extends d61 {
    public final fk0 Z1;
    public final o2 a2;
    public final d0 f13888b2;

    public z(d0 d0Var, o2 o2Var, Context context, int i10, boolean z10, c6 c6Var, fk0 fk0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i10, z10, c6Var, 16);
        this.f13888b2 = d0Var;
        this.Z1 = fk0Var;
        this.a2 = o2Var2;
    }

    @Override
    public final void m() {
        this.f13888b2.f13681a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        d1 d1Var = this.f13888b2.f13683c;
        fk0 fk0Var = this.Z1;
        o2 o2Var = this.a2;
        if (o2Var != null && !fk0Var.f28467w0 && fk0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            try {
                d1Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new tc(d1Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new jh.o(this, 20)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                p5.h(UserConfig.selectedAccount).e(document);
            }
            if (l10 == null) {
                longValue = document.f22398id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f13826g = longValue;
            obj.h = longValue;
            fk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(d1Var);
        }
    }

    @Override
    public final void q() {
        d0 d0Var = this.f13888b2;
        if (!d0Var.v) {
            d0Var.v = true;
            if (!d0Var.d) {
                d0Var.f13682b.updateViewLayout(d0Var.f13683c, d0Var.b(true));
            }
            o2 o2Var = this.a2;
            if (o2Var instanceof tn) {
                ((tn) o2Var).P9();
            }
            fk0 fk0Var = this.Z1;
            if (fk0Var.getDelegate() != null) {
                fk0Var.getDelegate().w();
            }
        }
    }

    @Override
    public final void r(m51 m51Var, q0 q0Var) {
        this.Z1.l(m51Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.f13888b2.f13683c);
    }

    @Override
    public final boolean u() {
        fk0 fk0Var = this.Z1;
        if (fk0Var.getDelegate() != null) {
            return fk0Var.getDelegate().w();
        }
        return false;
    }
}
