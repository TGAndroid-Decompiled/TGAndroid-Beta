package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f10068a;
    public final Object f10069b;

    public j(Object obj, int i10) {
        this.f10068a = i10;
        this.f10069b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f10068a;
        Object obj = this.f10069b;
        switch (i10) {
            case 0:
                ((i) obj).f10067b.f10118y.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.f10118y.setVisibility(0);
                if (sVar.f10118y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f45595a;
                    r0.y.c((View) sVar.f10118y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f10068a;
        Object obj = this.f10069b;
        switch (i10) {
            case 0:
                s sVar = ((i) obj).f10067b;
                sVar.f10118y.setAlpha(1.0f);
                sVar.G.d(null);
                sVar.G = null;
                return;
            case 1:
                s sVar2 = (s) obj;
                sVar2.f10118y.setAlpha(1.0f);
                sVar2.G.d(null);
                sVar2.G = null;
                return;
            default:
                s sVar3 = (s) ((n4.y) obj).f16640c;
                sVar3.f10118y.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.f10118y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f45595a;
                    r0.y.c((View) sVar3.f10118y.getParent());
                }
                sVar3.f10118y.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.f45595a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
