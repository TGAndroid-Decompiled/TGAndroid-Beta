package cg;

import bg.k1;
import org.telegram.messenger.l0;
import org.telegram.ui.dy;
public final class c implements Runnable {
    public final int f2394a;
    public final e f2395b;

    public c(e eVar, int i9) {
        this.f2394a = i9;
        this.f2395b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f2394a) {
            case 0:
                this.f2395b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f2395b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                dy dyVar = new dy(l0.e(3, "onlySelect", "dialogsType", true));
                dyVar.f37752y2 = new b5.d(10, eVar, sb3);
                eVar.f2400e.presentFragment(dyVar);
                ((k1) eVar).f1859r.dismiss();
                return;
        }
    }
}
