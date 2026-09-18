package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.x51;
import w7.x5;
public final class e5 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8320a;
    public org.telegram.ui.ActionBar.h2 f8321b;
    public f61 f8322c;

    public e5(long j3) {
        super(null);
        this.f8320a = j3;
    }

    public final void U(ArrayList arrayList, x51 x51Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8320a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8236a;
            j51 J = j51.J(a4.class);
            J.G = obj;
            J.f25133r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(j51.n(29));
            arrayList.add(j51.n(29));
            arrayList.add(j51.n(29));
        }
    }

    public final void V(j51 j51Var) {
        Object obj = j51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f8320a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f8321b = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.f8321b.f18713k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.f18863d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        kVar2.B(j6.w0(null, i10, false), false);
        this.actionBar.B(j6.w0(null, i10, false), true);
        this.actionBar.A(j6.w0(null, j6.f19266z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        qv0 qv0Var = new qv0(context, null);
        f61 f61Var = new f61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8322c = f61Var;
        qv0Var.addView(f61Var, x5.e(-1, -1, 119));
        this.fragmentView = qv0Var;
        return qv0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f61 f61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8320a && (f61Var = this.f8322c) != null && (f61Var.getAdapter() instanceof x51)) {
            ((x51) this.f8322c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f18863d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f19213w8, false);
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
