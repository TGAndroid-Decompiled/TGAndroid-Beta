package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import fi.q5;
import org.telegram.messenger.gj;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.bn;
public final class b3 implements m9.t {
    public boolean f20052a;
    public boolean f20053b;
    public Object f20054c;
    public Object d;

    public b3(org.telegram.ui.Wallet.m mVar, org.telegram.ui.Wallet.u uVar) {
        this.f20054c = mVar;
        this.d = uVar;
    }

    public boolean a(int i7) {
        SparseArray sparseArray = (SparseArray) this.f20054c;
        boolean z10 = this.f20053b;
        bn bnVar = (bn) this.d;
        int i10 = i7 - bnVar.D0.K;
        if (i10 >= 0 && i10 < bnVar.M6.size()) {
            gj gjVar = (gj) bnVar.M6.get(i10);
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

    public void b() {
        if (!this.f20052a) {
            this.f20052a = true;
            Runnable runnable = (Runnable) this.f20054c;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = (Runnable) this.d;
            if (runnable2 != null && !this.f20053b) {
                runnable2.run();
            }
        }
    }

    public boolean c(Rect rect, boolean z10, boolean z11) {
        boolean z12;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f20052a == z11 && this.f20053b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f20052a = z11;
        this.f20053b = z10;
        rect2.set(rect);
        return z12;
    }

    public void d(float r8, float r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: m.b3.d(float, float, int, boolean):void");
    }

    @Override
    public void onSuccess(Object obj) {
        p4.w wVar = (p4.w) obj;
        p4.e0 e0Var = ((p4.n0) this.d).h;
        Handler handler = e0Var.f55241l;
        p4.v vVar = (p4.v) this.f20054c;
        h2.l0.W(handler, new u4(e0Var, vVar, new q5(this, wVar, this.f20052a, this.f20053b, vVar, 4)));
    }

    public b3() {
        this.f20054c = new Path();
        this.d = new Rect();
    }

    @Override
    public void h(Throwable th2) {
    }
}
