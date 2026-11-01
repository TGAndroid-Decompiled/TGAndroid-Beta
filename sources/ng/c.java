package ng;

import mg.x0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.zx;
public final class c implements Runnable {
    public final int f13769a;
    public final f f13770b;

    public c(f fVar, int i10) {
        this.f13769a = i10;
        this.f13770b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f13769a) {
            case 0:
                this.f13770b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.f13770b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                zx zxVar = new zx(f1.j(3, "onlySelect", "dialogsType", true));
                zxVar.C2 = new d(0, fVar, sb3);
                fVar.e.presentFragment(zxVar);
                ((x0) fVar).f13287r.dismiss();
                return;
        }
    }
}
