package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
public class l07 {
    public final Context a;
    public final yz6 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public r07 h;
    public i07 i;
    public j07 j;
    public int f = 8388611;
    public final j07 k = new j07(this);

    public l07(Context context, yz6 yz6Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = yz6Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final i07 a() {
        i07 i07Var = this.i;
        if (i07Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            k07.a(defaultDisplay, point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165206);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                i07Var = new xc1(context2, this.e, this.d, this.c);
            } else {
                i07Var = new yma(context2, this.b, this.e, this.d, this.c);
            }
            i07Var.l(this.b);
            i07Var.r(this.k);
            i07Var.n(this.e);
            i07Var.h(this.h);
            i07Var.o(this.g);
            i07Var.p(this.f);
            this.i = i07Var;
        }
        return i07Var;
    }

    public final boolean b() {
        i07 i07Var = this.i;
        if (i07Var != null && i07Var.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.i = null;
        j07 j07Var = this.j;
        if (j07Var != null) {
            j07Var.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        i07 a = a();
        a.s(z2);
        if (z) {
            int i3 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = jdc.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.f();
    }
}
