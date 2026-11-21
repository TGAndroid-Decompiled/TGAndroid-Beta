package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f13021a;
    public final Object f13022b;

    public j(Object obj, int i7) {
        this.f13021a = i7;
        this.f13022b = obj;
    }

    @Override
    public void b() {
        int i7 = this.f13021a;
        Object obj = this.f13022b;
        switch (i7) {
            case 0:
                ((h) obj).f13019b.E.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.E.setVisibility(0);
                if (sVar.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f56285a;
                    r0.y.c((View) sVar.E.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i7 = this.f13021a;
        Object obj = this.f13022b;
        switch (i7) {
            case 0:
                s sVar = ((h) obj).f13019b;
                sVar.E.setAlpha(1.0f);
                sVar.H.d(null);
                sVar.H = null;
                return;
            case 1:
                s sVar2 = (s) obj;
                sVar2.E.setAlpha(1.0f);
                sVar2.H.d(null);
                sVar2.H = null;
                return;
            default:
                s sVar3 = (s) ((q4.q) obj).f55868c;
                sVar3.E.setVisibility(8);
                PopupWindow popupWindow = sVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f56285a;
                    r0.y.c((View) sVar3.E.getParent());
                }
                sVar3.E.e();
                sVar3.H.d(null);
                sVar3.H = null;
                ViewGroup viewGroup = sVar3.K;
                WeakHashMap weakHashMap2 = i0.f56285a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
