package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.n41;
public final class nb extends c71 {
    public final Context f9380a;
    public final int f9381b;
    public final boolean f9382c;
    public final int d;
    public final org.telegram.ui.ActionBar.i6 f9383e;
    public final long f9384f;
    public gk0 f9385g;
    public ri.q h;
    public final ArrayList f9386i = new ArrayList();

    public nb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f9380a = context;
        this.f9381b = i7;
        this.f9382c = z10;
        this.d = i10;
        this.f9383e = i6Var;
        this.f9384f = j3;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        gk0 gk0Var = this.f9385g;
        if (gk0Var != null) {
            gk0Var.J(view);
        }
    }

    @Override
    public final View d(int i7) {
        mb mbVar = new mb(this.f9380a, this.f9382c, this.f9384f, i7, this.f9381b, this.d, this.f9383e);
        if (this.f9385g != null) {
            mbVar.setClipChildren(false);
            mbVar.setClipToPadding(false);
            g51 g51Var = mbVar.f9322a;
            g51Var.setClipToPadding(false);
            g51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            g51Var.f35323g3.f33631r = false;
            g51Var.setCaptureSectionsDecoratorAllowed(true);
            g51Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(g51Var);
            }
        }
        return mbVar;
    }

    @Override
    public final int e() {
        return this.f9386i.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return gd.N0(2131744677, null);
            }
            return gd.N0(2131744678, null);
        }
        return gd.N0(2131744679, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f9386i;
            if (i7 < arrayList.size()) {
                return ((n41) arrayList.get(i7)).A;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f9386i;
        arrayList.clear();
        long j3 = this.f9384f;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9381b;
        if (i7 == 0) {
            y8 y10 = y8.y(i10, this.f9382c);
            arrayList.add(n41.D(0));
            if (y10.M(1)) {
                arrayList.add(n41.D(1));
            }
            if (y10.M(2)) {
                arrayList.add(n41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i10);
        arrayList.add(n41.D(0));
        if (!g10.k(j3).f8628a[1].isEmpty()) {
            arrayList.add(n41.D(1));
        }
        if (!g10.k(j3).f8628a[2].isEmpty()) {
            arrayList.add(n41.D(2));
        }
    }
}
