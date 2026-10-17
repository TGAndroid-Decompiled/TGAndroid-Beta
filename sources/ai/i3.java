package ai;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class i3 implements Runnable {
    public final int f1497a;
    public final k7 f1498b;
    public final TL_stars.TL_starGiftUnique f1499c;
    public final ag.a d;
    public final Runnable e;

    public i3(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f1497a = i10;
        this.f1498b = k7Var;
        this.f1499c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f1497a;
        ag.c cVar = ag.c.f635a;
        ag.c cVar2 = ag.c.f636b;
        Runnable runnable = this.e;
        ag.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f1499c;
        k7 k7Var = this.f1498b;
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
                k7Var.f1675f0.setResellPrice(aVar);
                yh.b2 b2Var = k7Var.f1686k1;
                if (b2Var != null) {
                    b2Var.run();
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
                k7Var.f1675f0.setResellPrice(aVar);
                yh.b2 b2Var2 = k7Var.f1686k1;
                if (b2Var2 != null) {
                    b2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i0.a.s(R.string.Gift2ResaleEnable, new Object[]{k7Var.P1()}, k7Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
        }
    }
}
