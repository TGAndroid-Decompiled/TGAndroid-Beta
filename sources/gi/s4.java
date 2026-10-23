package gi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ow0;
import w7.z5;
public final class s4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f11474a;
    public org.telegram.ui.ActionBar.h2 f11475b;
    public j71 f11476c;

    public s4(long j10) {
        super(null);
        this.f11474a = j10;
    }

    public final void U(ArrayList arrayList, b71 b71Var) {
        ai.i0 e = ai.k0.g(this.currentAccount).e(this.f11474a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = q3.f11424a;
            m61 J = m61.J(q3.class);
            J.G = obj;
            J.f28565r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(m61.n(29));
            arrayList.add(m61.n(29));
            arrayList.add(m61.n(29));
        }
    }

    public final void V(m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            u3.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f11474a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f11475b = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.f11475b.f20938k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 4));
        r6.i(k6.f21183d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 1, i10, null);
        r6.b(this.actionBar, i10, null, true);
        r6.m(this.actionBar, 3, k6.f21590z8, null);
        r6.m(this.actionBar, 5, i10, null);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        ow0 ow0Var = new ow0(context, null);
        j71 j71Var = new j71(this, new ai.q(this, 29), new e1.c(this, 12), null);
        this.f11476c = j71Var;
        ow0Var.addView(j71Var, z5.e(-1, -1, 119));
        this.fragmentView = ow0Var;
        return ow0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f11474a && (j71Var = this.f11476c) != null && (j71Var.getAdapter() instanceof b71)) {
            ((b71) this.f11476c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = k6.x0(null, k6.f21183d6, false);
            if (this.actionBar.s()) {
                x02 = k6.x0(null, k6.f21537w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
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
