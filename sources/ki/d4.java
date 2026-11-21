package ki;

import android.content.Context;
import android.view.View;
import c8.ma;
import hi.d7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class d4 extends org.telegram.ui.ActionBar.g2 implements fs {
    public final long f18653a;
    public org.telegram.ui.ActionBar.x1 f18654b;
    public h51 f18655c;

    public d4(long j3) {
        super(null);
        this.f18653a = j3;
    }

    public final void Z(ArrayList arrayList, c51 c51Var) {
        di.c0 e10 = di.e0.g(this.currentAccount).e(this.f18653a);
        ArrayList arrayList2 = e10.f8608e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = d3.f18652b;
            o41 K = o41.K(d3.class);
            K.H = obj;
            K.f38104s = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
        }
    }

    public final void a0(o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TL_payments.starRefProgram) {
            h3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f18653a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.f18654b = x1Var;
        kVar.setBackButtonDrawable(x1Var);
        this.f18654b.f30252k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bi.v1(this, 16));
        t6.h(m6.f29378d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i7 = m6.G6;
        t6.l(kVar2, 1, i7, null);
        t6.b(this.actionBar, i7, null, true);
        t6.l(this.actionBar, 3, m6.f29791z8, null);
        t6.l(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(gd.N0(2131752459, null));
        du0 du0Var = new du0(context, null);
        h51 h51Var = new h51(this, new d7(this, 22), new kg.x1(this, 4), null);
        this.f18655c = h51Var;
        du0Var.addView(h51Var, ma.e(-1, -1, 119));
        this.fragmentView = du0Var;
        return du0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h51 h51Var;
        if (i7 == ks.N3 && ((Long) objArr[0]).longValue() == this.f18653a && (h51Var = this.f18655c) != null && (h51Var.getAdapter() instanceof c51)) {
            ((c51) this.f18655c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = m6.x0(null, m6.f29378d6, false);
            if (this.actionBar.x()) {
                x02 = m6.x0(null, m6.f29734w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.N3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ks.f(this.currentAccount).n(this, ks.N3);
        super.onFragmentDestroy();
    }
}
