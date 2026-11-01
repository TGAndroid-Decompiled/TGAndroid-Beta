package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import org.telegram.messenger.kj;
import org.telegram.ui.un;
public final class c3 implements j9.t {
    public boolean f12382a;
    public boolean f12383b;
    public Object f12384c = new Path();
    public Object d = new Rect();

    public boolean a(int i10) {
        SparseArray sparseArray = (SparseArray) this.f12384c;
        boolean z10 = this.f12383b;
        un unVar = (un) this.d;
        int i11 = i10 - unVar.C0.J;
        if (i11 >= 0 && i11 < unVar.K6.size()) {
            kj kjVar = (kj) unVar.K6.get(i11);
            if (kjVar.U == 0) {
                if (!z10 && sparseArray.get(kjVar.f1(), null) == null) {
                    return true;
                }
                if (z10 && sparseArray.get(kjVar.f1(), null) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean b(Rect rect, boolean z10, boolean z11) {
        boolean z12;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f12382a == z11 && this.f12383b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f12382a = z11;
        this.f12383b = z10;
        rect2.set(rect);
        return z12;
    }

    public void c(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.c3.c(int, boolean, float, float):void");
    }

    @Override
    public void onSuccess(Object obj) {
        m4.x xVar = (m4.x) obj;
        m4.f0 f0Var = ((m4.p0) this.d).h;
        Handler handler = f0Var.f12747l;
        m4.w wVar = (m4.w) this.f12384c;
        e2.l0.W(handler, new k2.u(f0Var, wVar, new ig.k0(this, xVar, this.f12382a, this.f12383b, wVar, 2)));
    }

    @Override
    public void i(Throwable th2) {
    }
}
