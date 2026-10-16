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
    public final Context f14470a;
    public final k f14471b;
    public final boolean f14472c;
    public final int d;
    public View e;
    public boolean f14474g;
    public w h;
    public s f14475i;
    public PopupWindow.OnDismissListener f14476j;
    public int f14473f = 8388611;
    public final t f14477k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f14470a = context;
        this.f14471b = kVar;
        this.e = view;
        this.f14472c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f14475i == null) {
            Context context = this.f14470a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f14472c);
            } else {
                c0Var = new c0(this.f14470a, this.f14471b, this.e, this.d, this.f14472c);
            }
            c0Var.l(this.f14471b);
            c0Var.r(this.f14477k);
            c0Var.n(this.e);
            c0Var.h(this.h);
            c0Var.o(this.f14474g);
            c0Var.p(this.f14473f);
            this.f14475i = c0Var;
        }
        return this.f14475i;
    }

    public final boolean b() {
        s sVar = this.f14475i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f14475i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14476j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f14473f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f43485a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f14470a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f14468a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
