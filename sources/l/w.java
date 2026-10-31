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
import r0.h0;
public class w {
    public final Context f11552a;
    public final l f11553b;
    public final boolean f11554c;
    public final int d;
    public View e;
    public boolean f11556g;
    public x h;
    public t f11557i;
    public PopupWindow.OnDismissListener f11558j;
    public int f11555f = 8388611;
    public final u f11559k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f11552a = context;
        this.f11553b = lVar;
        this.e = view;
        this.f11554c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.f11557i == null) {
            Context context = this.f11552a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new f(context, this.e, this.d, this.f11554c);
            } else {
                d0Var = new d0(this.f11552a, this.f11553b, this.e, this.d, this.f11554c);
            }
            d0Var.l(this.f11553b);
            d0Var.r(this.f11559k);
            d0Var.n(this.e);
            d0Var.e(this.h);
            d0Var.o(this.f11556g);
            d0Var.p(this.f11555f);
            this.f11557i = d0Var;
        }
        return this.f11557i;
    }

    public final boolean b() {
        t tVar = this.f11557i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f11557i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11558j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f11555f;
            View view = this.e;
            WeakHashMap weakHashMap = h0.f46123a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.f11552a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f11550a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
