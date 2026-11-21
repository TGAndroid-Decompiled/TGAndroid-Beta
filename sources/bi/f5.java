package bi;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
public final class f5 implements Runnable {
    public final int f3621a;
    public final gq0 f3622b;

    public f5(gq0 gq0Var, int i7) {
        this.f3621a = i7;
        this.f3622b = gq0Var;
    }

    @Override
    public final void run() {
        switch (this.f3621a) {
            case 0:
                di.n8 n8Var = this.f3622b.f4117e;
                n8Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i7 = n8Var.f9403a;
                reorderstargiftcollections.peer = mp.u1(i7).l1(n8Var.f9404b);
                ArrayList arrayList = n8Var.f9406e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i7).sendRequest(reorderstargiftcollections, null);
                n8Var.j();
                return;
            case 1:
                this.f3622b.setReorderingCollections(true);
                return;
            default:
                this.f3622b.a();
                return;
        }
    }
}
