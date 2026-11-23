package ch;

import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
public final class h implements Runnable {
    public final int f5399a;
    public final p f5400b;

    public h(p pVar, int i7) {
        this.f5399a = i7;
        this.f5400b = pVar;
    }

    @Override
    public final void run() {
        int i7 = this.f5399a;
        p pVar = this.f5400b;
        switch (i7) {
            case 0:
                pVar.h.requestFocus();
                return;
            case 1:
                pVar.h.setFocusableInTouchMode(true);
                return;
            case 2:
                pVar.finishFragment();
                return;
            case 3:
                if (pVar.Q && !pVar.P) {
                    pVar.P = true;
                    ls.e().k(98, 512);
                    pVar.f5494c.setVisibility(0);
                    pVar.f5494c.setLayerType(2, null);
                    pVar.j0(pVar.R.f57700e);
                    pVar.R.a(true, true);
                    return;
                }
                return;
            case 4:
                vf.c.t(pVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                vf.c.t(pVar.getParentActivity(), hd.N0(2131752397, null));
                return;
            default:
                pVar.e0(false);
                return;
        }
    }
}
