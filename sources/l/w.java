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
import r0.j0;
public class w {
    public final Context f11452a;
    public final l f11453b;
    public final boolean f11454c;
    public final int d;
    public View f11455e;
    public boolean f11457g;
    public x h;
    public t f11458i;
    public PopupWindow.OnDismissListener f11459j;
    public int f11456f = 8388611;
    public final u f11460k = new u(this);

    public w(Context context, l lVar, View view, boolean z4, int i10, int i11) {
        this.f11452a = context;
        this.f11453b = lVar;
        this.f11455e = view;
        this.f11454c = z4;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f11458i == null) {
            Context context = this.f11452a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.f11455e, this.d, this.f11454c);
            } else {
                d0Var = new d0(this.f11452a, this.f11453b, this.f11455e, this.d, this.f11454c);
            }
            d0Var.l(this.f11453b);
            d0Var.r(this.f11460k);
            d0Var.n(this.f11455e);
            d0Var.h(this.h);
            d0Var.o(this.f11457g);
            d0Var.p(this.f11456f);
            this.f11458i = d0Var;
        }
        return this.f11458i;
    }

    public final boolean b() {
        t tVar = this.f11458i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f11458i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11459j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z4, boolean z10) {
        t a2 = a();
        a2.s(z10);
        if (z4) {
            int i12 = this.f11456f;
            View view = this.f11455e;
            WeakHashMap weakHashMap = j0.f46469a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f11455e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f11452a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f11450a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
