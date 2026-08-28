package hg;

import android.content.Context;
import android.view.View;
import fh.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.b61;
import org.telegram.ui.k51;
import org.telegram.ui.qn;
public final class z extends b61 {
    public final uj0 Z1;
    public final o2 a2;
    public final e0 f10779b2;

    public z(e0 e0Var, o2 o2Var, Context context, int i9, boolean z10, b6 b6Var, uj0 uj0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i9, z10, b6Var, 16);
        this.f10779b2 = e0Var;
        this.Z1 = uj0Var;
        this.a2 = o2Var2;
    }

    @Override
    public final void m() {
        this.f10779b2.f10574a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        fh.v vVar = this.f10779b2.f10576c;
        uj0 uj0Var = this.Z1;
        o2 o2Var = this.a2;
        if (o2Var != null && !uj0Var.f33078w0 && uj0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new oc(vVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new o1(this, 28)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                k5.h(UserConfig.selectedAccount).e(document);
            }
            if (l10 == null) {
                longValue = document.f22386id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f10718g = longValue;
            obj.h = longValue;
            uj0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(vVar);
        }
    }

    @Override
    public final void q() {
        e0 e0Var = this.f10779b2;
        if (!e0Var.v) {
            e0Var.v = true;
            if (!e0Var.d) {
                e0Var.f10575b.updateViewLayout(e0Var.f10576c, e0Var.b(true));
            }
            o2 o2Var = this.a2;
            if (o2Var instanceof qn) {
                ((qn) o2Var).P9();
            }
            uj0 uj0Var = this.Z1;
            if (uj0Var.getDelegate() != null) {
                uj0Var.getDelegate().p();
            }
        }
    }

    @Override
    public final void r(k51 k51Var, r0 r0Var) {
        this.Z1.l(k51Var, r0Var, false);
        AndroidUtilities.hideKeyboard(this.f10779b2.f10576c);
    }

    @Override
    public final boolean u() {
        uj0 uj0Var = this.Z1;
        if (uj0Var.getDelegate() != null) {
            return uj0Var.getDelegate().p();
        }
        return false;
    }
}
