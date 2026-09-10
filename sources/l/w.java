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
    public final Context f12683a;
    public final l f12684b;
    public final boolean f12685c;
    public final int d;
    public View e;
    public boolean f12687g;
    public x h;
    public t f12688i;
    public PopupWindow.OnDismissListener f12689j;
    public int f12686f = 8388611;
    public final u f12690k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f12683a = context;
        this.f12684b = lVar;
        this.e = view;
        this.f12685c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f12688i == null) {
            Context context = this.f12683a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.e, this.d, this.f12685c);
            } else {
                d0Var = new d0(this.f12683a, this.f12684b, this.e, this.d, this.f12685c);
            }
            d0Var.l(this.f12684b);
            d0Var.r(this.f12690k);
            d0Var.n(this.e);
            d0Var.h(this.h);
            d0Var.o(this.f12687g);
            d0Var.p(this.f12686f);
            this.f12688i = d0Var;
        }
        return this.f12688i;
    }

    public final boolean b() {
        t tVar = this.f12688i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f12688i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f12689j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f12686f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f41062a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f12683a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f12681a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
