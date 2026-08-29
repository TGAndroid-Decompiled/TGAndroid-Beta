package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class i extends o0 {
    public final int f6896a;
    public final Object f6897b;

    public i(Object obj, int i10) {
        this.f6896a = i10;
        this.f6897b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f6896a;
        Object obj = this.f6897b;
        switch (i10) {
            case 0:
                ((h) obj).f6895b.f6940y.setVisibility(0);
                return;
            case 1:
                q qVar = (q) obj;
                qVar.f6940y.setVisibility(0);
                if (qVar.f6940y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f46829a;
                    r0.z.c((View) qVar.f6940y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f6896a;
        Object obj = this.f6897b;
        switch (i10) {
            case 0:
                q qVar = ((h) obj).f6895b;
                qVar.f6940y.setAlpha(1.0f);
                qVar.C.d(null);
                qVar.C = null;
                return;
            case 1:
                q qVar2 = (q) obj;
                qVar2.f6940y.setAlpha(1.0f);
                qVar2.C.d(null);
                qVar2.C = null;
                return;
            default:
                q qVar3 = (q) ((ze.b) obj).f50825b;
                qVar3.f6940y.setVisibility(8);
                PopupWindow popupWindow = qVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qVar3.f6940y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = j0.f46829a;
                    r0.z.c((View) qVar3.f6940y.getParent());
                }
                qVar3.f6940y.e();
                qVar3.C.d(null);
                qVar3.C = null;
                ViewGroup viewGroup = qVar3.F;
                WeakHashMap weakHashMap2 = j0.f46829a;
                r0.z.c(viewGroup);
                return;
        }
    }
}
