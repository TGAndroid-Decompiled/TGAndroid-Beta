package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.v51;
import w7.x5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9640a;
    public org.telegram.ui.ActionBar.g2 f9641b;
    public d61 f9642c;

    public e5(long j3) {
        super(null);
        this.f9640a = j3;
    }

    public final void U(ArrayList arrayList, v51 v51Var) {
        zh.m e7 = zh.o.g(this.currentAccount).e(this.f9640a);
        ArrayList arrayList2 = e7.f52243e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f9549a;
            h51 J = h51.J(a4.class);
            J.G = obj;
            J.f26600r = false;
            arrayList.add(J);
        }
        if (e7.h) {
            arrayList.add(h51.n(29));
            arrayList.add(h51.n(29));
            arrayList.add(h51.n(29));
        }
    }

    public final void V(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f9640a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f9641b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f9641b.f20462k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 3));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.f20663d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        kVar2.C(j6.w0(null, i10, false), false);
        this.actionBar.C(j6.w0(null, i10, false), true);
        this.actionBar.B(j6.w0(null, j6.f21063z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        ov0 ov0Var = new ov0(context, null);
        d61 d61Var = new d61(this, new ci.u(this, 18), new f(this, 2), null);
        this.f9642c = d61Var;
        ov0Var.addView(d61Var, x5.e(-1, -1, 119));
        this.fragmentView = ov0Var;
        return ov0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d61 d61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f9640a && (d61Var = this.f9642c) != null && (d61Var.getAdapter() instanceof v51)) {
            ((v51) this.f9642c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f20663d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f21010w8, false);
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
