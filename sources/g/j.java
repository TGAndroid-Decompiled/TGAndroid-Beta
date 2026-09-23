package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f9251a;
    public final Object f9252b;

    public j(Object obj, int i10) {
        this.f9251a = i10;
        this.f9252b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f9251a;
        Object obj = this.f9252b;
        switch (i10) {
            case 0:
                ((i) obj).f9250b.f9297y.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.f9297y.setVisibility(0);
                if (sVar.f9297y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f41795a;
                    r0.y.c((View) sVar.f9297y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f9251a;
        Object obj = this.f9252b;
        switch (i10) {
            case 0:
                s sVar = ((i) obj).f9250b;
                sVar.f9297y.setAlpha(1.0f);
                sVar.G.d(null);
                sVar.G = null;
                return;
            case 1:
                s sVar2 = (s) obj;
                sVar2.f9297y.setAlpha(1.0f);
                sVar2.G.d(null);
                sVar2.G = null;
                return;
            default:
                s sVar3 = (s) ((n4.y) obj).f14970c;
                sVar3.f9297y.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.f9297y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f41795a;
                    r0.y.c((View) sVar3.f9297y.getParent());
                }
                sVar3.f9297y.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.f41795a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
