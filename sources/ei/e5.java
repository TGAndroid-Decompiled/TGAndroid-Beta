package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.w51;
import w7.x5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8315a;
    public org.telegram.ui.ActionBar.g2 f8316b;
    public e61 f8317c;

    public e5(long j3) {
        super(null);
        this.f8315a = j3;
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8315a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8231a;
            i51 J = i51.J(a4.class);
            J.G = obj;
            J.f24900r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
        }
    }

    public final void V(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f8315a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f8316b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f8316b.f18684k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(i6.w0(null, i6.f18836d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = i6.G6;
        kVar2.B(i6.w0(null, i10, false), false);
        this.actionBar.B(i6.w0(null, i10, false), true);
        this.actionBar.A(i6.w0(null, i6.f19239z8, false), false);
        this.actionBar.setTitleColor(i6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        pv0 pv0Var = new pv0(context, null);
        e61 e61Var = new e61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8317c = e61Var;
        pv0Var.addView(e61Var, x5.e(-1, -1, 119));
        this.fragmentView = pv0Var;
        return pv0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e61 e61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8315a && (e61Var = this.f8317c) != null && (e61Var.getAdapter() instanceof w51)) {
            ((w51) this.f8317c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.f18836d6, false);
            if (this.actionBar.s()) {
                w02 = i6.w0(null, i6.f19186w8, false);
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
