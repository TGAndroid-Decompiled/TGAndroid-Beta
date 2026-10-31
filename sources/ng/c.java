package ng;

import mg.x0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.ay;
public final class c implements Runnable {
    public final int f13768a;
    public final f f13769b;

    public c(f fVar, int i10) {
        this.f13768a = i10;
        this.f13769b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f13768a) {
            case 0:
                this.f13769b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.f13769b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                ay ayVar = new ay(f1.j(3, "onlySelect", "dialogsType", true));
                ayVar.C2 = new d(0, fVar, sb3);
                fVar.e.presentFragment(ayVar);
                ((x0) fVar).f13286r.dismiss();
                return;
        }
    }
}
