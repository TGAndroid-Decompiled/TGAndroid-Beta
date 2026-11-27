package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class ft8 implements Runnable {
    public final byte a;
    public final cga b;

    public ft8(cga cgaVar, byte b) {
        this.a = b;
        this.b = cgaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cga cgaVar = this.b;
        switch (b) {
            case 0:
                zwa zwaVar = cgaVar.e;
                zwaVar.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i = zwaVar.a;
                reorderstargiftcollections.peer = uc7.s1(i).j1(zwaVar.b);
                ArrayList arrayList = zwaVar.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
                zwaVar.j();
                return;
            case 1:
                cgaVar.setReorderingCollections(true);
                return;
            case 2:
                cgaVar.a();
                return;
            default:
                cgaVar.p();
                return;
        }
    }
}
