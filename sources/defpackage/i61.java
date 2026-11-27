package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class i61 implements pcc {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public i61(int i, c1 c1Var, lb7 lb7Var) {
        this.a = (byte) 6;
        this.b = i;
        this.c = c1Var;
        this.d = lb7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                float f = this.b;
                ((p) this.c).a(Float.valueOf((ete.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f)) + (((int[]) this.d)[0] / f)), Boolean.FALSE);
                return;
            case 1:
                e eVar = (e) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                eVar.showDialog(new kn2(eVar.getContext(), chat, -chat2.id, new zo2(eVar, this.b, chat2, chat, (byte) 0)));
                return;
            case 2:
                qn4 qn4Var = (qn4) this.c;
                int i = this.b;
                qn4Var.v2 = ((Boolean) obj).booleanValue();
                qn4Var.dismiss();
                ((pcc) this.d).a(Integer.valueOf(i));
                return;
            case 3:
                eu8 eu8Var = (eu8) this.c;
                int i2 = this.b;
                ArrayList arrayList = (ArrayList) obj;
                e eVar2 = eu8Var.a;
                zwa zwaVar = eu8Var.e;
                zwaVar.a(i2, arrayList);
                ((au8) this.d).f(true);
                eu8Var.f(true);
                eu8Var.o();
                TL_stars.TL_starGiftCollection c = zwaVar.c(i2);
                if (c != null) {
                    if (arrayList.size() > 1) {
                        v21 R = d31.b0(eVar2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), hl.S2(ob6.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c.title)));
                        R.s = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        v21 R2 = d31.b0(eVar2).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131750354, wua.u1(savedStarGift.gift), c.title)));
                        R2.s = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                hl.c3(new y36((TLRPC.UserFull) obj, (yt0) this.c, this.b, (TLRPC.User) this.d, (byte) 27));
                return;
            case 5:
                Utilities.i.c(new l77((k3b) this.c, this.b, (List) obj, new ArrayList(), (ea8) this.d, (byte) 27));
                return;
            case 6:
                hl.c3(new efa(this.b, (c1) this.c, (SparseIntArray) obj, (lb7) this.d, (byte) 9));
                return;
            default:
                ((boolean[]) this.c)[this.b] = ((Boolean) obj).booleanValue();
                ((Runnable) this.d).run();
                return;
        }
    }

    public i61(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public i61(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
