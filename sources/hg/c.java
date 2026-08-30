package hg;

import gg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.oy;
public final class c implements Runnable {
    public final int f7080a;
    public final e f7081b;

    public c(e eVar, int i10) {
        this.f7080a = i10;
        this.f7081b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7080a) {
            case 0:
                this.f7081b.E();
                return;
            default:
                StringBuilder sb = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f7081b;
                sb.append(eVar.h);
                String sb2 = sb.toString();
                oy oyVar = new oy(y3.e(3, "onlySelect", "dialogsType", true));
                oyVar.f37131z2 = new c1.b(17, eVar, sb2);
                eVar.e.presentFragment(oyVar);
                ((d1) eVar).f6606r.dismiss();
                return;
        }
    }
}
