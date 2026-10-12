package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class i extends o0 {
    public final int f9770a;
    public final Object f9771b;

    public i(Object obj, int i10) {
        this.f9770a = i10;
        this.f9771b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f9770a;
        Object obj = this.f9771b;
        switch (i10) {
            case 0:
                ((h) obj).f9769b.f9816y.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.f9816y.setVisibility(0);
                if (rVar.f9816y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f43732a;
                    r0.z.c((View) rVar.f9816y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f9770a;
        Object obj = this.f9771b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f9769b;
                rVar.f9816y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f9816y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.s) obj).f16032c;
                rVar3.f9816y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f9816y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f43732a;
                    r0.z.c((View) rVar3.f9816y.getParent());
                }
                rVar3.f9816y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = j0.f43732a;
                r0.z.c(viewGroup);
                return;
        }
    }
}
