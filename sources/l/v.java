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
    public final Context f19231a;
    public final k f19232b;
    public final boolean f19233c;
    public final int d;
    public View f19234e;
    public boolean f19236g;
    public w h;
    public s f19237i;
    public PopupWindow.OnDismissListener f19238j;
    public int f19235f = 8388611;
    public final t f19239k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i7, int i10) {
        this.f19231a = context;
        this.f19232b = kVar;
        this.f19234e = view;
        this.f19233c = z10;
        this.d = i7;
    }

    public final s a() {
        s c0Var;
        if (this.f19237i == null) {
            Context context = this.f19231a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f19234e, this.d, this.f19233c);
            } else {
                c0Var = new c0(this.f19231a, this.f19232b, this.f19234e, this.d, this.f19233c);
            }
            c0Var.l(this.f19232b);
            c0Var.r(this.f19239k);
            c0Var.n(this.f19234e);
            c0Var.h(this.h);
            c0Var.o(this.f19236g);
            c0Var.p(this.f19235f);
            this.f19237i = c0Var;
        }
        return this.f19237i;
    }

    public final boolean b() {
        s sVar = this.f19237i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f19237i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f19238j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z10, boolean z11) {
        s a10 = a();
        a10.s(z11);
        if (z10) {
            int i11 = this.f19235f;
            View view = this.f19234e;
            WeakHashMap weakHashMap = i0.f56254a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f19234e.getWidth();
            }
            a10.q(i7);
            a10.t(i10);
            int i12 = (int) ((this.f19231a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f19229a = new Rect(i7 - i12, i10 - i12, i7 + i12, i10 + i12);
        }
        a10.g();
    }
}
