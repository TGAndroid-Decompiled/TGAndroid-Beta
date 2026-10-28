package di;

import a8.yb;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class p4 {
    public boolean f8899a;
    public Object f8900b;
    public Object f8901c;
    public Object d;
    public Object e;
    public Object f8902f;
    public Object f8903g;

    public p4(Context context, int i10) {
        switch (i10) {
            case 2:
                this.d = ui.h.f49964a;
                this.f8899a = true;
                this.f8903g = ui.o.H;
                this.f8900b = context;
                return;
            default:
                this.f8900b = context;
                this.f8901c = k2.b.f16117f;
                return;
        }
    }

    public k2.u0 a() {
        boolean z10;
        k2.b bVar;
        Context context = (Context) this.f8900b;
        boolean z11 = true;
        yb.p(!this.f8899a);
        this.f8899a = true;
        if (((a8.h0) this.d) == null) {
            this.d = new a8.h0(new c2.o[0]);
        }
        if (((k2.l0) this.f8902f) == null) {
            if (((k2.o0) this.f8903g) == null) {
                this.f8903g = new k2.o0(context);
            }
            if (((k2.v0) this.e) == null) {
                this.e = k2.v0.f16306a;
            }
            k2.k0 k0Var = new k2.k0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (k2.b) this.f8901c;
            }
            Context context2 = k0Var.f16197a;
            if (context2 == null) {
                k0Var.d = bVar;
            }
            k2.o0 o0Var = (k2.o0) this.f8903g;
            k0Var.f16198b = o0Var;
            k0Var.f16199c = (k2.v0) this.e;
            if (o0Var == null) {
                k0Var.f16198b = new k2.o0(context2);
            }
            this.f8902f = new k2.l0(k0Var);
        } else {
            if (((k2.o0) this.f8903g) == null) {
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
        ArrayList arrayList = (ArrayList) this.f8903g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
