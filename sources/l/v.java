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
public class v {
    public final Context f14468a;
    public final k f14469b;
    public final boolean f14470c;
    public final int d;
    public View e;
    public boolean f14472g;
    public w h;
    public s f14473i;
    public PopupWindow.OnDismissListener f14474j;
    public int f14471f = 8388611;
    public final t f14475k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f14468a = context;
        this.f14469b = kVar;
        this.e = view;
        this.f14470c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f14473i == null) {
            Context context = this.f14468a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f14470c);
            } else {
                c0Var = new c0(this.f14468a, this.f14469b, this.e, this.d, this.f14470c);
            }
            c0Var.l(this.f14469b);
            c0Var.r(this.f14475k);
            c0Var.n(this.e);
            c0Var.h(this.h);
            c0Var.o(this.f14472g);
            c0Var.p(this.f14471f);
            this.f14473i = c0Var;
        }
        return this.f14473i;
    }

    public final boolean b() {
        s sVar = this.f14473i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f14473i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14474j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f14471f;
            View view = this.e;
            WeakHashMap weakHashMap = j0.f43732a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f14468a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f14466a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
