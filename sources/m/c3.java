package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import di.z5;
import org.telegram.messenger.ij;
import org.telegram.ui.an;
public final class c3 implements m9.t {
    public boolean f19072a;
    public boolean f19073b;
    public Object f19074c = new Path();
    public Object d = new Rect();

    public boolean a(int i7) {
        SparseArray sparseArray = (SparseArray) this.f19074c;
        boolean z9 = this.f19073b;
        an anVar = (an) this.d;
        int i10 = i7 - anVar.C0.J;
        if (i10 >= 0 && i10 < anVar.K6.size()) {
            ij ijVar = (ij) anVar.K6.get(i10);
            if (ijVar.U == 0) {
                if (!z9 && sparseArray.get(ijVar.f1(), null) == null) {
                    return true;
                }
                if (z9 && sparseArray.get(ijVar.f1(), null) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean b(Rect rect, boolean z9, boolean z10) {
        boolean z11;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f19072a == z10 && this.f19073b == z9 && z10 && z9) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f19072a = z10;
        this.f19073b = z9;
        rect2.set(rect);
        return z11;
    }

    public void c(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.c3.c(int, boolean, float, float):void");
    }

    @Override
    public void onSuccess(Object obj) {
        p4.w wVar = (p4.w) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.f53116l;
        p4.v vVar = (p4.v) this.f19074c;
        h2.m0.W(handler, new org.telegram.ui.web.w(d0Var, vVar, new z5(this, wVar, this.f19072a, this.f19073b, vVar, 4)));
    }

    @Override
    public void h(Throwable th2) {
    }
}
