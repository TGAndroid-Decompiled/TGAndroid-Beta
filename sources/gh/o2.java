package gh;

import hh.k7;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wq0;

public final class o2 implements Runnable {

    public final int f7477a;

    public final wq0 f7478b;

    public o2(wq0 wq0Var, int i10) {
        this.f7477a = i10;
        this.f7478b = wq0Var;
    }

    @Override
    public final void run() {
        switch (this.f7477a) {
            case 0:
                this.f7478b.a();
                break;
            case 1:
                this.f7478b.setReorderingCollections(true);
                break;
            default:
                k7 k7Var = this.f7478b.f7200e;
                k7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = k7Var.f9611a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(k7Var.f9612b);
                ArrayList arrayList = k7Var.f9614e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                k7Var.j();
                break;
        }
    }
}
