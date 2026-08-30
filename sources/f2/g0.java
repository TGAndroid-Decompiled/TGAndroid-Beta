package f2;

import android.view.View;
import java.util.List;
public final class g0 {
    public boolean f5702a;
    public int f5703b;
    public int f5704c;
    public int d;
    public int e;
    public int f5705f;
    public int f5706g;
    public int h;
    public int f5707i;
    public int f5708j;
    public List f5709k;
    public boolean f5710l;

    public final void a(View view) {
        int b10;
        int size = this.f5709k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((l1) this.f5709k.get(i11)).f5785a;
            w0 w0Var = (w0) view3.getLayoutParams();
            if (view3 != view && !w0Var.f5858a.j() && (b10 = (w0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
            this.d = ((w0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(i1 i1Var) {
        int i10 = this.d;
        if (i10 >= 0 && i10 < i1Var.b()) {
            return true;
        }
        return false;
    }

    public final View c(bf.f fVar) {
        List list = this.f5709k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((l1) this.f5709k.get(i10)).f5785a;
                w0 w0Var = (w0) view.getLayoutParams();
                if (!w0Var.f5858a.j() && this.d == w0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = fVar.j(this.d, Long.MAX_VALUE).f5785a;
        this.d += this.e;
        return view2;
    }
}
