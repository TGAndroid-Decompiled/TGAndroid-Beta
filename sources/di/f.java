package di;

import ah.n;
import ai.w5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a7;
import org.telegram.ui.d6;
import org.telegram.ui.zu;
import yh.x7;
public final class f implements bh.a {
    public final int f8368a;
    public final Object f8369b;
    public final Object f8370c;

    public f(int i10, Object obj, Object obj2) {
        this.f8368a = i10;
        this.f8369b = obj;
        this.f8370c = obj2;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f8368a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f8368a) {
            case 0:
                ((k) this.f8369b).S.c0(canvas, rectF, (e) this.f8370c);
                return;
            case 1:
                zl0 zl0Var = (zl0) this.f8369b;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, (FrameLayout) this.f8370c);
                return;
            case 2:
                ((a7) this.f8369b).f34681b0.c0(canvas, rectF, (d6) this.f8370c);
                return;
            case 3:
                zu zuVar = (zu) this.f8369b;
                w5 w5Var = (w5) this.f8370c;
                int childCount = zuVar.f43897a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zuVar.f43897a.getChildAt(i10);
                    if (childAt instanceof zl0) {
                        zl0 zl0Var2 = (zl0) childAt;
                        gh.d.a(zl0Var2, canvas, rectF, zl0Var2, w5Var);
                    }
                }
                return;
            case 4:
                ((n) this.f8370c).f(canvas, rectF);
                mh mhVar = ((ProfileActivity) this.f8369b).O.f29760c2;
                if (mhVar != null) {
                    mhVar.f(canvas, rectF);
                    return;
                }
                return;
            default:
                ((x7) this.f8369b).S.c0(canvas, rectF, (e) this.f8370c);
                return;
        }
    }
}
