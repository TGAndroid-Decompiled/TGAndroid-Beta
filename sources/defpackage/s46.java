package defpackage;

import android.view.View;
import java.util.List;
public final class s46 {
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
            View view3 = ((u69) this.k.get(i2)).a;
            g69 g69Var = (g69) view3.getLayoutParams();
            if (view3 != view && !g69Var.a.j() && (b = (g69Var.b() - this.d) * this.e) >= 0 && b < i) {
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
            this.d = ((g69) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(r69 r69Var) {
        int i = this.d;
        if (i >= 0 && i < r69Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(ki2 ki2Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((u69) this.k.get(i)).a;
                g69 g69Var = (g69) view.getLayoutParams();
                if (!g69Var.a.j() && this.d == g69Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = ki2Var.k(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }
}
