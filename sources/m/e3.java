package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import ci.j6;
public final class e3 implements j9.t {
    public boolean f16194a;
    public boolean f16195b;
    public Object f16196c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        boolean z12;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f16194a == z11 && this.f16195b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f16194a = z11;
        this.f16195b = z10;
        rect2.set(rect);
        return z12;
    }

    @Override
    public void onSuccess(Object obj) {
        m4.w wVar = (m4.w) obj;
        m4.f0 f0Var = ((m4.p0) this.d).f16661g;
        Handler handler = f0Var.f16526l;
        m4.v vVar = (m4.v) this.f16196c;
        e2.m0.W(handler, new hi.t(f0Var, vVar, new j6(this, wVar, this.f16194a, this.f16195b, vVar, 2)));
    }

    @Override
    public void i(Throwable th2) {
    }
}
