package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import org.telegram.messenger.jj;
import org.telegram.ui.un;
public final class c3 implements j9.t {
    public boolean f12381a;
    public boolean f12382b;
    public Object f12383c = new Path();
    public Object d = new Rect();

    public boolean a(int i10) {
        SparseArray sparseArray = (SparseArray) this.f12383c;
        boolean z10 = this.f12382b;
        un unVar = (un) this.d;
        int i11 = i10 - unVar.C0.J;
        if (i11 >= 0 && i11 < unVar.K6.size()) {
            jj jjVar = (jj) unVar.K6.get(i11);
            if (jjVar.U == 0) {
                if (!z10 && sparseArray.get(jjVar.f1(), null) == null) {
                    return true;
                }
                if (z10 && sparseArray.get(jjVar.f1(), null) != null) {
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
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f12381a == z11 && this.f12382b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f12381a = z11;
        this.f12382b = z10;
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
        Handler handler = f0Var.f12746l;
        m4.w wVar = (m4.w) this.f12383c;
        e2.l0.W(handler, new k2.u(f0Var, wVar, new ig.k0(this, xVar, this.f12381a, this.f12382b, wVar, 2)));
    }

    @Override
    public void i(Throwable th2) {
    }
}
