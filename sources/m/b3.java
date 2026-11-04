package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import ei.a6;
import org.telegram.messenger.zi;
import org.telegram.ui.wm;
public final class b3 implements l9.t {
    public boolean f18545a;
    public boolean f18546b;
    public Object f18547c = new Path();
    public Object d = new Rect();

    public boolean a(int i3) {
        SparseArray sparseArray = (SparseArray) this.f18547c;
        boolean z10 = this.f18546b;
        wm wmVar = (wm) this.d;
        int i10 = i3 - wmVar.D0.K;
        if (i10 >= 0 && i10 < wmVar.L6.size()) {
            zi ziVar = (zi) wmVar.L6.get(i10);
            if (ziVar.U == 0) {
                if (!z10 && sparseArray.get(ziVar.f1(), null) == null) {
                    return true;
                }
                if (z10 && sparseArray.get(ziVar.f1(), null) != null) {
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
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f18545a == z11 && this.f18546b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f18545a = z11;
        this.f18546b = z10;
        rect2.set(rect);
        return z12;
    }

    public void c(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.b3.c(int, boolean, float, float):void");
    }

    @Override
    public void onSuccess(Object obj) {
        o4.w wVar = (o4.w) obj;
        o4.e0 e0Var = ((o4.o0) this.d).h;
        Handler handler = e0Var.f20628l;
        o4.v vVar = (o4.v) this.f18547c;
        g2.n0.W(handler, new m2.s(e0Var, vVar, new a6(this, wVar, this.f18545a, this.f18546b, vVar, 2)));
    }

    @Override
    public void h(Throwable th2) {
    }
}
