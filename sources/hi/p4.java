package hi;

import android.content.Context;
import android.view.View;
import c8.ha;
import di.r4;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.y31;
public final class p4 extends org.telegram.ui.ActionBar.f2 implements ls {
    public final long f14871a;
    public org.telegram.ui.ActionBar.y1 f14872b;
    public r41 f14873c;

    public p4(long j3) {
        super(null);
        this.f14871a = j3;
    }

    public final void Z(ArrayList arrayList, m41 m41Var) {
        bi.l0 e10 = bi.n0.g(this.currentAccount).e(this.f14871a);
        ArrayList arrayList2 = e10.f4247e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = m3.f14798b;
            y31 K = y31.K(m3.class);
            K.G = obj;
            K.f40574r = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(y31.p(29));
            arrayList.add(y31.p(29));
            arrayList.add(y31.p(29));
        }
    }

    public final void a0(y31 y31Var) {
        Object obj = y31Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            q3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f14871a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f14872b = y1Var;
        kVar.setBackButtonDrawable(y1Var);
        this.f14872b.f28775k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 4));
        s6.h(l6.f27865d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i7 = l6.G6;
        s6.l(kVar2, 1, i7, null);
        s6.b(this.actionBar, i7, null, true);
        s6.l(this.actionBar, 3, l6.f28277z8, null);
        s6.l(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(id.M0(2131752471, null));
        tt0 tt0Var = new tt0(context, null);
        r41 r41Var = new r41(this, new u1(this, 2), new r4(this, 22), null);
        this.f14873c = r41Var;
        tt0Var.addView(r41Var, ha.e(-1, -1, 119));
        this.fragmentView = tt0Var;
        return tt0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        r41 r41Var;
        if (i7 == qs.K3 && ((Long) objArr[0]).longValue() == this.f14871a && (r41Var = this.f14873c) != null && (r41Var.getAdapter() instanceof m41)) {
            ((m41) this.f14873c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = l6.x0(null, l6.f27865d6, false);
            if (this.actionBar.w()) {
                x02 = l6.x0(null, l6.f28221w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.K3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        qs.f(this.currentAccount).n(this, qs.K3);
        super.onFragmentDestroy();
    }
}
