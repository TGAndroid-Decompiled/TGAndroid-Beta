package f2;

import android.view.View;
import java.util.List;
public final class g0 {
    public boolean f5691a;
    public int f5692b;
    public int f5693c;
    public int d;
    public int e;
    public int f5694f;
    public int f5695g;
    public int h;
    public int f5696i;
    public int f5697j;
    public List f5698k;
    public boolean f5699l;

    public final void a(View view) {
        int b10;
        int size = this.f5698k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((l1) this.f5698k.get(i11)).f5774a;
            w0 w0Var = (w0) view3.getLayoutParams();
            if (view3 != view && !w0Var.f5847a.j() && (b10 = (w0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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

    public final View c(af.h hVar) {
        List list = this.f5698k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((l1) this.f5698k.get(i10)).f5774a;
                w0 w0Var = (w0) view.getLayoutParams();
                if (!w0Var.f5847a.j() && this.d == w0Var.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = hVar.j(this.d, Long.MAX_VALUE).f5774a;
        this.d += this.e;
        return view2;
    }
}
