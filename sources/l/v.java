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
    public final Context f15292a;
    public final k f15293b;
    public final boolean f15294c;
    public final int d;
    public View f15295e;
    public boolean f15297g;
    public w h;
    public s f15298i;
    public PopupWindow.OnDismissListener f15299j;
    public int f15296f = 8388611;
    public final t f15300k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15292a = context;
        this.f15293b = kVar;
        this.f15295e = view;
        this.f15294c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15298i == null) {
            Context context = this.f15292a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f15295e, this.d, this.f15294c);
            } else {
                c0Var = new c0(this.f15292a, this.f15293b, this.f15295e, this.d, this.f15294c);
            }
            c0Var.l(this.f15293b);
            c0Var.r(this.f15300k);
            c0Var.n(this.f15295e);
            c0Var.h(this.h);
            c0Var.o(this.f15297g);
            c0Var.p(this.f15296f);
            this.f15298i = c0Var;
        }
        return this.f15298i;
    }

    public final boolean b() {
        s sVar = this.f15298i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15298i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15299j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15296f;
            View view = this.f15295e;
            WeakHashMap weakHashMap = i0.f46764a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15295e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15292a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15290a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
