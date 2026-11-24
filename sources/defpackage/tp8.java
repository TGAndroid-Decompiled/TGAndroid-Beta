package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class tp8 implements Runnable {
    public final byte a;
    public final lca b;

    public tp8(lca lcaVar, byte b) {
        this.a = b;
        this.b = lcaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lca lcaVar = this.b;
        switch (b) {
            case 0:
                wsa wsaVar = lcaVar.e;
                wsaVar.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i = wsaVar.a;
                reorderstargiftcollections.peer = na7.q1(i).h1(wsaVar.b);
                ArrayList arrayList = wsaVar.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
                wsaVar.j();
                return;
            case 1:
                lcaVar.setReorderingCollections(true);
                return;
            case 2:
                lcaVar.a();
                return;
            default:
                lcaVar.p();
                return;
        }
    }
}
