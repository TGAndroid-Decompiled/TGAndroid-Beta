package f2;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;
public abstract class p0 {
    public final q0 f6459a = new Observable();
    public boolean f6460b = false;

    public void B(r0 r0Var) {
        this.f6459a.registerObserver(r0Var);
    }

    public final void C(boolean z10) {
        if (!this.f6459a.a()) {
            this.f6460b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final n1 g(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.f17081a;
            Trace.beginSection("RV CreateView");
            n1 x4 = x(viewGroup, i10);
            if (x4.f6432a.getParent() == null) {
                x4.f6436f = i10;
                Trace.endSection();
                return x4;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = n0.g.f17081a;
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
        this.f6459a.b();
    }

    public void m(int i10) {
        this.f6459a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.f6459a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.f6459a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.f6459a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.f6459a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.f6459a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.f6459a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.f6459a.f(i10, i11);
    }

    public void u(int i10) {
        this.f6459a.f(i10, 1);
    }

    public abstract void v(n1 n1Var, int i10);

    public void w(n1 n1Var, int i10, List list) {
        v(n1Var, i10);
    }

    public abstract n1 x(ViewGroup viewGroup, int i10);

    public void A(n1 n1Var) {
    }

    public void y(n1 n1Var) {
    }

    public void z(n1 n1Var) {
    }
}
