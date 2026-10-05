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
    public final Context f15228a;
    public final k f15229b;
    public final boolean f15230c;
    public final int d;
    public View f15231e;
    public boolean f15233g;
    public w h;
    public s f15234i;
    public PopupWindow.OnDismissListener f15235j;
    public int f15232f = 8388611;
    public final t f15236k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15228a = context;
        this.f15229b = kVar;
        this.f15231e = view;
        this.f15230c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15234i == null) {
            Context context = this.f15228a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f15231e, this.d, this.f15230c);
            } else {
                c0Var = new c0(this.f15228a, this.f15229b, this.f15231e, this.d, this.f15230c);
            }
            c0Var.l(this.f15229b);
            c0Var.r(this.f15236k);
            c0Var.n(this.f15231e);
            c0Var.h(this.h);
            c0Var.o(this.f15233g);
            c0Var.p(this.f15232f);
            this.f15234i = c0Var;
        }
        return this.f15234i;
    }

    public final boolean b() {
        s sVar = this.f15234i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15234i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15235j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15232f;
            View view = this.f15231e;
            WeakHashMap weakHashMap = i0.f45610a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15231e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15228a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15226a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
