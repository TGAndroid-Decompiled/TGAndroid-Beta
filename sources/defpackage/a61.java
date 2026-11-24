package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class a61 implements p8c {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public a61(int i, b1 b1Var, d97 d97Var) {
        this.a = (byte) 6;
        this.b = i;
        this.c = b1Var;
        this.d = d97Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                float f = this.b;
                ((p) this.c).a(Float.valueOf((moe.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f)) + (((int[]) this.d)[0] / f)), Boolean.FALSE);
                return;
            case 1:
                d dVar = (d) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                dVar.showDialog(new qm2(dVar.getContext(), chat, -chat2.id, new go2(dVar, this.b, chat2, chat, (byte) 0)));
                return;
            case 2:
                ll4 ll4Var = (ll4) this.c;
                int i = this.b;
                ll4Var.v2 = ((Boolean) obj).booleanValue();
                ll4Var.dismiss();
                ((p8c) this.d).a(Integer.valueOf(i));
                return;
            case 3:
                tq8 tq8Var = (tq8) this.c;
                int i2 = this.b;
                ArrayList arrayList = (ArrayList) obj;
                d dVar2 = tq8Var.a;
                wsa wsaVar = tq8Var.e;
                wsaVar.a(i2, arrayList);
                ((pq8) this.d).f(true);
                tq8Var.f(true);
                tq8Var.o();
                TL_stars.TL_starGiftCollection c = wsaVar.c(i2);
                if (c != null) {
                    if (arrayList.size() > 1) {
                        m21 R = u21.b0(dVar2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), gl.T2(k96.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c.title)));
                        R.r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        m21 R2 = u21.b0(dVar2).R(savedStarGift.gift.getDocument(), gl.T2(k96.a0(null, null, 2131750377, vqa.t1(savedStarGift.gift), c.title)));
                        R2.r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                gl.d3(new q76((TLRPC.UserFull) obj, (pt0) this.c, this.b, (TLRPC.User) this.d, (byte) 25));
                return;
            case 5:
                Utilities.i.c(new i57((mza) this.c, this.b, (List) obj, new ArrayList(), (q68) this.d, (byte) 26));
                return;
            case 6:
                gl.d3(new ica(this.b, (b1) this.c, (SparseIntArray) obj, (d97) this.d, (byte) 7));
                return;
            default:
                ((boolean[]) this.c)[this.b] = ((Boolean) obj).booleanValue();
                ((Runnable) this.d).run();
                return;
        }
    }

    public a61(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public a61(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
