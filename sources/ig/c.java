package ig;

import hg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.py;
public final class c implements Runnable {
    public final int f8075a;
    public final e f8076b;

    public c(e eVar, int i10) {
        this.f8075a = i10;
        this.f8076b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8075a) {
            case 0:
                this.f8076b.E();
                return;
            default:
                StringBuilder sb = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f8076b;
                sb.append(eVar.h);
                String sb2 = sb.toString();
                py pyVar = new py(y3.e(3, "onlySelect", "dialogsType", true));
                pyVar.f40278z2 = new c1.b(17, eVar, sb2);
                eVar.f8081e.presentFragment(pyVar);
                ((d1) eVar).f7448r.dismiss();
                return;
        }
    }
}
