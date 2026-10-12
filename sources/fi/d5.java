package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.z61;
import w7.a6;
public final class d5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9233a;
    public org.telegram.ui.ActionBar.f2 f9234b;
    public h71 f9235c;

    public d5(long j10) {
        super(null);
        this.f9233a = j10;
    }

    public final void U(ArrayList arrayList, z61 z61Var) {
        zh.n e = zh.p.g(this.currentAccount).e(this.f9233a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = b4.f9188a;
            l61 J = l61.J(b4.class);
            J.G = obj;
            J.f26960r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(l61.n(29));
            arrayList.add(l61.n(29));
            arrayList.add(l61.n(29));
        }
    }

    public final void V(l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            f4.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f9233a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f9234b = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f9234b.f19781k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 3));
        this.actionBar.setBackgroundColor(g6.x0(null, g6.f19901d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = g6.G6;
        kVar2.D(g6.x0(null, i10, false), false);
        this.actionBar.D(g6.x0(null, i10, false), true);
        this.actionBar.B(g6.x0(null, g6.f20307z8, false), false);
        this.actionBar.setTitleColor(g6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        ow0 ow0Var = new ow0(context, null);
        h71 h71Var = new h71(this, new ci.u(this, 18), new f1.a(this, 3), null);
        this.f9235c = h71Var;
        ow0Var.addView(h71Var, a6.e(-1, -1, 119));
        this.fragmentView = ow0Var;
        return ow0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f9233a && (h71Var = this.f9235c) != null && (h71Var.getAdapter() instanceof z61)) {
            ((z61) this.f9235c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = g6.x0(null, g6.f19901d6, false);
            if (this.actionBar.t()) {
                x02 = g6.x0(null, g6.f20254w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
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
