package bi;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 implements Runnable {
    public final int f4597a;
    public final h7 f4598b;
    public final TL_stars.TL_starGiftUnique f4599c;
    public final bg.a d;
    public final Runnable e;

    public f3(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, int i10) {
        this.f4597a = i10;
        this.f4598b = h7Var;
        this.f4599c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f4597a;
        bg.b bVar = bg.b.f3980a;
        bg.b bVar2 = bg.b.f3981b;
        Runnable runnable = this.e;
        bg.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f4599c;
        h7 h7Var = this.f4598b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f3978a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h7Var.f4737f0.setResellPrice(aVar);
                zh.b2 b2Var = h7Var.f4748k1;
                if (b2Var != null) {
                    b2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                h7Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f3978a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h7Var.f4737f0.setResellPrice(aVar);
                zh.b2 b2Var2 = h7Var.f4748k1;
                if (b2Var2 != null) {
                    b2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                ic.a.s(R.string.Gift2ResaleEnable, new Object[]{h7Var.W1()}, h7Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
        }
    }
}
