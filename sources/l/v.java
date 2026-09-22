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
    public final Context f13789a;
    public final k f13790b;
    public final boolean f13791c;
    public final int d;
    public View e;
    public boolean f13793g;
    public w h;
    public s f13794i;
    public PopupWindow.OnDismissListener f13795j;
    public int f13792f = 8388611;
    public final t f13796k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f13789a = context;
        this.f13790b = kVar;
        this.e = view;
        this.f13791c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f13794i == null) {
            Context context = this.f13789a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f13791c);
            } else {
                c0Var = new c0(this.f13789a, this.f13790b, this.e, this.d, this.f13791c);
            }
            c0Var.l(this.f13790b);
            c0Var.r(this.f13796k);
            c0Var.n(this.e);
            c0Var.e(this.h);
            c0Var.o(this.f13793g);
            c0Var.p(this.f13792f);
            this.f13794i = c0Var;
        }
        return this.f13794i;
    }

    public final boolean b() {
        s sVar = this.f13794i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f13794i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13795j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f13792f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f41839a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f13789a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f13787a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
