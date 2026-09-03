package lh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ai;
public final class i2 implements Runnable {
    public final int f12563a;
    public final g5 f12564b;
    public final TL_stars.TL_starGiftUnique f12565c;
    public final lf.a d;
    public final Runnable e;

    public i2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable, int i10) {
        this.f12563a = i10;
        this.f12564b = g5Var;
        this.f12565c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10 = this.f12563a;
        lf.b bVar = lf.b.f12056a;
        lf.b bVar2 = lf.b.f12057b;
        Runnable runnable = this.e;
        lf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f12565c;
        g5 g5Var = this.f12564b;
        boolean z10 = false;
        switch (i10) {
            case 0:
                g5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f12054a == bVar2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tL_starGiftUnique.resale_ton_only = z4;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.f12452b0.setResellPrice(aVar);
                kh.z2 z2Var = g5Var.f12451a1;
                if (z2Var != null) {
                    z2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                ai.r(R.string.Gift2ResaleEnable, new Object[]{g5Var.C1()}, g5Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f12054a == bVar2) {
                    z10 = true;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.f12452b0.setResellPrice(aVar);
                kh.z2 z2Var2 = g5Var.f12451a1;
                if (z2Var2 != null) {
                    z2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
