package f2;

import android.view.View;
import java.util.List;
public final class h0 {
    public boolean f6333a;
    public int f6334b;
    public int f6335c;
    public int d;
    public int f6336e;
    public int f6337f;
    public int f6338g;
    public int h;
    public int f6339i;
    public int f6340j;
    public List f6341k;
    public boolean f6342l;

    public final void a(View view) {
        int b10;
        int size = this.f6341k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((n1) this.f6341k.get(i11)).f6432a;
            x0 x0Var = (x0) view3.getLayoutParams();
            if (view3 != view && !x0Var.f6508a.j() && (b10 = (x0Var.b() - this.d) * this.f6336e) >= 0 && b10 < i10) {
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

    public final boolean b(k1 k1Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < k1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(d1 d1Var) {
        List list = this.f6341k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((n1) this.f6341k.get(i10)).f6432a;
                x0 x0Var = (x0) view.getLayoutParams();
                if (!x0Var.f6508a.j() && this.d == x0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = d1Var.j(this.d, Long.MAX_VALUE).f6432a;
        this.d += this.f6336e;
        return view2;
    }
}
