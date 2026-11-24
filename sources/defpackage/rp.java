package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
public final class rp extends ehc {
    public final byte a;
    public final Object b;

    public rp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((qp) obj).b.E.setVisibility(0);
                return;
            case 1:
                bq bqVar = (bq) obj;
                bqVar.E.setVisibility(0);
                if (bqVar.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c((View) bqVar.E.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bq bqVar = ((qp) obj).b;
                bqVar.E.setAlpha(1.0f);
                bqVar.H.d(null);
                bqVar.H = null;
                return;
            case 1:
                bq bqVar2 = (bq) obj;
                bqVar2.E.setAlpha(1.0f);
                bqVar2.H.d(null);
                bqVar2.H = null;
                return;
            default:
                bq bqVar3 = (bq) ((lx6) obj).c;
                bqVar3.E.setVisibility(8);
                PopupWindow popupWindow = bqVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (bqVar3.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c((View) bqVar3.E.getParent());
                }
                bqVar3.E.e();
                bqVar3.H.d(null);
                bqVar3.H = null;
                ViewGroup viewGroup = bqVar3.K;
                WeakHashMap weakHashMap2 = kfc.a;
                afc.c(viewGroup);
                return;
        }
    }
}
