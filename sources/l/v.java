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
    public final Context f15226a;
    public final k f15227b;
    public final boolean f15228c;
    public final int d;
    public View f15229e;
    public boolean f15231g;
    public w h;
    public s f15232i;
    public PopupWindow.OnDismissListener f15233j;
    public int f15230f = 8388611;
    public final t f15234k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15226a = context;
        this.f15227b = kVar;
        this.f15229e = view;
        this.f15228c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15232i == null) {
            Context context = this.f15226a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f15229e, this.d, this.f15228c);
            } else {
                c0Var = new c0(this.f15226a, this.f15227b, this.f15229e, this.d, this.f15228c);
            }
            c0Var.l(this.f15227b);
            c0Var.r(this.f15234k);
            c0Var.n(this.f15229e);
            c0Var.h(this.h);
            c0Var.o(this.f15231g);
            c0Var.p(this.f15230f);
            this.f15232i = c0Var;
        }
        return this.f15232i;
    }

    public final boolean b() {
        s sVar = this.f15232i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15232i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15233j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15230f;
            View view = this.f15229e;
            WeakHashMap weakHashMap = i0.f45595a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15229e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15226a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15224a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
