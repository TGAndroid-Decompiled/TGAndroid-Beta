package defpackage;

import android.view.View;
import java.util.List;
public final class v46 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((f89) this.k.get(i2)).a;
            r79 r79Var = (r79) view3.getLayoutParams();
            if (view3 != view && !r79Var.a.j() && (b = (r79Var.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                }
                i = b;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((r79) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(c89 c89Var) {
        int i = this.d;
        if (i >= 0 && i < c89Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(oh2 oh2Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((f89) this.k.get(i)).a;
                r79 r79Var = (r79) view.getLayoutParams();
                if (!r79Var.a.j() && this.d == r79Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = oh2Var.k(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }
}
