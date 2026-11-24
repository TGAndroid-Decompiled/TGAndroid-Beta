package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class h0a extends nz9 {
    public final m8b O;
    public final n0a P;

    public h0a(n0a n0aVar, m8b m8bVar, Context context) {
        super(context);
        this.P = n0aVar;
        this.O = m8bVar;
        this.x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new lz9(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, bm2.o(-16777216, 160)});
    }

    @Override
    public final void b(int i) {
        i8b i8bVar;
        n0a n0aVar = this.P;
        i0a i0aVar = n0aVar.F;
        if (!n0aVar.x) {
            if (i0aVar.getCurrentItem() != i) {
                try {
                    i0aVar.x(i, false);
                } catch (Throwable th) {
                    fa4.g(th, true);
                    i0aVar.getAdapter().g();
                    i0aVar.x(i, false);
                }
            }
            m8b m8bVar = this.O;
            if (m8bVar.O0 != null && (i8bVar = m8bVar.u0) != null) {
                if (i < 10) {
                    i8bVar.i(false);
                } else if (i >= this.F.size() - 10) {
                    m8bVar.u0.i(true);
                }
            }
        }
    }
}
