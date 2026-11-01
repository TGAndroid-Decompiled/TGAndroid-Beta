package mh;

import android.view.ViewTreeObserver;
import org.telegram.messenger.i0;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.eb;
import org.telegram.ui.a50;
import org.telegram.ui.hw;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f13331a;
    public final Object f13332b;
    public final Object f13333c;

    public f(int i10, Object obj, Object obj2) {
        this.f13331a = i10;
        this.f13333c = obj;
        this.f13332b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        switch (this.f13331a) {
            case 0:
                ((ViewTreeObserver) this.f13332b).removeOnPreDrawListener(this);
                j jVar = (j) this.f13333c;
                eb ebVar = jVar.W;
                if (ebVar != null) {
                    int[] iArr = j.f13356d0;
                    ebVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - jVar.W.getTranslationY();
                    eb ebVar2 = jVar.W;
                    if (ebVar2.top) {
                        f7 = ebVar2.getTopOffset();
                    } else {
                        f7 = -ebVar2.getBottomOffset();
                    }
                    jVar.f13359a.getLocationInWindow(iArr);
                    jVar.X = (jVar.W.f25778a.getMeasuredWidth() / 2.0f) + (f10 - iArr[0]) + jVar.W.f25778a.getLeft();
                    jVar.Y = (jVar.W.f25778a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr[1]) + jVar.W.f25778a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                ((hw) this.f13333c).f37876a.f44137e0[0].f43733a.getViewTreeObserver().removeOnPreDrawListener(this);
                i0.h3((bi.e) this.f13332b, 100L);
                return false;
            default:
                a50 a50Var = (a50) this.f13333c;
                a50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var.f35608h4 = null;
                a50Var.R3.j((v3) this.f13332b);
                i0.a4(a50Var.f35592d4);
                a50Var.f21587b.requestLayout();
                return false;
        }
    }
}
