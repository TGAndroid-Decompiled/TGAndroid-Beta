package gi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.u61;
import w7.z5;
public final class s4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f11448a;
    public org.telegram.ui.ActionBar.g2 f11449b;
    public c71 f11450c;

    public s4(long j10) {
        super(null);
        this.f11448a = j10;
    }

    public final void U(ArrayList arrayList, u61 u61Var) {
        ai.i0 e = ai.k0.g(this.currentAccount).e(this.f11448a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = q3.f11398a;
            h61 J = h61.J(q3.class);
            J.G = obj;
            J.f26791r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(h61.n(29));
            arrayList.add(h61.n(29));
            arrayList.add(h61.n(29));
        }
    }

    public final void V(h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            u3.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f11448a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f11449b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f11449b.f20871k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 4));
        this.actionBar.setBackgroundColor(h6.x0(null, h6.f20993d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.C(h6.x0(null, i10, false), false);
        this.actionBar.C(h6.x0(null, i10, false), true);
        this.actionBar.B(h6.x0(null, h6.f21400z8, false), false);
        this.actionBar.setTitleColor(h6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        lw0 lw0Var = new lw0(context, null);
        c71 c71Var = new c71(this, new ai.q(this, 29), new e1.c(this, 12), null);
        this.f11450c = c71Var;
        lw0Var.addView(c71Var, z5.e(-1, -1, 119));
        this.fragmentView = lw0Var;
        return lw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f11448a && (c71Var = this.f11450c) != null && (c71Var.getAdapter() instanceof u61)) {
            ((u61) this.f11450c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.f20993d6, false);
            if (this.actionBar.t()) {
                x02 = h6.x0(null, h6.f21347w8, false);
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
