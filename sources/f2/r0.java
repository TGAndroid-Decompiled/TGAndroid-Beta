package f2;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class r0 {
    public final s0 f5523a = new Observable();
    public boolean f5524b = false;

    public void B(t0 t0Var) {
        this.f5523a.registerObserver(t0Var);
    }

    public final void C(boolean z10) {
        if (!this.f5523a.a()) {
            this.f5524b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final q1 g(ViewGroup viewGroup, int i9) {
        try {
            int i10 = n0.g.f18255a;
            Trace.beginSection("RV CreateView");
            q1 x10 = x(viewGroup, i9);
            if (x10.f5501a.getParent() == null) {
                x10.f5505f = i9;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            int i11 = n0.g.f18255a;
            Trace.endSection();
            throw th;
        }
    }

    public abstract int h();

    public long i(int i9) {
        return -1L;
    }

    public int j(int i9) {
        return 0;
    }

    public int k() {
        return h();
    }

    public void l() {
        this.f5523a.b();
    }

    public void m(int i9) {
        this.f5523a.d(i9, 1, null);
    }

    public final void n(int i9, Object obj) {
        this.f5523a.d(i9, 1, obj);
    }

    public void o(int i9) {
        this.f5523a.e(i9, 1);
    }

    public void p(int i9, int i10) {
        this.f5523a.c(i9, i10);
    }

    public void q(int i9, int i10) {
        this.f5523a.d(i9, i10, null);
    }

    public void r(int i9, int i10, Object obj) {
        this.f5523a.d(i9, i10, obj);
    }

    public void s(int i9, int i10) {
        this.f5523a.e(i9, i10);
    }

    public void t(int i9, int i10) {
        this.f5523a.f(i9, i10);
    }

    public void u(int i9) {
        this.f5523a.f(i9, 1);
    }

    public abstract void v(q1 q1Var, int i9);

    public void w(q1 q1Var, int i9, List list) {
        v(q1Var, i9);
    }

    public abstract q1 x(ViewGroup viewGroup, int i9);

    public void A(q1 q1Var) {
    }

    public void y(q1 q1Var) {
    }

    public void z(q1 q1Var) {
    }
}
