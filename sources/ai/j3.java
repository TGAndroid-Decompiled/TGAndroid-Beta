package ai;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 implements Runnable {
    public final int f1550a;
    public final k7 f1551b;
    public final TL_stars.TL_starGiftUnique f1552c;
    public final ag.a d;
    public final Runnable e;

    public j3(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f1550a = i10;
        this.f1551b = k7Var;
        this.f1552c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f1550a;
        ag.b bVar = ag.b.f633a;
        ag.b bVar2 = ag.b.f634b;
        Runnable runnable = this.e;
        ag.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f1552c;
        k7 k7Var = this.f1551b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f631a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                k7Var.f1657f0.setResellPrice(aVar);
                yh.a2 a2Var = k7Var.f1668k1;
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
                if (aVar.f631a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                k7Var.f1657f0.setResellPrice(aVar);
                yh.a2 a2Var2 = k7Var.f1668k1;
                if (a2Var2 != null) {
                    a2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i2.e.s(R.string.Gift2ResaleEnable, new Object[]{k7Var.X1()}, k7Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
        }
    }
}
