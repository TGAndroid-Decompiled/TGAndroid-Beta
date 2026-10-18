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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.i51;
import org.telegram.ui.sn;
import org.telegram.ui.z51;
public final class n0 extends z51 {
    public final cl0 f835d2;
    public final n2 f836e2;
    public final t0 f837f2;

    public n0(t0 t0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, cl0 cl0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f837f2 = t0Var;
        this.f835d2 = cl0Var;
        this.f836e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f837f2.f870a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        v vVar = this.f837f2.f872c;
        cl0 cl0Var = this.f835d2;
        n2 n2Var = this.f836e2;
        if (n2Var != null && !cl0Var.A0 && cl0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
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
                longValue = document.f20278id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f786g = longValue;
            obj.h = longValue;
            cl0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(vVar);
        }
    }

    @Override
    public final void q() {
        t0 t0Var = this.f837f2;
        if (!t0Var.v) {
            t0Var.v = true;
            if (!t0Var.d) {
                t0Var.f871b.updateViewLayout(t0Var.f872c, t0Var.b(true));
            }
            n2 n2Var = this.f836e2;
            if (n2Var instanceof sn) {
                ((sn) n2Var).U9();
            }
            cl0 cl0Var = this.f835d2;
            if (cl0Var.getDelegate() != null) {
                cl0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(i51 i51Var, i1 i1Var) {
        this.f835d2.l(i51Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.f837f2.f872c);
    }

    @Override
    public final boolean u() {
        cl0 cl0Var = this.f835d2;
        if (cl0Var.getDelegate() != null) {
            return cl0Var.getDelegate().k();
        }
        return false;
    }
}
