package ch;

import org.telegram.messenger.id;
import org.telegram.messenger.qs;
public final class h implements Runnable {
    public final int f6257a;
    public final o f6258b;

    public h(o oVar, int i7) {
        this.f6257a = i7;
        this.f6258b = oVar;
    }

    @Override
    public final void run() {
        int i7 = this.f6257a;
        o oVar = this.f6258b;
        switch (i7) {
            case 0:
                oVar.h.requestFocus();
                return;
            case 1:
                oVar.h.setFocusableInTouchMode(true);
                return;
            case 2:
                oVar.finishFragment();
                return;
            case 3:
                if (oVar.P && !oVar.O) {
                    oVar.O = true;
                    qs.e().k(98, 512);
                    oVar.f6346c.setVisibility(0);
                    oVar.f6346c.setLayerType(2, null);
                    oVar.j0(oVar.Q.f55498e);
                    oVar.Q.a(true, true);
                    return;
                }
                return;
            case 4:
                vf.c.t(oVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                vf.c.t(oVar.getParentActivity(), id.M0(2131752409, null));
                return;
            default:
                oVar.e0(false);
                return;
        }
    }
}
