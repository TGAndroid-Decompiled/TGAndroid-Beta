package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.u61;
import w7.z5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9017a;
    public org.telegram.ui.ActionBar.g2 f9018b;
    public c71 f9019c;

    public e5(long j3) {
        super(null);
        this.f9017a = j3;
    }

    public final void S(ArrayList arrayList, u61 u61Var) {
        yh.m e7 = yh.o.g(this.currentAccount).e(this.f9017a);
        ArrayList arrayList2 = e7.f51598e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = b4.f8943a;
            g61 J = g61.J(b4.class);
            J.G = obj;
            J.f26675r = false;
            arrayList.add(J);
        }
        if (e7.h) {
            arrayList.add(g61.o(29));
            arrayList.add(g61.o(29));
            arrayList.add(g61.o(29));
        }
    }

    public final void T(g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            f4.L0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f9017a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f9018b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f9018b.f20649k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new u(this, 2));
        this.actionBar.setBackgroundColor(i6.w0(null, i6.f20818d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = i6.G6;
        kVar2.B(i6.w0(null, i10, false), false);
        this.actionBar.B(i6.w0(null, i10, false), true);
        this.actionBar.A(i6.w0(null, i6.f21226z8, false), false);
        this.actionBar.setTitleColor(i6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        lw0 lw0Var = new lw0(context, null);
        c71 c71Var = new c71(this, new bi.v(this, 18), new f(this, 1), null);
        this.f9019c = c71Var;
        lw0Var.addView(c71Var, z5.e(-1, -1, 119));
        this.fragmentView = lw0Var;
        return lw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f9017a && (c71Var = this.f9019c) != null && (c71Var.getAdapter() instanceof u61)) {
            ((u61) this.f9019c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.f20818d6, false);
            if (this.actionBar.s()) {
                w02 = i6.w0(null, i6.f21173w8, false);
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
