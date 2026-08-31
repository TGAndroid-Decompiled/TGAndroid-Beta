package f2;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class p0 {
    public final q0 f5908a = new Observable();
    public boolean f5909b = false;

    public void B(r0 r0Var) {
        this.f5908a.registerObserver(r0Var);
    }

    public final void C(boolean z4) {
        if (!this.f5908a.a()) {
            this.f5909b = z4;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final m1 g(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f15180a;
            Trace.beginSection("RV CreateView");
            m1 x10 = x(viewGroup, i10);
            if (x10.f5875a.getParent() == null) {
                x10.f5879f = i10;
                Trace.endSection();
                return x10;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f15180a;
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
        this.f5908a.b();
    }

    public void m(int i10) {
        this.f5908a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.f5908a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.f5908a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.f5908a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.f5908a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.f5908a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.f5908a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.f5908a.f(i10, i11);
    }

    public void u(int i10) {
        this.f5908a.f(i10, 1);
    }

    public abstract void v(m1 m1Var, int i10);

    public void w(m1 m1Var, int i10, List list) {
        v(m1Var, i10);
    }

    public abstract m1 x(ViewGroup viewGroup, int i10);

    public void A(m1 m1Var) {
    }

    public void y(m1 m1Var) {
    }

    public void z(m1 m1Var) {
    }
}
