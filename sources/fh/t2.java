package fh;

import gh.l7;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vq0;
public final class t2 implements Runnable {
    public final int f6762a;
    public final vq0 f6763b;

    public t2(vq0 vq0Var, int i9) {
        this.f6762a = i9;
        this.f6763b = vq0Var;
    }

    @Override
    public final void run() {
        switch (this.f6762a) {
            case 0:
                this.f6763b.a();
                return;
            case 1:
                this.f6763b.setReorderingCollections(true);
                return;
            default:
                l7 l7Var = this.f6763b.f6548e;
                l7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i9 = l7Var.f8501a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i9).getInputPeer(l7Var.f8502b);
                ArrayList arrayList = l7Var.f8504e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i9).sendRequest(reorderstargiftcollections, null);
                l7Var.j();
                return;
        }
    }
}
