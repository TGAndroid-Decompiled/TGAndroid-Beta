package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ks8 implements qac {
    public final byte a;
    public final rs8 b;
    public final TL_stars.SavedStarGift c;

    public ks8(rs8 rs8Var, TL_stars.SavedStarGift savedStarGift, byte b) {
        this.a = b;
        this.b = rs8Var;
        this.c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        rs8 rs8Var = this.b;
        switch (b) {
            case 0:
                rs8Var.a.e.b(new ks8(rs8Var, savedStarGift, (byte) 1), (String) obj);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                lea leaVar = rs8Var.a;
                yua yuaVar = leaVar.e;
                int i = tL_starGiftCollection.collection_id;
                yuaVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                yuaVar.a(i, arrayList);
                leaVar.f(true);
                vgc vgcVar = leaVar.n;
                int i2 = tL_starGiftCollection.collection_id;
                vgcVar.e(i2, leaVar.e.f(i2) + 1);
                d dVar = leaVar.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).n3(true);
                }
                leaVar.o();
                c41.b0(dVar).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131750326, wsa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
