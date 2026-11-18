package ki;

import android.content.Context;
import android.view.View;
import c8.ma;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class e4 extends org.telegram.ui.ActionBar.h2 implements fs {
    public final long f18646a;
    public org.telegram.ui.ActionBar.y1 f18647b;
    public e51 f18648c;

    public e4(long j3) {
        super(null);
        this.f18646a = j3;
    }

    public final void Z(ArrayList arrayList, z41 z41Var) {
        di.c0 e10 = di.e0.g(this.currentAccount).e(this.f18646a);
        ArrayList arrayList2 = e10.f8586e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = e3.f18645b;
            l41 K = l41.K(e3.class);
            K.H = obj;
            K.f37024s = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
        }
    }

    public final void a0(l41 l41Var) {
        Object obj = l41Var.H;
        if (obj instanceof TL_payments.starRefProgram) {
            i3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f18646a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f18647b = y1Var;
        kVar.setBackButtonDrawable(y1Var);
        this.f18647b.f30271k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bi.r1(this, 16));
        u6.h(n6.f29396d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i7 = n6.G6;
        u6.l(kVar2, 1, i7, null);
        u6.b(this.actionBar, i7, null, true);
        u6.l(this.actionBar, 3, n6.f29809z8, null);
        u6.l(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(gd.M0(2131752460, null));
        au0 au0Var = new au0(context, null);
        e51 e51Var = new e51(this, new e7(this, 22), new e(this, 3), null);
        this.f18648c = e51Var;
        au0Var.addView(e51Var, ma.e(-1, -1, 119));
        this.fragmentView = au0Var;
        return au0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e51 e51Var;
        if (i7 == ks.M3 && ((Long) objArr[0]).longValue() == this.f18646a && (e51Var = this.f18648c) != null && (e51Var.getAdapter() instanceof z41)) {
            ((z41) this.f18648c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = n6.x0(null, n6.f29396d6, false);
            if (this.actionBar.y()) {
                x02 = n6.x0(null, n6.f29752w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.M3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ks.f(this.currentAccount).n(this, ks.M3);
        super.onFragmentDestroy();
    }
}
