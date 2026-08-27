package nh;

import android.content.Context;
import android.view.View;
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zu0;

public final class p4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public final long f18882a;

    public org.telegram.ui.ActionBar.g2 f18883b;

    public k51 f18884c;

    public p4(long j10) {
        super(null);
        this.f18882a = j10;
    }

    public final void U(ArrayList arrayList, b51 b51Var) {
        hh.a0 a0VarE = hh.c0.g(this.currentAccount).e(this.f18882a);
        ArrayList arrayList2 = a0VarE.f8937e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = o3.f18861a;
            n41 n41VarJ = n41.J(o3.class);
            n41VarJ.G = obj;
            n41VarJ.f30850r = false;
            arrayList.add(n41VarJ);
        }
        if (a0VarE.h) {
            arrayList.add(n41.n(29));
            arrayList.add(n41.n(29));
            arrayList.add(n41.n(29));
        }
    }

    public final void V(n41 n41Var) {
        Object obj = n41Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            s3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f18882a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f18883b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f18883b.f22973k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 6));
        this.actionBar.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = g6.G6;
        kVar2.D(g6.w0(null, i10, false), false);
        this.actionBar.D(g6.w0(null, i10, false), true);
        this.actionBar.C(g6.w0(null, g6.f23443z8, false), false);
        this.actionBar.setTitleColor(g6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        zu0 zu0Var = new zu0(context, null);
        k51 k51Var = new k51(this, new a8(this, 11), new lh.p(this, 9), null);
        this.f18884c = k51Var;
        zu0Var.addView(k51Var, z5.e(-1, -1, 119));
        this.fragmentView = zu0Var;
        return zu0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f18882a && (k51Var = this.f18884c) != null && (k51Var.getAdapter() instanceof b51)) {
            ((b51) this.f18884c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int iW0 = g6.w0(null, g6.f23053d6, false);
            if (this.actionBar.t()) {
                iW0 = g6.w0(null, g6.f23393w8, false);
            }
            if (i0.b.f(iW0) > 0.699999988079071d) {
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
