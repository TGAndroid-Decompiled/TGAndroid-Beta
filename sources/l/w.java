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
public class w {
    public final Context f13987a;
    public final l f13988b;
    public final boolean f13989c;
    public final int d;
    public View e;
    public boolean f13991g;
    public x h;
    public t f13992i;
    public PopupWindow.OnDismissListener f13993j;
    public int f13990f = 8388611;
    public final u f13994k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f13987a = context;
        this.f13988b = lVar;
        this.e = view;
        this.f13989c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f13992i == null) {
            Context context = this.f13987a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.e, this.d, this.f13989c);
            } else {
                d0Var = new d0(this.f13987a, this.f13988b, this.e, this.d, this.f13989c);
            }
            d0Var.l(this.f13988b);
            d0Var.r(this.f13994k);
            d0Var.n(this.e);
            d0Var.e(this.h);
            d0Var.o(this.f13991g);
            d0Var.p(this.f13990f);
            this.f13992i = d0Var;
        }
        return this.f13992i;
    }

    public final boolean b() {
        t tVar = this.f13992i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f13992i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13993j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f13990f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.f42142a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f13987a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f13985a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
