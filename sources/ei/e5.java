package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.v51;
import w7.x5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8303a;
    public org.telegram.ui.ActionBar.g2 f8304b;
    public d61 f8305c;

    public e5(long j3) {
        super(null);
        this.f8303a = j3;
    }

    public final void U(ArrayList arrayList, v51 v51Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8303a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8219a;
            h51 J = h51.J(a4.class);
            J.G = obj;
            J.f24513r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(h51.n(29));
            arrayList.add(h51.n(29));
            arrayList.add(h51.n(29));
        }
    }

    public final void V(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f8303a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f8304b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f8304b.f18672k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(h6.w0(null, h6.f18789d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.B(h6.w0(null, i10, false), false);
        this.actionBar.B(h6.w0(null, i10, false), true);
        this.actionBar.A(h6.w0(null, h6.f19191z8, false), false);
        this.actionBar.setTitleColor(h6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        pv0 pv0Var = new pv0(context, null);
        d61 d61Var = new d61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8305c = d61Var;
        pv0Var.addView(d61Var, x5.e(-1, -1, 119));
        this.fragmentView = pv0Var;
        return pv0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d61 d61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8303a && (d61Var = this.f8305c) != null && (d61Var.getAdapter() instanceof v51)) {
            ((v51) this.f8305c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = h6.w0(null, h6.f18789d6, false);
            if (this.actionBar.s()) {
                w02 = h6.w0(null, h6.f19138w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
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
