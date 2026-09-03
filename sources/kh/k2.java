package kh;

import java.util.ArrayList;
import lh.j7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
public final class k2 implements Runnable {
    public final int f10795a;
    public final or0 f10796b;

    public k2(or0 or0Var, int i10) {
        this.f10795a = i10;
        this.f10796b = or0Var;
    }

    @Override
    public final void run() {
        switch (this.f10795a) {
            case 0:
                this.f10796b.a();
                return;
            case 1:
                this.f10796b.setReorderingCollections(true);
                return;
            default:
                j7 j7Var = this.f10796b.e;
                j7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j7Var.f12654a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j7Var.f12655b);
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
