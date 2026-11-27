package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
public class s27 {
    public final Context a;
    public final f27 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public y27 h;
    public p27 i;
    public q27 j;
    public int f = 8388611;
    public final q27 k = new q27(this);

    public s27(Context context, f27 f27Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = f27Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final p27 a() {
        p27 p27Var = this.i;
        if (p27Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            r27.a(defaultDisplay, point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165206);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                p27Var = new fd1(context2, this.e, this.d, this.c);
            } else {
                p27Var = new vqa(context2, this.b, this.e, this.d, this.c);
            }
            p27Var.l(this.b);
            p27Var.r(this.k);
            p27Var.n(this.e);
            p27Var.h(this.h);
            p27Var.o(this.g);
            p27Var.p(this.f);
            this.i = p27Var;
        }
        return p27Var;
    }

    public final boolean b() {
        p27 p27Var = this.i;
        if (p27Var != null && p27Var.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.i = null;
        q27 q27Var = this.j;
        if (q27Var != null) {
            q27Var.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        p27 a = a();
        a.s(z2);
        if (z) {
            int i3 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = ihc.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.g();
    }
}
