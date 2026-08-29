package jh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.th;
public final class i2 implements Runnable {
    public final int f12236a;
    public final h5 f12237b;
    public final TL_stars.TL_starGiftUnique f12238c;
    public final kf.a d;
    public final Runnable f12239e;

    public i2(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, int i10) {
        this.f12236a = i10;
        this.f12237b = h5Var;
        this.f12238c = tL_starGiftUnique;
        this.d = aVar;
        this.f12239e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f12236a;
        kf.b bVar = kf.b.f13635a;
        kf.b bVar2 = kf.b.f13636b;
        Runnable runnable = this.f12239e;
        kf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f12238c;
        h5 h5Var = this.f12237b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                h5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f13633a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h5Var.f12163a0.setResellPrice(aVar);
                ih.a3 a3Var = h5Var.Z0;
                if (a3Var != null) {
                    a3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                th.r(R.string.Gift2ResaleEnable, new Object[]{h5Var.C1()}, h5Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f13633a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h5Var.f12163a0.setResellPrice(aVar);
                ih.a3 a3Var2 = h5Var.Z0;
                if (a3Var2 != null) {
                    a3Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
