package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class p4 {
    public boolean f5728a;
    public Object f5729b;
    public Object f5730c = k2.b.f14647f;
    public Object d;
    public Object e;
    public Object f5731f;
    public Object f5732g;

    public p4(Context context) {
        this.f5729b = context;
    }

    public k2.t0 a() {
        boolean z10;
        k2.b bVar;
        Context context = (Context) this.f5729b;
        boolean z11 = true;
        v7.u6.p(!this.f5728a);
        this.f5728a = true;
        if (((androidx.biometric.e) this.d) == null) {
            this.d = new androidx.biometric.e(new c2.n[0]);
        }
        if (((k2.k0) this.f5731f) == null) {
            if (((k2.n0) this.f5732g) == null) {
                this.f5732g = new k2.n0(context);
            }
            if (((k2.u0) this.e) == null) {
                this.e = k2.u0.f14826a;
            }
            k2.j0 j0Var = new k2.j0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (k2.b) this.f5730c;
            }
            Context context2 = j0Var.f14717a;
            if (context2 == null) {
                j0Var.d = bVar;
            }
            k2.n0 n0Var = (k2.n0) this.f5732g;
            j0Var.f14718b = n0Var;
            j0Var.f14719c = (k2.u0) this.e;
            if (n0Var == null) {
                j0Var.f14718b = new k2.n0(context2);
            }
            this.f5731f = new k2.k0(j0Var);
        } else {
            if (((k2.n0) this.f5732g) == null) {
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
        ArrayList arrayList = (ArrayList) this.f5732g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
