package gi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.t61;
import w7.z5;
public final class s4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f11450a;
    public org.telegram.ui.ActionBar.g2 f11451b;
    public b71 f11452c;

    public s4(long j10) {
        super(null);
        this.f11450a = j10;
    }

    public final void U(ArrayList arrayList, t61 t61Var) {
        ai.i0 e = ai.k0.g(this.currentAccount).e(this.f11450a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = q3.f11400a;
            g61 J = g61.J(q3.class);
            J.G = obj;
            J.f26505r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(g61.n(29));
            arrayList.add(g61.n(29));
            arrayList.add(g61.n(29));
        }
    }

    public final void V(g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            u3.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f11450a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f11451b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f11451b.f20867k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 4));
        this.actionBar.setBackgroundColor(h6.x0(null, h6.f20989d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.C(h6.x0(null, i10, false), false);
        this.actionBar.C(h6.x0(null, i10, false), true);
        this.actionBar.B(h6.x0(null, h6.f21396z8, false), false);
        this.actionBar.setTitleColor(h6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        kw0 kw0Var = new kw0(context, null);
        b71 b71Var = new b71(this, new ai.q(this, 29), new e1.c(this, 12), null);
        this.f11452c = b71Var;
        kw0Var.addView(b71Var, z5.e(-1, -1, 119));
        this.fragmentView = kw0Var;
        return kw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f11450a && (b71Var = this.f11452c) != null && (b71Var.getAdapter() instanceof t61)) {
            ((t61) this.f11452c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.f20989d6, false);
            if (this.actionBar.t()) {
                x02 = h6.x0(null, h6.f21343w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
