package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.x31;
public final class bd extends m61 {
    public final Context f3528a;
    public final int f3529b;
    public final boolean f3530c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f3531e;
    public final long f3532f;
    public rj0 f3533g;
    public oi.q h;
    public final ArrayList f3534i = new ArrayList();

    public bd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f3528a = context;
        this.f3529b = i7;
        this.f3530c = z9;
        this.d = i10;
        this.f3531e = f6Var;
        this.f3532f = j3;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        rj0 rj0Var = this.f3533g;
        if (rj0Var != null) {
            rj0Var.L(view);
        }
    }

    @Override
    public final View d(int i7) {
        ad adVar = new ad(this.f3528a, this.f3530c, this.f3532f, i7, this.f3529b, this.d, this.f3531e);
        if (this.f3533g != null) {
            adVar.setClipChildren(false);
            adVar.setClipToPadding(false);
            q41 q41Var = adVar.f3468a;
            q41Var.setClipToPadding(false);
            q41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            q41Var.f37160f3.f35510r = false;
            q41Var.setCaptureSectionsDecoratorAllowed(true);
            q41Var.setOverScrollMode(0);
            oi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(q41Var);
            }
        }
        return adVar;
    }

    @Override
    public final int e() {
        return this.f3534i.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return org.telegram.messenger.hd.M0(2131744919, null);
            }
            return org.telegram.messenger.hd.M0(2131744920, null);
        }
        return org.telegram.messenger.hd.M0(2131744921, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f3534i;
            if (i7 < arrayList.size()) {
                return ((x31) arrayList.get(i7)).f40172z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f3534i;
        arrayList.clear();
        long j3 = this.f3532f;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f3529b;
        if (i7 == 0) {
            ea y10 = ea.y(i10, this.f3530c);
            arrayList.add(x31.D(0));
            if (y10.N(1)) {
                arrayList.add(x31.D(1));
            }
            if (y10.N(2)) {
                arrayList.add(x31.D(2));
                return;
            }
            return;
        }
        n0 g10 = n0.g(i10);
        arrayList.add(x31.D(0));
        if (!g10.k(j3).f4301a[1].isEmpty()) {
            arrayList.add(x31.D(1));
        }
        if (!g10.k(j3).f4301a[2].isEmpty()) {
            arrayList.add(x31.D(2));
        }
    }
}
