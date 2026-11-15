package bi;

import di.j8;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wp0;
public final class t2 implements Runnable {
    public final int f3877a;
    public final wp0 f3878b;

    public t2(wp0 wp0Var, int i7) {
        this.f3877a = i7;
        this.f3878b = wp0Var;
    }

    @Override
    public final void run() {
        switch (this.f3877a) {
            case 0:
                j8 j8Var = this.f3878b.f3613e;
                j8Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i7 = j8Var.f8865a;
                reorderstargiftcollections.peer = np.s1(i7).j1(j8Var.f8866b);
                ArrayList arrayList = j8Var.f8868e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i7).sendRequest(reorderstargiftcollections, null);
                j8Var.j();
                return;
            case 1:
                this.f3878b.setReorderingCollections(true);
                return;
            default:
                this.f3878b.a();
                return;
        }
    }
}
