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
    public final Context f11205a;
    public final k f11206b;
    public final boolean f11207c;
    public final int d;
    public View e;
    public boolean f11209g;
    public w h;
    public s f11210i;
    public PopupWindow.OnDismissListener f11211j;
    public int f11208f = 8388611;
    public final t f11212k = new t(this);

    public v(Context context, k kVar, View view, boolean z4, int i10, int i11) {
        this.f11205a = context;
        this.f11206b = kVar;
        this.e = view;
        this.f11207c = z4;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f11210i == null) {
            Context context = this.f11205a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f11207c);
            } else {
                c0Var = new c0(this.f11205a, this.f11206b, this.e, this.d, this.f11207c);
            }
            c0Var.l(this.f11206b);
            c0Var.r(this.f11212k);
            c0Var.n(this.e);
            c0Var.h(this.h);
            c0Var.o(this.f11209g);
            c0Var.p(this.f11208f);
            this.f11210i = c0Var;
        }
        return this.f11210i;
    }

    public final boolean b() {
        s sVar = this.f11210i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f11210i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11211j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z4, boolean z10) {
        s a2 = a();
        a2.s(z10);
        if (z4) {
            int i12 = this.f11208f;
            View view = this.e;
            WeakHashMap weakHashMap = j0.f43142a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f11205a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f11203a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
