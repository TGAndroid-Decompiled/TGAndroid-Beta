package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
public class w {
    public final Context f15193a;
    public final l f15194b;
    public final boolean f15195c;
    public final int d;
    public View f15196e;
    public boolean f15198g;
    public x h;
    public t f15199i;
    public PopupWindow.OnDismissListener f15200j;
    public int f15197f = 8388611;
    public final u f15201k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f15193a = context;
        this.f15194b = lVar;
        this.f15196e = view;
        this.f15195c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f15199i == null) {
            Context context = this.f15193a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.f15196e, this.d, this.f15195c);
            } else {
                d0Var = new d0(this.f15193a, this.f15194b, this.f15196e, this.d, this.f15195c);
            }
            d0Var.l(this.f15194b);
            d0Var.r(this.f15201k);
            d0Var.n(this.f15196e);
            d0Var.h(this.h);
            d0Var.o(this.f15198g);
            d0Var.p(this.f15197f);
            this.f15199i = d0Var;
        }
        return this.f15199i;
    }

    public final boolean b() {
        t tVar = this.f15199i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15199i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15200j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15197f;
            View view = this.f15196e;
            WeakHashMap weakHashMap = i0.f44725a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15196e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15193a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15191a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
