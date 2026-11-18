package bi;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
public final class c5 implements Runnable {
    public final int f3525a;
    public final eq0 f3526b;

    public c5(eq0 eq0Var, int i7) {
        this.f3525a = i7;
        this.f3526b = eq0Var;
    }

    @Override
    public final void run() {
        switch (this.f3525a) {
            case 0:
                di.m8 m8Var = this.f3526b.f4006e;
                m8Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i7 = m8Var.f9322a;
                reorderstargiftcollections.peer = mp.u1(i7).l1(m8Var.f9323b);
                ArrayList arrayList = m8Var.f9325e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i7).sendRequest(reorderstargiftcollections, null);
                m8Var.j();
                return;
            case 1:
                this.f3526b.setReorderingCollections(true);
                return;
            default:
                this.f3526b.a();
                return;
        }
    }
}
