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
    public final Context f14039a;
    public final k f14040b;
    public final boolean f14041c;
    public final int d;
    public View f14042e;
    public boolean f14044g;
    public w h;
    public s f14045i;
    public PopupWindow.OnDismissListener f14046j;
    public int f14043f = 8388611;
    public final t f14047k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f14039a = context;
        this.f14040b = kVar;
        this.f14042e = view;
        this.f14041c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f14045i == null) {
            Context context = this.f14039a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f14042e, this.d, this.f14041c);
            } else {
                c0Var = new c0(this.f14039a, this.f14040b, this.f14042e, this.d, this.f14041c);
            }
            c0Var.l(this.f14040b);
            c0Var.r(this.f14047k);
            c0Var.n(this.f14042e);
            c0Var.g(this.h);
            c0Var.o(this.f14044g);
            c0Var.p(this.f14043f);
            this.f14045i = c0Var;
        }
        return this.f14045i;
    }

    public final boolean b() {
        s sVar = this.f14045i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f14045i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14046j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f14043f;
            View view = this.f14042e;
            WeakHashMap weakHashMap = j0.f46829a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f14042e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f14039a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f14037a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
