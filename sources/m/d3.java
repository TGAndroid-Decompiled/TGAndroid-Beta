package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import bi.n7;
public final class d3 implements j9.t {
    public boolean f15093a;
    public boolean f15094b;
    public Object f15095c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        boolean z12;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f15093a == z11 && this.f15094b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f15093a = z11;
        this.f15094b = z10;
        rect2.set(rect);
        return z12;
    }

    @Override
    public void onSuccess(Object obj) {
        m4.x xVar = (m4.x) obj;
        m4.f0 f0Var = ((m4.q0) this.d).f15573g;
        Handler handler = f0Var.f15432l;
        m4.w wVar = (m4.w) this.f15095c;
        e2.m0.W(handler, new ji.v2(f0Var, wVar, new n7(this, xVar, this.f15093a, this.f15094b, wVar, 2)));
    }

    @Override
    public void i(Throwable th2) {
    }
}
