package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class yla extends v46 {
    public final d53 r;
    public int s;
    public float t;

    public yla(Context context) {
        super(context);
        this.r = d53.f;
        this.t = 1.0f;
    }

    @Override
    public final void g(View view, p69 p69Var) {
        int j = j(o(), view);
        int k = k(p(), view);
        int m = m((int) Math.sqrt((k * k) + (j * j)));
        if (m > 0) {
            p69Var.b(-j, -k, m, this.r);
        }
        gm.d3(new bo6(this, (byte) 25), Math.max(0, m));
    }

    @Override
    public final int k(int i, View view) {
        return super.k(i, view) - this.s;
    }

    @Override
    public final int m(int i) {
        return Math.round(Math.min(super.m(i), 500) * this.t);
    }

    @Override
    public final int n(int i) {
        return Math.round(Math.min(super.n(i), 150) * this.t);
    }

    @Override
    public final void q(p69 p69Var) {
        PointF a = a(this.a);
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            q69.b(a);
            this.k = a;
            this.o = (int) (a.x * 10000.0f);
            this.p = (int) (a.y * 10000.0f);
            p69Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
            return;
        }
        p69Var.d = this.a;
        h();
    }
}
