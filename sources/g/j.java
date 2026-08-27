package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

public final class j extends o0 {

    public final int f6267a;

    public final Object f6268b;

    public j(Object obj, int i10) {
        this.f6267a = i10;
        this.f6268b = obj;
    }

    @Override
    public void b() {
        int i10 = this.f6267a;
        Object obj = this.f6268b;
        switch (i10) {
            case 0:
                ((i) obj).f6266b.f6311y.setVisibility(0);
                break;
            case 1:
                r rVar = (r) obj;
                rVar.f6311y.setVisibility(0);
                if (rVar.f6311y.getParent() instanceof View) {
                    View view = (View) rVar.f6311y.getParent();
                    WeakHashMap weakHashMap = j0.f46605a;
                    r0.z.c(view);
                }
                break;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f6267a;
        Object obj = this.f6268b;
        switch (i10) {
            case 0:
                r rVar = ((i) obj).f6266b;
                rVar.f6311y.setAlpha(1.0f);
                rVar.C.d(null);
                rVar.C = null;
                break;
            case 1:
                r rVar2 = (r) obj;
                rVar2.f6311y.setAlpha(1.0f);
                rVar2.C.d(null);
                rVar2.C = null;
                break;
            default:
                r rVar3 = (r) ((xe.b) obj).f49393c;
                rVar3.f6311y.setVisibility(8);
                PopupWindow popupWindow = rVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.f6311y.getParent() instanceof View) {
                    View view = (View) rVar3.f6311y.getParent();
                    WeakHashMap weakHashMap = j0.f46605a;
                    r0.z.c(view);
                }
                rVar3.f6311y.e();
                rVar3.C.d(null);
                rVar3.C = null;
                ViewGroup viewGroup = rVar3.F;
                WeakHashMap weakHashMap2 = j0.f46605a;
                r0.z.c(viewGroup);
                break;
        }
    }
}
