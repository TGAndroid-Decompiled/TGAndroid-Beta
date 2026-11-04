package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vj0;
public final class ub extends f61 {
    public final Context f6120a;
    public final int f6121b;
    public final boolean f6122c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f6123e;
    public final long f6124f;
    public vj0 f6125g;
    public pi.q h;
    public final ArrayList f6126i = new ArrayList();

    public ub(Context context, int i3, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f6120a = context;
        this.f6121b = i3;
        this.f6122c = z10;
        this.d = i10;
        this.f6123e = e6Var;
        this.f6124f = j10;
        i();
    }

    @Override
    public final void b(View view, int i3, int i10) {
        vj0 vj0Var = this.f6125g;
        if (vj0Var != null) {
            vj0Var.L(view);
        }
    }

    @Override
    public final View d(int i3) {
        tb tbVar = new tb(this.f6120a, this.f6122c, this.f6124f, i3, this.f6121b, this.d, this.f6123e);
        if (this.f6125g != null) {
            tbVar.setClipChildren(false);
            tbVar.setClipToPadding(false);
            l41 l41Var = tbVar.f6049a;
            l41Var.setClipToPadding(false);
            l41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
            l41Var.f35594g3.f33698r = false;
            l41Var.setCaptureSectionsDecoratorAllowed(true);
            l41Var.setOverScrollMode(0);
            pi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(l41Var);
            }
        }
        return tbVar;
    }

    @Override
    public final int e() {
        return this.f6126i.size();
    }

    @Override
    public final CharSequence g(int i3) {
        int h = h(i3);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return bd.M0(2131744928, null);
            }
            return bd.M0(2131744929, null);
        }
        return bd.M0(2131744930, null);
    }

    @Override
    public final int h(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f6126i;
            if (i3 < arrayList.size()) {
                return ((r31) arrayList.get(i3)).f37640z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f6126i;
        arrayList.clear();
        long j10 = this.f6124f;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.f6121b;
        if (i3 == 0) {
            e9 y9 = e9.y(i10, this.f6122c);
            arrayList.add(r31.D(0));
            if (y9.N(1)) {
                arrayList.add(r31.D(1));
            }
            if (y9.N(2)) {
                arrayList.add(r31.D(2));
                return;
            }
            return;
        }
        i0 g7 = i0.g(i10);
        arrayList.add(r31.D(0));
        if (!g7.k(j10).f5203a[1].isEmpty()) {
            arrayList.add(r31.D(1));
        }
        if (!g7.k(j10).f5203a[2].isEmpty()) {
            arrayList.add(r31.D(2));
        }
    }
}
