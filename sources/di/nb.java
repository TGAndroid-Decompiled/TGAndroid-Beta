package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y61;
public final class nb extends y61 {
    public final Context f9391a;
    public final int f9392b;
    public final boolean f9393c;
    public final int d;
    public final org.telegram.ui.ActionBar.i6 f9394e;
    public final long f9395f;
    public ek0 f9396g;
    public ri.q h;
    public final ArrayList f9397i = new ArrayList();

    public nb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f9391a = context;
        this.f9392b = i7;
        this.f9393c = z10;
        this.d = i10;
        this.f9394e = i6Var;
        this.f9395f = j3;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        ek0 ek0Var = this.f9396g;
        if (ek0Var != null) {
            ek0Var.H(view);
        }
    }

    @Override
    public final View d(int i7) {
        mb mbVar = new mb(this.f9391a, this.f9393c, this.f9395f, i7, this.f9392b, this.d, this.f9394e);
        if (this.f9396g != null) {
            mbVar.setClipChildren(false);
            mbVar.setClipToPadding(false);
            e51 e51Var = mbVar.f9337a;
            e51Var.setClipToPadding(false);
            e51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            e51Var.f34607g3.f42809r = false;
            e51Var.setCaptureSectionsDecoratorAllowed(true);
            e51Var.setOverScrollMode(0);
            ri.q qVar = this.h;
            if (qVar != null) {
                qVar.b(e51Var);
            }
        }
        return mbVar;
    }

    @Override
    public final int e() {
        return this.f9397i.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return gd.M0(2131744683, null);
            }
            return gd.M0(2131744684, null);
        }
        return gd.M0(2131744685, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f9397i;
            if (i7 < arrayList.size()) {
                return ((l41) arrayList.get(i7)).A;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f9397i;
        arrayList.clear();
        long j3 = this.f9395f;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9392b;
        if (i7 == 0) {
            x8 y10 = x8.y(i10, this.f9393c);
            arrayList.add(l41.D(0));
            if (y10.M(1)) {
                arrayList.add(l41.D(1));
            }
            if (y10.M(2)) {
                arrayList.add(l41.D(2));
                return;
            }
            return;
        }
        e0 g10 = e0.g(i10);
        arrayList.add(l41.D(0));
        if (!g10.k(j3).f8640a[1].isEmpty()) {
            arrayList.add(l41.D(1));
        }
        if (!g10.k(j3).f8640a[2].isEmpty()) {
            arrayList.add(l41.D(2));
        }
    }
}
