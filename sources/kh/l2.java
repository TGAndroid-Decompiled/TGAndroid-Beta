package kh;

import java.util.ArrayList;
import lh.j7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
public final class l2 implements Runnable {
    public final int f10697a;
    public final or0 f10698b;

    public l2(or0 or0Var, int i10) {
        this.f10697a = i10;
        this.f10698b = or0Var;
    }

    @Override
    public final void run() {
        switch (this.f10697a) {
            case 0:
                this.f10698b.a();
                return;
            case 1:
                this.f10698b.setReorderingCollections(true);
                return;
            default:
                j7 j7Var = this.f10698b.e;
                j7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j7Var.f12670a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j7Var.f12671b);
                ArrayList arrayList = j7Var.e;
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
