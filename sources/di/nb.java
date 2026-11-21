package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class nb extends b71 {
    public final Context f9416a;
    public final int f9417b;
    public final boolean f9418c;
    public final int d;
    public final org.telegram.ui.ActionBar.h6 f9419e;
    public final long f9420f;
    public gk0 f9421g;
    public ri.q h;
    public final ArrayList f9422i = new ArrayList();

    public nb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f9416a = context;
        this.f9417b = i7;
        this.f9418c = z10;
        this.d = i10;
        this.f9419e = h6Var;
        this.f9420f = j3;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        gk0 gk0Var = this.f9421g;
        if (gk0Var != null) {
            gk0Var.H(view);
        }
    }

    @Override
    public final View d(int i7) {
        mb mbVar = new mb(this.f9416a, this.f9418c, this.f9420f, i7, this.f9417b, this.d, this.f9419e);
        if (this.f9421g != null) {
            mbVar.setClipChildren(false);
            mbVar.setClipToPadding(false);
            h51 h51Var = mbVar.f9358a;
            h51Var.setClipToPadding(false);
            h51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            h51Var.f35796g3.f34068r = false;
            h51Var.setCaptureSectionsDecoratorAllowed(true);
            h51Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(h51Var);
            }
        }
        return mbVar;
    }

    @Override
    public final int e() {
        return this.f9422i.size();
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
            ArrayList arrayList = this.f9422i;
            if (i7 < arrayList.size()) {
                return ((o41) arrayList.get(i7)).A;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f9422i;
        arrayList.clear();
        long j3 = this.f9420f;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9417b;
        if (i7 == 0) {
            y8 y10 = y8.y(i10, this.f9418c);
            arrayList.add(o41.D(0));
            if (y10.M(1)) {
                arrayList.add(o41.D(1));
            }
            if (y10.M(2)) {
                arrayList.add(o41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i10);
        arrayList.add(o41.D(0));
        if (!g10.k(j3).f8664a[1].isEmpty()) {
            arrayList.add(o41.D(1));
        }
        if (!g10.k(j3).f8664a[2].isEmpty()) {
            arrayList.add(o41.D(2));
        }
    }
}
