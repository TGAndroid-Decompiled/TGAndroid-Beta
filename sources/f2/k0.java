package f2;

import android.view.View;
import java.util.List;
public final class k0 {
    public boolean f5403a;
    public int f5404b;
    public int f5405c;
    public int d;
    public int f5406e;
    public int f5407f;
    public int f5408g;
    public int h;
    public int f5409i;
    public int f5410j;
    public List f5411k;
    public boolean f5412l;

    public final void a(View view) {
        int b10;
        int size = this.f5411k.size();
        View view2 = null;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((q1) this.f5411k.get(i10)).f5501a;
            a1 a1Var = (a1) view3.getLayoutParams();
            if (view3 != view && !a1Var.f5311a.j() && (b10 = (a1Var.b() - this.d) * this.f5406e) >= 0 && b10 < i9) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i9 = b10;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((a1) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(n1 n1Var) {
        int i9 = this.d;
        if (i9 >= 0 && i9 < n1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(g1 g1Var) {
        List list = this.f5411k;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = ((q1) this.f5411k.get(i9)).f5501a;
                a1 a1Var = (a1) view.getLayoutParams();
                if (!a1Var.f5311a.j() && this.d == a1Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = g1Var.j(this.d, Long.MAX_VALUE).f5501a;
        this.d += this.f5406e;
        return view2;
    }
}
