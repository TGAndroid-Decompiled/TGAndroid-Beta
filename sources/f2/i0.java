package f2;

import android.view.View;
import java.util.List;

public final class i0 {

    public boolean f5691a;

    public int f5692b;

    public int f5693c;
    public int d;

    public int f5694e;

    public int f5695f;

    public int f5696g;
    public int h;

    public int f5697i;

    public int f5698j;

    public List f5699k;

    public boolean f5700l;

    public final void a(View view) {
        int iB;
        int size = this.f5699k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((o1) this.f5699k.get(i11)).f5789a;
            y0 y0Var = (y0) view3.getLayoutParams();
            if (view3 != view && !y0Var.f5864a.j() && (iB = (y0Var.b() - this.d) * this.f5694e) >= 0 && iB < i10) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i10 = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((y0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(l1 l1Var) {
        int i10 = this.d;
        return i10 >= 0 && i10 < l1Var.b();
    }

    public final View c(e1 e1Var) {
        List list = this.f5699k;
        if (list == null) {
            View view = e1Var.j(this.d, Long.MAX_VALUE).f5789a;
            this.d += this.f5694e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((o1) this.f5699k.get(i10)).f5789a;
            y0 y0Var = (y0) view2.getLayoutParams();
            if (!y0Var.f5864a.j() && this.d == y0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
