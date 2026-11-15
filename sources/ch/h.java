package ch;

import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
public final class h implements Runnable {
    public final int f5081a;
    public final o f5082b;

    public h(o oVar, int i7) {
        this.f5081a = i7;
        this.f5082b = oVar;
    }

    @Override
    public final void run() {
        int i7 = this.f5081a;
        o oVar = this.f5082b;
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
                if (oVar.Q && !oVar.P) {
                    oVar.P = true;
                    ns.e().k(98, 512);
                    oVar.f5172c.setVisibility(0);
                    oVar.f5172c.setLayerType(2, null);
                    oVar.j0(oVar.R.f57081e);
                    oVar.R.a(true, true);
                    return;
                }
                return;
            case 4:
                vf.c.t(oVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                vf.c.t(oVar.getParentActivity(), hd.M0(2131752409, null));
                return;
            default:
                oVar.e0(false);
                return;
        }
    }
}
