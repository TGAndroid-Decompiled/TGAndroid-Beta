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
    public final Context f16774a;
    public final k f16775b;
    public final boolean f16776c;
    public final int d;
    public View e;
    public boolean f16778g;
    public w h;
    public s f16779i;
    public PopupWindow.OnDismissListener f16780j;
    public int f16777f = 8388611;
    public final t f16781k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f16774a = context;
        this.f16775b = kVar;
        this.e = view;
        this.f16776c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.f16779i == null) {
            Context context = this.f16774a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.e, this.d, this.f16776c);
            } else {
                c0Var = new c0(this.f16774a, this.f16775b, this.e, this.d, this.f16776c);
            }
            c0Var.l(this.f16775b);
            c0Var.r(this.f16781k);
            c0Var.n(this.e);
            c0Var.e(this.h);
            c0Var.o(this.f16778g);
            c0Var.p(this.f16777f);
            this.f16779i = c0Var;
        }
        return this.f16779i;
    }

    public final boolean b() {
        s sVar = this.f16779i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f16779i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f16780j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f16777f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f47105a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f16774a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f16772a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
