package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class i extends n0 {
    public final int f10697a;
    public final Object f10698b;

    public i(Object obj, int i10) {
        this.f10697a = i10;
        this.f10698b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f10697a;
        Object obj = this.f10698b;
        switch (i10) {
            case 0:
                ((h) obj).f10696b.f10743y.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.f10743y.setVisibility(0);
                if (rVar.f10743y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f45242a;
                    r0.y.c((View) rVar.f10743y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f10697a;
        Object obj = this.f10698b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f10696b;
                rVar.f10743y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f10743y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.s) obj).f17189c;
                rVar3.f10743y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f10743y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f45242a;
                    r0.y.c((View) rVar3.f10743y.getParent());
                }
                rVar3.f10743y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = i0.f45242a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
