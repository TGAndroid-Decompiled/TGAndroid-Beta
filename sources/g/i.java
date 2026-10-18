package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class i extends n0 {
    public final int f10679a;
    public final Object f10680b;

    public i(Object obj, int i10) {
        this.f10679a = i10;
        this.f10680b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f10679a;
        Object obj = this.f10680b;
        switch (i10) {
            case 0:
                ((h) obj).f10678b.f10725y.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.f10725y.setVisibility(0);
                if (rVar.f10725y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f44818a;
                    r0.y.c((View) rVar.f10725y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f10679a;
        Object obj = this.f10680b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f10678b;
                rVar.f10725y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f10725y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.s) obj).f17125c;
                rVar3.f10725y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f10725y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f44818a;
                    r0.y.c((View) rVar3.f10725y.getParent());
                }
                rVar3.f10725y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = i0.f44818a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
