package lh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.yh;
public final class i2 implements Runnable {
    public final int f12579a;
    public final g5 f12580b;
    public final TL_stars.TL_starGiftUnique f12581c;
    public final mf.a d;
    public final Runnable e;

    public i2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, int i10) {
        this.f12579a = i10;
        this.f12580b = g5Var;
        this.f12581c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10 = this.f12579a;
        mf.b bVar = mf.b.f13930a;
        mf.b bVar2 = mf.b.f13931b;
        Runnable runnable = this.e;
        mf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f12581c;
        g5 g5Var = this.f12580b;
        boolean z10 = false;
        switch (i10) {
            case 0:
                g5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f13928a == bVar2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tL_starGiftUnique.resale_ton_only = z4;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.f12468b0.setResellPrice(aVar);
                kh.a3 a3Var = g5Var.f12467a1;
                if (a3Var != null) {
                    a3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                yh.s(R.string.Gift2ResaleEnable, new Object[]{g5Var.C1()}, g5Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f13928a == bVar2) {
                    z10 = true;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.f12468b0.setResellPrice(aVar);
                kh.a3 a3Var2 = g5Var.f12467a1;
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
