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
    public final Context f16611a;
    public final k f16612b;
    public final boolean f16613c;
    public final int d;
    public View f16614e;
    public boolean f16616g;
    public w h;
    public s f16617i;
    public PopupWindow.OnDismissListener f16618j;
    public int f16615f = 8388611;
    public final t f16619k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i9, int i10) {
        this.f16611a = context;
        this.f16612b = kVar;
        this.f16614e = view;
        this.f16613c = z10;
        this.d = i9;
    }

    public final s a() {
        s c0Var;
        if (this.f16617i == null) {
            Context context = this.f16611a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f16614e, this.d, this.f16613c);
            } else {
                c0Var = new c0(this.f16611a, this.f16612b, this.f16614e, this.d, this.f16613c);
            }
            c0Var.l(this.f16612b);
            c0Var.r(this.f16619k);
            c0Var.n(this.f16614e);
            c0Var.h(this.h);
            c0Var.o(this.f16616g);
            c0Var.p(this.f16615f);
            this.f16617i = c0Var;
        }
        return this.f16617i;
    }

    public final boolean b() {
        s sVar = this.f16617i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f16617i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f16618j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i9, int i10, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i11 = this.f16615f;
            View view = this.f16614e;
            WeakHashMap weakHashMap = j0.f46915a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i9 -= this.f16614e.getWidth();
            }
            a2.q(i9);
            a2.t(i10);
            int i12 = (int) ((this.f16611a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f16609a = new Rect(i9 - i12, i10 - i12, i9 + i12, i10 + i12);
        }
        a2.g();
    }
}
