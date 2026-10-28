package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class i extends n0 {
    public final int f12144a;
    public final Object f12145b;

    public i(Object obj, int i10) {
        this.f12144a = i10;
        this.f12145b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f12144a;
        Object obj = this.f12145b;
        switch (i10) {
            case 0:
                ((h) obj).f12143b.f12190y.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.f12190y.setVisibility(0);
                if (rVar.f12190y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f47143a;
                    r0.y.c((View) rVar.f12190y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f12144a;
        Object obj = this.f12145b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f12143b;
                rVar.f12190y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f12190y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.s) obj).f18696c;
                rVar3.f12190y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f12190y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f47143a;
                    r0.y.c((View) rVar3.f12190y.getParent());
                }
                rVar3.f12190y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = i0.f47143a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
