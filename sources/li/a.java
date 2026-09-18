package li;

import ah.o;
import ai.w0;
import ai.x5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.av;
import org.telegram.ui.h6;
import org.telegram.ui.w6;
import org.telegram.ui.z6;
public final class a implements bh.a {
    public final int f14282a;
    public final Object f14283b;
    public final Object f14284c;

    public a(int i10, Object obj, Object obj2) {
        this.f14282a = i10;
        this.f14283b = obj;
        this.f14284c = obj2;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f14282a) {
            case 0:
            case 1:
            case 2:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f14282a) {
            case 0:
                wl0 wl0Var = (wl0) this.f14283b;
                gh.d.a(wl0Var, canvas, rectF, wl0Var, (FrameLayout) this.f14284c);
                return;
            case 1:
                z6 z6Var = (z6) this.f14283b;
                h6 h6Var = (h6) this.f14284c;
                w0 w0Var = z6Var.f39984b;
                gh.d.a(w0Var, canvas, rectF, w0Var, h6Var);
                w6 w6Var = z6Var.M;
                if (w6Var != null) {
                    int childCount = w6Var.h.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = z6Var.M.h.getChildAt(i10);
                        if (childAt instanceof wl0) {
                            wl0 wl0Var2 = (wl0) childAt;
                            gh.d.a(wl0Var2, canvas, rectF, wl0Var2, h6Var);
                        }
                    }
                    return;
                }
                return;
            case 2:
                av avVar = (av) this.f14283b;
                x5 x5Var = (x5) this.f14284c;
                int childCount2 = avVar.f32147a.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = avVar.f32147a.getChildAt(i11);
                    if (childAt2 instanceof wl0) {
                        wl0 wl0Var3 = (wl0) childAt2;
                        gh.d.a(wl0Var3, canvas, rectF, wl0Var3, x5Var);
                    }
                }
                return;
            default:
                ((o) this.f14284c).f(canvas, rectF);
                kh khVar = ((ProfileActivity) this.f14283b).O.f25808c2;
                if (khVar != null) {
                    khVar.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
