package bi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
public final class h5 implements Runnable {
    public final int f3643a;
    public final gq0 f3644b;

    public h5(gq0 gq0Var, int i7) {
        this.f3643a = i7;
        this.f3644b = gq0Var;
    }

    @Override
    public final void run() {
        switch (this.f3643a) {
            case 0:
                di.n8 n8Var = this.f3644b.f4151e;
                n8Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i7 = n8Var.f9373a;
                reorderstargiftcollections.peer = np.u1(i7).l1(n8Var.f9374b);
                ArrayList arrayList = n8Var.f9376e;
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
                this.f3644b.setReorderingCollections(true);
                return;
            default:
                this.f3644b.a();
                return;
        }
    }
}
