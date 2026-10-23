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
    public final Context f15808a;
    public final k f15809b;
    public final boolean f15810c;
    public final int d;
    public View e;
    public boolean f15812g;
    public w h;
    public s f15813i;
    public PopupWindow.OnDismissListener f15814j;
    public int f15811f = 8388611;
    public final t f15815k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f15808a = context;
        this.f15809b = kVar;
        this.e = view;
        this.f15810c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f15813i == null) {
            Context context = this.f15808a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f15810c);
            } else {
                c0Var = new c0(this.f15808a, this.f15809b, this.e, this.d, this.f15810c);
            }
            c0Var.l(this.f15809b);
            c0Var.r(this.f15815k);
            c0Var.n(this.e);
            c0Var.h(this.h);
            c0Var.o(this.f15812g);
            c0Var.p(this.f15811f);
            this.f15813i = c0Var;
        }
        return this.f15813i;
    }

    public final boolean b() {
        s sVar = this.f15813i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15813i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15814j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f15811f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f44830a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f15808a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15806a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
