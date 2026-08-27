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

public class w {

    public final Context f15367a;

    public final l f15368b;

    public final boolean f15369c;
    public final int d;

    public View f15370e;

    public boolean f15372g;
    public x h;

    public t f15373i;

    public PopupWindow.OnDismissListener f15374j;

    public int f15371f = 8388611;

    public final u f15375k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f15367a = context;
        this.f15368b = lVar;
        this.f15370e = view;
        this.f15369c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f15373i == null) {
            Context context = this.f15367a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.f15370e, this.d, this.f15369c);
            } else {
                d0Var = new d0(this.f15367a, this.f15368b, this.f15370e, this.d, this.f15369c);
            }
            d0Var.l(this.f15368b);
            d0Var.r(this.f15375k);
            d0Var.n(this.f15370e);
            d0Var.h(this.h);
            d0Var.o(this.f15372g);
            d0Var.p(this.f15371f);
            this.f15373i = d0Var;
        }
        return this.f15373i;
    }

    public final boolean b() {
        t tVar = this.f15373i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f15373i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15374j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t tVarA = a();
        tVarA.s(z11);
        if (z10) {
            int i12 = this.f15371f;
            View view = this.f15370e;
            WeakHashMap weakHashMap = j0.f46605a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15370e.getWidth();
            }
            tVarA.q(i10);
            tVarA.t(i11);
            int i13 = (int) ((this.f15367a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f15365a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        tVarA.g();
    }
}
