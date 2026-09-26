package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import w7.y5;
public final class e5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8302a;
    public org.telegram.ui.ActionBar.f2 f8303b;
    public r61 f8304c;

    public e5(long j3) {
        super(null);
        this.f8302a = j3;
    }

    public final void U(ArrayList arrayList, j61 j61Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8302a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8218a;
            v51 J = v51.J(a4.class);
            J.G = obj;
            J.f29054r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(v51.n(29));
            arrayList.add(v51.n(29));
            arrayList.add(v51.n(29));
        }
    }

    public final void V(v51 v51Var) {
        Object obj = v51Var.G;
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
        aw0 aw0Var = new aw0(context, null);
        r61 r61Var = new r61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8304c = r61Var;
        aw0Var.addView(r61Var, y5.e(-1, -1, 119));
        this.fragmentView = aw0Var;
        return aw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r61 r61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8302a && (r61Var = this.f8304c) != null && (r61Var.getAdapter() instanceof j61)) {
            ((j61) this.f8304c.getAdapter()).N(true);
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
