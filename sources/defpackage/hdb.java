package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class hdb extends d implements jm7 {
    public final long a;
    public ee0 b;
    public q7c c;

    public hdb(long j) {
        super(null);
        this.a = j;
    }

    public final void Z(ArrayList arrayList, l7c l7cVar) {
        iu0 e = ku0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i = 0; i < arrayList2.size(); i++) {
            Object obj = arrayList2.get(i);
            int i2 = ih1.b;
            c6c K = c6c.K(ih1.class);
            K.H = obj;
            K.s = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
        }
    }

    public final void a0(c6c c6cVar) {
        Object obj = c6cVar.H;
        if (obj instanceof TL_payments.starRefProgram) {
            mh1.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        a aVar = this.actionBar;
        ee0 ee0Var = new ee0(false);
        this.b = ee0Var;
        aVar.setBackButtonDrawable(ee0Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 18));
        anb.h(cmb.c6, null, this.actionBar);
        a aVar2 = this.actionBar;
        int i = cmb.F6;
        anb.l(aVar2, 1, i, null);
        anb.b(this.actionBar, i, null, true);
        anb.l(this.actionBar, 3, cmb.y8, null);
        anb.l(this.actionBar, 5, i, null);
        this.actionBar.setTitle(jb6.M0(2131752418, null));
        ela elaVar = new ela(context, null);
        q7c q7cVar = new q7c(this, new o6b(this, (byte) 2), new wta(this, (byte) 14), null);
        this.c = q7cVar;
        elaVar.addView(q7cVar, qoe.e(-1, -1, 119));
        this.fragmentView = elaVar;
        return elaVar;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q7c q7cVar;
        if (i == nm7.N3 && ((Long) objArr[0]).longValue() == this.a && (q7cVar = this.c) != null && (q7cVar.getAdapter() instanceof l7c)) {
            ((l7c) this.c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w0 = cmb.w0(null, cmb.c6, false);
            if (this.actionBar.y()) {
                w0 = cmb.w0(null, cmb.v8, false);
            }
            if (on2.h(w0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.N3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        nm7.f(this.currentAccount).n(this, nm7.N3);
        super.onFragmentDestroy();
    }
}
