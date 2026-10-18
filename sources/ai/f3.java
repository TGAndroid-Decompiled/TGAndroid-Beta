package ai;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 implements Runnable {
    public final int f1278a;
    public final k7 f1279b;
    public final TL_stars.TL_starGiftUnique f1280c;
    public final ag.a d;
    public final Runnable e;

    public f3(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f1278a = i10;
        this.f1279b = k7Var;
        this.f1280c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f1278a;
        ag.c cVar = ag.c.f635a;
        ag.c cVar2 = ag.c.f636b;
        Runnable runnable = this.e;
        ag.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f1280c;
        k7 k7Var = this.f1279b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f631a == cVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(cVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(cVar2).o());
                k7Var.f1667f0.setResellPrice(aVar);
                yh.a2 a2Var = k7Var.f1678k1;
                if (a2Var != null) {
                    a2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k7Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f631a == cVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(cVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(cVar2).o());
                k7Var.f1667f0.setResellPrice(aVar);
                yh.a2 a2Var2 = k7Var.f1678k1;
                if (a2Var2 != null) {
                    a2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i2.d.s(R.string.Gift2ResaleEnable, new Object[]{k7Var.Q1()}, k7Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
        }
    }
}
