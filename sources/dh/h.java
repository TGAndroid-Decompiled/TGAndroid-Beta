package dh;

import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
public final class h implements Runnable {
    public final int f9018a;
    public final o f9019b;

    public h(o oVar, int i3) {
        this.f9018a = i3;
        this.f9019b = oVar;
    }

    @Override
    public final void run() {
        int i3 = this.f9018a;
        o oVar = this.f9019b;
        switch (i3) {
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
                    hs.e().k(98, 512);
                    oVar.f9103c.setVisibility(0);
                    oVar.f9103c.setLayerType(2, null);
                    oVar.j0(oVar.R.f53840e);
                    oVar.R.a(true, true);
                    return;
                }
                return;
            case 4:
                sf.c.t(oVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                sf.c.t(oVar.getParentActivity(), bd.M0(2131752409, null));
                return;
            default:
                oVar.e0(false);
                return;
        }
    }
}
