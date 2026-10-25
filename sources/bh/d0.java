package bh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.c61;
import org.telegram.ui.l51;
import org.telegram.ui.un;
public final class d0 extends c61 {
    public final fl0 f4010e2;
    public final r2 f4011f2;
    public final i0 f4012g2;

    public d0(i0 i0Var, r2 r2Var, Context context, int i10, boolean z10, u6 u6Var, fl0 fl0Var, r2 r2Var2) {
        super(r2Var, context, false, null, i10, z10, u6Var, 16);
        this.f4012g2 = i0Var;
        this.f4010e2 = fl0Var;
        this.f4011f2 = r2Var2;
    }

    @Override
    public final void m() {
        this.f4012g2.f4047a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        p pVar = this.f4012g2.f4049c;
        fl0 fl0Var = this.f4010e2;
        r2 r2Var = this.f4011f2;
        if (r2Var != null && !fl0Var.A0 && fl0Var.getWindowType() != 13 && !UserConfig.getInstance(r2Var.getCurrentAccount()).isPremium()) {
            try {
                pVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new wc(pVar, null).r(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 15)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                t5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f22033id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f4209g = longValue;
            obj.h = longValue;
            fl0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(pVar);
        }
    }

    @Override
    public final void q() {
        i0 i0Var = this.f4012g2;
        if (!i0Var.v) {
            i0Var.v = true;
            if (!i0Var.d) {
                i0Var.f4048b.updateViewLayout(i0Var.f4049c, i0Var.b(true));
            }
            r2 r2Var = this.f4011f2;
            if (r2Var instanceof un) {
                ((un) r2Var).Z9();
            }
            fl0 fl0Var = this.f4010e2;
            if (fl0Var.getDelegate() != null) {
                fl0Var.getDelegate().i();
            }
        }
    }

    @Override
    public final void r(l51 l51Var, x0 x0Var) {
        this.f4010e2.l(l51Var, x0Var, false);
        AndroidUtilities.hideKeyboard(this.f4012g2.f4049c);
    }

    @Override
    public final boolean u() {
        fl0 fl0Var = this.f4010e2;
        if (fl0Var.getDelegate() != null) {
            return fl0Var.getDelegate().i();
        }
        return false;
    }
}
