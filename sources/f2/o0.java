package f2;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class o0 {
    public final p0 f5816a = new Observable();
    public boolean f5817b = false;

    public void B(q0 q0Var) {
        this.f5816a.registerObserver(q0Var);
    }

    public final void C(boolean z4) {
        if (!this.f5816a.a()) {
            this.f5817b = z4;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final l1 g(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f14206a;
            Trace.beginSection("RV CreateView");
            l1 x10 = x(viewGroup, i10);
            if (x10.f5785a.getParent() == null) {
                x10.f5788f = i10;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f14206a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int h();

    public long i(int i10) {
        return -1L;
    }

    public int j(int i10) {
        return 0;
    }

    public int k() {
        return h();
    }

    public void l() {
        this.f5816a.b();
    }

    public void m(int i10) {
        this.f5816a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.f5816a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.f5816a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.f5816a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.f5816a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.f5816a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.f5816a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.f5816a.f(i10, i11);
    }

    public void u(int i10) {
        this.f5816a.f(i10, 1);
    }

    public abstract void v(l1 l1Var, int i10);

    public void w(l1 l1Var, int i10, List list) {
        v(l1Var, i10);
    }

    public abstract l1 x(ViewGroup viewGroup, int i10);

    public void A(l1 l1Var) {
    }

    public void y(l1 l1Var) {
    }

    public void z(l1 l1Var) {
    }
}
