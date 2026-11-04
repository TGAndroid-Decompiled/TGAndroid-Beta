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
    public final Context f17474a;
    public final k f17475b;
    public final boolean f17476c;
    public final int d;
    public View f17477e;
    public boolean f17479g;
    public w h;
    public s f17480i;
    public PopupWindow.OnDismissListener f17481j;
    public int f17478f = 8388611;
    public final t f17482k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i3, int i10) {
        this.f17474a = context;
        this.f17475b = kVar;
        this.f17477e = view;
        this.f17476c = z10;
        this.d = i3;
    }

    public final s a() {
        s c0Var;
        if (this.f17480i == null) {
            Context context = this.f17474a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f17477e, this.d, this.f17476c);
            } else {
                c0Var = new c0(this.f17474a, this.f17475b, this.f17477e, this.d, this.f17476c);
            }
            c0Var.l(this.f17475b);
            c0Var.r(this.f17482k);
            c0Var.n(this.f17477e);
            c0Var.h(this.h);
            c0Var.o(this.f17479g);
            c0Var.p(this.f17478f);
            this.f17480i = c0Var;
        }
        return this.f17480i;
    }

    public final boolean b() {
        s sVar = this.f17480i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f17480i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f17481j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i3, int i10, boolean z10, boolean z11) {
        s a10 = a();
        a10.s(z11);
        if (z10) {
            int i11 = this.f17478f;
            View view = this.f17477e;
            WeakHashMap weakHashMap = i0.f54015a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f17477e.getWidth();
            }
            a10.q(i3);
            a10.t(i10);
            int i12 = (int) ((this.f17474a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f17472a = new Rect(i3 - i12, i10 - i12, i3 + i12, i10 + i12);
        }
        a10.g();
    }
}
