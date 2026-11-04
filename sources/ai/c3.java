package ai;

import ci.s8;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vp0;
public final class c3 implements Runnable {
    public final int f541a;
    public final vp0 f542b;

    public c3(vp0 vp0Var, int i3) {
        this.f541a = i3;
        this.f542b = vp0Var;
    }

    @Override
    public final void run() {
        switch (this.f541a) {
            case 0:
                s8 s8Var = this.f542b.f1013e;
                s8Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i3 = s8Var.f5965a;
                reorderstargiftcollections.peer = hp.s1(i3).j1(s8Var.f5966b);
                ArrayList arrayList = s8Var.f5968e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i3).sendRequest(reorderstargiftcollections, null);
                s8Var.j();
                return;
            case 1:
                this.f542b.setReorderingCollections(true);
                return;
            default:
                this.f542b.a();
                return;
        }
    }
}
