package bi;

import di.k8;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wp0;
public final class t2 implements Runnable {
    public final int f3874a;
    public final wp0 f3875b;

    public t2(wp0 wp0Var, int i7) {
        this.f3874a = i7;
        this.f3875b = wp0Var;
    }

    @Override
    public final void run() {
        switch (this.f3874a) {
            case 0:
                k8 k8Var = this.f3875b.f3610e;
                k8Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i7 = k8Var.f8920a;
                reorderstargiftcollections.peer = np.s1(i7).j1(k8Var.f8921b);
                ArrayList arrayList = k8Var.f8923e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i7).sendRequest(reorderstargiftcollections, null);
                k8Var.j();
                return;
            case 1:
                this.f3875b.setReorderingCollections(true);
                return;
            default:
                this.f3875b.a();
                return;
        }
    }
}
