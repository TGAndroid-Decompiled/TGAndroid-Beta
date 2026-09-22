package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import w7.y5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8319a;
    public org.telegram.ui.ActionBar.g2 f8320b;
    public u61 f8321c;

    public e5(long j3) {
        super(null);
        this.f8319a = j3;
    }

    public final void U(ArrayList arrayList, m61 m61Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8319a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8235a;
            y51 J = y51.J(a4.class);
            J.G = obj;
            J.f30524r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(y51.n(29));
            arrayList.add(y51.n(29));
            arrayList.add(y51.n(29));
        }
    }

    public final void V(y51 y51Var) {
        Object obj = y51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f8319a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f8320b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f8320b.f18916k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.f19109d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        kVar2.B(j6.w0(null, i10, false), false);
        this.actionBar.B(j6.w0(null, i10, false), true);
        this.actionBar.A(j6.w0(null, j6.f19513z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        cw0 cw0Var = new cw0(context, null);
        u61 u61Var = new u61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8321c = u61Var;
        cw0Var.addView(u61Var, y5.e(-1, -1, 119));
        this.fragmentView = cw0Var;
        return cw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8319a && (u61Var = this.f8321c) != null && (u61Var.getAdapter() instanceof m61)) {
            ((m61) this.f8321c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f19109d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f19460w8, false);
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
