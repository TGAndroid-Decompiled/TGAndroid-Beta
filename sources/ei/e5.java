package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w51;
import w7.y5;
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f8320a;
    public org.telegram.ui.ActionBar.g2 f8321b;
    public s61 f8322c;

    public e5(long j3) {
        super(null);
        this.f8320a = j3;
    }

    public final void U(ArrayList arrayList, k61 k61Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.f8320a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.f8236a;
            w51 J = w51.J(a4.class);
            J.G = obj;
            J.f29954r = false;
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
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f8320a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f8321b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f8321b.f18901k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.f19094d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        kVar2.B(j6.w0(null, i10, false), false);
        this.actionBar.B(j6.w0(null, i10, false), true);
        this.actionBar.A(j6.w0(null, j6.f19498z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        aw0 aw0Var = new aw0(context, null);
        s61 s61Var = new s61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.f8322c = s61Var;
        aw0Var.addView(s61Var, y5.e(-1, -1, 119));
        this.fragmentView = aw0Var;
        return aw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f8320a && (s61Var = this.f8322c) != null && (s61Var.getAdapter() instanceof k61)) {
            ((k61) this.f8322c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f19094d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f19445w8, false);
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
