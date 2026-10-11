package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.uw0;
import w7.x5;
public final class d5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9016a;
    public org.telegram.ui.ActionBar.f2 f9017b;
    public m71 f9018c;

    public d5(long j3) {
        super(null);
        this.f9016a = j3;
    }

    public final void U(ArrayList arrayList, e71 e71Var) {
        yh.m e7 = yh.o.g(this.currentAccount).e(this.f9016a);
        ArrayList arrayList2 = e7.f52931e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8941a;
            r61 J = r61.J(a4.class);
            J.G = obj;
            J.f30367r = false;
            arrayList.add(J);
        }
        if (e7.h) {
            arrayList.add(r61.n(29));
            arrayList.add(r61.n(29));
            arrayList.add(r61.n(29));
        }
    }

    public final void V(r61 r61Var) {
        Object obj = r61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f9016a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f9017b = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f9017b.f20595k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(h6.x0(null, h6.f20786d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.D(h6.x0(null, i10, false), false);
        this.actionBar.D(h6.x0(null, i10, false), true);
        this.actionBar.C(h6.x0(null, h6.f21191z8, false), false);
        this.actionBar.setTitleColor(h6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        uw0 uw0Var = new uw0(context, null);
        m71 m71Var = new m71(this, new bi.v(this, 18), new c5(this, 0), null);
        this.f9018c = m71Var;
        uw0Var.addView(m71Var, x5.e(-1, -1, 119));
        this.fragmentView = uw0Var;
        return uw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m71 m71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f9016a && (m71Var = this.f9018c) != null && (m71Var.getAdapter() instanceof e71)) {
            ((e71) this.f9018c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.f20786d6, false);
            if (this.actionBar.t()) {
                x02 = h6.x0(null, h6.f21138w8, false);
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
