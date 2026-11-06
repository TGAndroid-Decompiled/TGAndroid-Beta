package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f13328a;
    public final Object f13329b;

    public j(Object obj, int i7) {
        this.f13328a = i7;
        this.f13329b = obj;
    }

    @Override
    public void b() {
        int i7 = this.f13328a;
        Object obj = this.f13329b;
        switch (i7) {
            case 0:
                ((h) obj).f13326b.D.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.D.setVisibility(0);
                if (sVar.D.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f54073a;
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
        int i7 = this.f13328a;
        Object obj = this.f13329b;
        switch (i7) {
            case 0:
                s sVar = ((h) obj).f13326b;
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
                s sVar3 = (s) ((q4.q) obj).f53687c;
                sVar3.D.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.D.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f54073a;
                    r0.y.c((View) sVar3.D.getParent());
                }
                sVar3.D.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.f54073a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
