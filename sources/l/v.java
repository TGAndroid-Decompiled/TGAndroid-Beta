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
    public final Context f15810a;
    public final k f15811b;
    public final boolean f15812c;
    public final int d;
    public View e;
    public boolean f15814g;
    public w h;
    public s f15815i;
    public PopupWindow.OnDismissListener f15816j;
    public int f15813f = 8388611;
    public final t f15817k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15810a = context;
        this.f15811b = kVar;
        this.e = view;
        this.f15812c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15815i == null) {
            Context context = this.f15810a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f15812c);
            } else {
                c0Var = new c0(this.f15810a, this.f15811b, this.e, this.d, this.f15812c);
            }
            c0Var.l(this.f15811b);
            c0Var.r(this.f15817k);
            c0Var.n(this.e);
            c0Var.h(this.h);
            c0Var.o(this.f15814g);
            c0Var.p(this.f15813f);
            this.f15815i = c0Var;
        }
        return this.f15815i;
    }

    public final boolean b() {
        s sVar = this.f15815i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15815i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15816j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15813f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f44816a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15810a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15808a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
