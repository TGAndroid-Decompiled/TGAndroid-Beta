package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class j extends n0 {
    public final int f11712a;
    public final Object f11713b;

    public j(Object obj, int i3) {
        this.f11712a = i3;
        this.f11713b = obj;
    }

    @Override
    public void b() {
        int i3 = this.f11712a;
        Object obj = this.f11713b;
        switch (i3) {
            case 0:
                ((h) obj).f11710b.E.setVisibility(0);
                return;
            case 1:
                s sVar = (s) obj;
                sVar.E.setVisibility(0);
                if (sVar.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f54015a;
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
        int i3 = this.f11712a;
        Object obj = this.f11713b;
        switch (i3) {
            case 0:
                s sVar = ((h) obj).f11710b;
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
                s sVar3 = (s) ((tf.b) obj).f55095b;
                sVar3.E.setVisibility(8);
                PopupWindow popupWindow = sVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = i0.f54015a;
                    r0.y.c((View) sVar3.E.getParent());
                }
                sVar3.E.e();
                sVar3.H.d(null);
                sVar3.H = null;
                ViewGroup viewGroup = sVar3.K;
                WeakHashMap weakHashMap2 = i0.f54015a;
                r0.y.c(viewGroup);
                return;
        }
    }
}
