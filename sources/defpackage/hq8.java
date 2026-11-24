package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class hq8 implements p8c {
    public final byte a;
    public final pq8 b;
    public final TL_stars.SavedStarGift c;

    public hq8(pq8 pq8Var, TL_stars.SavedStarGift savedStarGift, byte b) {
        this.a = b;
        this.b = pq8Var;
        this.c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.a.e.b(new hq8(pq8Var, savedStarGift, (byte) 1), (String) obj);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                lca lcaVar = pq8Var.a;
                wsa wsaVar = lcaVar.e;
                int i = tL_starGiftCollection.collection_id;
                wsaVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                wsaVar.a(i, arrayList);
                lcaVar.f(true);
                vec vecVar = lcaVar.n;
                int i2 = tL_starGiftCollection.collection_id;
                vecVar.e(i2, lcaVar.e.f(i2) + 1);
                d dVar = lcaVar.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).j3(true);
                }
                lcaVar.o();
                u21.b0(dVar).R(savedStarGift.gift.getDocument(), gl.T2(k96.a0(null, null, 2131750377, vqa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
