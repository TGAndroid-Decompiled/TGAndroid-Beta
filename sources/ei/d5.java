package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yw0;
import w7.w5;
public final class d5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9014a;
    public org.telegram.ui.ActionBar.f2 f9015b;
    public p71 f9016c;

    public d5(long j3) {
        super(null);
        this.f9014a = j3;
    }

    public final void U(ArrayList arrayList, h71 h71Var) {
        yh.m e7 = yh.o.g(this.currentAccount).e(this.f9014a);
        ArrayList arrayList2 = e7.f53068e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8939a;
            u61 J = u61.J(a4.class);
            J.G = obj;
            J.f31082r = false;
            arrayList.add(J);
        }
        if (e7.h) {
            arrayList.add(u61.n(29));
            arrayList.add(u61.n(29));
            arrayList.add(u61.n(29));
        }
    }

    public final void V(u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f9014a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f9015b = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f9015b.f20388k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(h6.x0(null, h6.f20559d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.E(h6.x0(null, i10, false), false);
        this.actionBar.E(h6.x0(null, i10, false), true);
        this.actionBar.D(h6.x0(null, h6.f20965z8, false), false);
        this.actionBar.setTitleColor(h6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        yw0 yw0Var = new yw0(context, null);
        p71 p71Var = new p71(this, new bi.v(this, 18), new c5(this, 0), null);
        this.f9016c = p71Var;
        yw0Var.addView(p71Var, w5.e(-1, -1, 119));
        this.fragmentView = yw0Var;
        return yw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p71 p71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f9014a && (p71Var = this.f9016c) != null && (p71Var.getAdapter() instanceof h71)) {
            ((h71) this.f9016c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.f20559d6, false);
            if (this.actionBar.u()) {
                x02 = h6.x0(null, h6.f20912w8, false);
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
