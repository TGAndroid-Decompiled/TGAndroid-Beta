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
    public final Context f18870a;
    public final k f18871b;
    public final boolean f18872c;
    public final int d;
    public View f18873e;
    public boolean f18875g;
    public w h;
    public s f18876i;
    public PopupWindow.OnDismissListener f18877j;
    public int f18874f = 8388611;
    public final t f18878k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i7, int i10) {
        this.f18870a = context;
        this.f18871b = kVar;
        this.f18873e = view;
        this.f18872c = z10;
        this.d = i7;
    }

    public final s a() {
        s c0Var;
        if (this.f18876i == null) {
            Context context = this.f18870a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f18873e, this.d, this.f18872c);
            } else {
                c0Var = new c0(this.f18870a, this.f18871b, this.f18873e, this.d, this.f18872c);
            }
            c0Var.l(this.f18871b);
            c0Var.r(this.f18878k);
            c0Var.n(this.f18873e);
            c0Var.h(this.h);
            c0Var.o(this.f18875g);
            c0Var.p(this.f18874f);
            this.f18876i = c0Var;
        }
        return this.f18876i;
    }

    public final boolean b() {
        s sVar = this.f18876i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f18876i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f18877j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z10, boolean z11) {
        s a10 = a();
        a10.s(z11);
        if (z10) {
            int i11 = this.f18874f;
            View view = this.f18873e;
            WeakHashMap weakHashMap = i0.f55671a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f18873e.getWidth();
            }
            a10.q(i7);
            a10.t(i10);
            int i12 = (int) ((this.f18870a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f18868a = new Rect(i7 - i12, i10 - i12, i7 + i12, i10 + i12);
        }
        a10.g();
    }
}
