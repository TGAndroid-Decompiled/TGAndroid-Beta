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
    public final Context f15040a;
    public final k f15041b;
    public final boolean f15042c;
    public final int d;
    public View f15043e;
    public boolean f15045g;
    public w h;
    public s f15046i;
    public PopupWindow.OnDismissListener f15047j;
    public int f15044f = 8388611;
    public final t f15048k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15040a = context;
        this.f15041b = kVar;
        this.f15043e = view;
        this.f15042c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15046i == null) {
            Context context = this.f15040a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f15043e, this.d, this.f15042c);
            } else {
                c0Var = new c0(this.f15040a, this.f15041b, this.f15043e, this.d, this.f15042c);
            }
            c0Var.l(this.f15041b);
            c0Var.r(this.f15048k);
            c0Var.n(this.f15043e);
            c0Var.h(this.h);
            c0Var.o(this.f15045g);
            c0Var.p(this.f15044f);
            this.f15046i = c0Var;
        }
        return this.f15046i;
    }

    public final boolean b() {
        s sVar = this.f15046i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15046i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15047j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15044f;
            View view = this.f15043e;
            WeakHashMap weakHashMap = i0.f46981a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15043e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15040a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15038a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
