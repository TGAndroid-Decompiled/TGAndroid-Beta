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
    public final Context f15167a;
    public final l f15168b;
    public final boolean f15169c;
    public final int d;
    public View f15170e;
    public boolean f15172g;
    public x h;
    public t f15173i;
    public PopupWindow.OnDismissListener f15174j;
    public int f15171f = 8388611;
    public final u f15175k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f15167a = context;
        this.f15168b = lVar;
        this.f15170e = view;
        this.f15169c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f15173i == null) {
            Context context = this.f15167a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.f15170e, this.d, this.f15169c);
            } else {
                d0Var = new d0(this.f15167a, this.f15168b, this.f15170e, this.d, this.f15169c);
            }
            d0Var.l(this.f15168b);
            d0Var.r(this.f15175k);
            d0Var.n(this.f15170e);
            d0Var.h(this.h);
            d0Var.o(this.f15172g);
            d0Var.p(this.f15171f);
            this.f15173i = d0Var;
        }
        return this.f15173i;
    }

    public final boolean b() {
        t tVar = this.f15173i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15173i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15174j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15171f;
            View view = this.f15170e;
            WeakHashMap weakHashMap = i0.f44697a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15170e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15167a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15165a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
