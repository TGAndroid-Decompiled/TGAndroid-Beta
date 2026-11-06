package hi;

import android.content.Context;
import android.view.View;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rt0;
public final class p4 extends org.telegram.ui.ActionBar.f2 implements ls {
    public final long f14868a;
    public org.telegram.ui.ActionBar.y1 f14869b;
    public k41 f14870c;

    public p4(long j3) {
        super(null);
        this.f14868a = j3;
    }

    public final void Z(ArrayList arrayList, f41 f41Var) {
        bi.l0 e10 = bi.n0.g(this.currentAccount).e(this.f14868a);
        ArrayList arrayList2 = e10.f4247e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = m3.f14795b;
            r31 K = r31.K(m3.class);
            K.G = obj;
            K.f37604r = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
        }
    }

    public final void a0(r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            q3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f14868a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f14869b = y1Var;
        kVar.setBackButtonDrawable(y1Var);
        this.f14869b.f28771k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 4));
        r6.i(k6.f27848d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i7 = k6.G6;
        r6.m(kVar2, 1, i7, null);
        r6.b(this.actionBar, i7, null, true);
        r6.m(this.actionBar, 3, k6.f28260z8, null);
        r6.m(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(hd.M0(2131752471, null));
        rt0 rt0Var = new rt0(context, null);
        k41 k41Var = new k41(this, new u1(this, 2), new di.q4(this, 22), null);
        this.f14870c = k41Var;
        rt0Var.addView(k41Var, ha.e(-1, -1, 119));
        this.fragmentView = rt0Var;
        return rt0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        k41 k41Var;
        if (i7 == qs.K3 && ((Long) objArr[0]).longValue() == this.f14868a && (k41Var = this.f14870c) != null && (k41Var.getAdapter() instanceof f41)) {
            ((f41) this.f14870c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = k6.x0(null, k6.f27848d6, false);
            if (this.actionBar.v()) {
                x02 = k6.x0(null, k6.f28204w8, false);
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
