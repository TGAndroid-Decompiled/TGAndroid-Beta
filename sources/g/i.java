package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class i extends o0 {
    public final int f6739a;
    public final Object f6740b;

    public i(Object obj, int i10) {
        this.f6739a = i10;
        this.f6740b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f6739a;
        Object obj = this.f6740b;
        switch (i10) {
            case 0:
                ((h) obj).f6738b.f6784y.setVisibility(0);
                return;
            case 1:
                q qVar = (q) obj;
                qVar.f6784y.setVisibility(0);
                if (qVar.f6784y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f46438a;
                    r0.z.c((View) qVar.f6784y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f6739a;
        Object obj = this.f6740b;
        switch (i10) {
            case 0:
                q qVar = ((h) obj).f6738b;
                qVar.f6784y.setAlpha(1.0f);
                qVar.D.d(null);
                qVar.D = null;
                return;
            case 1:
                q qVar2 = (q) obj;
                qVar2.f6784y.setAlpha(1.0f);
                qVar2.D.d(null);
                qVar2.D = null;
                return;
            default:
                q qVar3 = (q) ((f7.b) obj).f6121c;
                qVar3.f6784y.setVisibility(8);
                PopupWindow popupWindow = qVar3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qVar3.f6784y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f46438a;
                    r0.z.c((View) qVar3.f6784y.getParent());
                }
                qVar3.f6784y.e();
                qVar3.D.d(null);
                qVar3.D = null;
                ViewGroup viewGroup = qVar3.G;
                WeakHashMap weakHashMap2 = j0.f46438a;
                r0.z.c(viewGroup);
                return;
        }
    }
}
