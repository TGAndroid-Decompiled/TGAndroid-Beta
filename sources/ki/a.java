package ki;

import ah.n;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.ProfileActivity;
public final class a implements bh.a {
    public final int f13649a;
    public final Object f13650b;
    public final Object f13651c;

    public a(int i10, Object obj, Object obj2) {
        this.f13649a = i10;
        this.f13650b = obj;
        this.f13651c = obj2;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f13649a) {
            case 0:
            default:
                aVar.f415a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f13649a) {
            case 0:
                ll0 ll0Var = (ll0) this.f13650b;
                gh.d.a(ll0Var, canvas, rectF, ll0Var, (FrameLayout) this.f13651c);
                return;
            default:
                ((n) this.f13651c).f(canvas, rectF);
                jh jhVar = ((ProfileActivity) this.f13650b).O.f30352c2;
                if (jhVar != null) {
                    jhVar.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
