package lh;

import java.util.ArrayList;
import mh.j7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
public final class k2 implements Runnable {
    public final int f12832a;
    public final or0 f12833b;

    public k2(or0 or0Var, int i10) {
        this.f12832a = i10;
        this.f12833b = or0Var;
    }

    @Override
    public final void run() {
        switch (this.f12832a) {
            case 0:
                this.f12833b.a();
                return;
            case 1:
                this.f12833b.setReorderingCollections(true);
                return;
            default:
                j7 j7Var = this.f12833b.f13103e;
                j7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j7Var.f14302a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j7Var.f14303b);
                ArrayList arrayList = j7Var.f14305e;
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
