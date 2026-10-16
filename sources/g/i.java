package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class i extends n0 {
    public final int f9773a;
    public final Object f9774b;

    public i(Object obj, int i10) {
        this.f9773a = i10;
        this.f9774b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f9773a;
        Object obj = this.f9774b;
        switch (i10) {
            case 0:
                ((h) obj).f9772b.f9819y.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.f9819y.setVisibility(0);
                if (rVar.f9819y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f43485a;
                    r0.y.c((View) rVar.f9819y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f9773a;
        Object obj = this.f9774b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f9772b;
                rVar.f9819y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f9819y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.s) obj).f15746c;
                rVar3.f9819y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f9819y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f43485a;
                    r0.y.c((View) rVar3.f9819y.getParent());
                }
                rVar3.f9819y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = i0.f43485a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
