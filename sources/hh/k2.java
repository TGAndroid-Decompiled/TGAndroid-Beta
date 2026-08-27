package hh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

public final class k2 implements Runnable {

    public final int f9574a;

    public final i5 f9575b;

    public final TL_stars.TL_starGiftUnique f9576c;
    public final hf.a d;

    public final Runnable f9577e;

    public k2(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable, int i10) {
        this.f9574a = i10;
        this.f9575b = i5Var;
        this.f9576c = tL_starGiftUnique;
        this.d = aVar;
        this.f9577e = runnable;
    }

    @Override
    public final void run() {
        int i10 = this.f9574a;
        hf.b bVar = hf.b.f8921a;
        hf.b bVar2 = hf.b.f8922b;
        Runnable runnable = this.f9577e;
        hf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f9576c;
        i5 i5Var = this.f9575b;
        switch (i10) {
            case 0:
                i5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.f8919a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                i5Var.f9451a0.setResellPrice(aVar);
                gh.g3 g3Var = i5Var.Z0;
                if (g3Var != null) {
                    g3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.ui.Cells.pa.r(R.string.Gift2ResaleEnable, new Object[]{i5Var.C1()}, i5Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.f8919a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                i5Var.f9451a0.setResellPrice(aVar);
                gh.g3 g3Var2 = i5Var.Z0;
                if (g3Var2 != null) {
                    g3Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
