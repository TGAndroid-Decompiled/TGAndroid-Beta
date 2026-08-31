package f2;

import android.view.View;
import java.util.List;
public final class h0 {
    public boolean f5782a;
    public int f5783b;
    public int f5784c;
    public int d;
    public int f5785e;
    public int f5786f;
    public int f5787g;
    public int h;
    public int f5788i;
    public int f5789j;
    public List f5790k;
    public boolean f5791l;

    public final void a(View view) {
        int b10;
        int size = this.f5790k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((m1) this.f5790k.get(i11)).f5875a;
            x0 x0Var = (x0) view3.getLayoutParams();
            if (view3 != view && !x0Var.f5952a.j() && (b10 = (x0Var.b() - this.d) * this.f5785e) >= 0 && b10 < i10) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i10 = b10;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((x0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(j1 j1Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < j1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(bf.f fVar) {
        List list = this.f5790k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((m1) this.f5790k.get(i10)).f5875a;
                x0 x0Var = (x0) view.getLayoutParams();
                if (!x0Var.f5952a.j() && this.d == x0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = fVar.j(this.d, Long.MAX_VALUE).f5875a;
        this.d += this.f5785e;
        return view2;
    }
}
