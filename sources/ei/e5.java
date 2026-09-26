package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w51;
import w7.y5;
public final class e5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8302a;
    public org.telegram.ui.ActionBar.f2 f8303b;
    public s61 f8304c;

    public e5(long j3) {
        super(null);
        this.f8302a = j3;
    }

    public final void U(ArrayList arrayList, k61 k61Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8302a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8218a;
            w51 J = w51.J(a4.class);
            J.G = obj;
            J.f29901r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(w51.n(29));
            arrayList.add(w51.n(29));
            arrayList.add(w51.n(29));
        }
    }

    public final void V(w51 w51Var) {
        Object obj = w51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f8302a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f8303b = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f8303b.f18875k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.B(h6.w0(null, i10, false), false);
        this.actionBar.B(h6.w0(null, i10, false), true);
        this.actionBar.A(h6.w0(null, h6.f19463z8, false), false);
        this.actionBar.setTitleColor(h6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        bw0 bw0Var = new bw0(context, null);
        s61 s61Var = new s61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8304c = s61Var;
        bw0Var.addView(s61Var, y5.e(-1, -1, 119));
        this.fragmentView = bw0Var;
        return bw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8302a && (s61Var = this.f8304c) != null && (s61Var.getAdapter() instanceof k61)) {
            ((k61) this.f8304c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = h6.w0(null, h6.f19059d6, false);
            if (this.actionBar.s()) {
                w02 = h6.w0(null, h6.f19410w8, false);
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
