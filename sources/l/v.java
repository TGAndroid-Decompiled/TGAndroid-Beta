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
    public final Context f19265a;
    public final k f19266b;
    public final boolean f19267c;
    public final int d;
    public View f19268e;
    public boolean f19270g;
    public w h;
    public s f19271i;
    public PopupWindow.OnDismissListener f19272j;
    public int f19269f = 8388611;
    public final t f19273k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i7, int i10) {
        this.f19265a = context;
        this.f19266b = kVar;
        this.f19268e = view;
        this.f19267c = z10;
        this.d = i7;
    }

    public final s a() {
        s c0Var;
        if (this.f19271i == null) {
            Context context = this.f19265a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f19268e, this.d, this.f19267c);
            } else {
                c0Var = new c0(this.f19265a, this.f19266b, this.f19268e, this.d, this.f19267c);
            }
            c0Var.l(this.f19266b);
            c0Var.r(this.f19273k);
            c0Var.n(this.f19268e);
            c0Var.h(this.h);
            c0Var.o(this.f19270g);
            c0Var.p(this.f19269f);
            this.f19271i = c0Var;
        }
        return this.f19271i;
    }

    public final boolean b() {
        s sVar = this.f19271i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f19271i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f19272j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z10, boolean z11) {
        s a10 = a();
        a10.s(z11);
        if (z10) {
            int i11 = this.f19269f;
            View view = this.f19268e;
            WeakHashMap weakHashMap = i0.f56289a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f19268e.getWidth();
            }
            a10.q(i7);
            a10.t(i10);
            int i12 = (int) ((this.f19265a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f19263a = new Rect(i7 - i12, i10 - i12, i7 + i12, i10 + i12);
        }
        a10.g();
    }
}
