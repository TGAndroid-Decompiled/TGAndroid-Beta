package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.wj0;
public final class kb extends n61 {
    public final Context f8933a;
    public final int f8934b;
    public final boolean f8935c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f8936e;
    public final long f8937f;
    public wj0 f8938g;
    public ri.q h;
    public final ArrayList f8939i = new ArrayList();

    public kb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8933a = context;
        this.f8934b = i7;
        this.f8935c = z10;
        this.d = i10;
        this.f8936e = e6Var;
        this.f8937f = j3;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        wj0 wj0Var = this.f8938g;
        if (wj0Var != null) {
            wj0Var.J(view);
        }
    }

    @Override
    public final View d(int i7) {
        jb jbVar = new jb(this.f8933a, this.f8935c, this.f8937f, i7, this.f8934b, this.d, this.f8936e);
        if (this.f8938g != null) {
            jbVar.setClipChildren(false);
            jbVar.setClipToPadding(false);
            u41 u41Var = jbVar.f8869a;
            u41Var.setClipToPadding(false);
            u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            u41Var.f39895g3.f38201r = false;
            u41Var.setCaptureSectionsDecoratorAllowed(true);
            u41Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(u41Var);
            }
        }
        return jbVar;
    }

    @Override
    public final int e() {
        return this.f8939i.size();
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
            ArrayList arrayList = this.f8939i;
            if (i7 < arrayList.size()) {
                return ((b41) arrayList.get(i7)).f33194z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f8939i;
        arrayList.clear();
        long j3 = this.f8937f;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f8934b;
        if (i7 == 0) {
            v8 y10 = v8.y(i10, this.f8935c);
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
        if (!g10.k(j3).f8388a[1].isEmpty()) {
            arrayList.add(b41.D(1));
        }
        if (!g10.k(j3).f8388a[2].isEmpty()) {
            arrayList.add(b41.D(2));
        }
    }
}
