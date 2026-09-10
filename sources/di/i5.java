package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import w7.a6;
public final class i5 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f6684a;
    public org.telegram.ui.ActionBar.i2 f6685b;
    public r61 f6686c;

    public i5(long j3) {
        super(null);
        this.f6684a = j3;
    }

    public final void U(ArrayList arrayList, j61 j61Var) {
        xh.n e = xh.p.g(this.currentAccount).e(this.f6684a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = d4.f6591a;
            v51 J = v51.J(d4.class);
            J.G = obj;
            J.f27835r = false;
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
            h4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f6684a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f6685b = i2Var;
        lVar.setBackButtonDrawable(i2Var);
        this.f6685b.f17826k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new w(this, 2));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = j6.G6;
        lVar2.C(j6.w0(null, i10, false), false);
        this.actionBar.C(j6.w0(null, i10, false), true);
        this.actionBar.A(j6.w0(null, j6.f18327z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        aw0 aw0Var = new aw0(context, null);
        r61 r61Var = new r61(this, new ai.c0(this, 18), new a1.c(this, 20), null);
        this.f6686c = r61Var;
        aw0Var.addView(r61Var, a6.e(-1, -1, 119));
        this.fragmentView = aw0Var;
        return aw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r61 r61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f6684a && (r61Var = this.f6686c) != null && (r61Var.getAdapter() instanceof j61)) {
            ((j61) this.f6686c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f17928d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f18273w8, false);
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
