package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class h71 implements qac {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public h71(int i, b1 b1Var, eb7 eb7Var) {
        this.a = (byte) 6;
        this.b = i;
        this.c = b1Var;
        this.d = eb7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                float f = this.b;
                ((p) this.c).a(Float.valueOf((pqe.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f)) + (((int[]) this.d)[0] / f)), Boolean.FALSE);
                return;
            case 1:
                d dVar = (d) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                dVar.showDialog(new co2(dVar.getContext(), chat, -chat2.id, new rp2(dVar, this.b, chat2, chat, (byte) 0)));
                return;
            case 2:
                ln4 ln4Var = (ln4) this.c;
                int i = this.b;
                ln4Var.v2 = ((Boolean) obj).booleanValue();
                ln4Var.dismiss();
                ((qac) this.d).a(Integer.valueOf(i));
                return;
            case 3:
                vs8 vs8Var = (vs8) this.c;
                int i2 = this.b;
                ArrayList arrayList = (ArrayList) obj;
                d dVar2 = vs8Var.a;
                yua yuaVar = vs8Var.e;
                yuaVar.a(i2, arrayList);
                ((rs8) this.d).f(true);
                vs8Var.f(true);
                vs8Var.o();
                TL_stars.TL_starGiftCollection c = yuaVar.c(i2);
                if (c != null) {
                    if (arrayList.size() > 1) {
                        u31 R = c41.b0(dVar2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), gm.S2(jb6.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c.title)));
                        R.s = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        u31 R2 = c41.b0(dVar2).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131750326, wsa.t1(savedStarGift.gift), c.title)));
                        R2.s = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                gm.c3(new v36((TLRPC.UserFull) obj, (yu0) this.c, this.b, (TLRPC.User) this.d, (byte) 26));
                return;
            case 5:
                Utilities.i.c(new i77((n1b) this.c, this.b, (List) obj, new ArrayList(), (t88) this.d, (byte) 27));
                return;
            case 6:
                gm.c3(new tda(this.b, (b1) this.c, (SparseIntArray) obj, (eb7) this.d, (byte) 8));
                return;
            default:
                ((boolean[]) this.c)[this.b] = ((Boolean) obj).booleanValue();
                ((Runnable) this.d).run();
                return;
        }
    }

    public h71(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public h71(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
