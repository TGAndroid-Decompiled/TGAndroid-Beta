package gh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class k2 implements Runnable {
    public final int f8386a;
    public final k5 f8387b;
    public final TL_stars.TL_starGiftUnique f8388c;
    public final gf.a d;
    public final Runnable f8389e;

    public k2(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable, int i9) {
        this.f8386a = i9;
        this.f8387b = k5Var;
        this.f8388c = tL_starGiftUnique;
        this.d = aVar;
        this.f8389e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i9 = this.f8386a;
        gf.b bVar = gf.b.f7749a;
        gf.b bVar2 = gf.b.f7750b;
        Runnable runnable = this.f8389e;
        gf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f8388c;
        k5 k5Var = this.f8387b;
        boolean z11 = false;
        switch (i9) {
            case 0:
                k5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f7747a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                k5Var.f8397a0.setResellPrice(aVar);
                fh.l3 l3Var = k5Var.Z0;
                if (l3Var != null) {
                    l3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.ui.Cells.j2.q(R.string.Gift2ResaleEnable, new Object[]{k5Var.C1()}, k5Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f7747a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                k5Var.f8397a0.setResellPrice(aVar);
                fh.l3 l3Var2 = k5Var.Z0;
                if (l3Var2 != null) {
                    l3Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
