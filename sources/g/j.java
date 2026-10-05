package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f10069a;
    public final Object f10070b;

    public j(Object obj, int i10) {
        this.f10069a = i10;
        this.f10070b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f10069a;
        Object obj = this.f10070b;
        switch (i10) {
            case 0:
                ((i) obj).f10068b.f10119y.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.f10119y.setVisibility(0);
                if (sVar.f10119y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f45610a;
                    r0.y.c((View) sVar.f10119y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f10069a;
        Object obj = this.f10070b;
        switch (i10) {
            case 0:
                s sVar = ((i) obj).f10068b;
                sVar.f10119y.setAlpha(1.0f);
                sVar.G.d(null);
                sVar.G = null;
                return;
            case 1:
                s sVar2 = (s) obj;
                sVar2.f10119y.setAlpha(1.0f);
                sVar2.G.d(null);
                sVar2.G = null;
                return;
            default:
                s sVar3 = (s) ((n4.y) obj).f16650c;
                sVar3.f10119y.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.f10119y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f45610a;
                    r0.y.c((View) sVar3.f10119y.getParent());
                }
                sVar3.f10119y.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.f45610a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
