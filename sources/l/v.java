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
    public final Context f19234a;
    public final k f19235b;
    public final boolean f19236c;
    public final int d;
    public View f19237e;
    public boolean f19239g;
    public w h;
    public s f19240i;
    public PopupWindow.OnDismissListener f19241j;
    public int f19238f = 8388611;
    public final t f19242k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i7, int i10) {
        this.f19234a = context;
        this.f19235b = kVar;
        this.f19237e = view;
        this.f19236c = z10;
        this.d = i7;
    }

    public final s a() {
        s c0Var;
        if (this.f19240i == null) {
            Context context = this.f19234a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f19237e, this.d, this.f19236c);
            } else {
                c0Var = new c0(this.f19234a, this.f19235b, this.f19237e, this.d, this.f19236c);
            }
            c0Var.l(this.f19235b);
            c0Var.r(this.f19242k);
            c0Var.n(this.f19237e);
            c0Var.h(this.h);
            c0Var.o(this.f19239g);
            c0Var.p(this.f19238f);
            this.f19240i = c0Var;
        }
        return this.f19240i;
    }

    public final boolean b() {
        s sVar = this.f19240i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f19240i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f19241j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z10, boolean z11) {
        s a10 = a();
        a10.s(z11);
        if (z10) {
            int i11 = this.f19238f;
            View view = this.f19237e;
            WeakHashMap weakHashMap = i0.f56244a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f19237e.getWidth();
            }
            a10.q(i7);
            a10.t(i10);
            int i12 = (int) ((this.f19234a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f19232a = new Rect(i7 - i12, i10 - i12, i7 + i12, i10 + i12);
        }
        a10.g();
    }
}
