package ih;

import java.util.ArrayList;
import jh.i7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
public final class l2 implements Runnable {
    public final int f9271a;
    public final gr0 f9272b;

    public l2(gr0 gr0Var, int i10) {
        this.f9271a = i10;
        this.f9272b = gr0Var;
    }

    @Override
    public final void run() {
        switch (this.f9271a) {
            case 0:
                this.f9272b.a();
                return;
            case 1:
                this.f9272b.setReorderingCollections(true);
                return;
            default:
                i7 i7Var = this.f9272b.f9504e;
                i7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = i7Var.f12259a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(i7Var.f12260b);
                ArrayList arrayList = i7Var.f12262e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                i7Var.j();
                return;
        }
    }
}
