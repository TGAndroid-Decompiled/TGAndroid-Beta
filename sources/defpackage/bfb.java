package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class bfb extends e implements fn7 {
    public final long a;
    public gd0 b;
    public q9c c;

    public bfb(long j) {
        super(null);
        this.a = j;
    }

    public final void Y(ArrayList arrayList, l9c l9cVar) {
        it0 e = kt0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i = 0; i < arrayList2.size(); i++) {
            Object obj = arrayList2.get(i);
            int i2 = jg1.b;
            b8c K = b8c.K(jg1.class);
            K.H = obj;
            K.s = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
        }
    }

    public final void Z(b8c b8cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof TL_payments.starRefProgram) {
            ng1.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        a aVar = this.actionBar;
        gd0 gd0Var = new gd0(false);
        this.b = gd0Var;
        aVar.setBackButtonDrawable(gd0Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 19));
        yob.h(aob.d6, null, this.actionBar);
        a aVar2 = this.actionBar;
        int i = aob.G6;
        yob.l(aVar2, 1, i, null);
        yob.b(this.actionBar, i, null, true);
        yob.l(this.actionBar, 3, aob.z8, null);
        yob.l(this.actionBar, 5, i, null);
        this.actionBar.setTitle(ob6.M0(2131752446, null));
        wma wmaVar = new wma(context, null);
        q9c q9cVar = new q9c(this, new l8b(this, (byte) 2), new hja(this, (byte) 23), null);
        this.c = q9cVar;
        wmaVar.addView(q9cVar, tre.e(-1, -1, 119));
        this.fragmentView = wmaVar;
        return wmaVar;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q9c q9cVar;
        if (i == jn7.N3 && ((Long) objArr[0]).longValue() == this.a && (q9cVar = this.c) != null && (q9cVar.getAdapter() instanceof l9c)) {
            ((l9c) this.c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w0 = aob.w0(null, aob.d6, false);
            if (this.actionBar.z()) {
                w0 = aob.w0(null, aob.w8, false);
            }
            if (vm2.h(w0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.N3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        jn7.f(this.currentAccount).n(this, jn7.N3);
        super.onFragmentDestroy();
    }
}
