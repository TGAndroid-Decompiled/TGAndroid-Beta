package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.h0;
import r0.m0;
public final class i extends m0 {
    public final int f7199a;
    public final Object f7200b;

    public i(Object obj, int i10) {
        this.f7199a = i10;
        this.f7200b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f7199a;
        Object obj = this.f7200b;
        switch (i10) {
            case 0:
                ((h) obj).f7198b.D.setVisibility(0);
                return;
            case 1:
                r rVar = (r) obj;
                rVar.D.setVisibility(0);
                if (rVar.D.getParent() instanceof View) {
                    WeakHashMap weakHashMap = h0.f46134a;
                    r0.x.c((View) rVar.D.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f7199a;
        Object obj = this.f7200b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).f7198b;
                rVar.D.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                return;
            case 1:
                r rVar2 = (r) obj;
                rVar2.D.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                return;
            default:
                r rVar3 = (r) ((n4.q) obj).f13528b;
                rVar3.D.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.D.getParent() instanceof View) {
                    WeakHashMap weakHashMap = h0.f46134a;
                    r0.x.c((View) rVar3.D.getParent());
                }
                rVar3.D.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = h0.f46134a;
                r0.x.c(viewGroup);
                return;
        }
    }
}
