package di;

import a8.yb;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class p4 {
    public boolean f8900a;
    public Object f8901b;
    public Object f8902c;
    public Object d;
    public Object e;
    public Object f8903f;
    public Object f8904g;

    public p4(Context context, int i10) {
        switch (i10) {
            case 2:
                this.d = ui.h.f49926a;
                this.f8900a = true;
                this.f8904g = ui.o.H;
                this.f8901b = context;
                return;
            default:
                this.f8901b = context;
                this.f8902c = k2.b.f16118f;
                return;
        }
    }

    public k2.u0 a() {
        boolean z10;
        k2.b bVar;
        Context context = (Context) this.f8901b;
        boolean z11 = true;
        yb.p(!this.f8900a);
        this.f8900a = true;
        if (((a8.h0) this.d) == null) {
            this.d = new a8.h0(new c2.o[0]);
        }
        if (((k2.l0) this.f8903f) == null) {
            if (((k2.o0) this.f8904g) == null) {
                this.f8904g = new k2.o0(context);
            }
            if (((k2.v0) this.e) == null) {
                this.e = k2.v0.f16307a;
            }
            k2.k0 k0Var = new k2.k0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (k2.b) this.f8902c;
            }
            Context context2 = k0Var.f16198a;
            if (context2 == null) {
                k0Var.d = bVar;
            }
            k2.o0 o0Var = (k2.o0) this.f8904g;
            k0Var.f16199b = o0Var;
            k0Var.f16200c = (k2.v0) this.e;
            if (o0Var == null) {
                k0Var.f16199b = new k2.o0(context2);
            }
            this.f8903f = new k2.l0(k0Var);
        } else {
            if (((k2.o0) this.f8904g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            if (((k2.v0) this.e) != null) {
                z11 = false;
            }
            yb.p(z11);
        }
        return new k2.u0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f8904g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
