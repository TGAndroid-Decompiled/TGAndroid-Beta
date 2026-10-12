package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class i extends n0 {
    public final int f10137a;
    public final Object f10138b;

    public i(Object obj, int i10) {
        this.f10137a = i10;
        this.f10138b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f10137a;
        Object obj = this.f10138b;
        switch (i10) {
            case 0:
                ((h) obj).f10136b.f10187y.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.f10187y.setVisibility(0);
                if (rVar.f10187y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f46981a;
                    r0.y.c((View) rVar.f10187y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f10137a;
        Object obj = this.f10138b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f10136b;
                rVar.f10187y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f10187y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.y) obj).f16363c;
                rVar3.f10187y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f10187y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f46981a;
                    r0.y.c((View) rVar3.f10187y.getParent());
                }
                rVar3.f10187y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = i0.f46981a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
