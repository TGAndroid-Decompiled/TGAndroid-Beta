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
public class v {
    public final Context f15227a;
    public final k f15228b;
    public final boolean f15229c;
    public final int d;
    public View f15230e;
    public boolean f15232g;
    public w h;
    public s f15233i;
    public PopupWindow.OnDismissListener f15234j;
    public int f15231f = 8388611;
    public final t f15235k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15227a = context;
        this.f15228b = kVar;
        this.f15230e = view;
        this.f15229c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15233i == null) {
            Context context = this.f15227a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f15230e, this.d, this.f15229c);
            } else {
                c0Var = new c0(this.f15227a, this.f15228b, this.f15230e, this.d, this.f15229c);
            }
            c0Var.l(this.f15228b);
            c0Var.r(this.f15235k);
            c0Var.n(this.f15230e);
            c0Var.h(this.h);
            c0Var.o(this.f15232g);
            c0Var.p(this.f15231f);
            this.f15233i = c0Var;
        }
        return this.f15233i;
    }

    public final boolean b() {
        s sVar = this.f15233i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15233i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15234j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15231f;
            View view = this.f15230e;
            WeakHashMap weakHashMap = i0.f45596a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15230e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15227a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15225a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
