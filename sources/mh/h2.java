package mh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.yh;
public final class h2 implements Runnable {
    public final int f14157a;
    public final g5 f14158b;
    public final TL_stars.TL_starGiftUnique f14159c;
    public final mf.a d;
    public final Runnable f14160e;

    public h2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, int i10) {
        this.f14157a = i10;
        this.f14158b = g5Var;
        this.f14159c = tL_starGiftUnique;
        this.d = aVar;
        this.f14160e = runnable;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10 = this.f14157a;
        mf.b bVar = mf.b.f13653a;
        mf.b bVar2 = mf.b.f13654b;
        Runnable runnable = this.f14160e;
        mf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f14159c;
        g5 g5Var = this.f14158b;
        boolean z10 = false;
        switch (i10) {
            case 0:
                g5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f13651a == bVar2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tL_starGiftUnique.resale_ton_only = z4;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.f14087b0.setResellPrice(aVar);
                lh.z2 z2Var = g5Var.f14086a1;
                if (z2Var != null) {
                    z2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                yh.s(R.string.Gift2ResaleEnable, new Object[]{g5Var.C1()}, g5Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f13651a == bVar2) {
                    z10 = true;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.f14087b0.setResellPrice(aVar);
                lh.z2 z2Var2 = g5Var.f14086a1;
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
