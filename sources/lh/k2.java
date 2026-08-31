package lh;

import java.util.ArrayList;
import mh.j7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pr0;
public final class k2 implements Runnable {
    public final int f12830a;
    public final pr0 f12831b;

    public k2(pr0 pr0Var, int i10) {
        this.f12830a = i10;
        this.f12831b = pr0Var;
    }

    @Override
    public final void run() {
        switch (this.f12830a) {
            case 0:
                this.f12831b.a();
                return;
            case 1:
                this.f12831b.setReorderingCollections(true);
                return;
            default:
                j7 j7Var = this.f12831b.f13101e;
                j7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j7Var.f14300a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j7Var.f14301b);
                ArrayList arrayList = j7Var.f14303e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                j7Var.j();
                return;
        }
    }
}
