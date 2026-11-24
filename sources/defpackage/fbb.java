package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class fbb extends d implements gk7 {
    public final long a;
    public ed0 b;
    public q5c c;

    public fbb(long j) {
        super(null);
        this.a = j;
    }

    public final void Y(ArrayList arrayList, l5c l5cVar) {
        at0 e = ct0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i = 0; i < arrayList2.size(); i++) {
            Object obj = arrayList2.get(i);
            int i2 = ag1.b;
            c4c K = c4c.K(ag1.class);
            K.H = obj;
            K.s = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(c4c.p(29));
            arrayList.add(c4c.p(29));
            arrayList.add(c4c.p(29));
        }
    }

    public final void Z(c4c c4cVar) {
        Object obj = c4cVar.H;
        if (obj instanceof TL_payments.starRefProgram) {
            eg1.I0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        a aVar = this.actionBar;
        ed0 ed0Var = new ed0(false);
        this.b = ed0Var;
        aVar.setBackButtonDrawable(ed0Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 17));
        zkb.h(bkb.c6, null, this.actionBar);
        a aVar2 = this.actionBar;
        int i = bkb.F6;
        zkb.l(aVar2, 1, i, null);
        zkb.b(this.actionBar, i, null, true);
        zkb.l(this.actionBar, 3, bkb.y8, null);
        zkb.l(this.actionBar, 5, i, null);
        this.actionBar.setTitle(k96.M0(2131752459, null));
        cja cjaVar = new cja(context, null);
        q5c q5cVar = new q5c(this, new n4b(this, (byte) 2), new hza(this, (byte) 10), null);
        this.c = q5cVar;
        cjaVar.addView(q5cVar, nme.e(-1, -1, 119));
        this.fragmentView = cjaVar;
        return cjaVar;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q5c q5cVar;
        if (i == kk7.M3 && ((Long) objArr[0]).longValue() == this.a && (q5cVar = this.c) != null && (q5cVar.getAdapter() instanceof l5c)) {
            ((l5c) this.c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w0 = bkb.w0(null, bkb.c6, false);
            if (this.actionBar.y()) {
                w0 = bkb.w0(null, bkb.v8, false);
            }
            if (bm2.h(w0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.M3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        kk7.f(this.currentAccount).n(this, kk7.M3);
        super.onFragmentDestroy();
    }
}
