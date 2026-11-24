package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
public class l27 {
    public final Context a;
    public final y17 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public r27 h;
    public i27 i;
    public j27 j;
    public int f = 8388611;
    public final j27 k = new j27(this);

    public l27(Context context, y17 y17Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = y17Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final i27 a() {
        i27 i27Var = this.i;
        if (i27Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            k27.a(defaultDisplay, point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165206);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                i27Var = new fe1(context2, this.e, this.d, this.c);
            } else {
                i27Var = new zoa(context2, this.b, this.e, this.d, this.c);
            }
            i27Var.l(this.b);
            i27Var.r(this.k);
            i27Var.n(this.e);
            i27Var.h(this.h);
            i27Var.o(this.g);
            i27Var.p(this.f);
            this.i = i27Var;
        }
        return i27Var;
    }

    public final boolean b() {
        i27 i27Var = this.i;
        if (i27Var != null && i27Var.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.i = null;
        j27 j27Var = this.j;
        if (j27Var != null) {
            j27Var.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        i27 a = a();
        a.s(z2);
        if (z) {
            int i3 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = kfc.a;
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
