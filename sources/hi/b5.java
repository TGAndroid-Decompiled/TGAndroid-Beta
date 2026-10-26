package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vw0;
public final class b5 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f12896a;
    public org.telegram.ui.ActionBar.j2 f12897b;
    public r71 f12898c;

    public b5(long j10) {
        super(null);
        this.f12896a = j10;
    }

    public final void V(ArrayList arrayList, j71 j71Var) {
        bi.k0 e = bi.m0.g(this.currentAccount).e(this.f12896a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z3.f13400a;
            t61 K = t61.K(z3.class);
            K.G = obj;
            K.f32881r = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(t61.p(29));
            arrayList.add(t61.p(29));
            arrayList.add(t61.p(29));
        }
    }

    public final void W(t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d4.F0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f12896a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.f12897b = j2Var;
        kVar.setBackButtonDrawable(j2Var);
        this.f12897b.f22738k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 4));
        f7.i(y6.f23356d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = y6.G6;
        f7.m(kVar2, 1, i10, null);
        f7.b(this.actionBar, i10, null, true);
        f7.m(this.actionBar, 3, y6.f23769z8, null);
        f7.m(this.actionBar, 5, i10, null);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        vw0 vw0Var = new vw0(context, null);
        r71 r71Var = new r71(this, new e2(this, 2), new e1.c(this, 17), null);
        this.f12898c = r71Var;
        vw0Var.addView(r71Var, gb1.i(-1, -1, 119));
        this.fragmentView = vw0Var;
        return vw0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r71 r71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f12896a && (r71Var = this.f12898c) != null && (r71Var.getAdapter() instanceof j71)) {
            ((j71) this.f12898c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = y6.x0(null, y6.f23356d6, false);
            if (this.actionBar.q()) {
                x02 = y6.x0(null, y6.f23713w8, false);
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
