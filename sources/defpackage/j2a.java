package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class j2a extends p1a {
    public final oab O;
    public final p2a P;

    public j2a(p2a p2aVar, oab oabVar, Context context) {
        super(context);
        this.P = p2aVar;
        this.O = oabVar;
        this.x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new n1a(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, on2.p(-16777216, 160)});
    }

    @Override
    public final void b(int i) {
        kab kabVar;
        p2a p2aVar = this.P;
        k2a k2aVar = p2aVar.F;
        if (!p2aVar.x) {
            if (k2aVar.getCurrentItem() != i) {
                try {
                    k2aVar.x(i, false);
                } catch (Throwable th) {
                    fc4.g(th, true);
                    k2aVar.getAdapter().g();
                    k2aVar.x(i, false);
                }
            }
            oab oabVar = this.O;
            if (oabVar.O0 != null && (kabVar = oabVar.u0) != null) {
                if (i < 10) {
                    kabVar.e(false);
                } else if (i >= this.F.size() - 10) {
                    oabVar.u0.e(true);
                }
            }
        }
    }
}
