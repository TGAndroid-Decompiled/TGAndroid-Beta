package dg;

import ag.h0;
import cg.f1;
import org.telegram.messenger.y1;
import org.telegram.ui.gy;

public final class c implements Runnable {

    public final int f4938a;

    public final e f4939b;

    public c(e eVar, int i10) {
        this.f4938a = i10;
        this.f4939b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f4938a) {
            case 0:
                this.f4939b.E();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f4939b;
                sb2.append(eVar.h);
                String string = sb2.toString();
                gy gyVar = new gy(y1.e(3, "onlySelect", "dialogsType", true));
                gyVar.f38621y2 = new h0(15, eVar, string);
                eVar.f4944e.presentFragment(gyVar);
                ((f1) eVar).f2680r.dismiss();
                break;
        }
    }
}
