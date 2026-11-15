package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.wj0;
public final class jb extends n61 {
    public final Context f8878a;
    public final int f8879b;
    public final boolean f8880c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f8881e;
    public final long f8882f;
    public wj0 f8883g;
    public ri.q h;
    public final ArrayList f8884i = new ArrayList();

    public jb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8878a = context;
        this.f8879b = i7;
        this.f8880c = z10;
        this.d = i10;
        this.f8881e = e6Var;
        this.f8882f = j3;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        wj0 wj0Var = this.f8883g;
        if (wj0Var != null) {
            wj0Var.J(view);
        }
    }

    @Override
    public final View d(int i7) {
        ib ibVar = new ib(this.f8878a, this.f8880c, this.f8882f, i7, this.f8879b, this.d, this.f8881e);
        if (this.f8883g != null) {
            ibVar.setClipChildren(false);
            ibVar.setClipToPadding(false);
            u41 u41Var = ibVar.f8816a;
            u41Var.setClipToPadding(false);
            u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            u41Var.f39892g3.f38199r = false;
            u41Var.setCaptureSectionsDecoratorAllowed(true);
            u41Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(u41Var);
            }
        }
        return ibVar;
    }

    @Override
    public final int e() {
        return this.f8884i.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return hd.M0(2131744918, null);
            }
            return hd.M0(2131744919, null);
        }
        return hd.M0(2131744920, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f8884i;
            if (i7 < arrayList.size()) {
                return ((b41) arrayList.get(i7)).f33197z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f8884i;
        arrayList.clear();
        long j3 = this.f8882f;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f8879b;
        if (i7 == 0) {
            u8 y10 = u8.y(i10, this.f8880c);
            arrayList.add(b41.D(0));
            if (y10.N(1)) {
                arrayList.add(b41.D(1));
            }
            if (y10.N(2)) {
                arrayList.add(b41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i10);
        arrayList.add(b41.D(0));
        if (!g10.k(j3).f8380a[1].isEmpty()) {
            arrayList.add(b41.D(1));
        }
        if (!g10.k(j3).f8380a[2].isEmpty()) {
            arrayList.add(b41.D(2));
        }
    }
}
