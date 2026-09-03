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
import org.telegram.ui.f61;
import org.telegram.ui.x61;
import org.telegram.ui.zn;
public final class z extends x61 {
    public final pk0 a2;
    public final p2 f14155b2;
    public final d0 f14156c2;

    public z(d0 d0Var, p2 p2Var, Context context, int i10, boolean z4, f6 f6Var, pk0 pk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z4, f6Var, 16);
        this.f14156c2 = d0Var;
        this.a2 = pk0Var;
        this.f14155b2 = p2Var2;
    }

    @Override
    public final void m() {
        this.f14156c2.f13960a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ah.e eVar = this.f14156c2.f13962c;
        pk0 pk0Var = this.a2;
        p2 p2Var = this.f14155b2;
        if (p2Var != null && !pk0Var.f27918x0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                eVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new qc(eVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new lh.b(this, 20)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                l5.h(UserConfig.selectedAccount).e(document);
            }
            if (l10 == null) {
                longValue = document.f19165id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f14096g = longValue;
            obj.h = longValue;
            pk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(eVar);
        }
    }

    @Override
    public final void q() {
        d0 d0Var = this.f14156c2;
        if (!d0Var.v) {
            d0Var.v = true;
            if (!d0Var.d) {
                d0Var.f13961b.updateViewLayout(d0Var.f13962c, d0Var.b(true));
            }
            p2 p2Var = this.f14155b2;
            if (p2Var instanceof zn) {
                ((zn) p2Var).P9();
            }
            pk0 pk0Var = this.a2;
            if (pk0Var.getDelegate() != null) {
                pk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(f61 f61Var, q0 q0Var) {
        this.a2.l(f61Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.f14156c2.f13962c);
    }

    @Override
    public final boolean u() {
        pk0 pk0Var = this.a2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().k();
        }
        return false;
    }
}
