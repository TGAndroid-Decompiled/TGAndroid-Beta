package fg;

import a9.s;
import eg.e1;
import org.telegram.messenger.x3;
import org.telegram.ui.fy;
public final class c implements Runnable {
    public final int f6733a;
    public final e f6734b;

    public c(e eVar, int i10) {
        this.f6733a = i10;
        this.f6734b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f6733a) {
            case 0:
                this.f6734b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f6734b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                fy fyVar = new fy(x3.e(3, "onlySelect", "dialogsType", true));
                fyVar.f38379y2 = new s(17, eVar, sb3);
                eVar.f6739e.presentFragment(fyVar);
                ((e1) eVar).f5980r.dismiss();
                return;
        }
    }
}
