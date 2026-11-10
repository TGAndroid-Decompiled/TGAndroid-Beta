package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f13330a;
    public final Object f13331b;

    public j(Object obj, int i7) {
        this.f13330a = i7;
        this.f13331b = obj;
    }

    @Override
    public void b() {
        int i7 = this.f13330a;
        Object obj = this.f13331b;
        switch (i7) {
            case 0:
                ((h) obj).f13328b.D.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.D.setVisibility(0);
                if (sVar.D.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f54202a;
                    r0.y.c((View) sVar.D.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i7 = this.f13330a;
        Object obj = this.f13331b;
        switch (i7) {
            case 0:
                s sVar = ((h) obj).f13328b;
                sVar.D.setAlpha(1.0f);
                sVar.G.d(null);
                sVar.G = null;
                return;
            case 1:
                s sVar2 = (s) obj;
                sVar2.D.setAlpha(1.0f);
                sVar2.G.d(null);
                sVar2.G = null;
                return;
            default:
                s sVar3 = (s) ((q4.q) obj).f53816c;
                sVar3.D.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.D.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f54202a;
                    r0.y.c((View) sVar3.D.getParent());
                }
                sVar3.D.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.f54202a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
