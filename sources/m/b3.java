package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import fi.r5;
import org.telegram.messenger.gj;
import org.telegram.ui.an;
public final class b3 implements m9.t {
    public boolean f19657a;
    public boolean f19658b;
    public Object f19659c = new Path();
    public Object d = new Rect();

    public boolean a(int i7) {
        SparseArray sparseArray = (SparseArray) this.f19659c;
        boolean z10 = this.f19658b;
        an anVar = (an) this.d;
        int i10 = i7 - anVar.D0.K;
        if (i10 >= 0 && i10 < anVar.L6.size()) {
            gj gjVar = (gj) anVar.L6.get(i10);
            if (gjVar.U == 0) {
                if (!z10 && sparseArray.get(gjVar.e1(), null) == null) {
                    return true;
                }
                if (z10 && sparseArray.get(gjVar.e1(), null) != null) {
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
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f19657a == z11 && this.f19658b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f19657a = z11;
        this.f19658b = z10;
        rect2.set(rect);
        return z12;
    }

    public void c(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.b3.c(int, boolean, float, float):void");
    }

    @Override
    public void onSuccess(Object obj) {
        p4.w wVar = (p4.w) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.f54627l;
        p4.v vVar = (p4.v) this.f19659c;
        h2.l0.W(handler, new org.telegram.ui.web.e1(d0Var, vVar, new r5(this, wVar, this.f19657a, this.f19658b, vVar, 4)));
    }

    @Override
    public void h(Throwable th2) {
    }
}
