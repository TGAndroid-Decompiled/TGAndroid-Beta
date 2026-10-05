package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.w61;
import w7.z5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9018a;
    public org.telegram.ui.ActionBar.g2 f9019b;
    public e71 f9020c;

    public e5(long j3) {
        super(null);
        this.f9018a = j3;
    }

    public final void S(ArrayList arrayList, w61 w61Var) {
        yh.n e7 = yh.p.g(this.currentAccount).e(this.f9018a);
        ArrayList arrayList2 = e7.f51669e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = b4.f8944a;
            h61 K = h61.K(b4.class);
            K.G = obj;
            K.f27099r = false;
            arrayList.add(K);
        }
        if (e7.h) {
            arrayList.add(h61.p(29));
            arrayList.add(h61.p(29));
            arrayList.add(h61.p(29));
        }
    }

    public final void T(h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            f4.L0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f9018a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f9019b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f9019b.f20658k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new u(this, 2));
        this.actionBar.setBackgroundColor(i6.w0(null, i6.f20827d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = i6.G6;
        kVar2.A(i6.w0(null, i10, false), false);
        this.actionBar.A(i6.w0(null, i10, false), true);
        this.actionBar.z(i6.w0(null, i6.f21235z8, false), false);
        this.actionBar.setTitleColor(i6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        mw0 mw0Var = new mw0(context, null);
        e71 e71Var = new e71(this, new bi.v(this, 18), new f(this, 1), null);
        this.f9020c = e71Var;
        mw0Var.addView(e71Var, z5.e(-1, -1, 119));
        this.fragmentView = mw0Var;
        return mw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f9018a && (e71Var = this.f9020c) != null && (e71Var.getAdapter() instanceof w61)) {
            ((w61) this.f9020c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.f20827d6, false);
            if (this.actionBar.s()) {
                w02 = i6.w0(null, i6.f21182w8, false);
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
