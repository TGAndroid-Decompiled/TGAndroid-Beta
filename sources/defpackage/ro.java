package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
public final class ro extends efc {
    public final byte a;
    public final Object b;

    public ro(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((qo) obj).b.E.setVisibility(0);
                return;
            case 1:
                bp bpVar = (bp) obj;
                bpVar.E.setVisibility(0);
                if (bpVar.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c((View) bpVar.E.getParent());
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
                bp bpVar = ((qo) obj).b;
                bpVar.E.setAlpha(1.0f);
                bpVar.H.d(null);
                bpVar.H = null;
                return;
            case 1:
                bp bpVar2 = (bp) obj;
                bpVar2.E.setAlpha(1.0f);
                bpVar2.H.d(null);
                bpVar2.H = null;
                return;
            default:
                bp bpVar3 = (bp) ((tg2) obj).c;
                bpVar3.E.setVisibility(8);
                PopupWindow popupWindow = bpVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (bpVar3.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c((View) bpVar3.E.getParent());
                }
                bpVar3.E.e();
                bpVar3.H.d(null);
                bpVar3.H = null;
                ViewGroup viewGroup = bpVar3.K;
                WeakHashMap weakHashMap2 = jdc.a;
                zcc.c(viewGroup);
                return;
        }
    }
}
