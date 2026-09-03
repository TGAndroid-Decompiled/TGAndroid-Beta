package hg;

import gg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.qy;
public final class c implements Runnable {
    public final int f7063a;
    public final e f7064b;

    public c(e eVar, int i10) {
        this.f7063a = i10;
        this.f7064b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7063a) {
            case 0:
                this.f7064b.E();
                return;
            default:
                StringBuilder sb = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f7064b;
                sb.append(eVar.h);
                String sb2 = sb.toString();
                qy qyVar = new qy(y3.e(3, "onlySelect", "dialogsType", true));
                qyVar.f37649z2 = new c1.b(17, eVar, sb2);
                eVar.e.presentFragment(qyVar);
                ((d1) eVar).f6593r.dismiss();
                return;
        }
    }
}
