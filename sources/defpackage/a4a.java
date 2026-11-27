package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class a4a extends h3a {
    public final lcb O;
    public final g4a P;

    public a4a(g4a g4aVar, lcb lcbVar, Context context) {
        super(context);
        this.P = g4aVar;
        this.O = lcbVar;
        this.x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new f3a(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, vm2.o(-16777216, 160)});
    }

    @Override
    public final void b(int i) {
        hcb hcbVar;
        g4a g4aVar = this.P;
        b4a b4aVar = g4aVar.F;
        if (!g4aVar.x) {
            if (b4aVar.getCurrentItem() != i) {
                try {
                    b4aVar.x(i, false);
                } catch (Throwable th) {
                    cc4.g(th, true);
                    b4aVar.getAdapter().g();
                    b4aVar.x(i, false);
                }
            }
            lcb lcbVar = this.O;
            if (lcbVar.O0 != null && (hcbVar = lcbVar.u0) != null) {
                if (i < 10) {
                    hcbVar.f(false);
                } else if (i >= this.F.size() - 10) {
                    lcbVar.u0.f(true);
                }
            }
        }
    }
}
