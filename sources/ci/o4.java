package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class o4 {
    public boolean f5631a;
    public Object f5632b;
    public Object f5633c;
    public Object d;
    public Object e;
    public Object f5634f;
    public Object f5635g;

    public o4(Context context, int i10) {
        switch (i10) {
            case 2:
                this.d = ri.h.f46237a;
                this.f5631a = true;
                this.f5635g = ri.o.H;
                this.f5632b = context;
                return;
            default:
                this.f5632b = context;
                this.f5633c = k2.b.f14685f;
                return;
        }
    }

    public k2.t0 a() {
        boolean z10;
        k2.b bVar;
        Context context = (Context) this.f5632b;
        boolean z11 = true;
        v7.u6.p(!this.f5631a);
        this.f5631a = true;
        if (((androidx.biometric.e) this.d) == null) {
            this.d = new androidx.biometric.e(new c2.n[0]);
        }
        if (((k2.k0) this.f5634f) == null) {
            if (((k2.n0) this.f5635g) == null) {
                this.f5635g = new k2.n0(context);
            }
            if (((k2.u0) this.e) == null) {
                this.e = k2.u0.f14870a;
            }
            k2.j0 j0Var = new k2.j0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (k2.b) this.f5633c;
            }
            Context context2 = j0Var.f14756a;
            if (context2 == null) {
                j0Var.d = bVar;
            }
            k2.n0 n0Var = (k2.n0) this.f5635g;
            j0Var.f14757b = n0Var;
            j0Var.f14758c = (k2.u0) this.e;
            if (n0Var == null) {
                j0Var.f14757b = new k2.n0(context2);
            }
            this.f5634f = new k2.k0(j0Var);
        } else {
            if (((k2.n0) this.f5635g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            v7.u6.p(z10);
            if (((k2.u0) this.e) != null) {
                z11 = false;
            }
            v7.u6.p(z11);
        }
        return new k2.t0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f5635g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
