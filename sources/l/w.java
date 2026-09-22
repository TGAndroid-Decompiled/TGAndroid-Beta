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
    public final Context f14001a;
    public final l f14002b;
    public final boolean f14003c;
    public final int d;
    public View e;
    public boolean f14005g;
    public x h;
    public t f14006i;
    public PopupWindow.OnDismissListener f14007j;
    public int f14004f = 8388611;
    public final u f14008k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f14001a = context;
        this.f14002b = lVar;
        this.e = view;
        this.f14003c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f14006i == null) {
            Context context = this.f14001a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.e, this.d, this.f14003c);
            } else {
                d0Var = new d0(this.f14001a, this.f14002b, this.e, this.d, this.f14003c);
            }
            d0Var.l(this.f14002b);
            d0Var.r(this.f14008k);
            d0Var.n(this.e);
            d0Var.e(this.h);
            d0Var.o(this.f14005g);
            d0Var.p(this.f14004f);
            this.f14006i = d0Var;
        }
        return this.f14006i;
    }

    public final boolean b() {
        t tVar = this.f14006i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f14006i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14007j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f14004f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f42163a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f14001a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f13999a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
