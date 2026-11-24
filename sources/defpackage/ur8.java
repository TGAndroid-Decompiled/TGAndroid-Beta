package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class ur8 implements Runnable {
    public final byte a;
    public final lea b;

    public ur8(lea leaVar, byte b) {
        this.a = b;
        this.b = leaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lea leaVar = this.b;
        switch (b) {
            case 0:
                yua yuaVar = leaVar.e;
                yuaVar.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i = yuaVar.a;
                reorderstargiftcollections.peer = oc7.r1(i).i1(yuaVar.b);
                ArrayList arrayList = yuaVar.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
                yuaVar.j();
                return;
            case 1:
                leaVar.setReorderingCollections(true);
                return;
            case 2:
                leaVar.a();
                return;
            default:
                leaVar.p();
                return;
        }
    }
}
