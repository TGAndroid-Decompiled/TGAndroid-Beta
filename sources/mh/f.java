package mh;

import android.view.ViewTreeObserver;
import org.telegram.messenger.i0;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.eb;
import org.telegram.ui.b50;
import org.telegram.ui.iw;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f13330a;
    public final Object f13331b;
    public final Object f13332c;

    public f(int i10, Object obj, Object obj2) {
        this.f13330a = i10;
        this.f13332c = obj;
        this.f13331b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        switch (this.f13330a) {
            case 0:
                ((ViewTreeObserver) this.f13331b).removeOnPreDrawListener(this);
                j jVar = (j) this.f13332c;
                eb ebVar = jVar.W;
                if (ebVar != null) {
                    int[] iArr = j.f13355d0;
                    ebVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - jVar.W.getTranslationY();
                    eb ebVar2 = jVar.W;
                    if (ebVar2.top) {
                        f7 = ebVar2.getTopOffset();
                    } else {
                        f7 = -ebVar2.getBottomOffset();
                    }
                    jVar.f13358a.getLocationInWindow(iArr);
                    jVar.X = (jVar.W.f25744a.getMeasuredWidth() / 2.0f) + (f10 - iArr[0]) + jVar.W.f25744a.getLeft();
                    jVar.Y = (jVar.W.f25744a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr[1]) + jVar.W.f25744a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                ((iw) this.f13332c).f38358a.f35794e0[0].f44239a.getViewTreeObserver().removeOnPreDrawListener(this);
                i0.h3((bi.e) this.f13331b, 100L);
                return false;
            default:
                b50 b50Var = (b50) this.f13332c;
                b50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var.f36024h4 = null;
                b50Var.R3.j((v3) this.f13331b);
                i0.a4(b50Var.f36008d4);
                b50Var.f21586b.requestLayout();
                return false;
        }
    }
}
