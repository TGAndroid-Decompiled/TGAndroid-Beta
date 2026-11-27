package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
public final class so extends djc {
    public final byte a;
    public final Object b;

    public so(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ro) obj).b.E.setVisibility(0);
                return;
            case 1:
                cp cpVar = (cp) obj;
                cpVar.E.setVisibility(0);
                if (cpVar.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c((View) cpVar.E.getParent());
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
                cp cpVar = ((ro) obj).b;
                cpVar.E.setAlpha(1.0f);
                cpVar.H.d(null);
                cpVar.H = null;
                return;
            case 1:
                cp cpVar2 = (cp) obj;
                cpVar2.E.setAlpha(1.0f);
                cpVar2.H.d(null);
                cpVar2.H = null;
                return;
            default:
                cp cpVar3 = (cp) ((lh2) obj).c;
                cpVar3.E.setVisibility(8);
                PopupWindow popupWindow = cpVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (cpVar3.E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c((View) cpVar3.E.getParent());
                }
                cpVar3.E.e();
                cpVar3.H.d(null);
                cpVar3.H = null;
                ViewGroup viewGroup = cpVar3.K;
                WeakHashMap weakHashMap2 = ihc.a;
                ygc.c(viewGroup);
                return;
        }
    }
}
