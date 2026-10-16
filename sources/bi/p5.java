package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class p5 {
    public boolean f3468a;
    public Object f3469b;
    public Object f3470c = k2.b.f13845f;
    public Object d;
    public Object e;
    public Object f3471f;
    public Object f3472g;

    public p5(Context context) {
        this.f3469b = context;
    }

    public k2.s0 a() {
        boolean z10;
        k2.b bVar;
        Context context = (Context) this.f3469b;
        boolean z11 = true;
        v7.u6.p(!this.f3468a);
        this.f3468a = true;
        if (((androidx.biometric.e) this.d) == null) {
            this.d = new androidx.biometric.e(new c2.n[0]);
        }
        if (((k2.j0) this.f3471f) == null) {
            if (((k2.m0) this.f3472g) == null) {
                this.f3472g = new k2.m0(context);
            }
            if (((k2.t0) this.e) == null) {
                this.e = k2.t0.f14023a;
            }
            k2.i0 i0Var = new k2.i0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (k2.b) this.f3470c;
            }
            Context context2 = i0Var.f13909a;
            if (context2 == null) {
                i0Var.d = bVar;
            }
            k2.m0 m0Var = (k2.m0) this.f3472g;
            i0Var.f13910b = m0Var;
            i0Var.f13911c = (k2.t0) this.e;
            if (m0Var == null) {
                i0Var.f13910b = new k2.m0(context2);
            }
            this.f3471f = new k2.j0(i0Var);
        } else {
            if (((k2.m0) this.f3472g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            v7.u6.p(z10);
            if (((k2.t0) this.e) != null) {
                z11 = false;
            }
            v7.u6.p(z11);
        }
        return new k2.s0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f3472g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
