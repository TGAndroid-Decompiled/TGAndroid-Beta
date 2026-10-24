package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.a61;
import org.telegram.ui.j51;
import org.telegram.ui.sn;
public final class n0 extends a61 {
    public final fl0 f834e2;
    public final o2 f835f2;
    public final t0 f836g2;

    public n0(t0 t0Var, o2 o2Var, Context context, int i10, boolean z10, g6 g6Var, fl0 fl0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i10, z10, g6Var, 16);
        this.f836g2 = t0Var;
        this.f834e2 = fl0Var;
        this.f835f2 = o2Var2;
    }

    @Override
    public final void m() {
        this.f836g2.f869a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        v vVar = this.f836g2.f871c;
        fl0 fl0Var = this.f834e2;
        o2 o2Var = this.f835f2;
        if (o2Var != null && !fl0Var.A0 && fl0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new vc(vVar, null).r(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 5)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                p5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f20350id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f785g = longValue;
            obj.h = longValue;
            fl0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(vVar);
        }
    }

    @Override
    public final void q() {
        t0 t0Var = this.f836g2;
        if (!t0Var.v) {
            t0Var.v = true;
            if (!t0Var.d) {
                t0Var.f870b.updateViewLayout(t0Var.f871c, t0Var.b(true));
            }
            o2 o2Var = this.f835f2;
            if (o2Var instanceof sn) {
                ((sn) o2Var).U9();
            }
            fl0 fl0Var = this.f834e2;
            if (fl0Var.getDelegate() != null) {
                fl0Var.getDelegate().l();
            }
        }
    }

    @Override
    public final void r(j51 j51Var, i1 i1Var) {
        this.f834e2.l(j51Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.f836g2.f871c);
    }

    @Override
    public final boolean u() {
        fl0 fl0Var = this.f834e2;
        if (fl0Var.getDelegate() != null) {
            return fl0Var.getDelegate().l();
        }
        return false;
    }
}
