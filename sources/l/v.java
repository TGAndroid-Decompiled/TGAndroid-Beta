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
    public final Context f11095a;
    public final k f11096b;
    public final boolean f11097c;
    public final int d;
    public View e;
    public boolean f11099g;
    public w h;
    public s f11100i;
    public PopupWindow.OnDismissListener f11101j;
    public int f11098f = 8388611;
    public final t f11102k = new t(this);

    public v(Context context, k kVar, View view, boolean z4, int i10, int i11) {
        this.f11095a = context;
        this.f11096b = kVar;
        this.e = view;
        this.f11097c = z4;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f11100i == null) {
            Context context = this.f11095a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f11097c);
            } else {
                c0Var = new c0(this.f11095a, this.f11096b, this.e, this.d, this.f11097c);
            }
            c0Var.l(this.f11096b);
            c0Var.r(this.f11102k);
            c0Var.n(this.e);
            c0Var.h(this.h);
            c0Var.o(this.f11099g);
            c0Var.p(this.f11098f);
            this.f11100i = c0Var;
        }
        return this.f11100i;
    }

    public final boolean b() {
        s sVar = this.f11100i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f11100i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11101j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z4, boolean z10) {
        s a2 = a();
        a2.s(z10);
        if (z4) {
            int i12 = this.f11098f;
            View view = this.e;
            WeakHashMap weakHashMap = j0.f43118a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f11095a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f11093a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
