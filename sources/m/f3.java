package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import bi.n7;
public final class f3 implements j9.t {
    public boolean f14843a;
    public boolean f14844b;
    public Object f14845c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        boolean z12;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f14843a == z11 && this.f14844b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f14843a = z11;
        this.f14844b = z10;
        rect2.set(rect);
        return z12;
    }

    @Override
    public void onSuccess(Object obj) {
        m4.w wVar = (m4.w) obj;
        m4.e0 e0Var = ((m4.p0) this.d).f15303g;
        Handler handler = e0Var.f15162l;
        m4.v vVar = (m4.v) this.f14845c;
        e2.m0.W(handler, new ji.v2(e0Var, vVar, new n7(this, wVar, this.f14843a, this.f14844b, vVar, 2)));
    }

    @Override
    public void i(Throwable th2) {
    }
}
