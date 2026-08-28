package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class i extends o0 {
    public final int f6986a;
    public final Object f6987b;

    public i(Object obj, int i9) {
        this.f6986a = i9;
        this.f6987b = obj;
    }

    @Override
    public void b() {
        int i9 = this.f6986a;
        Object obj = this.f6987b;
        switch (i9) {
            case 0:
                ((h) obj).f6985b.f7030y.setVisibility(0);
                return;
            case 1:
                q qVar = (q) obj;
                qVar.f7030y.setVisibility(0);
                if (qVar.f7030y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f46915a;
                    r0.z.c((View) qVar.f7030y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i9 = this.f6986a;
        Object obj = this.f6987b;
        switch (i9) {
            case 0:
                q qVar = ((h) obj).f6985b;
                qVar.f7030y.setAlpha(1.0f);
                qVar.C.d(null);
                qVar.C = null;
                return;
            case 1:
                q qVar2 = (q) obj;
                qVar2.f7030y.setAlpha(1.0f);
                qVar2.C.d(null);
                qVar2.C = null;
                return;
            default:
                q qVar3 = (q) ((we.b) obj).f48794c;
                qVar3.f7030y.setVisibility(8);
                PopupWindow popupWindow = qVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qVar3.f7030y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f46915a;
                    r0.z.c((View) qVar3.f7030y.getParent());
                }
                qVar3.f7030y.e();
                qVar3.C.d(null);
                qVar3.C = null;
                ViewGroup viewGroup = qVar3.F;
                WeakHashMap weakHashMap2 = j0.f46915a;
                r0.z.c(viewGroup);
                return;
        }
    }
}
