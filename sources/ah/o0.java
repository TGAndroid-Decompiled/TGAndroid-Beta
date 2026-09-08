package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.j71;
import org.telegram.ui.s61;
public final class o0 extends j71 {
    public final fk0 f661d2;
    public final n2 f662e2;
    public final u0 f663f2;

    public o0(u0 u0Var, n2 n2Var, Context context, int i10, boolean z10, f6 f6Var, fk0 fk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, f6Var, 16);
        this.f663f2 = u0Var;
        this.f661d2 = fk0Var;
        this.f662e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f663f2.f697a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        w wVar = this.f663f2.f699c;
        fk0 fk0Var = this.f661d2;
        n2 n2Var = this.f662e2;
        if (n2Var != null && !fk0Var.A0 && fk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                wVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new yc(wVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 4)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                q5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f19902id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f610g = longValue;
            obj.h = longValue;
            fk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(wVar);
        }
    }

    @Override
    public final void q() {
        u0 u0Var = this.f663f2;
        if (!u0Var.v) {
            u0Var.v = true;
            if (!u0Var.d) {
                u0Var.f698b.updateViewLayout(u0Var.f699c, u0Var.b(true));
            }
            n2 n2Var = this.f662e2;
            if (n2Var instanceof co) {
                ((co) n2Var).P9();
            }
            fk0 fk0Var = this.f661d2;
            if (fk0Var.getDelegate() != null) {
                fk0Var.getDelegate().t();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, j1 j1Var) {
        this.f661d2.l(s61Var, j1Var, false);
        AndroidUtilities.hideKeyboard(this.f663f2.f699c);
    }

    @Override
    public final boolean u() {
        fk0 fk0Var = this.f661d2;
        if (fk0Var.getDelegate() != null) {
            return fk0Var.getDelegate().t();
        }
        return false;
    }
}
