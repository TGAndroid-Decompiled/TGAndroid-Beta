package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.a71;
import org.telegram.ui.fo;
import org.telegram.ui.r71;
public final class n0 extends r71 {
    public final gl0 f833d2;
    public final m2 f834e2;
    public final t0 f835f2;

    public n0(t0 t0Var, m2 m2Var, Context context, int i10, boolean z10, c6 c6Var, gl0 gl0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, c6Var, 16);
        this.f835f2 = t0Var;
        this.f833d2 = gl0Var;
        this.f834e2 = m2Var2;
    }

    @Override
    public final void m() {
        this.f835f2.f868a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        v vVar = this.f835f2.f870c;
        gl0 gl0Var = this.f833d2;
        m2 m2Var = this.f834e2;
        if (m2Var != null && !gl0Var.A0 && gl0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new zc(vVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 5)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                s5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f18922id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f784g = longValue;
            obj.h = longValue;
            gl0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(vVar);
        }
    }

    @Override
    public final void q() {
        t0 t0Var = this.f835f2;
        if (!t0Var.v) {
            t0Var.v = true;
            if (!t0Var.d) {
                t0Var.f869b.updateViewLayout(t0Var.f870c, t0Var.b(true));
            }
            m2 m2Var = this.f834e2;
            if (m2Var instanceof fo) {
                ((fo) m2Var).U9();
            }
            gl0 gl0Var = this.f833d2;
            if (gl0Var.getDelegate() != null) {
                gl0Var.getDelegate().m();
            }
        }
    }

    @Override
    public final void r(a71 a71Var, i1 i1Var) {
        this.f833d2.l(a71Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.f835f2.f870c);
    }

    @Override
    public final boolean u() {
        gl0 gl0Var = this.f833d2;
        if (gl0Var.getDelegate() != null) {
            return gl0Var.getDelegate().m();
        }
        return false;
    }
}
